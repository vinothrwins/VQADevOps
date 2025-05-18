package com.vqa.sanity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterDemoFlow {	
	
	public WebDriver driver;
	
	String url = "https://vinothqaacademy.com";
	String firstNameValue = "Vinoth";
	String lastNameValue = "R";
	String addressValue = "Saravana Flats";
	String streetaddressValue = "Prasanna Street";
	String AptValue = "F1";
	String cityName = "Chennai";
	String stateName = "Tamil Nadu";
	String countryName = "India";
	String emailValue = "vinoth@gmail.com";
	String dODValue = "09/30/25";
	String cnvTimeHHValue = "02";
	String cnvTimeMMValue = "05";
	String mobileNumberValue = "6383544892";
	String enterYQueryValue = "Is learning selenium automation using java easy?";
	String expsucFulMessage = "Registration Form is Successfully Submitted";
	
	@Test(priority = 1)
	public void launchApplication() {
		
		// Step 1. Launch the Application

		//2. Create the object instance for chrome browser in he webdriver interface
		driver = new ChromeDriver();
		
		// implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		

		//launch the URL
		driver.get(url);

		//maximize the browser
		driver.manage().window().maximize();
		System.out.println("Application is launched successdully");

		//Validate the current URL
		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = "https://vinothqaacademy.com/";

		if(actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("Both the actual and expected URLs are the same");
			System.out.println("The current URl page is "+ actualCurrentUrl);
		}
		else
		{
			System.out.println("Both the actual and expected URLs are not the same");
			System.out.println("The actual current URl page is "+ actualCurrentUrl);
			System.out.println("The expected current URl page is "+ expectedCurrentUrl);
		}


		//Validate the page title
		//System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTitle = "Vinoth Q.A Academy - Learn With Clarity";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Both the actual and expected titles are the same");
			System.out.println("The page title is "+ actualTitle);
		}
		else
		{
			System.out.println("Both the actual and expected titles are not the same");
			System.out.println("The actual page title is "+ actualTitle);
			System.out.println("The expected page title is "+ expectedTitle);
		}
		
		
		System.out.println("Application is launched successfully");
	}
	
	@Test(priority = 2)
	public void navigateToRegisterDemoPage() {
		
		// Step 2. Navigate to Registration Form Page

		//navigate to Registration form page
		driver.navigate().to("https://vinothqaacademy.com/demo-site/");
/*		Actions action = new Actions(driver);
		WebElement demoSites = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]"));
		action.moveToElement(demoSites).perform();
		WebElement practiceAutomation = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Practice Automation')]"));
		action.moveToElement(practiceAutomation).perform();
		WebElement registrationForm = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Registration Form']"));
		registrationForm.click(); */
		
		System.out.println("Register Demo page is displayed successfully");
	}
	
	
	@Test(priority = 3)
	public void registerUser() {
		
		// Step 3. Fill the form(all the fields) and perform validation

		//1. Validate the logo image alt text is “Vinoth Q.A Academy”

		WebElement logoImage = driver.findElement(By.xpath("//img[@alt='Vinoth Q.A Academy']"));
		if (logoImage.isDisplayed()) {
			//System.out.println("Logo image displayed");

			String ActlogoImage = logoImage.getAttribute("alt");  
			String ExplogoImage = "Vinoth Q.A Academy"; 
			if(ActlogoImage.equals(ExplogoImage)) {
				System.out.println("Actual and Expected logo image text are same");
				System.out.println("Actual logo image is " + ActlogoImage );
			}
			else
			{
				System.out.println("Actual and Expected logo image text are not same");
				System.out.println("Actual logo image is " + ActlogoImage );
				System.out.println("Expected logo image is " + ExplogoImage );
			}
		}
		else
		{
			System.out.println("Logo image is not displayed");
		}

		//2. Validate the form title is “Register For Demo”

		WebElement formTitle = driver.findElement(By.xpath("//h3[normalize-space()='Registration Form']"));
		if (formTitle.isDisplayed()) {
			//System.out.println(formTitle.getText());

			String actFormTitle = formTitle.getText();  
			String expFormTitle = "Registration Form"; 
			if(actFormTitle.equals(expFormTitle)) {
				System.out.println("Actual and Expected form title are same");
				System.out.println("Actual form title is " + actFormTitle );
			}
			else
			{
				System.out.println("Actual and Expected form title are not same");
				System.out.println("Actual form title is " + actFormTitle );
				System.out.println("Expected form title is " + expFormTitle );
			}
		}

		//3. Fill the form

		//First name
		WebElement firstname = driver.findElement(By.id("vfb-5"));
		if (firstname.isDisplayed()) {
			System.out.println("First name is displayed");

			//Enter value
			firstname.sendKeys(firstNameValue);
			System.out.println("First name entered is " + firstNameValue);
		}
		else
		{
			System.out.println("First name is not displayed");
		}

		// Last name
		WebElement lasttname = driver.findElement(By.id("vfb-7"));
		if (lasttname.isDisplayed()) {
			System.out.println("Last name is displayed");

			//Enter value
			lasttname.sendKeys(lastNameValue);
			System.out.println("Last name entered is " + lastNameValue);
		}
		else
		{
			System.out.println("Last name is not displayed");
		}

		// Gender radio button
		// male radio button
		WebElement maleRadiobutton = driver.findElement(By.id("vfb-31-1"));
		if (maleRadiobutton.isSelected()) {
			System.out.println("Male radio button is selected");
		}
		else
		{
			System.out.println("Male radio button is not selected");

			//Select the radio button
			maleRadiobutton.click();
			System.out.println("Male radio button is selected");
		}

		// Java checkbox checked
		WebElement javaCheckBox = driver.findElement(By.id("vfb-20-1"));
		if(javaCheckBox.isSelected()) {
			System.out.println("Java Check Box is selected");
		}
		else
		{
			System.out.println("Java Check Box is not selected");

			// CHECKED 
			javaCheckBox.click();
			System.out.println("Java Check Box is CHECKED");
		}


		//selenium webdriver checkbox checked
		WebElement selWebCheckBox = driver.findElement(By.id("vfb-20-0"));				
		if(selWebCheckBox.isSelected()) {
			System.out.println("Selenium webdriver Check Box is selected");
		}
		else
		{
			System.out.println("Selenium webdriver Check Box is not selected");

			// CHECKED 
			selWebCheckBox.click();
			System.out.println("Selenium webdriver Check Box is CHECKED");
		}


		//DevOps checkbox unchecked
		WebElement devOpsCheckBox = driver.findElement(By.id("vfb-20-3"));				
		if(devOpsCheckBox.isSelected()) {
			System.out.println("Devops Check Box is selected");
			devOpsCheckBox.click();
			System.out.println("Devops Check Box is unchecked");
		}
		else
		{
			System.out.println("Java Check Box is not selected");
		}
		
		
		
		// Address
		WebElement address = driver.findElement(By.id("vfb-13-address"));
		if (address.isDisplayed()) {
			System.out.println("Address is displayed");

			//Enter value
			address.sendKeys(addressValue);
			System.out.println("Address entered is " + addressValue);
		}
		else
		{
			System.out.println("Address is not displayed");
		}

		// Street Address
		WebElement streetAddress = driver.findElement(By.id("vfb-13-address-2"));
		if (streetAddress.isDisplayed()) {
			System.out.println("Address is displayed");

			//Enter value
			streetAddress.sendKeys(streetaddressValue);
			System.out.println("street address entered is " + streetaddressValue);
		}
		else
		{
			System.out.println("street address is not displayed");
		}

		//Apt, Suite, Bldg. (optional)
		WebElement apt = driver.findElement(By.id("vfb-13-city"));
		if (apt.isDisplayed()) {
			System.out.println("Apt is displayed");

			//Enter value
			apt.sendKeys(AptValue);
			System.out.println("Apt entered is " + AptValue);
		}
		else
		{
			System.out.println(" Apt is not displayed");
		}

		// City
		WebElement city = driver.findElement(By.id("vfb-13-zip"));
		if (city.isDisplayed()) {
			System.out.println("City is displayed");

			//Enter value
			city.sendKeys(cityName);
			System.out.println("City entered is " + cityName);
		}
		else
		{
			System.out.println("City is not displayed");
		}


		// State
		WebElement state = driver.findElement(By.id("vfb-13-state"));
		if (state.isDisplayed()) {
			System.out.println("State is displayed");

			//Enter value
			state.sendKeys(stateName);
			System.out.println("State entered is " + stateName);
		}
		else
		{
			System.out.println("State is not displayed");
		}


		// Country
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		if (countryDropDown.isDisplayed()) {
			System.out.println("Country dropdown is displayed");

			Select countryDD = new Select(countryDropDown);

			// Select by visibletext
			countryDD.selectByVisibleText(countryName);
			System.out.println("Country selected is " + countryName);

		}
		else
		{
			System.out.println("Country dropdown is not displayed");
		}


		// Email
		WebElement email = driver.findElement(By.id("vfb-14"));
		if (email.isDisplayed()) {
			System.out.println("Email is displayed");

			//Enter value
			email.sendKeys(emailValue);
			System.out.println("Email entered is " + emailValue);
		}
		else
		{
			System.out.println("Email is not displayed");
		}


		// Date of demo
		WebElement dOD = driver.findElement(By.id("vfb-18"));
		if (dOD.isDisplayed()) {
			System.out.println("DOD is displayed");

			//Enter value
			dOD.sendKeys(dODValue);
			System.out.println("DOD entered is " + dODValue);
		}
		else
		{
			System.out.println("DOD is not displayed");
		}


		// Convenient Time for HH
		WebElement cnvTimeHour = driver.findElement(By.id("vfb-16-hour"));
		if (cnvTimeHour.isDisplayed()) {
			System.out.println("Convenient time HH dropdown is displayed");

			Select cnvTimeDD1 = new Select(cnvTimeHour);

			// Select by visibletext
			cnvTimeDD1.selectByVisibleText(cnvTimeHHValue);
			System.out.println("Convenient time HH selected is " + cnvTimeHHValue);

		}
		else
		{
			System.out.println("Convenient time HH dropdown is not displayed");
		}


		// Convenient Time for MM
		WebElement cnvTimeMinute = driver.findElement(By.id("vfb-16-min"));
		if (cnvTimeMinute.isDisplayed()) {
			System.out.println("Convenient time MM dropdown is displayed");

			Select cnvTimeDD2 = new Select(cnvTimeMinute);

			// Select by visibletext
			cnvTimeDD2.selectByVisibleText(cnvTimeMMValue);
			System.out.println("Convenient time MM selected is " + cnvTimeMMValue);

		}
		else
		{
			System.out.println("Convenient time MM dropdown is not displayed");
		}



		// Mobile number
		WebElement mblNumber = driver.findElement(By.id("vfb-19"));
		if (mblNumber.isDisplayed()) {
			System.out.println("Mobile number is displayed");

			//Enter value
			mblNumber.sendKeys(mobileNumberValue);
			System.out.println("Mobile numbber entered is " + mobileNumberValue);
		}
		else
		{
			System.out.println("Mobile number is not displayed");
		}

		

		// Enter your query
		WebElement enterYQuery = driver.findElement(By.id("vfb-23"));
		if (enterYQuery.isDisplayed()) {
			System.out.println("Enter your query is displayed");

			//Enter value
			enterYQuery.sendKeys(enterYQueryValue);
			System.out.println("Query entered is " + enterYQueryValue);
		}
		else
		{
			System.out.println("Enter your query is not displayed");
		}


		//Verification
		WebElement verification = driver.findElement(By.cssSelector("fieldset[id='item-vfb-2'] label:nth-child(2)"));
		//System.out.println(verification.getText());
		String VerValue = verification.getText();

		String value[] = VerValue.split(":");
		String verId = value[1].trim();
		System.out.println(verId);

		WebElement VerificationValue = driver.findElement(By.id("vfb-3"));
		VerificationValue.sendKeys(verId);
		System.out.println("Varification succcessfull");


		// Step 4. Click on Submit button


		// Submit button

		WebElement submit = driver.findElement(By.id("vfb-4"));

		//Enable or not
		if(submit.isEnabled()) {
			System.out.println("Submit button is enabled");
			// submit.click();
			
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", submit);
			System.out.println("Submit button is clicked");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}
		
		System.out.println("User registered successfully");
	}
	
	@Test(priority = 4)
	public void validateTransaction() {
		
		//Validate the successful message

		WebElement sucfulMessage = driver.findElement(By.xpath("//div[@id='messageContainer']"));
		if(sucfulMessage.isDisplayed()) {
			// System.out.println("Message displayed successfully");

			String actsucFulMessage = sucfulMessage.getText();
			if(actsucFulMessage.contains(expsucFulMessage)) {
				System.out.println("Both actual and expected successful message are same" );
				System.out.println("Successful message is " + actsucFulMessage);

				String transactionvalue[] = actsucFulMessage.split(":");
				String transactionID = transactionvalue[1].trim();
				System.out.println(transactionID);					  
			}
			else
			{
				System.out.println("Both actual and expected successful message are not same" );
				System.out.println("Successful message is " + actsucFulMessage);
				System.out.println("Successful message is " + expsucFulMessage);
			}
		}
		
		System.out.println("Transaction validated successfully");
	}
	
	
	@Test(priority = 5)
	public void closeApplication() {
		// close the application
		driver.quit();
		System.out.println("Application is closed successfully");
	}
}
