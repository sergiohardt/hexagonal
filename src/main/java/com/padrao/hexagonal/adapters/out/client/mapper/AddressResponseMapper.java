package com.padrao.hexagonal.adapters.out.client.mapper;

import com.padrao.hexagonal.adapters.out.client.response.AddressResponse;
import com.padrao.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
