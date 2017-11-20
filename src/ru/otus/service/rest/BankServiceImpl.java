package ru.otus.service.rest;

import java.math.BigDecimal;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/bank")
public class BankServiceImpl {

	@GET
	@Path("/login")
	@Produces(MediaType.TEXT_PLAIN)
	public String login(@QueryParam("login") String login, @QueryParam("password") String password){
		return login.concat(password).concat("@").concat(login.hashCode() + "");
	}
	
	@POST
	@Path("/check")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean checkCustomer(@QueryParam("name") String fullName) {
		return fullName.length() > 10;
	}
	
	@GET
	@Path("/calculate")
	@Produces(MediaType.APPLICATION_JSON)
	public BigDecimal calculateMonthlyPayment() {
		if (Math.random() % 2 == 0) {
			return BigDecimal.ZERO;
		}
		return BigDecimal.ONE;
	}
}
