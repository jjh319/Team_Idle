package com.idle.shoppingmall.Service;


import com.idle.shoppingmall.Entity.Cart;
import com.idle.shoppingmall.Entity.Key.CartKey;
import com.idle.shoppingmall.mapper.CartMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartMapper cartMapper;

    @Transactional
    public List<Cart> selectCart(Cart cartDTO) {
        return cartMapper.selectCart(cartDTO);
    } // selectCart

    @Transactional
    public Cart findCart(CartKey key) {
        return cartMapper.findCart(key);
    } // findCart

    @Transactional
    public void addCart(Cart cartDTO) {

        cartMapper.saveCart(cartDTO);

    } // addCart

    @Transactional
    public void updateCart(Cart cartDTO) {

        cartMapper.updateCart(cartDTO);

    } // updateCart

    @Transactional
    public void deleteCart(Cart cartDTO) {

        cartMapper.deleteCart(cartDTO);

    } // deleteCart

} // end class
