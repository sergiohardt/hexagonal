package com.padrao.hexagonal.application.ports.in;

import com.padrao.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
