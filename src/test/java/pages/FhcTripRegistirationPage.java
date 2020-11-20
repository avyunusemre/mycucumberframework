package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FhcTripRegistirationPage {

    public FhcTripRegistirationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="UserName")
    public WebElement userNameBox;

    @FindBy(id="Password")
    public WebElement passwordBox;

    @FindBy(id="Email")
    public WebElement emailBox;

    @FindBy(id="NameSurname")
    public WebElement fullNameBox;

    @FindBy(id="PhoneNo")
    public WebElement phoneNoBox;

    @FindBy(id="SSN")
    public WebElement ssnBox;

    @FindBy(id="DrivingLicense")
    public WebElement drivingLicenceBox;

    @FindBy(id="IDCountry")
    public WebElement countryDropdown;

    @FindBy(id="IDState")
    public WebElement stateDropdown;

    @FindBy(id="Address")
    public WebElement addressBox;

    @FindBy(id="WorkingSector")
    public WebElement workingSectorBox;

    @FindBy(id="BirthDate")
    public WebElement birthDateBox;

    @FindBy(id="btnSubmit")
    public WebElement saveButton;

}
