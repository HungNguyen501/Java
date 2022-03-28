package com.mrroot501.file_engine.excel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

/**
 *
 * @author mrroot501
 */
public class ExcelEngine {
    public static Logger LOGGER = LogManager.getLogger("ExcelEngine");

    public static Map<Integer, List<String>> excelReader(String file_path, int sheet_index) {
        Map<Integer, List<String>> data = new HashMap<>();

        try (Workbook workBook1 = new XSSFWorkbook(file_path)) {
            Sheet sheet1 = workBook1.getSheetAt(sheet_index);
            Iterator<Row> iterator = sheet1.rowIterator();

            int row_number = 0;
            while (iterator.hasNext()) {
                Row row = iterator.next();
                Iterator<Cell> cellIterator = row.iterator();
                data.put(row_number, new ArrayList<String>());

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case NUMERIC -> data.get(row_number).add(String.valueOf(cell.getNumericCellValue()));
                        case STRING -> data.get(row_number).add(cell.getStringCellValue());
                        case BOOLEAN -> data.get(row_number).add(String.valueOf(cell.getBooleanCellValue()));
                        default -> data.get(row_number).add(String.valueOf(cell.getDateCellValue()));
                    }
                }
                row_number++;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return data;
    }

    public static boolean excelWriter(ExcelFileConfig excelFileConfig, Map<Integer, List<String>> data) {
        // Init params for sheet
        int col_num = data.get(0).size();
        int col_width = 18000;

        if (!excelFileConfig.isAppend()) { // Create new Excel file
            try (FileOutputStream file1 = new FileOutputStream(new File(excelFileConfig.getFile_path()))) {
                Workbook wb1 = excelFileConfig.getWb();
                Sheet sheet1 = wb1.createSheet(excelFileConfig.getSheet_name());

                // Set up columns properties
                for (int column_index = 0; column_index < col_num; column_index++) {
                    sheet1.setColumnWidth(column_index, col_width);
                }

                // Write header
                Row header = sheet1.createRow(0);
                for (int i = 0; i < col_num; i++) {
                    Cell header_cell = header.createCell(i);
                    header_cell.setCellStyle(excelFileConfig.getHeader_style());
                    header_cell.setCellValue(data.get(0).get(i));
                }

                // Write row
                for (int i = 1; i < data.size(); i++) {
                    Row row = sheet1.createRow(i);
                    for (int j = 0; j < col_num; j++) {
                        Cell cell = row.createCell(j);
                        cell.setCellStyle(excelFileConfig.getCell_style());
                        cell.setCellValue(data.get(i).get(j));
                    }
                }

                // Write sheet to file
                wb1.write(file1);
                wb1.close();
            } catch (Exception exp) {
                exp.printStackTrace();
                return false;
            }
        } else { // Append to excel file
            try (FileInputStream file2 = new FileInputStream(new File(excelFileConfig.getFile_path()))) {
                Workbook wb2 = new XSSFWorkbook(file2);
                Sheet sheet2 = wb2.getSheet(excelFileConfig.getSheet_name());
                int row_count = sheet2.getLastRowNum()+1;

                for (int i = 0; i < data.size(); i++) {
                    Row row = sheet2.createRow(row_count);

                    for (int j = 0; j < col_num; j++) {
                        Cell cell = row.createCell(j);
                        cell.setCellValue(data.get(i).get(j));
                    }
                    row_count++;
                }

                FileOutputStream file3 = new FileOutputStream(new File(excelFileConfig.getFile_path()));
                wb2.write(file3);
                wb2.close();
                file3.close();

            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return true;
    }

}

