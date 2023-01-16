package com.padrao.hexagonal.application.ports.out;

import com.padrao.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    //pode ou nao ter um usuario por id

    Optional<Customer> find(String id);
}
