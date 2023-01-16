package com.padrao.hexagonal.adapters.in.controller.mapper;

import com.padrao.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.padrao.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.padrao.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "adderess", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
