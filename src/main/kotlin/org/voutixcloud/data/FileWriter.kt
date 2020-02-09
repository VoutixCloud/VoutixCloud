package org.voutixcloud.data

import java.io.File
import java.io.FileWriter
import java.io.IOException

class FileWriter {
    internal fun write(file: File, text: String) {

        var writer: java.io.FileWriter = FileWriter(file)

        try {
            writer.write(text)
            writer.flush()
            writer.close()

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}