package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginPage {

  WebDriver driver;

  public LoginPage(final WebDriver driver) {
    this.driver = driver;
  }

  /**
   * method to click the login button
   */
  public void clickloginButton() {
    WebElement element = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
    element.click();
  }

  /**
   * method to enter the username
   *
   */
  public void enterUsername() {
    WebElement element = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
    element.sendKeys("standard_user");
  }

  /**
   * method to enter the locked out user
   */
  public void enterLockedOutUser() {
    WebElement element = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
    element.sendKeys("locked_out_user");
  }

  /**
   * method to enter the password
   */
  public void enterPassword() {
    WebElement element = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    element.sendKeys("secret_sauce");
  }

  /**
   * method to login
   */
  public void login() {
    enterUsername();
    enterPassword();
  }

  /**
   * method to test invalid login
   */
  public void badLogin(){
    enterLockedOutUser();
    enterPassword();
  }

  /**
   * method to return error msg
   *
   * @return error msg
   */
  public String testError(){
    WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3"));
    return element.getText();
  }

  /**
   * method used to tell if you are actually on a given page
   */
  public void confirmMe() {
    driver.navigate().to("https://www.saucedemo.com");
    assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
  }
}
