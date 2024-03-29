package com.sss.Cart;
import java.util.List;

import com.sss.item.Item;

public class CartController {
 
    private int userId;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addItemToCart(int itemId) {
        // first find item in items db by its id
        CartDb.addItemToCart(userId, itemId);
    }

    public List<Item> cartItems(int cartId) {
        return CartDb.findItemsByCartId(cartId);
    }
}