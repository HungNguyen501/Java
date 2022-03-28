package com.mrroot501.file_engine.csv;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author mrroot501
 */
public class CsvEngine {
    public static Logger LOGGER = LogManager.getLogger(CsvEngine.class);

    public static Map<Integer, List<String>> csvReader(String file_path) throws FileNotFoundException {
        Map<Integer, List<String>> data = new HashMap<>();

        try (BufferedReader bf1 = new BufferedReader(new FileReader(file_path))) {
            String line;
            int row_number = 0;

            while ((line = bf1.readLine()) != null) {
                List<String> list_cell = Arrays.asList(line.split(","));
                data.put(row_number, list_cell);
                row_number++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return  data;
    }

    public static boolean csvWriter(String file_path, boolean append, Map<Integer, List<String>> data) {
        try (FileOutputStream file1 = new FileOutputStream(new File(file_path), append)) {
            for (int i = 0; i < data.size(); i++) {
                String line = data.get(i).stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "));
                file1.write((line+"\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

}
