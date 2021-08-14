package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class StepDefinitions {

  private final LoginPage loginPage;
  private final MainPage mainPage;
  private final WebDriver driver = new ChromeDriver();


  public StepDefinitions() {
    loginPage = new LoginPage(driver);
    mainPage = new MainPage(driver);
  }

  @Given("I am on the Sauce Demo Login Page")
  public void IAmOnTheSauceDemoLoginPage() {
    loginPage.confirmMe();
  }

  @When("I fill the account information for account StandardUser into the Username field and the Password field")
  public void IFillTheAccountInformationForAccountStandardUserIntoTheUsernameFieldAndThePasswordField() {
    loginPage.login();
  }

  @And("I click the Login Button")
  public void IClickTheLoginButton() {
    loginPage.clickloginButton();
  }

  @Then("I am redirected to the Sauce Demo Main Page")
  public void IAmRedirectedTtoTheSauceDemoMainPage() {
    mainPage.confirmMe();
  }

  @And("I verify the App Logo exists")
  public void IVerifyTheAppLogoExists() {
    assertTrue(mainPage.testLogo().contains("url(\"https://www.saucedemo.com/static/media/logo3x.096bf4a7.svg\")"));
  }

  @When("I fill the account information for account LockedOutUser into the Username field and the Password field")
  public void IFillTheAccountInformationForAccountLockedOutUserIntoTheUsernameFieldAndThePasswordField() {
    loginPage.badLogin();
  }

  @Then("I verify the Error Message contains the text {string}")
  public void iVerifyTheErrorMessageContainsTheText(String arg0) {
    assertTrue(loginPage.testError().contains(arg0));
  }
}
