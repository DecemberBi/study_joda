package com.biykcode.studyjodamoney;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.biykcode.studyjodamoney.mapper")
public class StudyJodaMoneyApplication {

  public static void main(String[] args) {
    SpringApplication.run(StudyJodaMoneyApplication.class, args);
  }

}
