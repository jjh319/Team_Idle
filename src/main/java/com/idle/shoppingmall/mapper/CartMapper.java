package com.idle.shoppingmall.mapper;


import com.idle.shoppingmall.Entity.Cart;
import com.idle.shoppingmall.Entity.Key.CartKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface CartMapper {

    void saveCart(@Param("cart")Cart cartDTO);

    Cart findCart(@Param("cart") CartKey key);
    List<Cart> selectCart(@Param("cartList")Cart cartDTO);

    void updateCart(@Param("update") Cart cartDTO );

    void deleteCart(@Param("remove")Cart cartDTO );

} // interface
