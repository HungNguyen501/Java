package com.mrroot501.file_engine.excel;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author mrroot501
 */
public class ExcelFileConfig {
    public static final int MAX_COL_WIDTH = 255*256; // The maximum column width for an individual cell is 255 characters

    private Workbook wb;
    private String file_path;
    private String sheet_name;
    private boolean append;
    private CellStyle header_style;
    private CellStyle cell_style;

    // Default constructor
    public ExcelFileConfig() {
        this.wb = new XSSFWorkbook();
    }

    public  ExcelFileConfig(String file_path, String sheet_name, boolean append, Workbook wb, CellStyle cell_style) {
        this.wb = wb;
        this.file_path = file_path;
        this.sheet_name = sheet_name;
        this.append = append;
        this.header_style = cell_style;
        this.cell_style = cell_style;
    }

    public  ExcelFileConfig(String file_path, String sheet_name, boolean append, Workbook wb,
                            CellStyle header_style, CellStyle cell_style) {
        this.wb = wb;
        this.file_path = file_path;
        this.sheet_name = sheet_name;
        this.append = append;
        this.header_style = header_style;
        this.cell_style = cell_style;
    }

    public Workbook getWb() {
        return wb;
    }

    public void setWb(Workbook wb) {
        this.wb = wb;
    }

    public CellStyle getHeader_style() {
        return header_style;
    }

    public void setHeader_style(CellStyle header_style) {
        this.header_style = header_style;
    }

    public CellStyle getCell_style() {
        return cell_style;
    }

    public void setCell_style(CellStyle cell_style) {
        this.cell_style = cell_style;
    }

    public boolean isAppend() {
        return append;
    }

    public void setAppend(boolean append) {
        this.append = append;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getSheet_name() {
        return sheet_name;
    }

    public void setSheet_name(String sheet_name) {
        this.sheet_name = sheet_name;
    }
}

