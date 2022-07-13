package ru.ivanov.templatemethod.app;

import org.springframework.stereotype.Component;

@Component
public class DocumentDao {

  private static final String DATA = "data";

  public String getData() {
    return DATA;
  }
}
