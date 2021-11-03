package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports" },
        features = "src/test/resources/org/example/wyplata_pieniedzy.feature")

public class RunCucumberTest {

}
