package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Surekha\\Desktop\\Selenium\\CucumberPrograms\\Feature\\demo.feature",glue="stepdef")
public class TestRunner {

}
