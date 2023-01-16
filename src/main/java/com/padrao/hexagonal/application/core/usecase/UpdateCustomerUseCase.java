package com.padrao.hexagonal.application.core.usecase;

import com.padrao.hexagonal.application.core.domain.Customer;
import com.padrao.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.padrao.hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.padrao.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.padrao.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {
    // busca pelo usecase os finds com seu metodo de achar por id e validação
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Autowired
    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
