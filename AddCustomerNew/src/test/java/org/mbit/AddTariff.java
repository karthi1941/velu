package org.mbit;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariff {
	
	static WebDriver driver;
	@Given("User should be in the telecom home pages")
	public void user_should_be_in_the_telecom_home_pages() {
		
		System.setProperty("webdriver.chrome.driver","E:\\Karthivelu\\velu\\AddCustomerNew\\driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/telecom/");
	   
	}

	@Given("click add tariff buttonn")
	public void click_add_tariff_buttonn() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	    
	}

	@When("User enter all the datas")
	public void user_enter_all_the_datas() {
		
		driver.findElement(By.id("rental1")).sendKeys("1941");
		driver.findElement(By.id("local_minutes")).sendKeys("22");
		driver.findElement(By.id("inter_minutes")).sendKeys("33");
		driver.findElement(By.id("sms_pack")).sendKeys("43");
		driver.findElement(By.id("minutes_charges")).sendKeys("11");
		driver.findElement(By.id("inter_charges")).sendKeys("41");
		driver.findElement(By.id("sms_charges")).sendKeys("31");
	    
	}
	
	@When("User enter all the datass")
	public void user_enter_all_the_datas(DataTable tList) {
		List<String> Lists = tList.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(Lists.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(Lists.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(Lists.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(Lists.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(Lists.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(Lists.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(Lists.get(6));

	}
	
	@When("User enter all the datasss")
	public void user_enter_all_the_datasss(DataTable dataTable) {
		List<List<String>> Lists = dataTable.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(Lists.get(1).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(Lists.get(1).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(Lists.get(0).get(3));
		driver.findElement(By.id("sms_pack")).sendKeys(Lists.get(0).get(2));
		driver.findElement(By.id("minutes_charges")).sendKeys(Lists.get(2).get(2));
		driver.findElement(By.id("inter_charges")).sendKeys(Lists.get(0).get(3));
		driver.findElement(By.id("sms_charges")).sendKeys(Lists.get(1).get(1));
	}
	//@When("User enter all the datassse{String},{String},{String},{String},{String},{String},{String}")
//	public void user_enter_all_the_datasssee(String month,String lm,String im,String sms,String lpm,String ipm,String sms1)
	
//	{
//		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	
//	driver.findElement(By.id("rental1")).sendKeys(month);
	//driver.findElement(By.id("local_minutes")).sendKeys(lm);
//	driver.findElement(By.id("inter_minutes")).sendKeys(im);
//	driver.findElement(By.id("sms_pack")).sendKeys(sms);
//	driver.findElement(By.id("minutes_charges")).sendKeys(lpm);
	//driver.findElement(By.id("inter_charges")).sendKeys(ipm);
//	driver.findElement(By.id("sms_charges")).sendKeys(sms1);
//	}
	
	
	
	@When("User enter all the datassse")
	public void user_enter_all_the_datassse(io.cucumber.datatable.DataTable dataTable1) {
	List<Map<String, String>> Maps = dataTable1.asMaps(String.class,String.class);
	
	driver.findElement(By.id("rental1")).sendKeys(Maps.get(3).get("month"));
	driver.findElement(By.id("local_minutes")).sendKeys(Maps.get(3).get("lm"));
	driver.findElement(By.id("inter_minutes")).sendKeys(Maps.get(3).get("im"));
	driver.findElement(By.id("sms_pack")).sendKeys(Maps.get(3).get("sms"));
	driver.findElement(By.id("minutes_charges")).sendKeys(Maps.get(3).get("lpm"));
	driver.findElement(By.id("inter_charges")).sendKeys(Maps.get(3).get("ipm"));
	driver.findElement(By.id("sms_charges")).sendKeys(Maps.get(3).get("sms1"));
	}
	
	
	
	
	
	@When("click on submit buttons")
	public void click_on_submit_buttons() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	    


	@Then("user should be displayed congratulation message")
	public void user_should_be_displayed_congratulation_message() {
		
		WebElement Id = driver.findElement(By.xpath( "(//a[text()='Home'])[1]"));
	    Assert.assertTrue(Id.isDisplayed());
	   
	}



}
