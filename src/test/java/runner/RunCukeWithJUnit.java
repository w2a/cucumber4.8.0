package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(features= {"src/test/resources/features"},plugin={"json:target/cucumber.json","html:target/site/cucumber-pretty"},glue="stepDefinition")
@RunWith(Cucumber.class)
public class RunCukeWithJUnit{
	
	
	

}
