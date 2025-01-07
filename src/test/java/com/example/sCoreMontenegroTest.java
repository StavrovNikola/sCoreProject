package com.example;
import com.example.MainPage;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Arrays;

public class sCoreMontenegroTest {

    private MainPage mainPage;
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Enable headless mode for Jenkins
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("window-size=1920,1080");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        mainPage = new MainPage(driver);
    }

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 10)
    public void InfoOfferRizikoKreditUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoKreditMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Spektar with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 20)
    public void InfoOfferSpektarUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SpektarMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumDozivljenjeMNE.click();
        mainPage.inputSumDozivljenjeMNE.clear();
        mainPage.inputSumDozivljenjeMNE.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Joker with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test (priority = 30)
    public void InfoOfferJokerUW () {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.JokerMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("25");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Favorit with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test (priority = 40)
    public void InfoOfferFavoritUW () {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.FavoritMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(7);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2024");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Vital Kredit with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 50)
    public void InfoOfferRizikoVitalKreditUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoVitalKreditMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInMonthsMNE.click();
        mainPage.DurationInMonthsMNE.clear();
        mainPage.DurationInMonthsMNE.sendKeys("36");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("188");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("10");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();
}
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 60)
    public void InfoOfferRizikoPlusUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoPlusMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("12");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

         }

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with POC role ")
    @Step("Creating info offer with POC")
    @Owner("Nikola Stavrov")
    @Test(priority = 70)
    public void InfoOfferRizikoKreditPOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescorePOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("sLusalica.2019");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoKreditMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Spektar with POC role ")
    @Step("Creating info offer with POC")
    @Owner("Nikola Stavrov")
    @Test(priority = 80)
    public void InfoOfferSpektarPOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescorePOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("sLusalica.2019");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SpektarMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1972");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumDozivljenjeMNE.click();
        mainPage.inputSumDozivljenjeMNE.clear();
        mainPage.inputSumDozivljenjeMNE.sendKeys("8000");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Joker with POC role ")
    @Step("Creating info offer with POC")
    @Owner("Nikola Stavrov")
    @Test (priority = 90)
    public void InfoOfferJokerPOC () {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescorePOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("sLusalica.2019");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.JokerMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Favorit with POC role ")
    @Step("Creating info offer with POC")
    @Owner("Nikola Stavrov")
    @Test (priority = 100)
    public void InfoOfferFavoritPOC () {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescorePOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("sLusalica.2019");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.FavoritMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("17");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(7);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Vital Kredit with POC role ")
    @Step("Creating info offer with POC")
    @Owner("Nikola Stavrov")
    @Test(priority = 110)
    public void InfoOfferRizikoVitalKreditPOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescorePOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("sLusalica.2019");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoVitalKreditMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInMonthsMNE.click();
        mainPage.DurationInMonthsMNE.clear();
        mainPage.DurationInMonthsMNE.sendKeys("24");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("50000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("188");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("13");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();
    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with POC role ")
    @Step("Creating info offer with POC")
    @Owner("Nikola Stavrov")
    @Test(priority = 120)
    public void InfoOfferRizikoPlusPOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescorePOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("sLusalica.2019");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoPlusMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("13000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1973");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 130)
    public void InfoOfferRizikoKreditAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Score.Agent1!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoKreditMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Spektar with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 140)
    public void InfoOfferSpektarAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Score.Agent1!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SpektarMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.12.2024");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("12000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1992");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumDozivljenjeMNE.click();
        mainPage.inputSumDozivljenjeMNE.clear();
        mainPage.inputSumDozivljenjeMNE.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Joker with Agent role")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test (priority = 150)
    public void InfoOfferJokerAgent () {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Score.Agent1!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.JokerMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Favorit with Agent role")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test (priority = 160)
    public void InfoOfferFavoritAgent () {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Score.Agent1!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.FavoritMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(7);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Vital Kredit with Agent role")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 170)
    public void InfoOfferRizikoVitalKreditAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Score.Agent1!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoVitalKreditMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInMonthsMNE.click();
        mainPage.DurationInMonthsMNE.clear();
        mainPage.DurationInMonthsMNE.sendKeys("12");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("14500");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1982");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("188");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("13");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();
    }
    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with Agent role")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 180)
    public void InfoOfferRizikoPlusAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Score.Agent1!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoPlusMNE.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1973");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Montenegro")
    @Feature("Annulations")
    @Description("Annulations of info offer")
    @Step("Annulation of info offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 190)
    public void AnnulationCustomerWithdrawalInfoOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Annulations")
    @Description("Annulations of info offer")
    @Step("Annulation of info offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 200)
    public void AnnulationContractReplacementInfoOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Annulations")
    @Description("Annulations of offer")
    @Step("Annulation of offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 210)
    public void AnnulationCustomerWithdrawalOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(6);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Annulations")
    @Description("Annulations of offer")
    @Step("Annulation of offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 220)
    public void AnnulationContractReplacementOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(8);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
        mainPage.Annule.click();


    }


    @Epic("sCore Montenegro")
    @Feature("Annulations")
    @Description("Annulations of activated info offer")
    @Step("Annulation of activated info offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 230)
    public void AnnulationCustomerWithdrawalInfoOfferActivated() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Annulations")
    @Description("Annulations of activated info offer")
    @Step("Annulation of activated info offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 240)
    public void AnnulationContractReplacementInfoOfferActivated() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Client request")
    @Owner("Nikola Stavrov")
    @Test(priority = 250)
    public void CancellationClientRequest() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        new Select(mainPage.CancellationType).selectByIndex(1);
        new Select(mainPage.CancellationReason).selectByIndex(1);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }


    @Epic("sCore Montenegro")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Uniqa request")
    @Owner("Nikola Stavrov")
    @Test(priority = 260)
    public void CancellationUniqaRequest() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        new Select(mainPage.CancellationType).selectByIndex(2);
        new Select(mainPage.CancellationReason).selectByIndex(8);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();

    }

    @Epic("sCore Montenegro")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Dunning")
    @Owner("Nikola Stavrov")
    @Test(priority = 270)
    public void CancellationDunning() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        new Select(mainPage.CancellationType).selectByIndex(3);
        new Select(mainPage.CancellationReason).selectByIndex(12);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy")
    @Owner("Nikola Stavrov")
    @Test(priority = 280)
    public void Reactivation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferSearchMNE.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        mainPage.RequestActivationMNE.click();
        mainPage.CertificationSignatureMNE.click();
        mainPage.ReactivationMNE.click();


    }

    @Epic("sCore Montenegro")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Annul last cancellation")
    @Owner("Nikola Stavrov")
    @Test(priority = 290)
    public void ReactivationAnnulLastCancellation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferSearchMNE.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        mainPage.AnnulLastCancellationMNE.click();

    }

    @Epic("sCore Montenegro")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Annul client request")
    @Owner("Nikola Stavrov")
    @Test(priority = 300)
    public void ReactivationAnnulClientRequest() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferSearchMNE.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        mainPage.RequestActivationMNE.click();
        mainPage.CertificationSignatureMNE.click();
        mainPage.AnnulClientRequestMNE.click();

    }

    @Epic("sCore Montenegro")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Rejection")
    @Owner("Nikola Stavrov")
    @Test(priority = 310)
    public void ReactivationRejection() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferSearchMNE.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        mainPage.RequestActivationMNE.click();
        mainPage.CertificationSignatureMNE.click();
        mainPage.ReactivationMNE.click();
        mainPage.RejectionMNE.click();

    }

    @Epic("sCore Montenegro")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Spektar")
    @Owner("Nikola Stavrov")
    @Test(priority = 380)
    public void ClausesSpektar() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsMNE).selectByIndex(8);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka"):"Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Excepted Clause";

