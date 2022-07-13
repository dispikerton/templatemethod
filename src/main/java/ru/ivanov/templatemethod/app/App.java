package ru.ivanov.templatemethod.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {
  /*
  * 1. Собрать данные
  * 2. Создать документ
  * 3. Распечатать
  * */
  private final AbstractDocument abstractDocument;

  public App(@Qualifier("excelDocument") AbstractDocument abstractDocument) {
    this.abstractDocument = abstractDocument;
  }

  @GetMapping
  public void createDocument() {
    abstractDocument.create();
  }
}
