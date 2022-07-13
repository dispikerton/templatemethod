package ru.ivanov.templatemethod.app;

import java.io.File;

import org.springframework.stereotype.Component;

@Component
public class CsvDocument extends AbstractDocument {
  protected CsvDocument(DocumentDao documentDao, Printer printer) {
    super(documentDao, printer);
  }

  @Override
  protected File generate(String data) {
    return new File("csv");
  }
}
