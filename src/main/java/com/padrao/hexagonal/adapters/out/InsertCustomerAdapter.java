package com.padrao.hexagonal.adapters.out;

import com.padrao.hexagonal.adapters.out.repository.CustomerRepository;
import com.padrao.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.padrao.hexagonal.application.core.domain.Customer;
import com.padrao.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    //adaptador de inserção de cliente

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
