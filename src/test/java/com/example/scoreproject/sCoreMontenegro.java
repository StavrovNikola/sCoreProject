package com.example.scoreproject;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class sCoreMontenegro {

    private MainPage mainPage;




    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
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
    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Joker")
    @Step("Creating new contract of Joker - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 320)
    public void NewContractJoker () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/Life/Joker/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("15");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("bar");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(4);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Uplatnica");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();
        Thread.sleep(2000);

        // Ovde je uradjen driver.switchTo().frame(iFrame) kako bih hvatao elemente sa iFrame

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement JMBG = driver.findElement(By.id("MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber"));
        JMBG.click();
        JMBG.sendKeys("2504990710010");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();

        WebElement iFramePlatitelj = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFramePlatitelj);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select2 = new Select(PravnoLice);
        select2.selectByVisibleText("Pravno");

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIB.click();
        PIB.clear();
        PIB.sendKeys("02717557");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravnoLice.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMB.click();
        ZakonskiJMB.clear();
        ZakonskiJMB.sendKeys("1804971215017");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement KorisnikZaslucajDozivljenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        Thread.sleep(1500);
        KorisnikZaslucajDozivljenja.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();



    /*     WebElement AdresaPosta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[16]/div/div/div/div[2]/div/div/a"));
            AdresaPosta.click();

            WebElement iFrame1 = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]"));
            driver.switchTo().frame(iFrame1);
            Thread.sleep(2000);

            WebElement IzaberiAdresu = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div/div[3]/div/table/tbody/tr[3]/td[4]/div/a"));
            IzaberiAdresu.click();

    */

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("3500");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("190");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("85");

        WebElement TezeBolesti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[2]/div/fieldset/div/div/div[2]/div/div[2]/div[1]/div/label"));
        TezeBolesti.click();

        WebElement TezeBolesti1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[2]/div/fieldset/div/div/div[2]/div/div[2]/div[2]/div/div/input"));
        TezeBolesti1.clear();
        TezeBolesti1.sendKeys("3500");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
        assert PorukaZU.getText().equals("Odaberite zdravstveni upitnik") : "Očekivana poruka nakon ugovornih elemenata";

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Saradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[3]/a"));
        Saradnik.click();

        WebElement PretragaSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div/fieldset/div[6]/div/a"));
        PretragaSaradnika.click();

        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(2500);

        WebElement OdabirSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div[2]/table/tbody/tr[1]/td[13]/div/a"));
        OdabirSaradnika.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement Snimi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Snimi.click();
        Thread.sleep(3000);
    /*
           WebElement UgovorniElementi1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
           UgovorniElementi1.click();

            WebElement PrihvatiUE1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            PrihvatiUE1.click();

            WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
            SacuvajteUpitnik.click();

            WebElement Izracunaj1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            Izracunaj1.click();
    */
        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement AMLPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
        assert AMLPoruka.getText().equals("Popunite Upitnik o spriječavanju pranja novca.") : "Očekivana poruka nakon aktivacije";

        WebElement KIDStampa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/div[1]/a"));
        KIDStampa.click();
        Thread.sleep(6500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement AMLPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert AMLPoruka1.getText().equals("Morate popuniti Upitnik o spriječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa a pre popunjavanja AMLa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement NamjenaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        NamjenaOsiguranja.click();

        WebElement Zanimanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zanimanje.click();

        WebElement PorijekloSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        PorijekloSredstava.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement NegativnaSaznanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[2]"));
        NegativnaSaznanja.click();

        WebElement TajnostTransakcije = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        TajnostTransakcije.click();

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/label[2]"));
        Identifikacija.click();

        WebElement InformacijeKlijent = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[3]"));
        InformacijeKlijent.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(5000);

           /* WebElement AMLAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/span/a/img"));
            AMLAkcija.click();

            WebElement AMLStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/ul/li[1]/a"));
            AMLStampaj.click();

            WebElement AMLSaradnikAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/span/a/img"));
            AMLSaradnikAkcija.click();

            WebElement AMLSaradnikStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/ul/li[1]/a"));
            AMLSaradnikStampaj.click();
    */
        //Thread.sleep(3500);

        // WebElement Dokumentacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        // Dokumentacija.click();



        //  js.executeScript("window.scrollBy(500, 0);");

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

        //Ovde je raskid polise

    /*          WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
            Raskid.click();

            WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            Raskini.click();

            WebElement RaskidPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
            assert RaskidPoruka.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

            WebElement RaskidPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
            assert RaskidPoruka1.getText().equals("Generisana štampa obaveštenja o raskidu.") : "Očekivana poruka nakon raskida";

            //Ovo je reaktivacija

            WebElement Reaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
            Reaktivacija.click();

            WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            KreirajZahtevZaReaktivaciju.click();

            WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            PotvrdaPotpisaReaktivacija.click();

            WebElement Reaktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            Reaktiviraj.click();

            WebElement ReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert ReaktivacijaPoruka.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";


            //Kreiranje nonpremium aneksa

            WebElement Aneksi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
            Aneksi.click();

            WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            NoviAneks.click();

            WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[2]/label"));
            NacinPlacanja.click();

            WebElement DatumPocetka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
            DatumPocetka.sendKeys("1.5.2024");

            WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
            KreirajAneks.click();

            WebElement MetodPlacanja1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
            Select select3 = new Select(MetodPlacanja1);
            select3.selectByVisibleText("Direct debit");

            WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            AktivirajAneks.click();

            WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            PotvrdaPotpisaAneksa.click();

            WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
            PonistavanjeAneksa.click();

            WebElement RazlogPonistenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/fieldset/div[1]/div/div/div/select"));
            Select select4 = new Select(RazlogPonistenja);
            select4.selectByVisibleText("Odustanak klijenta");

            WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            PonistiAneks.click();
            */
    }

    //Raskid.click();

    //Raskini.click();


    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 330)
    public void NewContractSpektar () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/Life/Spektar/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("12");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("bar");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(3);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Uplatnica");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();
        Thread.sleep(2000);

        // Ovde je uradjen driver.switchTo().frame(iFrame) kako bih hvatao elemente sa iFrame

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);


        WebElement JMBG = driver.findElement(By.id("MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber"));
        JMBG.click();
        JMBG.sendKeys("1211989700248");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();
        Thread.sleep(3500);

        js.executeScript("window.scrollBy(-500, 0);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();

        WebElement iFramePlatitelj = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFramePlatitelj);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select2 = new Select(PravnoLice);
        select2.selectByVisibleText("Pravno");

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIB.click();
        PIB.clear();
        PIB.sendKeys("02717557");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravnoLice.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement PravnoLiceZakonski = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select3 = new Select(PravnoLiceZakonski);
        select3.selectByVisibleText("Pravno");

        WebElement PIBZakonski = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIBZakonski.click();
        PIBZakonski.clear();
        PIBZakonski.sendKeys("02717557");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();



    /*     WebElement AdresaPosta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[16]/div/div/div/div[2]/div/div/a"));
            AdresaPosta.click();

            WebElement iFrame1 = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]"));
            driver.switchTo().frame(iFrame1);
            Thread.sleep(2000);

            WebElement IzaberiAdresu = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div/div[3]/div/table/tbody/tr[3]/td[4]/div/a"));
            IzaberiAdresu.click();

    */

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("3500");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("189");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("83");

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Dozivljenje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[2]/div/fieldset/div/div/div[2]/div/div[3]/div[2]/div/div/input"));
        Dozivljenje.click();
        Dozivljenje.clear();
        Dozivljenje.sendKeys("3500");

        //js.executeScript("window.scrollBy(-500, 0);");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

         /* WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
            assert PorukaZU.getText().equals("Molim vas odaberite zdravstvena izjava ili zdravstveni upitnik.") : "Očekivana poruka nakon ugovornih elemenata";
     */
        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Saradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[3]/a"));
        Saradnik.click();

        WebElement PretragaSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div/fieldset/div[6]/div/a"));
        PretragaSaradnika.click();

        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(2500);

        WebElement OdabirSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div[2]/table/tbody/tr[1]/td[13]/div/a"));
        OdabirSaradnika.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement Snimi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Snimi.click();
        Thread.sleep(3000);

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement AMLPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
        assert AMLPoruka.getText().equals("Popunite Upitnik o spriječavanju pranja novca.") : "Očekivana poruka nakon aktivacije";

        WebElement KIDStampa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/div[1]/a"));
        KIDStampa.click();
        Thread.sleep(3500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement AMLPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert AMLPoruka1.getText().equals("Morate popuniti Upitnik o spriječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa a pre popunjavanja AMLa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement NamjenaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        NamjenaOsiguranja.click();

        WebElement Zanimanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zanimanje.click();

        WebElement PorijekloSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        PorijekloSredstava.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement NegativnaSaznanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[2]"));
        NegativnaSaznanja.click();

        WebElement TajnostTransakcije = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        TajnostTransakcije.click();

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/label[2]"));
        Identifikacija.click();

        WebElement InformacijeKlijent = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[3]"));
        InformacijeKlijent.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(5000);

           /* WebElement AMLAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/span/a/img"));
            AMLAkcija.click();

            WebElement AMLStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/ul/li[1]/a"));
            AMLStampaj.click();

            WebElement AMLSaradnikAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/span/a/img"));
            AMLSaradnikAkcija.click();

            WebElement AMLSaradnikStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/ul/li[1]/a"));
            AMLSaradnikStampaj.click();
    */
        //Thread.sleep(3500);

        // WebElement Dokumentacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        // Dokumentacija.click();



        //  js.executeScript("window.scrollBy(500, 0);");

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

        //Ovde je raskid polise
    /*
            WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
            Thread.sleep(1500);
            Raskid.click();

            WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            Raskini.click();

            WebElement RaskidPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
            assert RaskidPoruka.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

            WebElement RaskidPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
            assert RaskidPoruka1.getText().equals("Generisana štampa obaveštenja o raskidu.") : "Očekivana poruka nakon raskida";

            //Ovo je reaktivacija

            WebElement Reaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
            Reaktivacija.click();

            WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            KreirajZahtevZaReaktivaciju.click();

            WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            PotvrdaPotpisaReaktivacija.click();

            WebElement Reaktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            Reaktiviraj.click();

            WebElement ReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert ReaktivacijaPoruka.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";


            //Kreiranje nonpremium aneksa

            WebElement Aneksi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
            Aneksi.click();

            WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            NoviAneks.click();

            WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[2]/label"));
            NacinPlacanja.click();

            WebElement DatumPocetka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
            DatumPocetka.sendKeys("1.5.2024");

            WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
            KreirajAneks.click();

            WebElement MetodPlacanja1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
            Select select4 = new Select(MetodPlacanja1);
            select4.selectByVisibleText("Direct debit");

            WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            AktivirajAneks.click();

            WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            PotvrdaPotpisaAneksa.click();

            WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
            PonistavanjeAneksa.click();

            WebElement RazlogPonistenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/fieldset/div[1]/div/div/div/select"));
            Select select5 = new Select(RazlogPonistenja);
            select5.selectByVisibleText("Odustanak klijenta");

            WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            PonistiAneks.click();
            */
    }


    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko Kredit")
    @Step("Creating new contract of Riziko Kredit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 340)
    public void NewContractRizikoKredit () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/Life/RizikoKredit/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("17");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("bar");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(2);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Direct debit");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();
        Thread.sleep(2000);

        // Ovde je uradjen driver.switchTo().frame(iFrame) kako bih hvatao elemente sa iFrame

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);


        WebElement JMBG = driver.findElement(By.id("MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber"));
        JMBG.click();
        JMBG.sendKeys("1211990700243");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();

        WebElement iFramePlatitelj = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFramePlatitelj);
        Thread.sleep(2000);

        WebElement JMBblatitelj = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBblatitelj.click();
        JMBblatitelj.sendKeys("1804971215017");

        WebElement PretraziPlatitelja = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziPlatitelja.click();

        WebElement PregledPlatitelja = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledPlatitelja.click();

        WebElement PrihvatiPlatitelja = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiPlatitelja.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement PravnoLiceZakonski = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select3 = new Select(PravnoLiceZakonski);
        select3.selectByVisibleText("Pravno");

        WebElement PIBZakonski = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIBZakonski.click();
        PIBZakonski.clear();
        PIBZakonski.sendKeys("02717557");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();
        Thread.sleep(2000);

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("4000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("189");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("83");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

       /*   WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
            assert PorukaZU.getText().equals("Odaberite zdravstveni upitnik") : "Očekivana poruka nakon ugovornih elemenata";
    */
        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Saradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[3]/a"));
        Saradnik.click();

        WebElement PretragaSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div/fieldset/div[6]/div/a"));
        PretragaSaradnika.click();

        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(2500);

        WebElement OdabirSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div[2]/table/tbody/tr[1]/td[13]/div/a"));
        OdabirSaradnika.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement Snimi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Snimi.click();
        Thread.sleep(3000);

        WebElement Vinkulacije = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        Vinkulacije.click();

        WebElement DodajVinkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div/div/div/div[2]/div/div/a"));
        DodajVinkulaciju.click();

        WebElement BrojUgovoraOKreditu = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[4]/div/input"));
        BrojUgovoraOKreditu.click();
        BrojUgovoraOKreditu.sendKeys("123321123");

        WebElement PrvaVinkulacionaBanka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/fieldset/div[2]/div/div/div/select"));
        Select select4 = new Select(PrvaVinkulacionaBanka);
        select4.selectByVisibleText("ADRIATIC BANK AD");

        WebElement PrihvatiVinkulaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiVinkulaciju.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();
/*
            WebElement AMLPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
            assert AMLPoruka.getText().equals("Popunite Upitnik o spriječavanju pranja novca.") : "Očekivana poruka nakon aktivacije";
*/
        WebElement KIDStampa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/div[1]/a"));
        KIDStampa.click();
        Thread.sleep(5500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement AMLPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert AMLPoruka1.getText().equals("Morate popuniti Upitnik o spriječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa a pre popunjavanja AMLa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement NamjenaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        NamjenaOsiguranja.click();

        WebElement Zanimanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zanimanje.click();

        WebElement PorijekloSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        PorijekloSredstava.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement NegativnaSaznanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[2]"));
        NegativnaSaznanja.click();

        WebElement TajnostTransakcije = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        TajnostTransakcije.click();

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/label[2]"));
        Identifikacija.click();

        WebElement InformacijeKlijent = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[3]"));
        InformacijeKlijent.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        StampanaDokumenta.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(5000);

           /* WebElement AMLAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/span/a/img"));
            AMLAkcija.click();

            WebElement AMLStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/ul/li[1]/a"));
            AMLStampaj.click();

            WebElement AMLSaradnikAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/span/a/img"));
            AMLSaradnikAkcija.click();

            WebElement AMLSaradnikStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/ul/li[1]/a"));
            AMLSaradnikStampaj.click();
    */
        //Thread.sleep(3500);

        // WebElement Dokumentacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        // Dokumentacija.click();



        //  js.executeScript("window.scrollBy(500, 0);");

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

        //Ovde je raskid polise
    /*
            WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
            Thread.sleep(1500);
            Raskid.click();

            WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            Raskini.click();

            WebElement RaskidPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
            assert RaskidPoruka.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

            WebElement RaskidPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
            assert RaskidPoruka1.getText().equals("Generisana štampa obaveštenja o raskidu.") : "Očekivana poruka nakon raskida";

            //Ovo je reaktivacija

            WebElement Reaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
            Reaktivacija.click();

            WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            KreirajZahtevZaReaktivaciju.click();

            WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            PotvrdaPotpisaReaktivacija.click();

            WebElement Reaktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            Reaktiviraj.click();

            WebElement ReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert ReaktivacijaPoruka.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";


            //Kreiranje nonpremium aneksa

            WebElement Aneksi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[14]/a"));
            Aneksi.click();

            WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            NoviAneks.click();

            WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[2]/label"));
            NacinPlacanja.click();

            WebElement DatumPocetka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
            DatumPocetka.sendKeys("1.7.2024");

            WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
            KreirajAneks.click();

            WebElement MetodPlacanja1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
            Select select5 = new Select(MetodPlacanja1);
            select5.selectByVisibleText("Uplatnica");

            WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            AktivirajAneks.click();

            WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            PotvrdaPotpisaAneksa.click();

            WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
            PonistavanjeAneksa.click();

            WebElement RazlogPonistenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/fieldset/div[1]/div/div/div/select"));
            Select select6 = new Select(RazlogPonistenja);
            select6.selectByVisibleText("Ostalo");

            WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            PonistiAneks.click();
 */
    }


    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko Vital Kredit")
    @Step("Creating new contract of Riziko Vital Kredit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 350)
    public void NewContractRizikoVitalKredit () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/Life/RizikoVitalKredit/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[3]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("60");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("bar");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(1);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Uplatnica");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();
        Thread.sleep(2000);

        // Ovde je uradjen driver.switchTo().frame(iFrame) kako bih hvatao elemente sa iFrame

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);


        WebElement JMBG = driver.findElement(By.id("MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber"));
        JMBG.click();
        JMBG.sendKeys("1211992700240");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();
        Thread.sleep(1500);

        WebElement iFramePlatitelj = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFramePlatitelj);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select2 = new Select(PravnoLice);
        select2.selectByVisibleText("Pravno");

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIB.click();
        PIB.clear();
        PIB.sendKeys("02717557");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravnoLice.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement PravnoLiceZakonski = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select3 = new Select(PravnoLiceZakonski);
        select3.selectByVisibleText("Pravno");

        WebElement PIBZakonski = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIBZakonski.click();
        PIBZakonski.clear();
        PIBZakonski.sendKeys("02717557");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();
        Thread.sleep(2000);

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Dokument je uspješno sačuvan.") : "Očekivana poruka nakon taba Lica";

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("6000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("187");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("81");

        WebElement IznosKamate = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[8]/div/input"));
        IznosKamate.clear();
        IznosKamate.sendKeys("5");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

      /*    WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
            assert PorukaZU.getText().equals("Odaberite zdravstveni upitnik") : "Očekivana poruka nakon ugovornih elemenata";
*/
        WebElement RiziciZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert RiziciZU.getText().equals("Uspješno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon ugovornih elemenata";

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement UpitnikUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert UpitnikUEL.getText().equals("Uspješno snimljen upitnik.") : "Očekivana poruka nakon ZU";

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Saradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[3]/a"));
        Saradnik.click();

        WebElement PretragaSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div/fieldset/div[6]/div/a"));
        PretragaSaradnika.click();

        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(2500);

        WebElement OdabirSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div[2]/table/tbody/tr[1]/td[13]/div/a"));
        OdabirSaradnika.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement Snimi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Snimi.click();
        Thread.sleep(3000);

        WebElement AktivirajpreVinkulacije = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        AktivirajpreVinkulacije.click();

        WebElement VinkulacijaAktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert VinkulacijaAktivacija.getText().equals("Potrebno je uneti elemente vinkulacije!") : "Očekivana poruka nakon aktivacije bez unosa Vinkulacije";

        WebElement Vinkulacije = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        Vinkulacije.click();

        WebElement DodajVinkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div/div/div/div[2]/div/div/a"));
        DodajVinkulaciju.click();

        WebElement BrojUgovoraOKreditu = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[4]/div/input"));
        BrojUgovoraOKreditu.click();
        BrojUgovoraOKreditu.sendKeys("123321123");

        WebElement PrvaVinkulacionaBanka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/fieldset/div[2]/div/div/div/select"));
        Select select4 = new Select(PrvaVinkulacionaBanka);
        select4.selectByVisibleText("ADRIATIC BANK AD");

        WebElement PrihvatiVinkulaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiVinkulaciju.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();

        /*    WebElement AMLPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
            assert AMLPoruka.getText().equals("Popunite Upitnik o spriječavanju pranja novca.") : "Očekivana poruka nakon aktivacije";
            */
        WebElement KIDStampa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/div[1]/a"));
        KIDStampa.click();
        Thread.sleep(3500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement AMLPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert AMLPoruka1.getText().equals("Morate popuniti Upitnik o spriječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa a pre popunjavanja AMLa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement NamjenaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        NamjenaOsiguranja.click();

        WebElement Zanimanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zanimanje.click();

        WebElement PorijekloSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        PorijekloSredstava.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement NegativnaSaznanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[2]"));
        NegativnaSaznanja.click();

        WebElement TajnostTransakcije = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        TajnostTransakcije.click();

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/label[2]"));
        Identifikacija.click();

        WebElement InformacijeKlijent = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[3]"));
        InformacijeKlijent.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();
        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        StampanaDokumenta.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(5000);

           /* WebElement AMLAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/span/a/img"));
            AMLAkcija.click();

            WebElement AMLStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/ul/li[1]/a"));
            AMLStampaj.click();

            WebElement AMLSaradnikAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/span/a/img"));
            AMLSaradnikAkcija.click();

            WebElement AMLSaradnikStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/ul/li[1]/a"));
            AMLSaradnikStampaj.click();
    */
        //Thread.sleep(3500);

        // WebElement Dokumentacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        // Dokumentacija.click();



        //  js.executeScript("window.scrollBy(500, 0);");

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

        //Ovde je raskid polise
    /*
            WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
            Raskid.click();

            WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            Raskini.click();

            WebElement RaskidPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
            assert RaskidPoruka.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

            WebElement RaskidPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
            assert RaskidPoruka1.getText().equals("Generisana štampa obaveštenja o raskidu.") : "Očekivana poruka nakon raskida";

            //Ovo je reaktivacija

            WebElement Reaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
            Reaktivacija.click();

            WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            KreirajZahtevZaReaktivaciju.click();

            WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            PotvrdaPotpisaReaktivacija.click();

            WebElement Reaktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            Reaktiviraj.click();

            WebElement ReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert ReaktivacijaPoruka.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";


            //Kreiranje nonpremium aneksa

            WebElement Aneksi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[14]/a"));
            Aneksi.click();

            WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            NoviAneks.click();

            WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[2]/label"));
            NacinPlacanja.click();

            WebElement DatumPocetka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
            DatumPocetka.sendKeys("1.5.2024");

            WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
            KreirajAneks.click();

            WebElement MetodPlacanja1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
            Select select5 = new Select(MetodPlacanja1);
            select5.selectByVisibleText("Administrativna zabrana");

            WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            AktivirajAneks.click();

            WebElement AktivacijaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert AktivacijaAneksa.getText().equals("Zahtev je uspešno aktiviran.") : "Očekivana poruka nakon aktivacije aneksa";

            WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            PotvrdaPotpisaAneksa.click();

            WebElement PotvrdaPotpisaAneksaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert PotvrdaPotpisaAneksaPoruka.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa aneksa";

            WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[14]/a"));
            PonistavanjeAneksa.click();

            WebElement RazlogPonistenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/fieldset/div[1]/div/div/div/select"));
            Select select6 = new Select(RazlogPonistenja);
            select6.selectByVisibleText("Ostalo");

            WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            PonistiAneks.click();
 */
    }


    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko Plus")
    @Step("Creating new contract of Riziko Plus - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 360)
    public void NewContractRizikoPlus () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/Life/RizikoPlus/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("15");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("bar");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(1);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Trajni nalog");

        WebElement BankaTrajniNalog = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[5]/div/div/select"));
        Select select2 = new Select(BankaTrajniNalog);
        select2.selectByVisibleText("Addiko Bank AD Podgorica");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();
        Thread.sleep(2000);

        // Ovde je uradjen driver.switchTo().frame(iFrame) kako bih hvatao elemente sa iFrame

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);


        WebElement JMBG = driver.findElement(By.id("MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber"));
        JMBG.click();
        JMBG.sendKeys("1211993700244");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();
        Thread.sleep(1500);

        WebElement iFramePlatitelj = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFramePlatitelj);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select3 = new Select(PravnoLice);
        select3.selectByVisibleText("Pravno");

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIB.click();
        PIB.clear();
        PIB.sendKeys("02717557");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravnoLice.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement PravnoLiceZakonski = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select4 = new Select(PravnoLiceZakonski);
        select4.selectByVisibleText("Pravno");

        WebElement PIBZakonski = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIBZakonski.click();
        PIBZakonski.clear();
        PIBZakonski.sendKeys("02717557");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();
        Thread.sleep(2000);

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Dokument je uspješno sačuvan.") : "Očekivana poruka nakon taba Lica";

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("16000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("187");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("81");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

         /*   WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
            assert PorukaZU.getText().equals("Odaberite zdravstvena izjava ili odaberite zdravstveni upitnik.") : "Očekivana poruka nakon ugovornih elemenata";
           */
        WebElement RiziciZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert RiziciZU.getText().equals("Uspješno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon ugovornih elemenata";

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement UpitnikUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert UpitnikUEL.getText().equals("Uspješno snimljen upitnik.") : "Očekivana poruka nakon ZU";

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Saradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[3]/a"));
        Saradnik.click();

        WebElement PretragaSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div/fieldset/div[6]/div/a"));
        PretragaSaradnika.click();

        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(2500);

        WebElement OdabirSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div[2]/table/tbody/tr[1]/td[13]/div/a"));
        OdabirSaradnika.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement Snimi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Snimi.click();
        Thread.sleep(3000);

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement KIDStampa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/div[1]/a"));
        KIDStampa.click();
        Thread.sleep(3500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement AMLPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert AMLPoruka1.getText().equals("Morate popuniti Upitnik o spriječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa a pre popunjavanja AMLa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement NamjenaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        NamjenaOsiguranja.click();

        WebElement Zanimanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zanimanje.click();

        WebElement PorijekloSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        PorijekloSredstava.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement NegativnaSaznanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[2]"));
        NegativnaSaznanja.click();

        WebElement TajnostTransakcije = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        TajnostTransakcije.click();

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/label[2]"));
        Identifikacija.click();

        WebElement InformacijeKlijent = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[3]"));
        InformacijeKlijent.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement PotvrdaPotpisaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaPoruka.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa";

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(5000);

           /* WebElement AMLAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/span/a/img"));
            AMLAkcija.click();

            WebElement AMLStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/ul/li[1]/a"));
            AMLStampaj.click();

            WebElement AMLSaradnikAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/span/a/img"));
            AMLSaradnikAkcija.click();

            WebElement AMLSaradnikStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/ul/li[1]/a"));
            AMLSaradnikStampaj.click();
    */
        //Thread.sleep(3500);

        // WebElement Dokumentacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        // Dokumentacija.click();



        //  js.executeScript("window.scrollBy(500, 0);");

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);
    /*
            //Ovde je raskid polise

            WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
            Thread.sleep(1500);
            Raskid.click();

            WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            Raskini.click();

            WebElement RaskidPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
            assert RaskidPoruka.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

            WebElement RaskidPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
            assert RaskidPoruka1.getText().equals("Generisana štampa obaveštenja o raskidu.") : "Očekivana poruka nakon raskida";

            //Ovo je reaktivacija

            WebElement Reaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
            Reaktivacija.click();

            WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            KreirajZahtevZaReaktivaciju.click();

            WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            PotvrdaPotpisaReaktivacija.click();

            WebElement Reaktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
            Reaktiviraj.click();

            WebElement ReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert ReaktivacijaPoruka.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";


            //Kreiranje nonpremium aneksa

            WebElement Aneksi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
            Aneksi.click();

            WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            NoviAneks.click();

            WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[2]/label"));
            NacinPlacanja.click();

            WebElement DatumPocetka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
            DatumPocetka.sendKeys("1.7.2024");

            WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
            KreirajAneks.click();

            WebElement MetodPlacanja1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
            Select select5 = new Select(MetodPlacanja1);
            select5.selectByVisibleText("Direct debit");

            WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            AktivirajAneks.click();

            WebElement AktivacijaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert AktivacijaAneksa.getText().equals("Zahtev je uspešno aktiviran.") : "Očekivana poruka nakon aktivacije aneksa";

            WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
            PotvrdaPotpisaAneksa.click();

            WebElement PotvrdaPotpisaAneksaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
            assert PotvrdaPotpisaAneksaPoruka.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa aneksa";

            WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
            PonistavanjeAneksa.click();

            WebElement RazlogPonistenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/fieldset/div[1]/div/div/div/select"));
            Select select6 = new Select(RazlogPonistenja);
            select6.selectByVisibleText("Ostalo");

            WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
            PonistiAneks.click();
 */
    }



    @Epic("sCore Montenegro")
    @Feature("New Contract")
    @Description("Creating new contract of Favorit")
    @Step("Creating new contract of Favorit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 370)
    public void NewContractFavorit () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/Life/Favorit/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("15");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("bar");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(4);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Uplatnica");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        //Nisu ista lica posto je Favorit tarifa = razliciti ugovarac i osiguranik
    /*
            WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
            CheckmarkUgovaracOsiguranik.click();
    */
        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();
        Thread.sleep(2000);

        // Ovde je uradjen driver.switchTo().frame(iFrame) kako bih hvatao elemente sa iFrame

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(1000);

        WebElement JMBG = driver.findElement(By.id("MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber"));
        JMBG.click();
        JMBG.sendKeys("1504989230028");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1000);

        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(1000);

        WebElement SacuvajLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div/a"));
        SacuvajLice.click();

        WebElement SacuvajLiceDa = driver.findElement(By.xpath("/html/body/div[18]/div/div[3]/button[1]"));
        SacuvajLiceDa.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(500, 0);");

        WebElement DodajOsiguranika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/a"));
        DodajOsiguranika.click();

        WebElement iFrameO = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameO);
        Thread.sleep(2000);

        WebElement JMBGO = driver.findElement(By.id("MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber"));
        JMBGO.click();
        JMBGO.sendKeys("1104020700240");

        WebElement PretraziLiceO = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLiceO.click();

        WebElement PregledLicaO = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLicaO.click();
        Thread.sleep(1500);

        WebElement PrihvatiLiceO = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLiceO.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();

        WebElement iFramePlatitelj = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFramePlatitelj);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select2 = new Select(PravnoLice);
        select2.selectByVisibleText("Pravno");

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIB.click();
        PIB.clear();
        PIB.sendKeys("02391678");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravnoLice.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMB.click();
        ZakonskiJMB.clear();
        ZakonskiJMB.sendKeys("1804971215017");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();
        Thread.sleep(1500);

        js.executeScript("window.scrollBy(500, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Dokument je uspješno sačuvan.") : "Očekivana poruka nakon taba Lica";

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("10000");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement RiziciZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert RiziciZU.getText().equals("Uspješno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon ugovornih elemenata";

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Saradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[3]/a"));
        Saradnik.click();

        WebElement PretragaSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div/fieldset/div[6]/div/a"));
        PretragaSaradnika.click();

        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(2500);

        WebElement OdabirSaradnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div[2]/table/tbody/tr[1]/td[13]/div/a"));
        OdabirSaradnika.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement Snimi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Snimi.click();
        Thread.sleep(3000);

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement KIDStampa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/div[1]/a"));
        KIDStampa.click();
        Thread.sleep(3500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement AMLPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert AMLPoruka1.getText().equals("Morate popuniti Upitnik o spriječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa a pre popunjavanja AMLa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement NamjenaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        NamjenaOsiguranja.click();

        WebElement Zanimanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zanimanje.click();

        WebElement PorijekloSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        PorijekloSredstava.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement NegativnaSaznanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[2]"));
        NegativnaSaznanja.click();

        WebElement TajnostTransakcije = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        TajnostTransakcije.click();

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/label[2]"));
        Identifikacija.click();

        WebElement InformacijeKlijent = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[3]"));
        InformacijeKlijent.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement PotvrdaPotpisaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaPoruka.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa";

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolisaStampaj.click();
        Thread.sleep(5000);

           /* WebElement AMLAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/span/a/img"));
            AMLAkcija.click();

            WebElement AMLStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[2]/td[19]/ul/li[1]/a"));
            AMLStampaj.click();

            WebElement AMLSaradnikAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/span/a/img"));
            AMLSaradnikAkcija.click();

            WebElement AMLSaradnikStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[19]/ul/li[1]/a"));
            AMLSaradnikStampaj.click();
    */
        //Thread.sleep(3500);

        // WebElement Dokumentacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        // Dokumentacija.click();



        //  js.executeScript("window.scrollBy(500, 0);");

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

        //Ovde je raskid polise

        WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
        Thread.sleep(1500);
        Raskid.click();

        WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Raskini.click();

        WebElement RaskidPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert RaskidPoruka.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

        WebElement RaskidPoruka1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert RaskidPoruka1.getText().equals("Generisana štampa obaveštenja o raskidu.") : "Očekivana poruka nakon raskida";

        //Ovo je reaktivacija

        WebElement Reaktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        Reaktivacija.click();

        WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        KreirajZahtevZaReaktivaciju.click();

        WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        PotvrdaPotpisaReaktivacija.click();

        WebElement Reaktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Reaktiviraj.click();

        WebElement ReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert ReaktivacijaPoruka.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";


        //Kreiranje nonpremium aneksa

        WebElement Aneksi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
        Aneksi.click();

        WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        NoviAneks.click();

        WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[1]/label"));
        NacinPlacanja.click();

        WebElement DatumPocetka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
        DatumPocetka.sendKeys("1.7.2024");

        WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        KreirajAneks.click();

        WebElement MetodPlacanja1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select4 = new Select(MetodPlacanja1);
        select4.selectByVisibleText("Direct debit");

        WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        AktivirajAneks.click();

        WebElement AktivacijaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert AktivacijaAneksa.getText().equals("Zahtev je uspešno aktiviran.") : "Očekivana poruka nakon aktivacije aneksa";

        WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaAneksa.click();

        WebElement PotvrdaPotpisaAneksaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaAneksaPoruka.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa aneksa";

        WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
        PonistavanjeAneksa.click();

        WebElement RazlogPonistenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/fieldset/div[1]/div/div/div/select"));
        Select select5 = new Select(RazlogPonistenja);
        select5.selectByVisibleText("Ostalo");

        WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        PonistiAneks.click();

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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select2 = new Select(mainPage.ProductsMNE);
        select2.selectByIndex(8);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.ProductsMNE);
        select2.selectByIndex(8);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(10);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.ProductsMNE);
        select2.selectByIndex(8);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(10);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.ProductsMNE);
        select2.selectByIndex(8);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(10);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.ProductsMNE);
        select2.selectByIndex(8);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(10);
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
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.ProductsMNE);
        select2.selectByIndex(8);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(10);
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
        mainPage.DateOfContracting.sendKeys("01.08.2024");
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

        WebDriver driver = new ChromeDriver();
        //JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/Life/Joker/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("15");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("bar");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(4);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Uplatnica");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();
        Thread.sleep(2000);

        // Ovde je uradjen driver.switchTo().frame(iFrame) kako bih hvatao elemente sa iFrame

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement JMBG = driver.findElement(By.id("MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber"));
        JMBG.click();
        JMBG.sendKeys("0208981260171");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        // WebElement PorukaSPNFT = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        // assert PorukaSPNFT.getText().equals("Unešena osoba se nalazi na sankcionoj listi EU i/ili PEP listi! Nije moguć dalji rad na dokumentu.") : "Očekivana poruka nakon dodavanja lica sa sankcione liste";


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
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(5);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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
        mainPage.DateOfBirth.sendKeys("01.01.1973");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
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

     }





