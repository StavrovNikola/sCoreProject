package com.example.scoreproject;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class sCoreMontenegro {

    private MainPage mainPage;
    WebDriver driver = new ChromeDriver();



    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(7);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1972");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        mainPage.DurationInYear.sendKeys("18");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Podgorica");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(7);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("50000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("13000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1973");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("12000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1992");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(7);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("14500");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1982");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1973");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(6);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(8);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(1);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(1);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(8);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchMNE.click();
        mainPage.CancellationReactivationMNE.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(3);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(12);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
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

    }