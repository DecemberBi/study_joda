package com.biykcode.studyjodamoney.service;

import com.biykcode.studyjodamoney.mapper.GoodsMapper;
import com.biykcode.studyjodamoney.model.Goods;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.joda.money.CurrencyUnit.*;

/**
 * @author biyukun
 * @description TODO
 * @date 2020-03-03
 */
@Service
@Slf4j
public class GoodsService {

  @Autowired
  private GoodsMapper goodsMapper;

  public int save() {
    Goods goods = Goods.builder().name("显示器2").price(Money.of(CurrencyUnit.of("CNY"), 200)).build();
    Long count = goodsMapper.save(goods);
    log.info("返回的count={}", count);
    return Math.toIntExact(count);
  }

  public Goods findById(Long id) {
    Goods goods = goodsMapper.findById(id);
    log.info("返回的货物是={}", goods);
    return goods;
  }

}
