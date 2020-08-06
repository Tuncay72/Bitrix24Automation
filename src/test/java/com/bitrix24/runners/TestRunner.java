package com.bitrix24.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features" ,
        glue ="com/bitrix24/step_definitions"  ,
        plugin = {
                "json::target/cucumber.json"
        } ,
        tags = "@fileUploading" ,
        dryRun = true
)

@RunWith(Cucumber.class)
public class TestRunner {


}
