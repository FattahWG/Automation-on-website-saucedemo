package step_definitions;

import com.example.pageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class loginSteps {
    private WebDriver webDriver;

    public loginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the web page")
    public void verifyLoginPage(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
    }

    @When("User input \"(.*)\" as userName and \"(.*)\" as password")
    public void inputCredential(String userName, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Then ("User will see \"(.*)\" on login page")
    public void displayErrorMassage(String ErrorText){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.getErrorMessage();
        assertEquals(ErrorText, loginPage.getErrorMessage());
    }
}