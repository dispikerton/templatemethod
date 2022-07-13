package ru.ivanov.templatemethod.app;

import java.io.File;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PdfGenerator {
  public File generate(String data){
    log.info("Генерирую документ, используя {}", data);
    return new File("pdf");
  }
}
