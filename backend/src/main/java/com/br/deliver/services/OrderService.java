package com.br.deliver.services;

import com.br.deliver.dto.OrderDTO;
import com.br.deliver.entities.Order;
import com.br.deliver.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(){
        List<Order> list = repository.findOrdersWithProducts();
        return list.stream().map(OrderDTO::new).collect(Collectors.toList());
    }
}
