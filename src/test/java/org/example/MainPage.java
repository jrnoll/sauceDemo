package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class MainPage {
  WebDriver driver;

  public MainPage(WebDriver driver) {
    this.driver = driver;
  }

  /**
   * method to return css values of background of the app-logo div
   *
   * @return String value of background
   */
  public String testLogo() {
    return driver.findElement(By.className("app_logo")).getCssValue("background");
  }

  /**
   * method used to tell if you are actually on a given page
   */
  public void confirmMe() {
    assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
  }
}
