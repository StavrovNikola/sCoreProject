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
public class sCoreBosnia {

    private MainPage mainPage;


    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
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
    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Classic")
    @Step("Creating new contract of Classic - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 470)
    public void NewContractClassic () throws Exception{
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("andrea.petrovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        WebElement Classic = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        Classic.click();

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement NoviDokument = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        NoviDokument.click();
        Thread.sleep(2500);

        WebElement PonudaSaTerena = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/ul/li[2]/div/a"));
        PonudaSaTerena.click();

        WebElement PoslovnaJedinica = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div/div/select"));
        Select select = new Select(PoslovnaJedinica);
        select.selectByIndex(21);

        WebElement BrojPonude = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[1]/div/div/input"));
        BrojPonude.click();
        BrojPonude.clear();
        BrojPonude.sendKeys("0001000313");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("6");

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select1 = new Select(DinamikaPlacanja);
        select1.selectByVisibleText("Polugodišnje");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Virman");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBG.clear();
        JMBG.sendKeys("1012984180057");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PlatiteljiUgovarac = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/label"));
        PlatiteljiUgovarac.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.clear();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.clear();
        Procenat.sendKeys("100");

        WebElement PrihvatiKorisnika = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiKorisnika.click();

        WebElement TabUgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        TabUgovorniElementi.click();

        WebElement OsnovaZaKalkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/div/select"));
        Select select4 = new Select(OsnovaZaKalkulaciju);
        select4.selectByVisibleText("Premija");

        WebElement Iznos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        Iznos.sendKeys("450");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("185");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("83");

        WebElement PrihvatiDugme = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiDugme.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon prihvatanja UEL";

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement PrezimeiIme = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[8]/div/div/div/input"));
        PrezimeiIme.clear();
        PrezimeiIme.sendKeys("DR");

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaZU.getText().equals("Uspješno snimljen upitnik.") : "Očekivana poruka nakon cuvanja ZU";

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li[2]"));
        assert PorukaAML.getText().equals("Popunite Upitnik o sprječavanju pranja novca i priložite fotokopiju lične karte.") : "Očekivana poruka nakon aktivacije";

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaAMLBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaAMLBloker.getText().equals("Morate popuniti Upitnik o sprječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE5.click();

        WebElement NE6 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE6.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NE10 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        NE10.click();

        WebElement NE12 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[2]"));
        NE12.click();

        WebElement NE13 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[13]/div/div/div/label[2]"));
        NE13.click();

        WebElement NE14 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[14]/div/div/div/label[2]"));
        NE14.click();

        WebElement NE15 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[15]/div/div/div/label[2]"));
        NE15.click();

        WebElement NE16 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[16]/div/div/div/label[2]"));
        NE16.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa";

        WebElement BrojUgovora = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojUgovora.getText();
        System.out.println("Broj ugovora je: " + headingtext);



    }

    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Comfort")
    @Step("Creating new contract of Comfort - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 480)
    public void NewContractComfort () throws Exception{
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("andrea.petrovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        WebElement Comfort = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[2]/div"));
        Comfort.click();

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement NoviDokument = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        NoviDokument.click();
        Thread.sleep(2500);

        WebElement PonudaSaTerena = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/ul/li[2]/div/a"));
        PonudaSaTerena.click();

        WebElement PoslovnaJedinica = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div/div/select"));
        Select select = new Select(PoslovnaJedinica);
        select.selectByIndex(21);

        WebElement BrojPonude = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[1]/div/div/input"));
        BrojPonude.click();
        BrojPonude.clear();
        BrojPonude.sendKeys("0001000314");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("13");
        WebElement Klik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]"));
        Klik.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select1 = new Select(DinamikaPlacanja);
        select1.selectByVisibleText("Mjesečno");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select2 = new Select(MetodPlacanja);
        select2.selectByVisibleText("Uplatnica");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBG.clear();
        JMBG.sendKeys("1012984180057");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[6]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();

        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select3 = new Select(PravnoLice);
        select3.selectByVisibleText("Pravno");

        WebElement SifraLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[1]/input"));
        SifraLica.clear();
        SifraLica.sendKeys("1890778");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravno.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.clear();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.clear();
        Procenat.sendKeys("100");

        WebElement PrihvatiKorisnika = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiKorisnika.click();

        WebElement TabUgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        TabUgovorniElementi.click();

        WebElement OsnovaZaKalkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/div/select"));
        Select select4 = new Select(OsnovaZaKalkulaciju);
        select4.selectByVisibleText("Premija");

        WebElement Iznos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        Iznos.sendKeys("260");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("185");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("78");

        WebElement PrihvatiDugme = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiDugme.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon prihvatanja UEL";

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement PrezimeiIme = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[8]/div/div/div/input"));
        PrezimeiIme.clear();
        PrezimeiIme.sendKeys("DR");

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaZU.getText().equals("Uspješno snimljen upitnik.") : "Očekivana poruka nakon cuvanja ZU";

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li[2]"));
        assert PorukaAML.getText().equals("Popunite Upitnik o sprječavanju pranja novca i priložite fotokopiju lične karte.") : "Očekivana poruka nakon aktivacije";

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaAMLBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaAMLBloker.getText().equals("Morate popuniti Upitnik o sprječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE5.click();

        WebElement NE6 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE6.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NE10 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        NE10.click();

        WebElement NE12 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[2]"));
        NE12.click();

        WebElement NE13 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[13]/div/div/div/label[2]"));
        NE13.click();

        WebElement NE14 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[14]/div/div/div/label[2]"));
        NE14.click();

        WebElement NE15 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[15]/div/div/div/label[2]"));
        NE15.click();

        WebElement NE16 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[16]/div/div/div/label[2]"));
        NE16.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa";

        WebElement BrojUgovora = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojUgovora.getText();
        System.out.println("Broj ugovora je: " + headingtext);

    }
    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Uniqo")
    @Step("Creating new contract of Uniqo - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 490)
    public void NewContractUniqo () throws Exception{
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("andrea.petrovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        WebElement Uniqo = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[3]/div"));
        Uniqo.click();

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement NoviDokument = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        NoviDokument.click();
        Thread.sleep(2500);

        WebElement PonudaSaTerena = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/ul/li[2]/div/a"));
        PonudaSaTerena.click();

        WebElement PoslovnaJedinica = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div/div/select"));
        Select select = new Select(PoslovnaJedinica);
        select.selectByIndex(21);

        WebElement BrojPonude = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[1]/div/div/input"));
        BrojPonude.click();
        BrojPonude.clear();
        BrojPonude.sendKeys("0001000315");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("15");
        WebElement Klik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]"));
        Klik.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select1 = new Select(DinamikaPlacanja);
        select1.selectByVisibleText("Kvartalno");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select2 = new Select(MetodPlacanja);
        select2.selectByVisibleText("Virman");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBG.clear();
        JMBG.sendKeys("1012984180057");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();
        Thread.sleep(1500);

        js.executeScript("window.scrollBy(500, 0);");

        WebElement DodajOsiguranika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div/a"));
        DodajOsiguranika.click();

        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(2000);

        WebElement JMBGOsiguranika = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBGOsiguranika.clear();
        JMBGOsiguranika.sendKeys("0711020700240");

        WebElement PretraziLice1 = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice1.click();

        WebElement PregledLica1 = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica1.click();

        WebElement PrihvatiLice1 = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice1.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[6]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();

        WebElement iFrame2 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame2);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select3 = new Select(PravnoLice);
        select3.selectByVisibleText("Pravno");

        WebElement SifraLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[1]/input"));
        SifraLica.clear();
        SifraLica.sendKeys("1890778");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravno.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.clear();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.clear();
        Procenat.sendKeys("100");

        WebElement PrihvatiKorisnika = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiKorisnika.click();

        WebElement TabUgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        TabUgovorniElementi.click();

        WebElement OsnovaZaKalkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/div/select"));
        Select select4 = new Select(OsnovaZaKalkulaciju);
        select4.selectByVisibleText("Premija");

        WebElement Iznos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        Iznos.clear();
        Iznos.sendKeys("400");

        WebElement VisinaO = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        VisinaO.sendKeys("90");

        WebElement TezinaO = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        TezinaO.sendKeys("20");

        WebElement VisinaU = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[4]/div[5]/div/input"));
        VisinaU.sendKeys("189");

        WebElement TezinaU = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[4]/div[6]/div/input"));
        TezinaU.sendKeys("80");

        WebElement PrihvatiDugme = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiDugme.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon prihvatanja UEL";

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement PrezimeiIme = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[8]/div/div/div/input"));
        PrezimeiIme.clear();
        PrezimeiIme.sendKeys("DR");

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement PrezimeiIme1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[16]/div/div/div/input"));
        PrezimeiIme1.clear();
        PrezimeiIme1.sendKeys("DR");


        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaZU.getText().equals("Uspješno snimljen upitnik.") : "Očekivana poruka nakon cuvanja ZU";

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();
/*
                    WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
                    assert PorukaAML.getText().equals("Popunite Upitnik o sprječavanju pranja novca i priložite fotokopiju lične karte.") : "Očekivana poruka nakon aktivacije";
*/
        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaAMLBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaAMLBloker.getText().equals("Morate popuniti Upitnik o sprječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE5.click();

        WebElement NE6 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE6.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NE10 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        NE10.click();

        WebElement NE12 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[2]"));
        NE12.click();

        WebElement NE13 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[13]/div/div/div/label[2]"));
        NE13.click();

        WebElement NE14 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[14]/div/div/div/label[2]"));
        NE14.click();

        WebElement NE15 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[15]/div/div/div/label[2]"));
        NE15.click();

        WebElement NE16 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[16]/div/div/div/label[2]"));
        NE16.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa";

        WebElement BrojUgovora = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojUgovora.getText();
        System.out.println("Broj ugovora je: " + headingtext);

    }

    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Kapital")
    @Step("Creating new contract of Kapital - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 500)
    public void NewContractKapital () throws Exception{
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("andrea.petrovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        WebElement Kapital = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[4]/div"));
        Kapital.click();

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement NoviDokument = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        NoviDokument.click();
        Thread.sleep(2500);

        WebElement PonudaSaTerena = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/ul/li[2]/div/a"));
        PonudaSaTerena.click();

        WebElement PoslovnaJedinica = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div/div/select"));
        Select select = new Select(PoslovnaJedinica);
        select.selectByIndex(21);

        WebElement BrojPonude = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[1]/div/div/input"));
        BrojPonude.click();
        BrojPonude.clear();
        BrojPonude.sendKeys("0001000316");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("6");
        WebElement Klik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]"));
        Klik.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select1 = new Select(DinamikaPlacanja);
        select1.selectByVisibleText("Godišnje");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select2 = new Select(MetodPlacanja);
        select2.selectByVisibleText("Uplatnica");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBG.clear();
        JMBG.sendKeys("1012984180057");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[6]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();

        WebElement iFrame2 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame2);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select3 = new Select(PravnoLice);
        select3.selectByVisibleText("Pravno");

        WebElement SifraLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[1]/input"));
        SifraLica.clear();
        SifraLica.sendKeys("1890778");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravno.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.clear();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.clear();
        Procenat.sendKeys("100");

        WebElement PrihvatiKorisnika = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiKorisnika.click();

        WebElement TabUgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        TabUgovorniElementi.click();

        WebElement OsnovaZaKalkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/div/select"));
        Select select4 = new Select(OsnovaZaKalkulaciju);
        select4.selectByVisibleText("Premija");

        WebElement Iznos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        Iznos.clear();
        Iznos.sendKeys("1400");

        WebElement VisinaO = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        VisinaO.sendKeys("190");

        WebElement TezinaO = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        TezinaO.sendKeys("90");

        WebElement PrihvatiDugme = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiDugme.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon prihvatanja UEL";

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement PrezimeiIme = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[8]/div/div/div/input"));
        PrezimeiIme.clear();
        PrezimeiIme.sendKeys("DR");

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaZU.getText().equals("Uspješno snimljen upitnik.") : "Očekivana poruka nakon cuvanja ZU";

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li[2]"));
        assert PorukaAML.getText().equals("Popunite Upitnik o sprječavanju pranja novca i priložite fotokopiju lične karte.") : "Očekivana poruka nakon aktivacije";

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaAMLBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaAMLBloker.getText().equals("Morate popuniti Upitnik o sprječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE5.click();

        WebElement NE6 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE6.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NE10 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        NE10.click();

        WebElement NE12 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[2]"));
        NE12.click();

        WebElement NE13 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[13]/div/div/div/label[2]"));
        NE13.click();

        WebElement NE14 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[14]/div/div/div/label[2]"));
        NE14.click();

        WebElement NE15 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[15]/div/div/div/label[2]"));
        NE15.click();

        WebElement NE16 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[16]/div/div/div/label[2]"));
        NE16.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa";

        WebElement BrojUgovora = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojUgovora.getText();
        System.out.println("Broj ugovora je: " + headingtext);

    }
    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of ComfortDual")
    @Step("Creating new contract of ComfortDual - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 510)
    public void NewContractComfortDual () throws Exception{
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("andrea.petrovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        WebElement ComfortDual = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[5]/div"));
        ComfortDual.click();

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement NoviDokument = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        NoviDokument.click();
        Thread.sleep(2500);

        WebElement PonudaSaTerena = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/ul/li[2]/div/a"));
        PonudaSaTerena.click();

        WebElement PoslovnaJedinica = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div/div/select"));
        Select select = new Select(PoslovnaJedinica);
        select.selectByIndex(21);

        WebElement BrojPonude = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[1]/div/div/input"));
        BrojPonude.click();
        BrojPonude.clear();
        BrojPonude.sendKeys("0001000317");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("12");
        WebElement Klik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]"));
        Klik.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select1 = new Select(DinamikaPlacanja);
        select1.selectByVisibleText("Mjesečno");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select2 = new Select(MetodPlacanja);
        select2.selectByVisibleText("Virman");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBG.clear();
        JMBG.sendKeys("1012984180057");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Osiguranik1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/div[2]/div/div/a"));
        Osiguranik1.click();

        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(2000);

        WebElement JMBGOsiguranika = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBGOsiguranika.clear();
        JMBGOsiguranika.sendKeys("2104986150002");

        WebElement PretraziLice1 = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice1.click();

        WebElement PregledLica1 = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica1.click();

        WebElement PrihvatiLice1 = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice1.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatitelja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[6]/div/div/div/div[2]/div/div/a"));
        DodajPlatitelja.click();

        WebElement iFrame2 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame2);
        Thread.sleep(2000);

