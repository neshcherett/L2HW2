package com.tneshcheret;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ToFileWriter implements Writer {
    //записывает все данные в файл
    @Override
    public void write(String value) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Operation with sentence"))) {
            writer.write(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
