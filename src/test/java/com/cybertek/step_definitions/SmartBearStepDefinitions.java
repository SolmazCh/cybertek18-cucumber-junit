package com.cybertek.step_definitions;

import com.cybertek.pages.SbViewAllOrdersPage;
import com.cybertek.pages.SmartBearLoginPage;
import com.cybertek.pages.SmartBearOrderPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDefinitions {

    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();

    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();



    @Given("User is logged into SmartBear account with valid credentials")
    public void user_is_logged_into_smart_bear_account_with_valid() {

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearLoginPage.loginInput.sendKeys("Tester");
        smartBearLoginPage.passwordInput.sendKeys("test");
        smartBearLoginPage.loginButton.click();
    }



    @Given("User is on Order Page and  fills out the form as followed:")
    public void user_is_on_order_page_and_fills_out_the_form_as_followed() {
        smartBearOrderPage.OrderForm.click();

    }
    @Then("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String dropdownValue) {
        Select productDropdown = new Select(smartBearOrderPage.productDropDown);
      productDropdown.selectByVisibleText(dropdownValue);
    }
    @Then("User enters {string} to quantity")
    public void user_enters_to_quantity(String Givenquantity) {
            smartBearOrderPage.quantityInput.sendKeys(Keys.BACK_SPACE+Givenquantity);
    }
    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
               smartBearOrderPage.customerNameInput.sendKeys(customerName);
    }
    @Then("User enters {string} to street")
    public void user_enters_to_street(String street) {
                 smartBearOrderPage.streetInput.sendKeys(street);
    }
    @Then("User enters {string} to city")
    public void user_enters_to_city(String city) {
               smartBearOrderPage.cityInput.sendKeys(city);
    }
    @Then("User enters {string} to state")
    public void user_enters_to_state(String string) {
               smartBearOrderPage.stateInput.sendKeys(string);
    }
    @Then("User enters {string} as a postal code")
    public void user_enters_as_a_postal_code(String string) {
               smartBearOrderPage.zipInput.sendKeys(string);
    }
    @Then("User selects {string} as card type")
    public void user_selects_as_card_type(String givenType) {

        if (givenType.equalsIgnoreCase("Visa")){
            smartBearOrderPage.VisaCardRadioButton.click();
        }else if (givenType.equalsIgnoreCase("MasterCard")){
            smartBearOrderPage.masterCardType.click();
        }else if (givenType.equalsIgnoreCase("American Express")){
            smartBearOrderPage.americanExpressCardType.click();
        }else{
            Assert.assertTrue("INVALID CARD TYPE!",false);
        }
    }
    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
             smartBearOrderPage.cardNumberInput.sendKeys(string);
    }
    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
               smartBearOrderPage.expireDateInput.sendKeys(string);
    }
    @Then("User clicks process button")
    public void user_clicks_process_button() {
            smartBearOrderPage.processButton.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String givenName) throws InterruptedException {
        SbViewAllOrdersPage SbViewAllOrdersPage =new SbViewAllOrdersPage();
        SbViewAllOrdersPage.viewAllOrdersLink.click();
        Thread.sleep(3000);
        String actualName = SbViewAllOrdersPage.newOrderNameCell.getText();

        Assert.assertTrue("Names are not matching!!!", actualName.equals(givenName));
    }



}
