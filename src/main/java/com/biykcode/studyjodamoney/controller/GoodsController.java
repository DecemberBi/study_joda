package com.biykcode.studyjodamoney.controller;

import com.biykcode.studyjodamoney.model.Goods;
import com.biykcode.studyjodamoney.service.GoodsService;
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
}
