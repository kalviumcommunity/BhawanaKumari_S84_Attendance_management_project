package com.school;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileStorageService {

    public void saveData(List<? extends Storable> items, String filename) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename, false))) {
            for (Storable item : items) {
                out.println(item.toDataString());
            }
            System.out.printf("Saved %d record(s) to %s%n", items.size(), filename);
        } catch (IOException e) {
            System.err.printf("Error writing %s: %s%n", filename, e.getMessage());
        }
    }
}
