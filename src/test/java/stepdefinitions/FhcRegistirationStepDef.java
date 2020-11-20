package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.FhcTripLoginPage;
import pages.FhcTripRegistirationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcRegistirationStepDef {

    FhcTripRegistirationPage fhcTripRegistirationPage = new FhcTripRegistirationPage();

    @Given("kullanici fhctrip sayfasindadir")
    public void kullanici_fhctrip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("kullanici creat a new account butonuna tiklar")
    public void kullanici_creat_a_new_account_butonuna_tiklar() {
        FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage();
        fhcTripLoginPage.registirationButtom.click();
    }

    @Given("kullanici username girer {string}")
    public void kullanici_username_girer(String string) {
        fhcTripRegistirationPage.userNameBox.sendKeys(string);
    }

    @Given("kullanici password girer {string}")
    public void kullanici_password_girer(String string) {
        fhcTripRegistirationPage.passwordBox.sendKeys(string);
    }

    @Given("kullanici email girer {string}")
    public void kullanici_email_girer(String string) {
        fhcTripRegistirationPage.emailBox.sendKeys(string);
    }

    @Given("kullanici Fullname girer {string}")
    public void kullanici_Fullname_girer(String string) {
        fhcTripRegistirationPage.fullNameBox.sendKeys(string);
    }

    @Given("kullanici phone number girer {string}")
    public void kullanici_phone_number_girer(String string) {
        fhcTripRegistirationPage.phoneNoBox.sendKeys(string);
    }

    @Given("kullanici social security number girer {string}")
    public void kullanici_social_security_number_girer(String string) {
        fhcTripRegistirationPage.ssnBox.sendKeys(string);
    }

    @Given("kullanici driving licence girer {string}")
    public void kullanici_driving_licence_girer(String string) {
        fhcTripRegistirationPage.drivingLicenceBox.sendKeys(string);
    }

    @Given("kullanici country secer")
    public void kullanici_country_secer() {
        Select optionCountry = new Select(fhcTripRegistirationPage.countryDropdown);
        optionCountry.selectByVisibleText("United States");
    }

    @Given("kullanici state secer")
    public void kullanici_state_secer() {
        Select optionState = new Select(fhcTripRegistirationPage.stateDropdown);
        optionState.selectByIndex(12);
    }

    @Given("kullanici address girer {string}")
    public void kullanici_address_girer(String string) {
        fhcTripRegistirationPage.addressBox.sendKeys(string);
    }

    @Given("kullanici working sector girer {string}")
    public void kullanici_working_sector_girer(String string) {
        fhcTripRegistirationPage.workingSectorBox.sendKeys(string);
    }

    @Given("kullanici birth date girer {string}")
    public void kullanici_birth_date_girer(String string) {
        fhcTripRegistirationPage.birthDateBox.sendKeys(string);
    }

    @Then("kullanici Save butonuna tiklar")
    public void kullanici_Save_butonuna_tiklar() {
        fhcTripRegistirationPage.saveButton.click();

    }

}