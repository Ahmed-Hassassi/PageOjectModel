package run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	    tags="@AddProductsInCart",
		features="src/test/features",
		glue={"hooks" , "stepDefinition"},
		publish = true,
		plugin = {"pretty","html:target/reporttTest.html","json:target/reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Runner {
}