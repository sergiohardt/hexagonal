package com.padrao.hexagonal.application.ports.out;

import com.padrao.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
