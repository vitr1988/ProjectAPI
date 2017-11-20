package ru.otus.service.soap;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface InsurationService {

	@WebMethod
	void login(@WebParam(name="login") String login, @WebParam String password);
	
	@WebMethod
	BigDecimal calculate(@WebParam String fullName, @WebParam int age, @WebParam boolean isCredit);
	
}
