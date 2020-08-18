package com.comercio.app.filereader;

import com.comercio.app.negocio.Producto;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    private static final String COMMA_DELIMITER = ",";

    public static List<Producto> readCSV() {
        List<Producto> records = new ArrayList<>();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream("products.csv");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        try (BufferedReader br = new BufferedReader(streamReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                Producto producto = new Producto(values[0], values[1], values[2], Integer.parseInt(values[3]), Double.parseDouble(values[4]));
                records.add(producto);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
