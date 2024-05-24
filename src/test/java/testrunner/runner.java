package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = ".\\src\\test\\resource\\FeatureFiles\\LoginFunction.feature",
		glue= {"stepdefination","hooks"},
        plugin = {"pretty","html:target/abc.html"},
        monochrome = true
		)

public class runner {

}
