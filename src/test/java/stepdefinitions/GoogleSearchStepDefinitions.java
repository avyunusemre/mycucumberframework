package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearchStepDefinitions {
    GooglePage googlePage = new GooglePage();

    @Given("user is in the google page")
    public void user_is_in_the_google_page() {

        Driver.getDriver().get("https://www.google.com");
    }

    @Given("user search teapot")
    public void user_search_teapot() {
        googlePage.searchBox.sendKeys("iphone");
        googlePage.searchBox.submit();

    }

    @Then("verify the result has teapot")
    public void verify_the_result_has_teapot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }

    @Given("user search nokia")
    public void user_search_nokia() {
        googlePage.searchBox.sendKeys("nokia" + Keys.ENTER);
    }

    @Then("verify the result has nokia")
    public void verify_the_result_has_nokia() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("nokia"));
    }

    @Given("user searches {string}")
    public void user_search(String string) {
        googlePage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("verify result has {string}")
    public void verify_result_has(String string) {
        String title = Driver.getDriver().getTitle();
        System.out.println("TITLE : " + Driver.getDriver().getTitle());
        Assert.assertTrue(title.contains(string));
    }


}
