package ru.ivanov.templatemethod.app;

import java.io.File;

public abstract class AbstractDocument {

  private final DocumentDao documentDao;
  private final Printer printer;

  protected AbstractDocument(DocumentDao documentDao, Printer printer) {
    this.documentDao = documentDao;
    this.printer = printer;
  }

  public final void create() {
    String data = documentDao.getData();
    File document = generate(data);
    printer.print(document);
  }

  protected abstract File generate(String data);
}