/*
        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(4);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select1 = new Select(Proizvod);
        select1.selectByIndex(8);

        WebElement ScrollRight = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight);
        Thread.sleep(2500);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        Select select2 = new Select(StatusDokumenta);
        select2.selectByIndex(10);

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretraga.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement ScrollRight1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight1);
        Thread.sleep(2500);

        WebElement AkcijaPretraga = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/span/a/img"));
        AkcijaPretraga.click();

        WebElement RaskidReaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/ul/li[6]/a"));
        RaskidReaktivacija.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života (OUŽ XII/2021) od 23.12.2021"):"Očekivani uslovi";

        WebElement UsloviPosljedicaNezgode = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert UsloviPosljedicaNezgode.getText().equals("Uslovi za osiguranje lica  od posljedica nesrećnog slučaja (nezgode) kao dopunskog osiguranja uz osiguranje života (UNE II/2017) od 6.2.2017. godine"):"Očekivani uslovi";

        WebElement TabelaInvaliditeta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert TabelaInvaliditeta.getText().equals("Tabela invaliditeta za odredivanje trajnog gubitka opšte radne sposobnosti usljed nesrecnog slucaja (TI X/2007) od 20.08.2007. godine"):"Očekivani uslovi";

        //  WebElement UsloviDnevnaNaknadaBolnica = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[4]/label"));
        //  assert UsloviDnevnaNaknadaBolnica.getText().equals("Uslovi za osiguranje dnevne naknade za boravak u bolnici kao dopunskog osiguranja uz osiguranje života (UDN II/2017) od 6.2.2017. godine"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement DefinicijaPropratnogTekstaUpitnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert DefinicijaPropratnogTekstaUpitnik.getText().equals("Definicija propratnog teksta uz upitnik"):"Očekivana klauzula";

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert KlauzulaOZastitiPodataka.getText().equals("Klauzula o zaštiti podataka"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement PredugovornoInformisanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert PredugovornoInformisanje.getText().equals("Predugovorno informisanje"):"Očekivana klauzula";
*/
    }

    @Epic("sCore Montenegro")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Joker")
    @Owner("Nikola Stavrov")
    @Test (priority = 390)
    public void ClausesJoker () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.ProductsMNE).selectByIndex(8);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka"):"Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Excepted Clause";
