package com.abo.ecommerce.dto;

import com.abo.ecommerce.entity.Address;
import com.abo.ecommerce.entity.Customer;
import com.abo.ecommerce.entity.Order;
import com.abo.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
