package org.hyundai.carbooking;

import org.hyundai.carbooking.pom.BookingPojo;
import org.hyundai.carbooking.testbase.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CarBookingTest extends BaseTest {

	public static BookingPojo bookingPojo;

	@Before
	public void initPojo() {
		driver.get("https://clicktobuy.hyundai.co.in/#/bookACar?modelCode=0Y");
		bookingPojo = new BookingPojo(driver);
	}

	@Test
	public void captureAllDealerDetails() {
		selectDropdown(bookingPojo.getInputModel(), 1);
		selectDropdown(bookingPojo.getInputFuel(), 1);
		selectDropdown(bookingPojo.getInputVarient(), 1);
		selectDropdown(bookingPojo.getExteriorColor(), 1);
		printAllDealers();
	}
	
	@Test
	public void captureAllDealerDetails1() {
		selectDropdown(bookingPojo.getInputModel(), 1);
		selectDropdown(bookingPojo.getInputFuel(), 1);
		selectDropdown(bookingPojo.getInputVarient(), 1);
		selectDropdown(bookingPojo.getExteriorColor(), 1);
		printAllDealers();
	}

	public void printAllDealers() {
		Select stateSelect = new Select(bookingPojo.getDealerState());
		for (WebElement stateOption : stateSelect.getOptions()) {
			if (stateOption.isEnabled()) {
				System.out.println(">>>>>>>>>>>>" + stateOption.getText() + "<<<<<<<<<<<<");
				stateSelect.selectByVisibleText(stateOption.getText());
				selectCities();
			}
		}
	}

	public void selectCities() {
		Select citySelect = new Select(bookingPojo.getDealerCity());
		for (WebElement cityOption : citySelect.getOptions()) {
			if (cityOption.isEnabled()) {
				System.out.println("============" + cityOption.getText() + "============");
				citySelect.selectByVisibleText(cityOption.getText());
				selectDealerNames();
			}
		}
	}

	public void selectDealerNames() {
		Select dealerNameSelect = new Select(bookingPojo.getDealerName());
		for (WebElement dealerNameOption : dealerNameSelect.getOptions()) {
			if (dealerNameOption.isEnabled()) {
				dealerNameSelect.selectByVisibleText(dealerNameOption.getText());
				System.out.println("-----------Dealer Detail Start------------------");
				System.out.println(bookingPojo.getDealerAddressCol().getText());
				System.out.println("---------------Dealer Detail End--------------------");
			}
		}
	}

	@After
	public void closeBrowser() {
		close();
	}
}