        WebElement PravnoLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select3 = new Select(PravnoLice);
        select3.selectByVisibleText("Pravno");

        WebElement SifraLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[1]/input"));
        SifraLica.clear();
        SifraLica.sendKeys("1917410");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravnog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravnog.click();

        WebElement PrihvatiPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravno.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.clear();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.clear();
        Procenat.sendKeys("100");

        WebElement PrihvatiKorisnika = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiKorisnika.click();

        WebElement TabUgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        TabUgovorniElementi.click();

        WebElement OsnovaZaKalkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/div/select"));
        Select select4 = new Select(OsnovaZaKalkulaciju);
        select4.selectByVisibleText("Premija");

        WebElement Iznos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        Iznos.clear();
        Iznos.sendKeys("1400");

        WebElement VisinaO = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        VisinaO.sendKeys("190");

        WebElement TezinaO = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        TezinaO.sendKeys("90");

        WebElement VisinaU = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[4]/div[5]/div/input"));
        VisinaU.sendKeys("189");

        WebElement TezinaU = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[4]/div[6]/div/input"));
        TezinaU.sendKeys("80");

        WebElement PrihvatiDugme = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiDugme.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon prihvatanja UEL";

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement PrezimeiIme = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[8]/div/div/div/input"));
        PrezimeiIme.clear();
        PrezimeiIme.sendKeys("DR");

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement PrezimeiIme1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[16]/div/div/div/input"));
        PrezimeiIme1.clear();
        PrezimeiIme1.sendKeys("DR");

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement PorukaZU = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaZU.getText().equals("Uspješno snimljen upitnik.") : "Očekivana poruka nakon cuvanja ZU";

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li[2]"));
        assert PorukaAML.getText().equals("Popunite Upitnik o sprječavanju pranja novca i priložite fotokopiju lične karte.") : "Očekivana poruka nakon aktivacije";

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaAMLBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaAMLBloker.getText().equals("Morate popuniti Upitnik o sprječavanju pranja novca") : "Očekivana poruka nakon potvrde potpisa";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE5.click();

