package com.padrao.hexagonal.adapters.in.consumer;

import com.padrao.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.padrao.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.padrao.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class ReceiveValidatedCpfConsumer {

	@Autowired
	private UpdateCustomerUseCase updateCustomerUseCase;

	@Autowired
	private CustomerMessageMapper customerMessageMapper;

	@KafkaListener(topics = "tp-cpf-validated", groupId = "hexagonal")
	public void receive(CustomerMessage customerMessage) {
		var customer = customerMessageMapper.toCustomer(customerMessage);
		updateCustomerUseCase.update(customer, customerMessage.getZipCode());
	}
}
