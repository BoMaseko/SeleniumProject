package runner;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(features = "feature\\multiply.feature", 
glue = {"step_def"},format = {"pretty", "html:target/cucumber"}) 

public class runTest { }	