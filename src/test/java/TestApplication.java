import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/simarjeetk/Documents/JuvoProjects/mybddproject/src/test/resources/Features",
        plugin = {"pretty","html:target/cucumber-reports"}
)
public class TestApplication {

    protected TestNGCucumberRunner testNGCucumberRunner ;


    @BeforeClass(alwaysRun=true)
    public  void setupClass(){
        testNGCucumberRunner= new TestNGCucumberRunner(this.getClass());
    }


    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void testfeatures(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
    testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());

    }
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun=true)
    public  void tearOffs(){
        testNGCucumberRunner.finish();
    }
}
