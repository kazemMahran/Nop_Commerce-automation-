package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
 (
         glue = {"StepDef"} ,
         plugin ={"pretty","html:target/TestRepot.html"},
         tags = "@Smoke"
 )
public class Runner extends AbstractTestNGCucumberTests {


}
