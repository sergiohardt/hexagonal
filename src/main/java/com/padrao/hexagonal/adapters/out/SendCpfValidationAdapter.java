package com.padrao.hexagonal.adapters.out;

import com.padrao.hexagonal.application.ports.out.SendCpfForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfValidationAdapter implements SendCpfForValidationOutputPort {

	//envio do kafka

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public void send(String cpf) {
		kafkaTemplate.send("tp-cpf-validation", cpf);
	}
}
