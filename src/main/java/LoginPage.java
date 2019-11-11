import cucumber.api.java.After;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {




    WebDriver driver=null;



    public WebDriver getDriver(){

            driver = new ChromeDriver();

            return driver;
    }

    @Step("Launch the app")
    @Given("^User Launch the Application$")
    public  void LaunchtheApp(){

        driver = getDriver();
        driver.get("http://newtours.demoaut.com");
    }


    @Step("Navigate to Registration Page")
    @When("^User is able to register with the application$")
    public void LogintoApp(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     driver.findElement(By.xpath("//a[contains(@href,'mercuryregister.php')]")).click();

    }

    @After
    public void CloseApp(){

        driver.quit();
    }
}
