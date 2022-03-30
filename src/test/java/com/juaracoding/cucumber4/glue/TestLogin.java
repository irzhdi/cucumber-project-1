package com.juaracoding.cucumber4.glue;

//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber4.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber4.drivers.DriverSingleton;
import com.juaracoding.cucumber4.pages.LoginPage;
import com.juaracoding.cucumber4.utlis.ConfigurationProperties;
import com.juaracoding.cucumber4.utlis.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class TestLogin {

	private WebDriver driver;
//	private LoginPage loginPage;
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
//		loginPage = new LoginPage();
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("Customer klik login button")
//	public void customer_klik_login_button() {
//		loginPage.submitLogin(configurationProperties.getEmail(), configurationProperties.getPassword());
//	}
	
	@Then("Customer berhasil login")
//	public void customer_berhasil_login() {
		//refresh
//		driver.navigate().refresh();
//		tunggu();
//		assertEquals(configurationProperties.getTxtWelcome(), loginPage.getTxtWelcome());
//	}
//	
	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
