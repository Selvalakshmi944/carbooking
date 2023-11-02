package org.hyundai.carbooking.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingPojo {

	@FindBy(id = "inputmodel-01")
	private WebElement inputModel;

	@FindBy(id = "inputfuel-01")
	private WebElement inputFuel;

	@FindBy(id = "inputvrnt-01")
	private WebElement inputVarient;

	@FindBy(id = "inputext-01")
	private WebElement exteriorColor;

	@FindBy(id = "state-01")
	private WebElement dealerState;

	@FindBy(id = "dealer-city-01")
	private WebElement dealerCity;

	@FindBy(id = "bookacardelar")
	private WebElement dealerName;
	
	@FindBy(id = "dealeraddresscol")
	private WebElement dealerAddressCol;

	public BookingPojo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getInputModel() {
		return inputModel;
	}

	public WebElement getInputFuel() {
		return inputFuel;
	}

	public WebElement getInputVarient() {
		return inputVarient;
	}

	public WebElement getExteriorColor() {
		return exteriorColor;
	}

	public WebElement getDealerState() {
		return dealerState;
	}

	public WebElement getDealerCity() {
		return dealerCity;
	}

	public WebElement getDealerName() {
		return dealerName;
	}

	public WebElement getDealerAddressCol() {
		return dealerAddressCol;
	}
	
}
