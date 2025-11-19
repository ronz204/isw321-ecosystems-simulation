package com.isw.app.helpers;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import com.isw.app.enums.DataFile;

public class BufferedHelper {

  public static BufferedReader getReader(DataFile dataFile) throws IOException {
    FileReader fileReader = new FileReader(dataFile.getPath());
    return new BufferedReader(fileReader);
  }

  public static BufferedWriter getWriter(DataFile dataFile) throws IOException {
    FileWriter fileWriter = new FileWriter(dataFile.getPath(), true);
    return new BufferedWriter(fileWriter);
  }
}
