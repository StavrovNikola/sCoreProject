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

}