/*
        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(4);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select1 = new Select(Proizvod);
        select1.selectByIndex(2);

        WebElement ScrollRight = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight);
        Thread.sleep(2500);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        Select select2 = new Select(StatusDokumenta);
        select2.selectByIndex(10);

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretraga.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement ScrollRight1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight1);
        Thread.sleep(2500);

        WebElement AkcijaPretraga = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/span/a/img"));
        AkcijaPretraga.click();

        WebElement RaskidReaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/ul/li[6]/a"));
        RaskidReaktivacija.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života (OUŽ XII/2021) od 23.12.2021"):"Očekivani uslovi";

        //   WebElement UsloviTežeBolesti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[2]/label"));
        //   assert UsloviTežeBolesti.getText().equals("Uslovi za  osiguranje lica za slučaj nastupanja težih bolesti uz osiguranje života (UTB II/2017) od 6.2.2017. godine"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement DefinicijaPropratnogTekstaUpitnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert DefinicijaPropratnogTekstaUpitnik.getText().equals("Definicija propratnog teksta uz upitnik"):"Očekivana klauzula";

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert KlauzulaOZastitiPodataka.getText().equals("Klauzula o zaštiti podataka"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement PredugovornoInformisanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert PredugovornoInformisanje.getText().equals("Predugovorno informisanje"):"Očekivana klauzula";
*/
    }


    @Epic("sCore Montenegro")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - RizikoKredit")
    @Owner("Nikola Stavrov")
    @Test (priority = 400)
    public void ClausesRizikoKredit () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.ProductsMNE).selectByIndex(8);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka"):"Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Excepted Clause";

        /*
        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(4);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select1 = new Select(Proizvod);
        select1.selectByIndex(3);

        WebElement ScrollRight = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight);
        Thread.sleep(2500);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        Select select2 = new Select(StatusDokumenta);
        select2.selectByIndex(10);

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretraga.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement ScrollRight1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight1);
        Thread.sleep(2500);

        WebElement AkcijaPretraga = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/span/a/img"));
        AkcijaPretraga.click();

        WebElement RaskidReaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/ul/li[6]/a"));
        RaskidReaktivacija.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života (OUŽ XII/2021) od 23.12.2021"):"Očekivani uslovi";

        WebElement UsloviSmrtOpadajućaSUma = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert UsloviSmrtOpadajućaSUma.getText().equals("Uslovi za osiguranje života za slučaj smrti sa opadajućim osiguranim sumama od 20.12.2018. (UOOS XII/2018)"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement DefinicijaPropratnogTekstaUpitnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert DefinicijaPropratnogTekstaUpitnik.getText().equals("Definicija propratnog teksta uz upitnik"):"Očekivana klauzula";

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert KlauzulaOZastitiPodataka.getText().equals("Klauzula o zaštiti podataka"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement PredugovornoInformisanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert PredugovornoInformisanje.getText().equals("Predugovorno informisanje"):"Očekivana klauzula";
*/
    }


    @Epic("sCore Montenegro")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - RizikoPlus")
    @Owner("Nikola Stavrov")
    @Test (priority = 410)
    public void ClausesRizikoPlus () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.ProductsMNE).selectByIndex(8);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka"):"Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Excepted Clause";
