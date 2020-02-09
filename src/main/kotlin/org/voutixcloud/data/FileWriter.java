package org.voutixcloud.data;

import java.io.File;
import java.io.IOException;

public class FileWriter {

    public static void write(File file, String text) {

        try (java.io.FileWriter writer = new java.io.FileWriter(file)) {

            writer.write(text);
            writer.flush();
            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
