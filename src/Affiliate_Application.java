import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Affiliate_Application 
{
	static WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
	public static void main(String args[]) throws Exception
		
		{
	    
		driver.get("https://panel.qrq.co/apply/");
		WebElement Company_Name = driver.findElement(By.name("a-name"));
		Company_Name.sendKeys("Markchoice");
		
		WebElement Add_1 = driver.findElement(By.name("a-address1"));
		Add_1.sendKeys("Ring Road, Pin - 20015");
		
		WebElement Add_2 = driver.findElement(By.name("a-address2"));
		Add_2.sendKeys("Ring Road1, Pin - 20016");
		
		WebElement City = driver.findElement(By.name("a-city"));
		City.sendKeys("Kolkata");
		
		WebElement State = driver.findElement(By.name("a-state"));
		State.sendKeys("West Bengal");
		
		WebElement Zip = driver.findElement(By.name("a-zip"));
		Zip.sendKeys("1234567890");
		
		WebElement Country = driver.findElement(By.xpath(".//*[@id='id_a-country']"));
		Country.sendKeys("India");
		Thread.sleep(2000);
		Country.sendKeys(Keys.ENTER);
		
		WebElement Website = driver.findElement(By.name("a-website"));
		Website.sendKeys("http://yahoo.com");
	
		WebElement First_Name = driver.findElement(By.name("u-first_name"));
		First_Name.sendKeys("John");
		
		WebElement Last_Name = driver.findElement(By.name("u-last_name"));
		Last_Name.sendKeys("Williamson");
		
		WebElement Email = driver.findElement(By.name("u-email"));
		Email.sendKeys("gg12@yopmail.com");
		
		WebElement Pass = driver.findElement(By.name("u-password"));
		Pass.sendKeys("Set_12345");
		
		WebElement Pass_Confirm = driver.findElement(By.name("u-confirm_password"));
		Pass_Confirm.sendKeys("Set_12345");
		
		WebElement Job_Title = driver.findElement(By.name("c-title"));
		Job_Title.sendKeys("Affiliate Manager");
		
		WebElement Phone = driver.findElement(By.name("c-work_phone"));
		Phone.sendKeys("1234567890");
		
		WebElement im_service = driver.findElement(By.name("c-im_service"));
		im_service.sendKeys("test emi");
		
		WebElement im_username = driver.findElement(By.name("c-im_username"));
		im_username.sendKeys("test.skype");
		
		WebElement Timezone = driver.findElement(By.xpath(".//*[@id='id_c-timezone']"));
		Timezone.sendKeys("Asia/Kolkata");
		Thread.sleep(2000);
		Timezone.sendKeys(Keys.ENTER);
		
		WebElement Partner_Types = driver.findElement(By.name("a-partner_types"));
		Partner_Types.sendKeys("Affiliate Group");
		
		WebElement Networks = driver.findElement(By.name("a-current_networks"));
		Networks.sendKeys("Available wifi networks");
		
		WebElement Expertise = driver.findElement(By.name("a-top_verticals"));
		Expertise.sendKeys("YD Verticals");
		
		WebElement Experience_Years = driver.findElement(By.name("a-years_of_experience"));
		Experience_Years.sendKeys("6");
		
		WebElement Traffic_Source = driver.findElement(By.name("a-traffic_sources"));
		Traffic_Source.sendKeys("www promote");
		
		WebElement Traffic_Volume = driver.findElement(By.name("a-traffic_volume"));
		Traffic_Volume.sendKeys("10000");
		
		WebElement Traffic_Type = driver.findElement(By.name("a-traffic_type"));
		Traffic_Type.sendKeys("4G");
		
		WebElement Country_Volume = driver.findElement(By.name("a-country_with_volume"));
		Country_Volume.sendKeys("India");
		
		WebElement Pricing = driver.findElement(By.name("a-pricing_models"));
		Pricing.sendKeys("CPA");
		
		WebElement Monthly_Volume = driver.findElement(By.name("a-monthly_revenue"));
		Monthly_Volume.sendKeys("2000");
		
		WebElement Tracking_Platform = driver.findElement(By.name("a-tracking_platform"));
		Tracking_Platform.sendKeys("Windows,Android");
		
		WebElement Team_Size = driver.findElement(By.name("a-team_size"));
		Team_Size.sendKeys("10");
		
		WebElement Promoting = driver.findElement(By.name("a-promotions"));
		Promoting.sendKeys("Ads");
		
		WebElement Referral = driver.findElement(By.name("a-referred_by"));
		Referral.sendKeys("Debiprasad");
		
		WebElement Checkbox = driver.findElement(By.name("a-agree_terms_cond"));
		Checkbox.click();
		
		WebElement Save = driver.findElement(By.xpath("html/body/div[2]/div[2]/div/form/footer/button"));
		Save.click();
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
		Assert.assertEquals("https://panel.qrq.co/apply/success", s);
		
	}

}
	