/*
        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(4);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select1 = new Select(Proizvod);
        select1.selectByIndex(4);

        WebElement ScrollRight = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight);
        Thread.sleep(2500);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        Select select2 = new Select(StatusDokumenta);
        select2.selectByIndex(10);

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretraga.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement ScrollRight1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight1);
        Thread.sleep(2500);

        WebElement AkcijaPretraga = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/span/a/img"));
        AkcijaPretraga.click();

        WebElement RaskidReaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/ul/li[6]/a"));
        RaskidReaktivacija.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života (OUŽ XII/2021) od 23.12.2021"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement DefinicijaPropratnogTekstaUpitnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert DefinicijaPropratnogTekstaUpitnik.getText().equals("Definicija propratnog teksta uz upitnik"):"Očekivana klauzula";

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert KlauzulaOZastitiPodataka.getText().equals("Klauzula o zaštiti podataka"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement PredugovornoInformisanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert PredugovornoInformisanje.getText().equals("Predugovorno informisanje"):"Očekivana klauzula";
*/
    }


    @Epic("sCore Montenegro")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Favorit")
    @Owner("Nikola Stavrov")
    @Test (priority = 420)
    public void ClausesFavorit () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.ProductsMNE).selectByIndex(8);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka"):"Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Excepted Clause";
/*
        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(4);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select1 = new Select(Proizvod);
        select1.selectByIndex(6);

        WebElement ScrollRight = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight);
        Thread.sleep(2500);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        Select select2 = new Select(StatusDokumenta);
        select2.selectByIndex(10);

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretraga.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement ScrollRight1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight1);
        Thread.sleep(2500);

        WebElement AkcijaPretraga = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/span/a/img"));
        AkcijaPretraga.click();

        WebElement RaskidReaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/ul/li[6]/a"));
        RaskidReaktivacija.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života (OUŽ XII/2021) od 23.12.2021"):"Očekivani uslovi";

        WebElement UsloviZaOsiguranjeDjece = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert UsloviZaOsiguranjeDjece.getText().equals("Uslovi za osiguranje djece (UOD II/2017) od 6.2.2017. godine"):"Očekivani uslovi";

        WebElement UsloviZaOsiguranjeLicaNesrećniSlučaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert UsloviZaOsiguranjeLicaNesrećniSlučaj.getText().equals("Uslovi za osiguranje lica  od posljedica nesrećnog slučaja (nezgode) kao dopunskog osiguranja uz osiguranje života (UNE II/2017) od 6.2.2017. godine"):"Očekivani uslovi";

        WebElement TabelaInvaliditeta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert TabelaInvaliditeta.getText().equals("Tabela invaliditeta za odredivanje trajnog gubitka opšte radne sposobnosti usljed nesrecnog slucaja (TI X/2007) od 20.08.2007. godine"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert KlauzulaOZastitiPodataka.getText().equals("Klauzula o zaštiti podataka"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement PredugovornoInformisanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert PredugovornoInformisanje.getText().equals("Predugovorno informisanje"):"Očekivana klauzula";
*/
    }


    @Epic("sCore Montenegro")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - RizikoVitalKredit")
    @Owner("Nikola Stavrov")
    @Test (priority = 430)
    public void ClausesRizikoVital () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.ProductsMNE).selectByIndex(8);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka"):"Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Excepted Clause";
