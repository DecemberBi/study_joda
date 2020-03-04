package com.biykcode.studyjodamoney.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.time.LocalDateTime;

/**
 * @author biyukun
 * @date 2020-03-03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Goods {

  private Long id;

  private String name;

  private Money price;

  private LocalDateTime createTime;

  private LocalDateTime updateTime;
}
