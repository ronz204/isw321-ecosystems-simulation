package com.isw.app.enums;

import java.nio.file.Paths;

public enum DataFile {
  ANIMALS("animals.txt"),
  CUSTOMERS("customers.txt"),
  ECOSYSTEMS("ecosystems.txt");

  private final String path;

  DataFile(String path) {
    this.path = path;
  }

  public String getPath() {
    return Paths.get("src", "main", "resources", "database", path).toString();
  }
}