/*
        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(4);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select1 = new Select(Proizvod);
        select1.selectByIndex(27);

        WebElement ScrollRight = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight);
        Thread.sleep(2500);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        Select select2 = new Select(StatusDokumenta);
        select2.selectByIndex(10);

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretraga.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement ScrollRight1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[20]/div/div/div/div/div/select"));
        js.executeScript("arguments[0].scrollIntoView()", ScrollRight1);
        Thread.sleep(2500);

        WebElement AkcijaPretraga = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/span/a/img"));
        AkcijaPretraga.click();

        WebElement RaskidReaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[2]/td[40]/div/div/ul/li[6]/a"));
        RaskidReaktivacija.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života (OUŽ XII/2021) od 23.12.2021"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement DefinicijaPropratnogTekstaUpitnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert DefinicijaPropratnogTekstaUpitnik.getText().equals("Definicija propratnog teksta uz upitnik"):"Očekivana klauzula";

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert KlauzulaOZastitiPodataka.getText().equals("Klauzula o zaštiti podataka"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement PredugovornoInformisanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert PredugovornoInformisanje.getText().equals("Predugovorno informisanje"):"Očekivana klauzula";
*/
    }

    @Epic("sCore Montenegro")
    @Feature("Export to excel")
    @Description("Checking funcionality of exporting data to excel")
    @Step("Checking funcionality of exporting data to excel - action Export to excel")
    @Owner("Nikola Stavrov")
    @Test (priority = 440)
    public void ExportToExcelMontenegro () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.12.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.ExportToExcel.click();


    }
    @Epic("sCore Montenegro")
    @Feature("SPNFT")
    @Description("Checking funcionality of SPNFT/Smaragd service")
    @Step("Checking funcionality of SPNFT - Creating documents with persons on SPNFT lists")
    @Owner("Nikola Stavrov")
    @Test (priority = 450)
    public void SPNFTMontenegro () throws Exception {

        mainPage.inputUsername.sendKeys("mcosovic MNE");
        mainPage.inputPassword.sendKeys("milena");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.JokerMNE, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.12.2024");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("0208981260171");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }

    }

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of SME KMP with UW role")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 460)
    public void InfoOfferSMEKMPUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescoreTehnika");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Februar.23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SMEKMPMNE.click();
        assert mainPage.SMEKMPCheckbox.getText().equals("SME ključni čovjek pravnog lica"):"Expected label";
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInMonthsMNE.click();
        mainPage.DurationInMonthsMNE.clear();
        mainPage.DurationInMonthsMNE.sendKeys("12");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("15");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();
}

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of SME KMP with BOC role")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 470)
    public void InfoOfferSMEKMPBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mnescorePOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("sLusalica.2019");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SMEKMPMNE.click();
        assert mainPage.SMEKMPCheckbox.getText().equals("SME ključni čovjek pravnog lica"):"Expected label";
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInMonthsMNE.click();
        mainPage.DurationInMonthsMNE.clear();
        mainPage.DurationInMonthsMNE.sendKeys("36");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(5);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("15");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();
    }

    @Epic("sCore Montenegro")
    @Feature("Info offer")
    @Description("Creating info offer of SME KMP with Bank Operater role")
    @Step("Creating info offer with Bank Operater")
    @Owner("Nikola Stavrov")
    @Test(priority = 480)
    public void InfoOfferSMEKMPBankOperater() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("mneSCoreBankOperator");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Score.BanOp23");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SMEKMPMNE.click();
        assert mainPage.SMEKMPCheckbox.getText().equals("SME ključni čovjek pravnog lica"):"Expected label";
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Petar Petrovic");
        mainPage.DurationInMonthsMNE.click();
        mainPage.DurationInMonthsMNE.clear();
        mainPage.DurationInMonthsMNE.sendKeys("60");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1973");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("180");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("82");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("15");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Joker")
    @Step("Creating new contract of Joker - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 490)
    public void NewContractJoker() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("mcosovic MNE");
        mainPage.inputPassword.sendKeys("milena");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.JokerMNE, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1211989700248");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.Stednja, mainPage.Zaposlen, mainPage.StalniIzvori, mainPage.NegativnaSaznanja, mainPage.TajnostTransakcije, mainPage.IdentifikacijaProblem, mainPage.KlijentInformacije, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.KID, mainPage.StampaAML, mainPage.PismoPropratno, mainPage.StampaUplatnica, mainPage.CertificationSignatureMNE, mainPage.linkTabPrintouts, mainPage.PolisaStampaj)) {
            webElement.click(); Thread.sleep(6000); }
        //assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 500)
    public void NewContractSpektar () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("mcosovic MNE");
        mainPage.inputPassword.sendKeys("milena");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.SpektarMNE, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1211989700248");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputDozivljenje.sendKeys("4000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.Stednja, mainPage.Zaposlen, mainPage.StalniIzvori, mainPage.NegativnaSaznanja, mainPage.TajnostTransakcije, mainPage.IdentifikacijaProblem, mainPage.KlijentInformacije, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.KID, mainPage.StampaAML, mainPage.PismoPropratno, mainPage.StampaUplatnica, mainPage.CertificationSignatureMNE, mainPage.linkTabPrintouts, mainPage.PolisaStampaj)) {
            webElement.click(); Thread.sleep(6000); }
        //assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar with vinculation - standard basic flow and standard bank")
    @Owner("Nikola Stavrov")
    @Test(priority = 510)
    public void NewContractVinculationSpektar () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("mcosovic MNE");
        mainPage.inputPassword.sendKeys("milena");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.SpektarMNE, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Vinculation.click();
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1211989700248");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputDozivljenje.sendKeys("4000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabVinculations, mainPage.AddVinculation)) {
            element.click(); }
        new Select(mainPage.Creditor).selectByIndex(1);
        new Select(mainPage.FirstVinculationBank).selectByIndex(5);
        mainPage.CreditLoanNumber.sendKeys("123123321");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.Activate, mainPage.linkTabMoneyLaundry, mainPage.Stednja, mainPage.Zaposlen, mainPage.StalniIzvori, mainPage.NegativnaSaznanja, mainPage.TajnostTransakcije, mainPage.IdentifikacijaProblem, mainPage.KlijentInformacije, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.KID, mainPage.StampaAML, mainPage.PismoPropratno, mainPage.StampaUplatnica, mainPage.CertificationSignatureMNE, mainPage.linkTabPrintouts, mainPage.PolisaStampaj)) {
            webElement.click(); Thread.sleep(6000); }
        //assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko kredit")
    @Step("Creating new contract of Riziko kredit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 520)
    public void NewContractRizikoKredit() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("mcosovic MNE");
        mainPage.inputPassword.sendKeys("milena");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.RizikoKreditMNE, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1211992700240");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        //mainPage.ConcernInterest.sendKeys("15");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabVinculations, mainPage.AddVinculation)) {
            element.click(); }
        new Select(mainPage.Creditor).selectByIndex(1);
        new Select(mainPage.FirstVinculationBank).selectByIndex(8);
        mainPage.CreditLoanNumber.sendKeys("4443335556");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.Activate, mainPage.linkTabMoneyLaundry, mainPage.Stednja, mainPage.Zaposlen, mainPage.StalniIzvori, mainPage.NegativnaSaznanja, mainPage.TajnostTransakcije, mainPage.IdentifikacijaProblem, mainPage.KlijentInformacije, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.KID, mainPage.StampaAML,/*mainPage.PismoPropratno*/ mainPage.PismoPropratno, mainPage.CertificationSignatureMNE, mainPage.linkConfirm, mainPage.linkCreatePolicy, mainPage.PolisaStampaj)) {
            webElement.click(); Thread.sleep(6000); }
       // assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Favorit")
    @Step("Creating new contract of Favorit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 530)
    public void NewContractFavorit() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("mcosovic MNE");
        mainPage.inputPassword.sendKeys("milena");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.FavoritMNE, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1211993700244");
        for (WebElement webElement1 : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.linkMainContentIndividualClient, mainPage.SavePerson)) {
            webElement1.click();}
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(500, 0);");
        mainPage.DodajOsiguranik.click();
        Thread.sleep(2500);
        WebElement iFrame2 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame2));
        mainPage.IdentificationNumber.sendKeys("1105020700246");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.linkMainContentIndividualClient, mainPage.SavePerson)) {
            element.click(); }
        js.executeScript("window.scrollBy(500, 0);");
        mainPage.labelUgovaraPlatilacIstoLice.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.Stednja, mainPage.Zaposlen, mainPage.StalniIzvori, mainPage.NegativnaSaznanja, mainPage.TajnostTransakcije, mainPage.IdentifikacijaProblem, mainPage.KlijentInformacije, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.KID, mainPage.StampaAML, mainPage.PismoPropratno, mainPage.StampaUplatnica, mainPage.CertificationSignatureMNE, mainPage.linkTabPrintouts, mainPage.PolisaStampaj)) {
            webElement.click(); Thread.sleep(6000); }
       // assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko vital kredit")
    @Step("Creating new contract of Riziko vital kredit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 540)
    public void NewContractRizikoVitalKredit() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("mcosovic MNE");
        mainPage.inputPassword.sendKeys("milena");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.RizikoVitalKreditMNE, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInMonthsMNE.sendKeys("24");
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1211992700240");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.sendKeys("10");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabVinculations, mainPage.AddVinculation)) {
            element.click(); }
        new Select(mainPage.Creditor).selectByIndex(1);
        new Select(mainPage.FirstVinculationBank).selectByIndex(8);
        mainPage.CreditLoanNumber.sendKeys("4443335556");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.Activate, mainPage.linkTabMoneyLaundry, mainPage.Stednja, mainPage.Zaposlen, mainPage.StalniIzvori, mainPage.NegativnaSaznanja, mainPage.TajnostTransakcije, mainPage.IdentifikacijaProblem, mainPage.KlijentInformacije, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.KID, mainPage.StampaAML,/*mainPage.PismoPropratno*/ mainPage.PismoPropratno, mainPage.CertificationSignatureMNE, mainPage.linkConfirm, mainPage.linkCreatePolicy, mainPage.PolisaStampaj)) {
            webElement.click(); Thread.sleep(6000); }
        // assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko Plus")
    @Step("Creating new contract of Riziko Plus - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 550)
    public void NewContractRizikoPlus() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("mcosovic MNE");
        mainPage.inputPassword.sendKeys("milena");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.RizikoPlusMNE, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        mainPage.DatumPocetka.clear();
        mainPage.DatumPocetka.sendKeys("01.01.2025");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1211992700240");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(2);
        mainPage.InsuredSumOrPremium.sendKeys("350");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        for (WebElement webElement : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.Activate, mainPage.linkTabMoneyLaundry, mainPage.Stednja, mainPage.Zaposlen, mainPage.StalniIzvori, mainPage.NegativnaSaznanja, mainPage.TajnostTransakcije, mainPage.IdentifikacijaProblem, mainPage.KlijentInformacije, mainPage.linkAcceptMoneyLaundry)) {
            webElement.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkTabPrintouts, mainPage.KID, mainPage.StampaAML, mainPage.PismoPropratno, mainPage.CertificationSignatureMNE, mainPage.linkConfirm, mainPage.linkCreatePolicy, mainPage.PolisaStampaj)) {
            webElement.click(); Thread.sleep(4000);}
        /*mainPage.PismoPropratno*/
        // assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

     }





