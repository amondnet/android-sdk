package com.gospelware.moltin.modules.carts;

/**
 * Created by lewis on 08/03/2017.
 */

public class CartResponse {

    private Cart data;
    private CartMeta meta;

    public Cart getData() {
        return data;
    }

    public void setData(Cart data) {
        this.data = data;
    }

    public CartMeta getMeta() {
        return meta;
    }

    public void setMeta(CartMeta meta) {
        this.meta = meta;
    }
}