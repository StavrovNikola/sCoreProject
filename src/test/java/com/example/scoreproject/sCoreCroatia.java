package com.example.scoreproject;


import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
public class sCoreCroatia {

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
        driver.get("https://aasv098.uniqa.hr/POS/Croatia/NoAD/");
        mainPage = new MainPage(driver);
    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of TB with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 10)
    public void InfoOfferTBUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.TB.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("12");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(3);
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

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of MO with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 20)
    public void InfoOfferMOUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MO.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
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
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of MODOR with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 30)
    public void InfoOfferMODORUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MODOR.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("21");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(1);
        mainPage.TabConcerns.click();
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
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of ROPOS with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 40)
    public void InfoOfferROPOSUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ROPOS.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("12");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1969");
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

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of FidelisLife with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 50)
    public void InfoOfferFidelisLifeUW() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.FidelisLife.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("16");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1985");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        Select select8 = new Select(mainPage.ChosenAmountSum);
        select8.selectByIndex(2);
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();
        Thread.sleep(3500);
        mainPage.CreateNewContract.click();
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        mainPage.FirstQuestion.click();
        mainPage.SecondQuestion.click();
        mainPage.ThirdQuestion.click();
        mainPage.FourthQuestion.click();
        mainPage.FirstQuestion1.click();
        mainPage.SecondQuestion1.click();
        mainPage.ThirdQuestion1.click();
        mainPage.FourthQuestion1.click();
        mainPage.FirstQuestion2.click();
        mainPage.SecondQuestion2.click();
        mainPage.ThirdQuestion2.click();
        mainPage.FourthQuestion2.click();
        mainPage.SaveTP.click();
        mainPage.PrintTP.click();
    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of TB with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 60)
    public void InfoOfferTBBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentBOC CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2010.");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.TB.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(3);
        mainPage.TabConcerns.click();
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
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of MO with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 70)
    public void InfoOfferMOBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentBOC CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2010.");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MO.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("11");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("13000");
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

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of MODOR with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 80)
    public void InfoOfferMODORBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentBOC CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2010.");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MODOR.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("9000");
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
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of ROPOS with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 90)
    public void InfoOfferROPOSBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentBOC CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2010.");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ROPOS.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("14");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1969");
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

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of FidelisLife with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")
    @Test(priority = 100)
    public void InfoOfferFidelisLifeBOC() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentBOC CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2010.");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.FidelisLife.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("21");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1985");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        Select select8 = new Select(mainPage.ChosenAmountSum);
        select8.selectByIndex(2);
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();
        Thread.sleep(3500);
        mainPage.CreateNewContract.click();
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        mainPage.FirstQuestion.click();
        mainPage.SecondQuestion.click();
        mainPage.ThirdQuestion.click();
        mainPage.FourthQuestion.click();
        mainPage.FirstQuestion1.click();
        mainPage.SecondQuestion1.click();
        mainPage.ThirdQuestion1.click();
        mainPage.FourthQuestion1.click();
        mainPage.FirstQuestion2.click();
        mainPage.SecondQuestion2.click();
        mainPage.ThirdQuestion2.click();
        mainPage.FourthQuestion2.click();
        mainPage.SaveTP.click();
        mainPage.PrintTP.click();
    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of TB with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 110)
    public void InfoOfferTBAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2009!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.PermanentEmployment.click();
        mainPage.TB.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("14");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(3);
        mainPage.TabConcerns.click();
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
        mainPage.Activate1.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of MO with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 120)
    public void InfoOfferMOAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2009!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.PermanentEmployment.click();
        mainPage.MO.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("14");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
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
        mainPage.Activate1.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of MODOR with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 130)
    public void InfoOfferMODORAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2009!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.PermanentEmployment.click();
        mainPage.MODOR.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("9000");
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
        mainPage.Activate1.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of ROPOS with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 140)
    public void InfoOfferROPOSAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2009!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.PermanentEmployment.click();
        mainPage.ROPOS.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1969");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.Activate1.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of FidelisLife with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")
    @Test(priority = 150)
    public void InfoOfferFidelisLifeAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Beni2009!+");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.PermanentEmployment.click();
        mainPage.FidelisLife.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("16");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1985");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        Select select8 = new Select(mainPage.ChosenAmountSum);
        select8.selectByIndex(2);
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.Activate1.click();
        mainPage.Print.click();
        Thread.sleep(3500);
        mainPage.CreateNewContract.click();
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        mainPage.FirstQuestion.click();
        mainPage.SecondQuestion.click();
        mainPage.ThirdQuestion.click();
        mainPage.FourthQuestion.click();
        mainPage.FirstQuestion1.click();
        mainPage.SecondQuestion1.click();
        mainPage.ThirdQuestion1.click();
        mainPage.FourthQuestion1.click();
        mainPage.FirstQuestion2.click();
        mainPage.SecondQuestion2.click();
        mainPage.ThirdQuestion2.click();
        mainPage.FourthQuestion2.click();
        mainPage.SaveTP.click();
        mainPage.PrintTP.click();
    }

    //ANNULATIONS
    @Epic("sCore Croatia")
    @Feature("Annulations")
    @Description("Annulations of info offer ")
    @Step("Annulation of info offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 160)
    public void AnnulationCustomerWithdrawalInfoOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
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
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Croatia")
    @Feature("Annulations")
    @Description("Annulations of info offer ")
    @Step("Annulation of info offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 170)
    public void AnnulationContractReplacementInfoOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
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
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Croatia")
    @Feature("Annulations")
    @Description("Annulations of offer ")
    @Step("Annulation of offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 180)
    public void AnnulationCustomerWithdrawalOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(8);
        select1.selectByIndex(8);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Croatia")
    @Feature("Annulations")
    @Description("Annulations of offer ")
    @Step("Annulation of offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 190)
    public void AnnulationContractReplacementOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(8);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Croatia")
    @Feature("Annulations")
    @Description("Annulations of activated info offer ")
    @Step("Annulation of activated info offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 200)
    public void AnnulationCustomerWithdrawalInfoOfferActivated() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
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
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Croatia")
    @Feature("Annulations")
    @Description("Annulations of activated info offer ")
    @Step("Annulation of activated info offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 210)
    public void AnnulationContractReplacementInfoOfferActivated() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
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
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Croatia")
    @Feature("Cancellation")
    @Description("Policy cancellation ")
    @Step("Cancellation - Client request")
    @Owner("Nikola Stavrov")
    @Test(priority = 220)
    public void CancellationClientRequest() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivationCRO.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(1);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(7);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();

    }

    @Epic("sCore Croatia")
    @Feature("Cancellations")
    @Description("Policy cancellation ")
    @Step("Cancellation - Uniqa request")
    @Owner("Nikola Stavrov")
    @Test(priority = 230)
    public void CancellationUniqaRequest() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivationCRO.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(9);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();

    }

    @Epic("sCore Croatia")
    @Feature("Cancellations")
    @Description("Policy cancellation ")
    @Step("Cancellation - Dunning")
    @Owner("Nikola Stavrov")
    @Test(priority = 240)
    public void CancellationDunning() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivationCRO.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(3);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(11);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }

    @Epic("sCore Croatia")
    @Feature("Cancellations")
    @Description("Policy cancellation ")
    @Step("Cancellation - Death")
    @Owner("Nikola Stavrov")
    @Test(priority = 250)
    public void CancellationDeath() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivationCRO.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(4);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(16);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();

}
    @Epic("sCore Croatia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy")
    @Owner("Nikola Stavrov")
    @Test(priority = 260)
    public void Reactivation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2023");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.CertificationSignature.click();
        mainPage.Reactivation.click();

    }

    @Epic("sCore Croatia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Annul last cancellation")
    @Owner("Nikola Stavrov")
    @Test(priority = 270)
    public void ReactivationAnnulLastCancellation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2023");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivation.click();
        mainPage.AnnulLastCancellation.click();

    }

    @Epic("sCore Croatia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Annul client request")
    @Owner("Nikola Stavrov")
    @Test(priority = 280)
    public void ReactivationAnnulClientRequest() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2023");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.CertificationSignature.click();
        mainPage.Rejection.click();

    }

    @Epic("sCore Croatia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Rejection")
    @Owner("Nikola Stavrov")
    @Test(priority = 290)
    public void ReactivationRejection() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(5);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2023");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.Rejection.click();

    }

    @Epic("sCore Croatia")
    @Feature("Indexation")
    @Description("Creating info offer of TB with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 300)
    public void IndexationTB() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.TB.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("12");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(4);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(3);
        mainPage.Indexation.click();
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

    @Epic("sCore Croatia")
    @Feature("Indexation")
    @Description("Creating info offer of MO with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 310)
    public void IndexationMO() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MO.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.Indexation.click();
        mainPage.TabConcerns.click();
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
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Indexation")
    @Description("Creating info offer of MODOR with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 320)
    public void IndexationMODOR() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MODOR.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("21");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(1);
        mainPage.Indexation.click();
        mainPage.TabConcerns.click();
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
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of FidelisLife with indexation")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 330)
    public void IndexationFidelisLife () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.FidelisLife.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("16");
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.Indexation.click();
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1985");
        Select select7 = new Select(mainPage.GenderConcernPerson);
        select7.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        Select select8 = new Select(mainPage.ChosenAmountSum);
        select8.selectByIndex(2);
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();
        Thread.sleep(3500);
        mainPage.CreateNewContract.click();
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        mainPage.FirstQuestion.click();
        mainPage.SecondQuestion.click();
        mainPage.ThirdQuestion.click();
        mainPage.FourthQuestion.click();
        mainPage.FirstQuestion1.click();
        mainPage.SecondQuestion1.click();
        mainPage.ThirdQuestion1.click();
        mainPage.FourthQuestion1.click();
        mainPage.FirstQuestion2.click();
        mainPage.SecondQuestion2.click();
        mainPage.ThirdQuestion2.click();
        mainPage.FourthQuestion2.click();
        mainPage.SaveTP.click();
        mainPage.PrintTP.click();
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of TB")
    @Step("Creating new contract of TB - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 340)
    public void NewContractTB () throws Exception {


        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/NoAD/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Werts!23!!g00!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        Zivot.click();

        WebElement TB = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        TB.click();

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/Life/TB/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.click();
        Trajanje.clear();
        Trajanje.sendKeys("15");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("zagreb");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(4);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Uplatnica");

        WebElement Osobe = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Osobe.click();

        WebElement UgovarateljOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        UgovarateljOsiguranik.click();

//53588363881

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement OIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/input"));
        OIB.click();
        OIB.clear();
        OIB.sendKeys("10972535407");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platitelj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platitelj.click();

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement Opis = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        Opis.click();
        Opis.clear();
        Opis.sendKeys("Brat");

        WebElement Postotak = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Postotak.click();
        Postotak.clear();
        Postotak.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement DodajAdresu = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[15]/div/div/div/div[2]/div/div/a"));
        DodajAdresu.click();
        Thread.sleep(1500);

        WebElement iFrameAdresa = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameAdresa);
        Thread.sleep(2000);

        WebElement IzaberiAdresu = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div/div[3]/div/table/tbody/tr[3]/td[4]/div/a"));
        IzaberiAdresu.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("7500");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("190");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("80");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno spremljen predmet osiguranja i rizici") : "Očekivana poruka nakon Ugovornih elemenata";

        js.executeScript("window.scrollBy(0, 2000);");

        WebElement AlkoholZU = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[7]/div/div/div/input"));
        AlkoholZU.clear();
        AlkoholZU.sendKeys("0");

        WebElement ImeDoktora = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[10]/div/div/div/input"));
        ImeDoktora.clear();
        ImeDoktora.sendKeys("DR Test");

        js.executeScript("window.scrollBy(2000, 0);");

        WebElement SpremiteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SpremiteUpitnik.click();

        WebElement PorukaUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUpitnik.getText().equals("Uspješno spremljen upitnik.") : "Očekivana poruka nakon snimanja upitnika";

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

        WebElement SPN = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        SPN.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        StalniIzvori.click();
        Thread.sleep(1000);

        WebElement MolimoNavedite = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/div/input[1]"));
        MolimoNavedite.click();
        MolimoNavedite.sendKeys("123");

        WebElement Drzavljanstvo = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        Drzavljanstvo.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PorezniRezident = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[3]"));
        PorezniRezident.click();

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[6]/div/div/div/label[2]"));
        PIB.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PoslovniOdnos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[8]/div/div/div/label[3]"));
        PoslovniOdnos.click();

        WebElement UiP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[3]"));
        UiP.click();

        WebElement ZP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        ZP.click();

        WebElement DjelatnostStranke = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/input"));
        DjelatnostStranke.click();
        DjelatnostStranke.sendKeys("Djelatnost");

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiSPN = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiSPN.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaAML.getText().equals("Uspješno spremljen Upitnik za sprječavanje pranja novca.") : "Očekivana poruka nakon snimanja AMLa";

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();
        Thread.sleep(1500);

        WebElement PorukaNoviUgovor = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaNoviUgovor.getText().equals("Novi ugovor je uspješno aktiviran.") : "Očekivana poruka nakon aktivacije";

/*   WebElement PorukaPolica = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaPolica.getText().equals("Polica je uspješno kreirana.") : "Očekivana poruka nakon aktivacije";
*/

        WebElement PotvrdaPotpisaBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaBloker.click();
        Thread.sleep(2000);

        WebElement PorukaStampaPolice = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaStampaPolice.getText().equals("Potpis se ne može potvrditi prije štampe ponude.") : "Očekivana poruka nakon potvrde potpisa bez stampanja ponude";

        WebElement PolicaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolicaStampaj.click();
        Thread.sleep(6000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potvrda potpisa uspješno odrađena.") : "Očekivana poruka nakon potvrde potpisa";
/*
        WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
        Raskid.click();

        WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Raskini.click();
        Thread.sleep(2000);

        WebElement PorukaRaskid = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaRaskid.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

        WebElement RaskidAktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        RaskidAktivacija.click();

        WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        KreirajZahtevZaReaktivaciju.click();

        WebElement PorukaZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaZahtevZaReaktivaciju.getText().equals("Kreiran je zahtjev za reaktivaciju.") : "Očekivana poruka nakon kreiranja zahtjeva za reaktivaciju";

        WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        PotvrdaPotpisaReaktivacija.click();

        WebElement PorukaReaktivacijaPP = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaReaktivacijaPP.getText().equals("Zahtjev je poslat u centralu na obradu.") : "Očekivana poruka nakon potvrde potpisa reaktivacije";

        WebElement Reaktiviranje = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        Reaktiviranje.click();
        Thread.sleep(1500);

        WebElement PorukaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaReaktivacija.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";

        WebElement Aneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
        Aneks.click();

        WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        NoviAneks.click();

        WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[3]/label"));
        NacinPlacanja.click();

        WebElement DatumPocetkaAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
        DatumPocetkaAneksa.click();
        DatumPocetkaAneksa.sendKeys("01.06.2024");

        WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        KreirajAneks.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NacinPlacanjaAneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select4 = new Select(NacinPlacanjaAneks);
        select4.selectByVisibleText("Trajni nalog");

        WebElement Banka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[5]/div/div/select"));
        Select select5 = new Select(Banka);
        select5.selectByIndex(6);

        js.executeScript("window.scrollBy(500, 0);");

        WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        AktivirajAneks.click();

        WebElement PorukaAktivacijaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaAktivacijaAneksa.getText().equals("Aneks je uspješno aktiviran.") : "Očekivana poruka nakon aktivacije aneksa";

        WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaAneksa.click();

        WebElement PorukaPotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisaAneksa.getText().equals("Potvrda potpisa uspješno odrađena.") : "Očekivana poruka nakon potvrde potpisa aneksa";

        js.executeScript("window.scrollBy(0, 500);");

        WebElement StampaAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[7]/td[19]/div[1]/a"));
        StampaAneksa.click();

        js.executeScript("window.scrollBy(500, 0);");

        WebElement BrojPolice = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolice.getText();
        System.out.println("Broj police: " + headingtext);

        WebElement RataPremijeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[7]"));
        String headingtext1 = RataPremijeHeader.getText();
        System.out.println("Rata premije: " + headingtext1);

        WebElement DinamikaPlacanjaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[7]"));
        String headingtext2 = DinamikaPlacanjaHeader.getText();
        System.out.println("Dinamika placanja: " + headingtext2);

        WebElement UGPHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[7]"));
        String headingtext3 = UGPHeader.getText();
        System.out.println("UGP: " + headingtext3);

        WebElement TrajanjeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[5]"));
        String headingtext4 = TrajanjeHeader.getText();
        System.out.println("Trajanje (g : m : d): " + headingtext4);

        WebElement DatumPocetkaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[3]"));
        String headingtext5 = DatumPocetkaHeader.getText();
        System.out.println("Datum pocetka: " + headingtext5);

        WebElement UgovarateljHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[3]"));
        String headingtext6 = UgovarateljHeader.getText();
        System.out.println("Ugovaratelj: " + headingtext6);

        WebElement StatusHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[5]"));
        String headingtext7 = StatusHeader.getText();
        System.out.println("Status: " + headingtext7);

*/
    }


    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MO")
    @Step("Creating new contract of MO - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 350)
    public void NewContractMO () throws Exception {


        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/NoAD/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Werts!23!!g00!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        Zivot.click();

        WebElement MO = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[2]/div"));
        MO.click();

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/Life/MO/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.click();
        Trajanje.clear();
        Trajanje.sendKeys("10");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("zagreb");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(4);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Trajni nalog");

        WebElement Banka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[5]/div/div/select"));
        Select select2 = new Select(Banka);
        select2.selectByVisibleText("IMEX BANKA d.d.");

        WebElement Osobe = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Osobe.click();

        WebElement UgovarateljOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        UgovarateljOsiguranik.click();

//53588363881

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement OIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/input"));
        OIB.click();
        OIB.clear();
        OIB.sendKeys("10972535407");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platitelj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platitelj.click();

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement Opis = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        Opis.click();
        Opis.clear();
        Opis.sendKeys("Brat");

        WebElement Postotak = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Postotak.click();
        Postotak.clear();
        Postotak.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement DodajAdresu = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[15]/div/div/div/div[2]/div/div/a"));
        DodajAdresu.click();
        Thread.sleep(1500);

        WebElement iFrameAdresa = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameAdresa);
        Thread.sleep(2000);

        WebElement IzaberiAdresu = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div/div[3]/div/table/tbody/tr[3]/td[4]/div/a"));
        IzaberiAdresu.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("4000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("180");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("79");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno spremljen predmet osiguranja i rizici") : "Očekivana poruka nakon ugovornih elemenata";

        js.executeScript("window.scrollBy(0, 2000);");

        WebElement AlkoholZU = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[7]/div/div/div/input"));
        AlkoholZU.clear();
        AlkoholZU.sendKeys("0");

        WebElement ImeDoktora = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[10]/div/div/div/input"));
        ImeDoktora.clear();
        ImeDoktora.sendKeys("DR Test");

        js.executeScript("window.scrollBy(2000, 0);");

        WebElement SpremiteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SpremiteUpitnik.click();

        WebElement PorukaUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUpitnik.getText().equals("Uspješno spremljen upitnik.") : "Očekivana poruka nakon popunjavanja upitnika";

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

        WebElement SPN = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        SPN.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        StalniIzvori.click();
        Thread.sleep(1000);

        WebElement MolimoNavedite = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/div/input[1]"));
        MolimoNavedite.click();
        MolimoNavedite.sendKeys("123");

        WebElement Drzavljanstvo = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        Drzavljanstvo.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PorezniRezident = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[3]"));
        PorezniRezident.click();

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[6]/div/div/div/label[2]"));
        PIB.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PoslovniOdnos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[8]/div/div/div/label[3]"));
        PoslovniOdnos.click();

        WebElement UiP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[3]"));
        UiP.click();

        WebElement ZP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        ZP.click();

        WebElement DjelatnostStranke = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/input"));
        DjelatnostStranke.click();
        DjelatnostStranke.sendKeys("Djelatnost");

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiSPN = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiSPN.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaAML.getText().equals("Uspješno spremljen Upitnik za sprječavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();
        Thread.sleep(1500);

        WebElement PorukanakonAktivacije = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukanakonAktivacije.getText().equals("Novi ugovor je uspješno aktiviran.") : "Očekivana poruka nakon aktivacije";

        WebElement PorukanakonAktivacije1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukanakonAktivacije1.getText().equals("Ponuda je uspješno kreirana.") : "Očekivana poruka nakon aktivacije";

        WebElement PotvrdaPotpisaBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaBloker.click();
        Thread.sleep(2000);

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potpis se ne može potvrditi prije štampe ponude.") : "Očekivana poruka nakon potvrde potpisa pre štampe";

        WebElement PolicaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolicaStampaj.click();
        Thread.sleep(5000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaPotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa1.getText().equals("Potvrda potpisa uspješno odrađena.") : "Očekivana poruka nakon potvrde potpisa";
/*
        WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
        Raskid.click();

        WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Raskini.click();
        Thread.sleep(2000);

        WebElement PorukanakonRaskida = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukanakonRaskida.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

        WebElement RaskidAktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        RaskidAktivacija.click();

        WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        KreirajZahtevZaReaktivaciju.click();

        WebElement PorukaZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaZahtevZaReaktivaciju.getText().equals("Kreiran je zahtjev za reaktivaciju.") : "Očekivana poruka nakon kreiranja zahteva za reaktivaciju";

        WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        PotvrdaPotpisaReaktivacija.click();

        WebElement PotvrdaPotpisaReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaReaktivacijaPoruka.getText().equals("Zahtjev je poslat u centralu na obradu.") : "Očekivana poruka nakon potvrde potpisa zahteva za reaktivaciju";

        WebElement Reaktiviranje = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        Reaktiviranje.click();
        Thread.sleep(1500);

        WebElement PorukaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaReaktivacija.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";

        WebElement BrojPolice = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolice.getText();
        System.out.println("Broj police: " + headingtext);

        WebElement RataPremijeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[7]"));
        String headingtext1 = RataPremijeHeader.getText();
        System.out.println("Rata premije: " + headingtext1);

        WebElement DinamikaPlacanjaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[7]"));
        String headingtext2 = DinamikaPlacanjaHeader.getText();
        System.out.println("Dinamika placanja: " + headingtext2);

        WebElement UGPHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[7]"));
        String headingtext3 = UGPHeader.getText();
        System.out.println("UGP: " + headingtext3);

        WebElement TrajanjeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[5]"));
        String headingtext4 = TrajanjeHeader.getText();
        System.out.println("Trajanje (g : m : d): " + headingtext4);

        WebElement DatumPocetkaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[3]"));
        String headingtext5 = DatumPocetkaHeader.getText();
        System.out.println("Datum pocetka: " + headingtext5);

        WebElement UgovarateljHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[3]"));
        String headingtext6 = UgovarateljHeader.getText();
        System.out.println("Ugovaratelj: " + headingtext6);

        WebElement StatusHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[5]"));
        String headingtext7 = StatusHeader.getText();
        System.out.println("Status: " + headingtext7);


       /*  WebElement Aneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[13]/a"));
        Aneks.click();

        WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        NoviAneks.click();

        WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[3]/label"));
        NacinPlacanja.click();

        WebElement DatumPocetkaAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
        DatumPocetkaAneksa.click();
        DatumPocetkaAneksa.sendKeys("01.12.2023");

        WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        KreirajAneks.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NacinPlacanjaAneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(NacinPlacanjaAneks);
        select3.selectByVisibleText("Trajni nalog");

        WebElement BankaAneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select4 = new Select(BankaAneks);
        select4.selectByVisibleText("IMEX BANKA d.d.");

        js.executeScript("window.scrollBy(500, 0);");

        WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        AktivirajAneks.click();

        WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaAneksa.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement StampaAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[7]/td[19]/div[1]/a"));
        StampaAneksa.click();

        js.executeScript("window.scrollBy(500, 0);");

        WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
        PonistavanjeAneksa.click();

        WebElement PonistavanjeAneksaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/table/tbody/tr[2]/td[17]/span/a/img"));
        PonistavanjeAneksaAkcija.click();

        WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/table/tbody/tr[2]/td[17]/ul/li[2]/a"));
        PonistiAneks.click();
        Thread.sleep(1000);

        WebElement RaskidPolice = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        RaskidPolice.click();

        WebElement RaskiniPolicu = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        RaskiniPolicu.click();
     */


    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MODOR")
    @Step("Creating new contract of MODOR - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 360)
    public void NewContractMODOR () throws Exception {


        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/NoAD/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Werts!23!!g00!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        Zivot.click();

        WebElement MODOR = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[3]/div"));
        MODOR.click();

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/Life/MODOR/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.click();
        Trajanje.clear();
        Trajanje.sendKeys("17");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("zagreb");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(3);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select1 = new Select(MetodPlacanja);
        select1.selectByVisibleText("Trajni nalog");

        WebElement Banka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[5]/div/div/select"));
        Select select2 = new Select(Banka);
        select2.selectByVisibleText("IMEX BANKA d.d.");

        WebElement Osobe = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Osobe.click();


        WebElement UgovarateljOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        UgovarateljOsiguranik.click();

//53588363881

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement OIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/input"));
        OIB.click();
        OIB.clear();
        OIB.sendKeys("10972535407");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platitelj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platitelj.click();

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement Opis = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        Opis.click();
        Opis.clear();
        Opis.sendKeys("Sestra");

        WebElement Postotak = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Postotak.click();
        Postotak.clear();
        Postotak.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement DodajAdresu = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[15]/div/div/div/div[2]/div/div/a"));
        DodajAdresu.click();
        Thread.sleep(1500);

        WebElement iFrameAdresa = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameAdresa);
        Thread.sleep(2000);

        WebElement IzaberiAdresu = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div/div[3]/div/table/tbody/tr[3]/td[4]/div/a"));
        IzaberiAdresu.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("4500");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("180");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("79");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno spremljen predmet osiguranja i rizici") : "Očekivana poruka nakon ugovornih elemenata";

        js.executeScript("window.scrollBy(0, 2000);");

        WebElement AlkoholZU = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[7]/div/div/div/input"));
        AlkoholZU.clear();
        AlkoholZU.sendKeys("0");

        WebElement ImeDoktora = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[10]/div/div/div/input"));
        ImeDoktora.clear();
        ImeDoktora.sendKeys("DR Test");

        js.executeScript("window.scrollBy(2000, 0);");

        WebElement SpremiteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SpremiteUpitnik.click();

        WebElement PorukaUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUpitnik.getText().equals("Uspješno spremljen upitnik.") : "Očekivana poruka nakon popunjavanja upitnika";

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

        WebElement SPN = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        SPN.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        StalniIzvori.click();
        Thread.sleep(1000);

        WebElement MolimoNavedite = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/div/input[1]"));
        MolimoNavedite.click();
        MolimoNavedite.sendKeys("123");

        WebElement Drzavljanstvo = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        Drzavljanstvo.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PorezniRezident = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[3]"));
        PorezniRezident.click();

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[6]/div/div/div/label[2]"));
        PIB.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PoslovniOdnos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[8]/div/div/div/label[3]"));
        PoslovniOdnos.click();

        WebElement UiP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[3]"));
        UiP.click();

        WebElement ZP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        ZP.click();

        WebElement DjelatnostStranke = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/input"));
        DjelatnostStranke.click();
        DjelatnostStranke.sendKeys("Djelatnost");

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiSPN = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiSPN.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaAML.getText().equals("Uspješno spremljen Upitnik za sprječavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();
        Thread.sleep(1500);

        WebElement PorukanakonAktivacije = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukanakonAktivacije.getText().equals("Novi ugovor je uspješno aktiviran.") : "Očekivana poruka nakon aktivacije";

        WebElement PorukanakonAktivacije1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukanakonAktivacije1.getText().equals("Polica je uspješno kreirana.") : "Očekivana poruka nakon aktivacije";

        WebElement PotvrdaPotpisaBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaBloker.click();
        Thread.sleep(2000);

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potpis se ne može potvrditi prije štampe police.") : "Očekivana poruka nakon potvrde potpisa pre štampe";

        WebElement PolicaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolicaStampaj.click();
        Thread.sleep(5000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Thread.sleep(1500);
        PotvrdaPotpisa.click();

        WebElement PorukaPotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa1.getText().equals("Potvrda potpisa uspješno odrađena.") : "Očekivana poruka nakon potvrde potpisa";
/*
        WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
        Raskid.click();

        WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Raskini.click();
        Thread.sleep(2000);

        WebElement PorukanakonRaskida = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukanakonRaskida.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

        WebElement RaskidAktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        RaskidAktivacija.click();

        WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        KreirajZahtevZaReaktivaciju.click();

        WebElement PorukaZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaZahtevZaReaktivaciju.getText().equals("Kreiran je zahtjev za reaktivaciju.") : "Očekivana poruka nakon kreiranja zahteva za reaktivaciju";

        WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        PotvrdaPotpisaReaktivacija.click();

        WebElement PotvrdaPotpisaReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaReaktivacijaPoruka.getText().equals("Zahtjev je poslat u centralu na obradu.") : "Očekivana poruka nakon potvrde potpisa zahteva za reaktivaciju";

        WebElement Reaktiviranje = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        Reaktiviranje.click();
        Thread.sleep(1500);

        WebElement PorukaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaReaktivacija.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";

        WebElement BrojPolice = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolice.getText();
        System.out.println("Broj police: " + headingtext);

        WebElement RataPremijeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[7]"));
        String headingtext1 = RataPremijeHeader.getText();
        System.out.println("Rata premije: " + headingtext1);

        WebElement DinamikaPlacanjaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[7]"));
        String headingtext2 = DinamikaPlacanjaHeader.getText();
        System.out.println("Dinamika placanja: " + headingtext2);

        WebElement UGPHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[7]"));
        String headingtext3 = UGPHeader.getText();
        System.out.println("UGP: " + headingtext3);

        WebElement TrajanjeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[5]"));
        String headingtext4 = TrajanjeHeader.getText();
        System.out.println("Trajanje (g : m : d): " + headingtext4);

        WebElement DatumPocetkaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[3]"));
        String headingtext5 = DatumPocetkaHeader.getText();
        System.out.println("Datum pocetka: " + headingtext5);

        WebElement UgovarateljHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[3]"));
        String headingtext6 = UgovarateljHeader.getText();
        System.out.println("Ugovaratelj: " + headingtext6);

        WebElement StatusHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[5]"));
        String headingtext7 = StatusHeader.getText();
        System.out.println("Status: " + headingtext7);
*/
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of ROPOS")
    @Step("Creating new contract of ROPOS - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 370)
    public void NewContractROPOS () throws Exception {


        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/NoAD/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Werts!23!!g00!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        Zivot.click();

        WebElement ROPOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        ROPOS.click();

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/Life/ROPOS/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.click();
        Trajanje.clear();
        Trajanje.sendKeys("20");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("zagreb");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(3);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Uplatnica");

        WebElement VinkulacijaOsnovno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[2]/div/div/div/ul/li/label"));
        VinkulacijaOsnovno.click();
        Thread.sleep(1000);

        WebElement Osobe = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Osobe.click();

        WebElement UgovarateljOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        UgovarateljOsiguranik.click();

//53588363881

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement OIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/input"));
        OIB.click();
        OIB.clear();
        OIB.sendKeys("56033006787");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platitelj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platitelj.click();

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement Opis = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        Opis.click();
        Opis.clear();
        Opis.sendKeys("Brat");

        WebElement Postotak = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Postotak.click();
        Postotak.clear();
        Postotak.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement DodajAdresu = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[15]/div/div/div/div[2]/div/div/a"));
        DodajAdresu.click();
        Thread.sleep(1500);

        WebElement iFrameAdresa = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameAdresa);
        Thread.sleep(2000);

        WebElement IzaberiAdresu = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div/div[3]/div/table/tbody/tr[3]/td[4]/div/a"));
        IzaberiAdresu.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("40000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("190");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("80");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno spremljen predmet osiguranja i rizici") : "Očekivana poruka nakon ugovornih elemenata";

        js.executeScript("window.scrollBy(0, 2000);");

        WebElement AlkoholZU = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[7]/div/div/div/input"));
        AlkoholZU.clear();
        AlkoholZU.sendKeys("0");

        WebElement ImeDoktora = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[10]/div/div/div/input"));
        ImeDoktora.clear();
        ImeDoktora.sendKeys("DR Test");

        js.executeScript("window.scrollBy(2000, 0);");

        WebElement SpremiteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SpremiteUpitnik.click();

        WebElement PorukaUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUpitnik.getText().equals("Uspješno spremljen upitnik.") : "Očekivana poruka nakon popunjavanja upitnika";

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

        WebElement SPN = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        SPN.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        StalniIzvori.click();
        Thread.sleep(1000);

        WebElement MolimoNavedite = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/div/input[1]"));
        MolimoNavedite.click();
        MolimoNavedite.sendKeys("123");

        WebElement Drzavljanstvo = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        Drzavljanstvo.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PorezniRezident = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[3]"));
        PorezniRezident.click();

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[6]/div/div/div/label[2]"));
        PIB.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PoslovniOdnos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[8]/div/div/div/label[3]"));
        PoslovniOdnos.click();

        WebElement UiP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[3]"));
        UiP.click();

        WebElement ZP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        ZP.click();

        WebElement DjelatnostStranke = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/input"));
        DjelatnostStranke.click();
        DjelatnostStranke.sendKeys("Djelatnost");

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiSPN = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiSPN.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaAML.getText().equals("Uspješno spremljen Upitnik za sprječavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();
        Thread.sleep(1500);

        WebElement PorukanakonAktivacije = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukanakonAktivacije.getText().equals("Novi ugovor je uspješno aktiviran.") : "Očekivana poruka nakon aktivacije";

        WebElement PorukanakonAktivacije1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukanakonAktivacije1.getText().equals("Polica je uspješno kreirana.") : "Očekivana poruka nakon aktivacije";

        WebElement PotvrdaPotpisaBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaBloker.click();
        Thread.sleep(2000);

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potpis se ne može potvrditi prije štampe police.") : "Očekivana poruka nakon potvrde potpisa pre štampe";

        WebElement PolicaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolicaStampaj.click();
        Thread.sleep(5000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaPotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa1.getText().equals("Potvrda potpisa uspješno odrađena.") : "Očekivana poruka nakon potvrde potpisa";
     /*
        WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        Raskid.click();

        WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Raskini.click();
        Thread.sleep(2000);

        WebElement PorukanakonRaskida = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukanakonRaskida.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

        WebElement RaskidAktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        RaskidAktivacija.click();

        WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        KreirajZahtevZaReaktivaciju.click();

        WebElement PorukaZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaZahtevZaReaktivaciju.getText().equals("Kreiran je zahtjev za reaktivaciju.") : "Očekivana poruka nakon kreiranja zahteva za reaktivaciju";

        WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        PotvrdaPotpisaReaktivacija.click();

        WebElement PotvrdaPotpisaReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaReaktivacijaPoruka.getText().equals("Zahtjev je poslat u centralu na obradu.") : "Očekivana poruka nakon potvrde potpisa zahteva za reaktivaciju";

        WebElement Reaktiviranje = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        Reaktiviranje.click();
        Thread.sleep(1500);

        WebElement PorukaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaReaktivacija.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";

        WebElement Aneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
        Aneks.click();

        WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        NoviAneks.click();

        WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[2]/label"));
        NacinPlacanja.click();

        WebElement DatumPocetkaAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
        DatumPocetkaAneksa.click();
        DatumPocetkaAneksa.sendKeys("01.06.2024");

        WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        KreirajAneks.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NacinPlacanjaAneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select4 = new Select(NacinPlacanjaAneks);
        select4.selectByVisibleText("Trajni nalog");

        WebElement Banka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[5]/div/div/select"));
        Select select5 = new Select(Banka);
        select5.selectByIndex(6);

        js.executeScript("window.scrollBy(500, 0);");

        WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        AktivirajAneks.click();

        WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaAneksa.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement StampaAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[7]/td[19]/div[1]/a"));
        StampaAneksa.click();
/*
        js.executeScript("window.scrollBy(500, 0);");

        WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        PonistavanjeAneksa.click();

        WebElement PonistavanjeAneksaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/table/tbody/tr[2]/td[17]/span/a/img"));
        PonistavanjeAneksaAkcija.click();

        WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/table/tbody/tr[2]/td[17]/ul/li[2]/a"));
        PonistiAneks.click();
        Thread.sleep(1000);

        WebElement PorukaInfoPonuda = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaInfoPonuda.getText().equals("Aneks je u takvom statusu da se ne može poništiti") : "Očekivana poruka nakon pokusaja ponistavanja aneksa";
*/

        WebElement BrojPolice = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolice.getText();
        System.out.println("Broj police: " + headingtext);

        WebElement RataPremijeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[7]"));
        String headingtext1 = RataPremijeHeader.getText();
        System.out.println("Rata premije: " + headingtext1);

        WebElement DinamikaPlacanjaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[7]"));
        String headingtext2 = DinamikaPlacanjaHeader.getText();
        System.out.println("Dinamika placanja: " + headingtext2);

        WebElement UGPHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[7]"));
        String headingtext3 = UGPHeader.getText();
        System.out.println("UGP: " + headingtext3);

        WebElement TrajanjeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[5]"));
        String headingtext4 = TrajanjeHeader.getText();
        System.out.println("Trajanje (g : m : d): " + headingtext4);

        WebElement DatumPocetkaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[3]"));
        String headingtext5 = DatumPocetkaHeader.getText();
        System.out.println("Datum pocetka: " + headingtext5);

        WebElement UgovarateljHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[3]"));
        String headingtext6 = UgovarateljHeader.getText();
        System.out.println("Ugovaratelj: " + headingtext6);

        WebElement StatusHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[5]"));
        String headingtext7 = StatusHeader.getText();
        System.out.println("Status: " + headingtext7);

    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of FidelisLife")
    @Step("Creating new contract of FidelisLife - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 380)
    public void NewContractFidelisLife () throws Exception {


        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/NoAD/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Werts!23!!g00!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[1]/div"));
        Zivot.click();

        WebElement FIDELISLIFE = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[5]/div"));
        FIDELISLIFE.click();

        driver.get("https://aasv098.uniqa.hr/POS/Croatia/Life/GPS/NewContract/InsuranceDistributionDirective/New/0");

        //Sledi Test Prikladnosti koji se mora popuniti i odstampati

        WebElement Ime = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/fieldset[1]/div/div[1]/div[1]/input"));
        Ime.click();
        Ime.clear();
        Ime.sendKeys("Nikola");

        WebElement StrucnaSprema = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/fieldset[1]/div/div[1]/div[2]/input"));
        StrucnaSprema.click();
        StrucnaSprema.clear();
        StrucnaSprema.sendKeys("VSS");

        WebElement Prezime = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/fieldset[1]/div/div[2]/div[1]/input"));
        Prezime.click();
        Prezime.clear();
        Prezime.sendKeys("Nikolic");

        WebElement Zvanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/fieldset[1]/div/div[2]/div[2]/input"));
        Zvanje.click();
        Zvanje.clear();
        Zvanje.sendKeys("Menadzer");

        WebElement OIBTP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/fieldset[1]/div/div[3]/div[1]/input"));
        OIBTP.click();
        OIBTP.clear();
        OIBTP.sendKeys("44690245651");

        WebElement Zanimanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/fieldset[1]/div/div[3]/div[2]/input"));
        Zanimanje.click();
        Zanimanje.clear();
        Zanimanje.sendKeys("Diplomirani Ekonomista");

        WebElement NazivDistributere = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/fieldset[2]/div/div[1]/div/div/div[1]/input"));
        NazivDistributere.click();
        NazivDistributere.clear();
        NazivDistributere.sendKeys("UNIQA");

        WebElement ImeDistributera = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/fieldset[2]/div/div[1]/div/div/div[2]/input"));
        ImeDistributera.click();
        ImeDistributera.clear();
        ImeDistributera.sendKeys("UNIQA CRO");

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Iskustvo = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[1]/fieldset/div[1]/div/div/div/label[2]"));
        Iskustvo.click();

        WebElement Ucestalost = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[1]/fieldset/div[2]/div/div/div/label[2]"));
        Ucestalost.click();

        WebElement UkupanVolumen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[1]/fieldset/div[3]/div/div/div/label[3]"));
        UkupanVolumen.click();

        WebElement DostatnoPojasnjenje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[1]/fieldset/div[4]/div/div/div/label[6]"));
        DostatnoPojasnjenje.click();

        WebElement Iskustvo1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[2]/fieldset/div[1]/div/div/div/label[3]"));
        Iskustvo1.click();

        WebElement Ucestalost1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[2]/fieldset/div[2]/div/div/div/label[2]"));
        Ucestalost1.click();

        WebElement UkupanVolumen1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[2]/fieldset/div[3]/div/div/div/label[3]"));
        UkupanVolumen1.click();

        WebElement DostatnoPojasnjenje1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[2]/fieldset/div[4]/div/div/div/label[6]"));
        DostatnoPojasnjenje1.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Iskustvo2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[3]/fieldset/div[1]/div/div/div/label[2]"));
        Iskustvo2.click();

        WebElement Ucestalost2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[3]/fieldset/div[2]/div/div/div/label[2]"));
        Ucestalost2.click();

        WebElement UkupanVolumen2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[3]/fieldset/div[3]/div/div/div/label[3]"));
        UkupanVolumen2.click();

        WebElement DostatnoPojasnjenje2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[3]/div[3]/fieldset/div[4]/div/div/div/label[6]"));
        DostatnoPojasnjenje2.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement SpremiTestPrikladnosti = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        SpremiTestPrikladnosti.click();

        WebElement IspisTestPrikladnosti = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        IspisTestPrikladnosti.click();
        Thread.sleep(1500);

        WebElement KreirajNoviFidelisLife = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        KreirajNoviFidelisLife.click();

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.click();
        Trajanje.clear();
        Trajanje.sendKeys("11");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("zagreb");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(5);

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Uplatnica");

       /*  WebElement VinkulacijaOsnovno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[2]/div/div/div/ul/li/label"));
        VinkulacijaOsnovno.click();
        Thread.sleep(1000);
                */
        WebElement Osobe = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Osobe.click();

        WebElement UgovarateljOsiguranik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label"));
        UgovarateljOsiguranik.click();

//53588363881

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        WebElement OIB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/input"));
        OIB.click();
        OIB.clear();
        OIB.sendKeys("56033006787");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platitelj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platitelj.click();

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement Opis = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        Opis.click();
        Opis.clear();
        Opis.sendKeys("Sestra");

        WebElement Postotak = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Postotak.click();
        Postotak.clear();
        Postotak.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement DodajAdresu = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[15]/div/div/div/div[2]/div/div/a"));
        DodajAdresu.click();
        Thread.sleep(1500);

        WebElement iFrameAdresa = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameAdresa);
        Thread.sleep(2000);

        WebElement IzaberiAdresu = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div/div[3]/div/table/tbody/tr[3]/td[4]/div/a"));
        IzaberiAdresu.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement OsnovaZaKalkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/div/select"));
        Select select4 = new Select(OsnovaZaKalkulaciju);
        select4.selectByIndex(1);

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("4500");

        WebElement OdabraniIznosPremije = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[2]/div/div/div/select"));
        Select select5 = new Select(OdabraniIznosPremije);
        select5.selectByIndex(1);

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("190");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("80");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspješno spremljen predmet osiguranja i rizici") : "Očekivana poruka nakon ugovornih elemenata";

        js.executeScript("window.scrollBy(0, 2000);");

        WebElement PrvoPitanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Thread.sleep(3500);
        PrvoPitanje.click();

        WebElement DnevnaKolicinaAlkohola = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[2]/div/div/div/input"));
        DnevnaKolicinaAlkohola.clear();
        DnevnaKolicinaAlkohola.sendKeys("0");

        WebElement Duhan = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        Duhan.click();

        WebElement Droga = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        Droga.click();

        WebElement ImeDoktora = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[5]/div/div/div/input"));
        ImeDoktora.clear();
        ImeDoktora.sendKeys("DR Test");

        WebElement Deformitet = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[6]/div/div/div/label[2]"));
        Deformitet.click();

        WebElement Oboljenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[3]/fieldset/div[2]/div/div/fieldset/div[7]/div/div/div/label[2]"));
        Oboljenja.click();

        js.executeScript("window.scrollBy(2000, 0);");

        WebElement SpremiteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SpremiteUpitnik.click();

        WebElement PorukaUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUpitnik.getText().equals("Uspješno spremljen upitnik.") : "Očekivana poruka nakon popunjavanja upitnika";

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

        WebElement SPN = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        SPN.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        StalniIzvori.click();
        Thread.sleep(1000);

        WebElement MolimoNavedite = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/div/input[1]"));
        MolimoNavedite.click();
        MolimoNavedite.sendKeys("123");

        WebElement Drzavljanstvo = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        Drzavljanstvo.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PorezniRezident = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[3]"));
        PorezniRezident.click();

        WebElement PIB = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[6]/div/div/div/label[2]"));
        PIB.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PoslovniOdnos = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[8]/div/div/div/label[3]"));
        PoslovniOdnos.click();

        WebElement UiP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[9]/div/div/div/label[3]"));
        UiP.click();

        WebElement ZP = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[10]/div/div/div/label[2]"));
        ZP.click();

        WebElement DjelatnostStranke = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[11]/div/div/div/input"));
        DjelatnostStranke.click();
        DjelatnostStranke.sendKeys("Djelatnost");

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiSPN = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiSPN.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaAML.getText().equals("Uspješno spremljen Upitnik za sprječavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();
        Thread.sleep(1500);

        WebElement PorukanakonAktivacije = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukanakonAktivacije.getText().equals("Novi ugovor je uspješno aktiviran.") : "Očekivana poruka nakon aktivacije";

        WebElement PorukanakonAktivacije1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukanakonAktivacije1.getText().equals("Polica je uspješno kreirana.") : "Očekivana poruka nakon aktivacije";

        WebElement PotvrdaPotpisaBloker = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaBloker.click();
        Thread.sleep(2000);

        WebElement PorukaPotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaPotvrdaPotpisa.getText().equals("Potpis se ne može potvrditi prije štampe police.") : "Očekivana poruka nakon potvrde potpisa pre štampe";

        WebElement PolicaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/div[1]/a"));
        PolicaStampaj.click();
        Thread.sleep(6000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PorukaPotvrdaPotpisa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaPotvrdaPotpisa1.getText().equals("Potvrda potpisa uspješno odrađena.") : "Očekivana poruka nakon potvrde potpisa";
   /*
        WebElement Raskid = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        Raskid.click();

        WebElement Raskini = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Raskini.click();
        Thread.sleep(2000);

        WebElement PorukanakonRaskida = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukanakonRaskida.getText().equals("Uspješno raskinut dokument.") : "Očekivana poruka nakon raskida";

        WebElement RaskidAktivacija = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        RaskidAktivacija.click();

        WebElement KreirajZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        KreirajZahtevZaReaktivaciju.click();

        WebElement PorukaZahtevZaReaktivaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaZahtevZaReaktivaciju.getText().equals("Kreiran je zahtjev za reaktivaciju.") : "Očekivana poruka nakon kreiranja zahteva za reaktivaciju";

        WebElement PotvrdaPotpisaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        PotvrdaPotpisaReaktivacija.click();

        WebElement PotvrdaPotpisaReaktivacijaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaReaktivacijaPoruka.getText().equals("Zahtjev je poslat u centralu na obradu.") : "Očekivana poruka nakon potvrde potpisa zahteva za reaktivaciju";

        WebElement Reaktiviranje = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[4]/a"));
        Reaktiviranje.click();
        Thread.sleep(1500);

        WebElement PorukaReaktivacija = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaReaktivacija.getText().equals("Dokument je uspješno aktiviran.") : "Očekivana poruka nakon reaktivacije";

        WebElement BrojPolice = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolice.getText();
        System.out.println("Broj police je: " + headingtext);

        WebElement RataPremijeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[7]"));
        String headingtext1 = RataPremijeHeader.getText();
        System.out.println("Rata premije: " + headingtext1);

        WebElement DinamikaPlacanjaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[7]"));
        String headingtext2 = DinamikaPlacanjaHeader.getText();
        System.out.println("Dinamika placanja: " + headingtext2);

        WebElement UGPHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[7]"));
        String headingtext3 = UGPHeader.getText();
        System.out.println("UGP: " + headingtext3);

        WebElement TrajanjeHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[5]"));
        String headingtext4 = TrajanjeHeader.getText();
        System.out.println("Trajanje (g : m : d): " + headingtext4);

        WebElement DatumPocetkaHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[3]/div[3]"));
        String headingtext5 = DatumPocetkaHeader.getText();
        System.out.println("Datum pocetka: " + headingtext5);

        WebElement UgovarateljHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[3]"));
        String headingtext6 = UgovarateljHeader.getText();
        System.out.println("Ugovaratelj: " + headingtext6);

        WebElement StatusHeader = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[1]/div[5]"));
        String headingtext7 = StatusHeader.getText();
        System.out.println("Status: " + headingtext7);

        /*

        WebElement Aneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[12]/a"));
        Aneks.click();

        WebElement NoviAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        NoviAneks.click();

        WebElement NacinPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div/div/div/div/ul/li[2]/label"));
        NacinPlacanja.click();

        WebElement DatumPocetkaAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/fieldset/div[2]/div/input"));
        DatumPocetkaAneksa.click();
        DatumPocetkaAneksa.sendKeys("01.5.2024");

        WebElement KreirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        KreirajAneks.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement NacinPlacanjaAneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select6 = new Select(NacinPlacanjaAneks);
        select6.selectByVisibleText("Trajni nalog");

        WebElement Banka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select7 = new Select(Banka);
        select7.selectByVisibleText("IMEX BANKA d.d.");

        js.executeScript("window.scrollBy(500, 0);");

        WebElement AktivirajAneks = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        AktivirajAneks.click();

        WebElement PotvrdaPotpisaAneksa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisaAneksa.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement StampaAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[7]/td[19]/div[1]/a"));
        StampaAneksa.click();

        js.executeScript("window.scrollBy(500, 0);");

        WebElement PonistavanjeAneksa = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        PonistavanjeAneksa.click();

        WebElement PonistavanjeAneksaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/table/tbody/tr[2]/td[17]/span/a/img"));
        PonistavanjeAneksaAkcija.click();

        WebElement PorukaInfoPonuda = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul/li"));
        assert PorukaInfoPonuda.getText().equals("Aneks je u takvom statusu da se ne može poništiti") : "Očekivana poruka nakon pokusaja ponistavanja aneksa";

        WebElement PonistiAneks = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/table/tbody/tr[2]/td[17]/ul/li[2]/a"));
        PonistiAneks.click();
        Thread.sleep(1000);

        WebElement RaskidPolice = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        RaskidPolice.click();

        WebElement RaskiniPolicu = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        RaskiniPolicu.click();

                */


    }

}



