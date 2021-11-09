package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
	        features = "Features"
	        ,glue = {"stepdefination"},dryRun=false)
	        
          public class Runner {

}
