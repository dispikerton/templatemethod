package ru.ivanov.templatemethod.app;

import java.io.File;

import org.springframework.stereotype.Component;

@Component
public class PdfDocument extends AbstractDocument {

  private final PdfGenerator pdfGenerator;

  protected PdfDocument(DocumentDao documentDao, Printer printer, PdfGenerator pdfGenerator) {
    super(documentDao, printer);
    this.pdfGenerator = pdfGenerator;
  }

  @Override
  public File generate(String data) {
    return pdfGenerator.generate(data);
  }
}
