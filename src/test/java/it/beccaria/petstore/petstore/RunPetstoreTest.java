package it.beccaria.petstore.petstore;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/it/beccaria/petstore/petstore" }, glue = "it.beccaria.petstore.petstore")
public class RunPetstoreTest {

}