        WebElement NE6 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE6.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NE10 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        NE10.click();

        WebElement NE12 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[12]/div/div/div/label[2]"));
        NE12.click();

        WebElement NE13 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[13]/div/div/div/label[2]"));
        NE13.click();

        WebElement NE14 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[14]/div/div/div/label[2]"));
        NE14.click();

        WebElement NE15 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[15]/div/div/div/label[2]"));
        NE15.click();

        WebElement NE16 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[16]/div/div/div/label[2]"));
        NE16.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa1.click();

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potvrda potpisa uspješno urađena.") : "Očekivana poruka nakon potvrde potpisa";

        WebElement BrojUgovora = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojUgovora.getText();
        System.out.println("Broj ugovora je: " + headingtext);

    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Classic")
    @Owner("Nikola Stavrov")
    @Test (priority = 520)
    public void ClausesClassic () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.ProductsBA);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.Status);
        select2.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.03.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.PreviewCRO.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19"):"Excepted General Conditions";
        assert mainPage.SpecialConditionsClassic.getText().equals("Dodatni uslovi za osiguranje života za slučaj doživljenja i smrti DUZM I/19"):"Excepted Special Conditions";


    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Comfort")
    @Owner("Nikola Stavrov")
    @Test (priority = 530)
    public void ClausesComfort () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.ProductsBA);
        select1.selectByIndex(2);
        Select select2 = new Select(mainPage.Status);
        select2.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.04.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.Preview.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19"):"Excepted General Conditions";
        assert mainPage.SpecialConditionsComfort.getText().equals("Posebni uslovi za dopunsko osiguranje od posljedica nesretnog slučaja (nezgode) uz osiguranje života PUDN I/19"):"Excepted Special Conditions";


    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Uniqo")
    @Owner("Nikola Stavrov")
    @Test (priority = 540)
    public void ClausesUniqo () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.ProductsBA);
        select1.selectByIndex(3);
        Select select2 = new Select(mainPage.Status);
        select2.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.Preview.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19"):"Excepted General Conditions";
        assert mainPage.SpecialConditionsUniqo.getText().equals("Dodatni uslovi za osiguranje života za slučaj doživljenja djeteta DUZDD I/19"):"Excepted Special Conditions";
        assert mainPage.SpecialConditionsUniqo1.getText().equals("Posebni uslovi za dopunsko osiguranje od posljedica nesretnog slučaja (nezgode) uz osiguranje života PUDN I/19"):"Excepted Special Conditions";

       // assert DodatniUsloviOsiguranjeDjeteta.getText().equals("Dodatni uslovi za osiguranje života za slučaj doživljenja djeteta DUZDD I/19"):"Očekivani uslovi";



    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Kapital")
    @Owner("Nikola Stavrov")
    @Test (priority = 550)
    public void ClausesKapital () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.ProductsBA);
        select1.selectByIndex(4);
        Select select2 = new Select(mainPage.Status);
        select2.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.Preview.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19"):"Excepted General Conditions";
        assert mainPage.SpecialConditionsKapital.getText().equals("Dodatni uslovi za osiguranje života za slučaj doživljenja DUZ I/19"):"Excepted Special Conditions";
        assert mainPage.SpecialConditionsKapital1.getText().equals("Posebni uslovi za dopunsko osiguranje od posljedica nesretnog slučaja (nezgode) uz osiguranje života PUDN I/19"):"Excepted Special Conditions";


    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - ComfortDual")
    @Owner("Nikola Stavrov")
    @Test (priority = 560)
    public void ClausesComfortDual () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.ProductsBA);
        select1.selectByIndex(5);
        Select select2 = new Select(mainPage.Status);
        select2.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.Preview.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19"):"Excepted General Conditions";
        assert mainPage.SpecialConditionsComfortDual.getText().equals("Dodatne uslove za osiguranje života za slučaj doživljenja i smrti i nastupa teške bolesti dvije osobe DUZTD I/19"):"Excepted Special Conditions";


    }

    @Epic("sCore Bosnia")
    @Feature("Export to excel")
    @Description("Checking funcionality of exporting data to excel")
    @Step("Checking funcionality of exporting data to excel - action Export to excel")
    @Owner("Nikola Stavrov")
    @Test (priority = 570)
    public void ExportToExcelBosnia () throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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


    @Epic("sCore Bosnia")
    @Feature("SPNFT")
    @Description("Checking funcionality of SPNFT/Smaragd service")
    @Step("Checking funcionality of SPNFT - Creating documents with persons on SPNFT lists")
    @Owner("Nikola Stavrov")
    @Test (priority = 580)
    public void SPNFTBosnia () throws Exception{
        WebDriver driver = new ChromeDriver();
        // JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("andrea.petrovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        WebElement Classic = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        Classic.click();

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement NoviDokument = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        NoviDokument.click();
        Thread.sleep(2500);

        WebElement PonudaSaTerena = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/ul/li[2]/div/a"));
        PonudaSaTerena.click();

        WebElement PoslovnaJedinica = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div/div/select"));
        Select select = new Select(PoslovnaJedinica);
        select.selectByIndex(21);

        WebElement BrojPonude = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[1]/div/div/input"));
        BrojPonude.click();
        BrojPonude.clear();
        BrojPonude.sendKeys("0001000318");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("6");

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select1 = new Select(DinamikaPlacanja);
        select1.selectByVisibleText("Polugodišnje");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Virman");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement CheckmarkUgovaracOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        CheckmarkUgovaracOsiguranik.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        JMBG.clear();
        JMBG.sendKeys("1505981180052");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        //WebElement PorukaSPNFT = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul"));
       // assert PorukaSPNFT.getText().equals("Uneseno lice se nalazi na sankcionoj listi EU i/ili PEP listi! Nije moguć dalji rad na dokumentu.") : "Očekivana poruka nakon dodavanja lica sa sankcione liste";

    }

}




