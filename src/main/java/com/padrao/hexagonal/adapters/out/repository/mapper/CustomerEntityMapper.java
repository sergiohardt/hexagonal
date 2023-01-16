package com.padrao.hexagonal.adapters.out.repository.mapper;

import com.padrao.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.padrao.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
