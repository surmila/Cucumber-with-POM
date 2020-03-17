package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resorces/feature/Guru99.feature", plugin = { "pretty","html:reports/cucumber-html-report" }, 
tags = { "@tc01_guru99" }, 
glue = { "steps" }, 
monochrome = true)

public class Guru99_runner {

}
