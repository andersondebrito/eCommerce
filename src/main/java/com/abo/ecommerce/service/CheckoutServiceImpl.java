package com.abo.ecommerce.service;

import com.abo.ecommerce.dto.Purchase;
import com.abo.ecommerce.dto.PurchaseResponse;
import com.abo.ecommerce.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        return null;
    }
}
