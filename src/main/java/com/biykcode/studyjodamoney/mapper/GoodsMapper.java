package com.biykcode.studyjodamoney.mapper;

import com.biykcode.studyjodamoney.model.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author biyukun
 * @description TODO
 * @date 2020-03-03
 */
@Mapper
public interface GoodsMapper {

  @Insert("insert into goods (name, price, create_time, update_time) values (#{name}, #{price}, now(), now())")
  @Options(useGeneratedKeys = true)
  Long save(Goods goods);


  @Select("select * from goods where id = #{id}")
  Goods findById(@Param("id") Long id);
}
