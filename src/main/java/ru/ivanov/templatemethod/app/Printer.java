package ru.ivanov.templatemethod.app;

import java.io.File;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Printer {
  public void print(File file) {
    log.info("Печать документа: " + file.getName());
  }
}
