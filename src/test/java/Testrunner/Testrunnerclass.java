package Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Featurefolder"},
plugin = {"json:target/cucumber.json"},// He is responsible for generate HTML reports 
glue = "Stepdefination")//tags = {""})
public class Testrunnerclass extends AbstractTestNGCucumberTests{

}
