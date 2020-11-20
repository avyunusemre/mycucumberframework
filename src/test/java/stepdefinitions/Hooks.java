package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //@Before TestNg'deki @BeforeMethod gibi çalışır.
    //Her scenario'dan önce çalışır.
    //GLOBAL Hooks annotation
    @Before(order = 1)
    public void setUp() {
        System.out.println("Hooks Class- Setup Method");
    }

    //TAGGED Hooks annotation
    //Her ozel seneryodan önce çalışır
    @Before(value = "@iphone", order = 2)
    public void searchIphone() {
        System.out.println("Hooks Class- Iphone method");
    }


    //her scenario'dan önce çalışır
    @After
    public void tearDown() {
        System.out.println("Hooks Class - tearDown Method");

        //screenshoot almak icin
        final byte[] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        
        Driver.closeDriver();
    }



}
