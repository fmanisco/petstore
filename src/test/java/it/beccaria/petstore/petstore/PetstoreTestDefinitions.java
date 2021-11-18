package it.beccaria.petstore.petstore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import it.beccaria.petstore.dto.PetstoreDto;
import step.CucumberStepDefinitions;

public class PetstoreTestDefinitions extends CucumberStepDefinitions<PetstoreDto> {

	private PetstoreDto dto;
	private static final String URI = "/petstore/";
	private MockHttpServletResponse response;
	
	@Autowired
	protected ObjectMapper mapper;

	@Before
	public void beforeAll() {
		
	}
	
	@Given("^utente ha identificato Banca: (.*)$")
	public void utente_ha_identificato_Petstore(String arg1) throws Exception {
		dto = new PetstoreDto();
	    dto.setId(Long.parseLong(arg1));
	}
	
	@When("^eseguo get$")
	public void eseguo_get() throws Exception {
		response = get( URI+"/"+dto.getId());
	}

	@Then("^ottengo (\\d+)$")
	public void ottengo(int status) throws Exception {
		Assertions.assertEquals(status, response.getStatus());
	}


}
