package com.abo.ecommerce.service;

import com.abo.ecommerce.dto.Purchase;
import com.abo.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
