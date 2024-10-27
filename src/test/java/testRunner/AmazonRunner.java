package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * single test case:  tags="@Sellpage"
 * multiple test case:tags="@Sellpage or @Mobilepage"
 * ignore single test: tags="not @Mobilepage"
 * ignore multiple test: tags="not @ignore"
 * 
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue="stepdef",
					tags="@All",
					publish=true)
public class AmazonRunner {

}
