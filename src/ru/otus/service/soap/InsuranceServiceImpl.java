package ru.otus.service.soap;

import java.math.BigDecimal;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.otus.service.soap.InsurationService")
public class InsuranceServiceImpl implements InsurationService {

	@Override
	public void login(String login, String password) {
		System.out.println("Login was succeded!");
	}

	@Override
	public BigDecimal calculate(String fullName, int age, boolean isCredit) {
		switch(age) {
			case 18: return BigDecimal.valueOf(100000L);
			default: return BigDecimal.valueOf(30000);
		}
	}

}
