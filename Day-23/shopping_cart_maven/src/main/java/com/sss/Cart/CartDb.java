package com.sss.Cart;

import java.util.ArrayList;
import java.util.List;

import com.sss.exception.CartNotFoundException;
import com.sss.item.Item;
import com.sss.item.ItemDb;
import com.sss.user.User;
import com.sss.user.UsersDb;

public class CartDb {
    
    private static final ArrayList<Cart> carts = new ArrayList<>();

    public static void addCart(int cartId, int userId) {

        User user = UsersDb.findUserById(userId);

        Cart cart = new Cart();
        cart.setId(cartId);
        cart.setUser(user);
        carts.add(cart);
    }

    public static void addItemToCart(int userId, int itemId) {

        User user = UsersDb.findUserById(userId);
        Cart cart = user.getCart();

        Item item = ItemDb.findItemById(itemId);
        
        cart.getItems().add(item);
    }

    public static List<Cart> allCarts() {
        return carts;
    }

    public static List<Item> findItemsByCartId(int cartId) {
        return findCartById(cartId).getItems();
    }

    public static Cart findCartById(int cartId) {
        for( Cart cart : carts) {
            if(cart.getId() == cartId) {
                return cart;
            }
        }
        throw new CartNotFoundException("❌ Cart Id " + cartId +" Not Found");
    }
}
