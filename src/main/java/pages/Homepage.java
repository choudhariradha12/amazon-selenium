package pages;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import testBase.webtestbase;

	


	public class Homepage extends webtestbase {
		
		@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")
	    WebElement usersearch;

	
		
	    public Homepage(){
	        PageFactory.initElements(driver,this);
	    }

	    public void userSearchClick(){
	        usersearch.click();
	    }
	   
	}

