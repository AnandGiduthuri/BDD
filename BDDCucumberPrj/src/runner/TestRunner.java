package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Feature",glue= {"stepDefinition"},tags= {"@smoke"},plugin= {"pretty","html:target/cucumber_html_repo1/login1.html"})
//plugin= {"pretty","junit:Reportxml/repo.xml"})
		//"json:target/jsonrepo"})
//		"html:target/cucumber_html_repo1"})
//{"pretty"},monochrome=true)
//,glue= {"stepDefinition"},tags= {"@regression"})
//glue= {"stepDefinition"})
public class TestRunner {

}
