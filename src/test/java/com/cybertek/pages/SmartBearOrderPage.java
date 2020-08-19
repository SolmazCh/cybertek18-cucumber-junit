package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPage {

    public SmartBearOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Order']")
    public WebElement OrderForm;

    @FindBy(xpath = "ctl00_MainContent_fmwOrder_ddlProduct")
   public WebElement productDropDown;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
   public WebElement quantityInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtUnitPrice")
    public WebElement pricePerUnitInput;

    @FindBy(xpath = "ctl00$MainContent$fmwOrder$txtDiscount")
    public WebElement discountInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtTotal']")
    public WebElement totalInput;

    @FindBy(xpath = "//input[@value='Calculate']")
    public WebElement calculateButton;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement customerNameInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement streetInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement stateInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zipInput;

    @FindBy(xpath = "(//input[@name='ctl00$MainContent$fmwOrder$cardList'])[1]")
    public WebElement VisaCardRadioButton;


    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
    public WebElement masterCardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_2")
    public WebElement americanExpressCardType;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement  cardNumberInput;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement expireDateInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//input[@type='reset']")
    public WebElement resetButton;






}
