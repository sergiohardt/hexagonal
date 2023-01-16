package com.padrao.hexagonal.application.ports.out;

import com.padrao.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
