package com.biykcode.studyjodamoney.controller;

import com.biykcode.studyjodamoney.model.Goods;
import com.biykcode.studyjodamoney.service.GoodsService;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author biyukun
 * @description TODO
 * @date 2020-03-03
 */
@RestController
public class GoodsController {

  @Autowired
  private GoodsService goodsService;

  @RequestMapping("/save")
  public int save() {
    return goodsService.save();
  }

  @RequestMapping("/findById")
  public Goods findById(@RequestParam("id") Long id) {
    return goodsService.findById(id);
  }

  @RequestMapping("/test")
  public Goods testController() {
    return Goods.builder().id(1L).name("笔记本").price(Money.of(CurrencyUnit.of("CNY"),  6999.0)).build();
  }
}
