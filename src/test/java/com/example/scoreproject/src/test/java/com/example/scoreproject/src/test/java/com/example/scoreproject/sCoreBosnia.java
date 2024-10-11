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
public class sCoreBosnia {

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
        driver.get("https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        mainPage = new MainPage(driver);
    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Classic with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 10)
    public void InfoOfferClassicAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Classic.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Comfort with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 20)
    public void InfoOfferComfortAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Comfort.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
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
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Uniqo with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 30)
    public void InfoOfferUniqoAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Uniqo.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Kapital with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 40)
    public void InfoOfferKapitalAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Kapital.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of ComfortDual with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 50)
    public void InfoOfferComfortDualAgent() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ComfortDual.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(1);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("170");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("60");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Classic with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 60)
    public void InfoOfferClassicBOC() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("martina.pandzic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Classic.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1982");
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
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Comfort with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 70)
    public void InfoOfferComfortBOC() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("martina.pandzic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Comfort.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("13500");
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
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Uniqo with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 80)
    public void InfoOfferUniqoBOC() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("martina.pandzic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Uniqo.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Kapital with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 90)
    public void InfoOfferKapitalBOC() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("martina.pandzic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Kapital.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
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
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of ComfortDual with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 100)
    public void InfoOfferComfortDualBOC() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("martina.pandzic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ComfortDual.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("14");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(1);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("170");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("60");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Classic with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 110)
    public void InfoOfferClassicUW() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("elvira.hadzimusovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Classic.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Comfort with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 120)
    public void InfoOfferComfortUW() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("elvira.hadzimusovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Comfort.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("12000");
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
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Uniqo with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 130)
    public void InfoOfferUniqoUW() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("elvira.hadzimusovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Uniqo.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of Kapital with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 140)
    public void InfoOfferKapitalUW() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("elvira.hadzimusovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Kapital.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("25");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("18000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1995");
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
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Info offer")
    @Description("Creating info offer of ComfortDual with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 150)
    public void InfoOfferComfortDualUW() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("elvira.hadzimusovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ComfortDual.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("9");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("23000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(1);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("170");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("60");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        Select select8 = new Select(mainPage.SalesUnitChanel);
        select8.selectByIndex(1);
        Thread.sleep(2500);
        Select select9 = new Select(mainPage.SalesUnitPartner);
        select9.selectByIndex(2);
        mainPage.TechnicalPersonSearch.click();
        mainPage.TechnicalPerson.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Annulations")
    @Description("Annulations of info offer ")
    @Step("Annulation of info offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 160)
    public void AnnulationCustomerWithdrawalInfoOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Bosnia")
    @Feature("Annulations")
    @Description("Annulations of info offer ")
    @Step("Annulation of info offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 170)
    public void AnnulationContractReplacementInfoOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Bosnia")
    @Feature("Annulations")
    @Description("Annulations of offer ")
    @Step("Annulation of offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 180)
    public void AnnulationCustomerWithdrawalOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(30);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Bosnia")
    @Feature("Annulations")
    @Description("Annulations of offer ")
    @Step("Annulation of offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 190)
    public void AnnulationContractReplacementOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(30);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }


    @Epic("sCore Bosnia")
    @Feature("Annulations")
    @Description("Annulations of activated info offer ")
    @Step("Annulation of activated info offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 200)
    public void AnnulationCustomerWithdrawalInfoOfferActivated() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Bosnia")
    @Feature("Annulations")
    @Description("Annulations of activated info offer ")
    @Step("Annulation of activated info offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 210)
    public void AnnulationContractReplacementInfoOfferActivated() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Bosnia")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Client request")
    @Owner("Nikola Stavrov")
    @Test(priority = 220)
    public void CancellationClientRequest() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(1);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(1);
        Select select4 = new Select(mainPage.CancellationOption);
        select4.selectByIndex(1);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }


    @Epic("sCore Bosnia")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Uniqa request")
    @Owner("Nikola Stavrov")
    @Test(priority = 230)
    public void CancellationUniqaRequest() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(9);
        Select select4 = new Select(mainPage.CancellationOption);
        select4.selectByIndex(1);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();



    }

    @Epic("sCore Bosnia")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Dunning")
    @Owner("Nikola Stavrov")
    @Test(priority = 320)
    public void CancellationDunning() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(3);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(14);
        Select select4 = new Select(mainPage.CancellationOption);
        select4.selectByIndex(1);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }

    @Epic("sCore Bosnia")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Death")
    @Owner("Nikola Stavrov")
    @Test(priority = 320)
    public void CancellationReasonDeath() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(4);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(16);
        Select select4 = new Select(mainPage.CancellationOption);
        select4.selectByIndex(1);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }

    @Epic("sCore Bosnia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy")
    @Owner("Nikola Stavrov")
    @Test(priority = 330)
    public void Reactivation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2023");
        mainPage.SearchMenu.click();
        Thread.sleep(3500);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.CertificationSignature.click();
        mainPage.Reactivation.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Annul last cancellation")
    @Owner("Nikola Stavrov")
    @Test(priority = 340)
    public void ReactivationAnnulLastCancellation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2023");
        mainPage.SearchMenu.click();
        Thread.sleep(3500);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        mainPage.AnnulLastCancellation.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Annul client request")
    @Owner("Nikola Stavrov")
    @Test(priority = 350)
    public void ReactivationAnnulClientRequest() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2023");
        mainPage.SearchMenu.click();
        Thread.sleep(3500);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.CertificationSignature.click();
        mainPage.Rejection.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Rejection")
    @Owner("Nikola Stavrov")
    @Test(priority = 360)
    public void ReactivationRejection() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2023");
        mainPage.SearchMenu.click();
        Thread.sleep(3500);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.Rejection.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Indexation")
    @Description("Creating info offer of Classic with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 370)
    public void IndexationClassic() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Classic.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.Indexation.click();
        Select select3 = new Select(mainPage.IndexValue);
        select3.selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Indexation")
    @Description("Creating info offer of Comfort with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 380)
    public void IndexationComfort() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Comfort.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.Indexation.click();
        Select select3 = new Select(mainPage.IndexValue);
        select3.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
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
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Indexation")
    @Description("Creating info offer of Uniqo with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 390)
    public void IndexationUniqo() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Uniqo.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.Indexation.click();
        Select select3 = new Select(mainPage.IndexValue);
        select3.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Indexation")
    @Description("Creating info offer of Kapital with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 400)
    public void IndexationKapital() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Kapital.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.Indexation.click();
        Select select3 = new Select(mainPage.IndexValue);
        select3.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Indexation")
    @Description("Creating info offer of ComfortDual with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 410)
    public void IndexationComfortDual() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ComfortDual.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.Indexation.click();
        Select select3 = new Select(mainPage.IndexValue);
        select3.selectByIndex(1);
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(1);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("170");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("60");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Payment method allowance")
    @Description("Creating info offer of Classic with allowance of payment method surcharge")
    @Step("Creating info offer with allowance")
    @Owner("Nikola Stavrov")
    @Test(priority = 420)
    public void PaymentMethodAllowanceClassic() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Classic.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
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
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Payment method allowance")
    @Description("Creating info offer of Comfort with allowance of payment method surcharge")
    @Step("Creating info offer with allowance")
    @Owner("Nikola Stavrov")
    @Test(priority = 430)
    public void PaymentMethodAllowanceComfort() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Comfort.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
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
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Payment method allowance")
    @Description("Creating info offer of Uniqo with allowance of payment method surcharge")
    @Step("Creating info offer with allowance")
    @Owner("Nikola Stavrov")
    @Test(priority = 440)
    public void PaymentMethodAllowanceUniqo() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Uniqo.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Payment method allowance")
    @Description("Creating info offer of Kapital with allowance of payment method surcharge")
    @Step("Creating info offer with allowance")
    @Owner("Nikola Stavrov")
    @Test(priority = 450)
    public void PaymentMethodAllowanceKapital() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Kapital.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Bosnia")
    @Feature("Payment method allowance")
    @Description("Creating info offer of ComfortDual with allowance of payment method surcharge")
    @Step("Creating info offer with allowance")
    @Owner("Nikola Stavrov")
    @Test(priority = 460)
    public void PaymentMethodAllowanceComfortDual() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ComfortDual.click();
        Select select4 = new Select(mainPage.BusinessUnit);
        select4.selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        Select select5 = new Select(mainPage.GenderConcernPerson1);
        select5.selectByIndex(1);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("170");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("60");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        // mainPage.TechnicalPersons.click();
        // mainPage.TechnicalPersonsOpenSearch.click();
        //mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }


}


