package ru.ivanov.templatemethod.app;

import java.io.File;

import org.springframework.stereotype.Component;

@Component
public class ExcelDocument extends AbstractDocument {
  private final ExcelGenerator excelGenerator;

  protected ExcelDocument(DocumentDao documentDao, Printer printer, ExcelGenerator excelGenerator) {
    super(documentDao, printer);
    this.excelGenerator = excelGenerator;
  }

  @Override
  public File generate(String data) {
    return excelGenerator.generate(data);
  }
}
