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

public class sCoreCroatiaTest {

    private MainPage mainPage;
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
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
        mainPage.DurationInYear.sendKeys("11");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        new Select(mainPage.Banka).selectByIndex(3);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("8000");
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1969");
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
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1985");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        new Select(mainPage.Banka).selectByIndex(3);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("13000");
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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("9000");
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1969");
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
        mainPage.DurationInYear.sendKeys("20");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1985");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        new Select(mainPage.Banka).selectByIndex(3);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("9000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1969");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1985");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
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
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
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
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
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
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(8);
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
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(8);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
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
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
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
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.AnnulationCRO.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Croatia")
    @Feature("Cancellations")
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivationCRO.click();
        new Select(mainPage.CancellationType).selectByIndex(1);
        new Select(mainPage.CancellationReason).selectByIndex(7);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivationCRO.click();
        new Select(mainPage.CancellationType).selectByIndex(2);
        new Select(mainPage.CancellationReason).selectByIndex(9);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivationCRO.click();
        new Select(mainPage.CancellationType).selectByIndex(3);
        new Select(mainPage.CancellationReason).selectByIndex(11);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.CancellationReactivationCRO.click();
        new Select(mainPage.CancellationType).selectByIndex(4);
        new Select(mainPage.CancellationReason).selectByIndex(16);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        new Select(mainPage.Banka).selectByIndex(3);
        mainPage.IndexationCRO.click();
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.IndexationCRO.click();
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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(1);
        mainPage.IndexationCRO.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("8000");
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

    @Epic("sCore Croatia")
    @Feature("Info offer")
    @Description("Creating info offer of FidelisLife with indexation")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 330)
    public void IndexationFidelisLife() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.FidelisLife.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.IndexationCRO.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1985");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
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
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - TB")
    @Owner("Nikola Stavrov")
    @Test(priority = 390)
    public void ClausesTB() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Products).selectByIndex(1);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.Preview.click();
        mainPage.TabClausesCRO.click();
        assert mainPage.OUZ2023.getText().equals("Opći uvjeti za osiguranje života OUŽ 1/2023") : "Excepted General Conditions";
        assert mainPage.PUTB2023.getText().equals("Posebni uvjeti za dopunsko pokriće za slučaj nastanka teških bolesti uz osiguranje života PUTB 1/2023") : "Excepted Special Conditions";
        assert mainPage.INFTB2023.getText().equals("Informacije ugovaratelju osiguranja života INF-TB 1/2023") : "Excepted Special Conditions";
        assert mainPage.IOOPTB.getText().equals("Informacije o obradi podataka INF IOOP") : "Excepted Special Conditions";

    }

    @Epic("sCore Croatia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - MO")
    @Owner("Nikola Stavrov")
    @Test(priority = 400)
    public void ClausesMO() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Products).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.Preview.click();
        mainPage.TabClausesCRO.click();
        assert mainPage.OUZ2023.getText().equals("Opći uvjeti za osiguranje života OUŽ 1/2023") : "Excepted General Conditions";
        assert mainPage.INFZIV2023.getText().equals("Informacije ugovaratelju osiguranja života INF-ZIV 1/2023") : "Excepted Special Conditions";
        assert mainPage.INFIOOP.getText().equals("Informacije o obradi podataka INF IOOP") : "Excepted Special Conditions";


    }


    @Epic("sCore Croatia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - MODOR")
    @Owner("Nikola Stavrov")
    @Test(priority = 410)
    public void ClausesMODOR() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Products).selectByIndex(3);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.Preview.click();
        mainPage.TabClausesCRO.click();
        assert mainPage.OUZ2023.getText().equals("Opći uvjeti za osiguranje života OUŽ 1/2023") : "Excepted General Conditions";
        assert mainPage.INFZIV2023.getText().equals("Informacije ugovaratelju osiguranja života INF-ZIV 1/2023") : "Excepted Special Conditions";
        assert mainPage.INFIOOP.getText().equals("Informacije o obradi podataka INF IOOP") : "Excepted Special Conditions";


    }

    @Epic("sCore Croatia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - ROPOS")
    @Owner("Nikola Stavrov")
    @Test(priority = 420)
    public void ClausesROPOS() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Products).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.Preview.click();
        mainPage.TabClausesCRO.click();
        assert mainPage.OUZ2023.getText().equals("Opći uvjeti za osiguranje života OUŽ 1/2023") : "Excepted General Conditions";
        assert mainPage.INFZIV2023.getText().equals("Informacije ugovaratelju osiguranja života INF-ZIV 1/2023") : "Excepted Special Conditions";
        assert mainPage.Clause05.getText().equals("Klauzula 05 1. U slučaju smrti osiguranika za vrijeme trajanja osiguranja, osiguratelj isplaćuje korisniku ugovoreni osigurani iznos naveden na polici. 2. Ovaj ugovor o osiguranju ne uključuje pravo na sudjelovanje u dobiti osiguratelja i dobit se ne isplaćuje. 3. Otkup i kapitalizacija prema članku 26. i 27. Općih uvjeta za osiguranje života ne mogu se zatražiti.") : "Excepted Special Conditions";
        assert mainPage.INFIOOP.getText().equals("Informacije o obradi podataka INF IOOP") : "Excepted Special Conditions";


    }


    @Epic("sCore Croatia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - FidelisLife")
    @Owner("Nikola Stavrov")
    @Test(priority = 430)
    public void ClausesFidelisLife() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Products).selectByIndex(7);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchCRO.click();
        mainPage.Preview.click();
        mainPage.TabClausesCRO.click();
        assert mainPage.OUZIF2023.getText().equals("Opći uvjeti za osiguranje života vezano za jedinice investicijskih fondova OUŽIF 1/2023") : "Excepted General Conditions";
        assert mainPage.PUZIF2022.getText().equals("Posebni uvjeti za osiguranje života vezano za jedinice investicijskih fondova za ugovoreno povećanje premije i osiguranog iznosa bez ponovnog liječničkog pregleda PUŽIF 1/2022") : "Excepted Special Conditions";
        assert mainPage.INFIOOP.getText().equals("Informacije o obradi podataka INF IOOP") : "Excepted Special Conditions";


    }

    @Epic("sCore Croatia")
    @Feature("Side menu print")
    @Description("Checking documents from Side menu")
    @Step("Checking documents from Side menu - TB")
    @Owner("Nikola Stavrov")
    @Test(priority = 440)
    public void SideMenuTB() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.TB.click();
        mainPage.SideMenuCRO.click();
        mainPage.SideMenuDocuments.click();
        Thread.sleep(2500);
        assert mainPage.INFIOOPSideMenu.getText().equals("Informacije o obradi podataka INF IOOP") : "Expected side menu document";
        mainPage.WhiteButton.click();
        Thread.sleep(2500);
        assert mainPage.INFTB20231.getText().equals("Informacije ugovaratelju INF-TB_2023") : "Expected side menu document";
        mainPage.WhiteButton1.click();
        Thread.sleep(2500);
        assert mainPage.TB2016.getText().equals("Informacije o proizvodu osiguranja TB2016") : "Expected side menu document";
        mainPage.WhiteButton2.click();


    }

    @Epic("sCore Croatia")
    @Feature("Side menu print")
    @Description("Checking documents from Side menu")
    @Step("Checking documents from Side menu - MO")
    @Owner("Nikola Stavrov")
    @Test(priority = 450)
    public void SideMenuMO() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MO.click();
        mainPage.SideMenuCRO.click();
        mainPage.SideMenuDocuments.click();
        assert mainPage.INFIOOPSideMenu.getText().equals("Informacije o obradi podataka INF IOOP") : "Expected side menu document";
        mainPage.WhiteButton.click();
        Thread.sleep(2500);
        assert mainPage.INFZIV2023SideMenu.getText().equals("Informacije ugovaratelju INF-ZIV_2023") : "Expected side menu document";
        mainPage.WhiteButton1.click();
        Thread.sleep(2500);
        assert mainPage.MO16.getText().equals("Informacije o proizvodu osiguranja MO16") : "Expected side menu document";
        mainPage.WhiteButton2.click();


    }

    @Epic("sCore Croatia")
    @Feature("Side menu print")
    @Description("Checking documents from Side menu")
    @Step("Checking documents from Side menu - MODOR")
    @Owner("Nikola Stavrov")
    @Test(priority = 460)
    public void SideMenuMODOR() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MODOR.click();
        mainPage.SideMenuCRO.click();
        mainPage.SideMenuDocuments.click();
        assert mainPage.INFIOOPSideMenu.getText().equals("Informacije o obradi podataka INF IOOP") : "Expected side menu document";
        mainPage.WhiteButton.click();
        Thread.sleep(2500);
        assert mainPage.INFZIV2023SideMenu.getText().equals("Informacije ugovaratelju INF-ZIV_2023") : "Expected side menu document";
        mainPage.WhiteButton1.click();
        Thread.sleep(2500);
        assert mainPage.MODOR16.getText().equals("Informacije o proizvodu osiguranja MODOR16") : "Expected side menu document";
        mainPage.WhiteButton2.click();


    }

    @Epic("sCore Croatia")
    @Feature("Side menu print")
    @Description("Checking documents from Side menu")
    @Step("Checking documents from Side menu - ROPOS")
    @Owner("Nikola Stavrov")
    @Test(priority = 470)
    public void SideMenuROPOS() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ROPOS.click();
        mainPage.SideMenuCRO.click();
        mainPage.SideMenuDocuments.click();
        assert mainPage.INFIOOPSideMenu.getText().equals("Informacije o obradi podataka INF IOOP") : "Expected side menu document";
        mainPage.WhiteButton.click();
        Thread.sleep(2500);
        assert mainPage.INFZIV2023SideMenu.getText().equals("Informacije ugovaratelju INF-ZIV_2023") : "Expected side menu document";
        mainPage.WhiteButton1.click();
        Thread.sleep(2500);
        assert mainPage.ROPOS16.getText().equals("Informacije o proizvodu osiguranja ROPOS16") : "Expected side menu document";
        mainPage.WhiteButton2.click();
        Thread.sleep(2500);
        assert mainPage.ROPOS16J.getText().equals("Informacije o proizvodu osiguranja ROPOS16-J") : "Expected side menu document";
        mainPage.WhiteButton3.click();


    }

    @Epic("sCore Croatia")
    @Feature("Side menu print")
    @Description("Checking documents from Side menu")
    @Step("Checking documents from Side menu - FidelisLife")
    @Owner("Nikola Stavrov")
    @Test(priority = 480)
    public void SideMenuFidelisLife() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.FidelisLife.click();
        mainPage.SideMenuCRO.click();
        mainPage.SideMenuDocuments.click();
        assert mainPage.INFIOOPSideMenu.getText().equals("Informacije o obradi podataka INF IOOP") : "Expected side menu document";
        mainPage.WhiteButton.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2035J12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2035_J 1-2024") : "Expected side menu document";
        mainPage.WhiteButton1.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2040J12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2040_J 1-2024") : "Expected side menu document";
        mainPage.WhiteButton2.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2045J12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2045_J 1-2024") : "Expected side menu document";
        mainPage.WhiteButton3.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2050J12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2050_J 1-2024") : "Expected side menu document";
        mainPage.WhiteButton4.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2055J12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2055_J 1-2024") : "Expected side menu document";
        mainPage.WhiteButton5.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2035V12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2035_V 1-2024") : "Expected side menu document";
        mainPage.WhiteButton6.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2040V12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2040_V 1-2024") : "Expected side menu document";
        mainPage.WhiteButton7.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2045V12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2045_V 1-2024") : "Expected side menu document";
        mainPage.WhiteButton8.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2050V12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2050_V 1-2024") : "Expected side menu document";
        mainPage.WhiteButton9.click();
        Thread.sleep(2500);
        assert mainPage.FidelisLifeTarget2055V12024.getText().equals("Dokument s ključnim informacijama FidelisLife Target 2055_V 1-2024") : "Expected side menu document";
        mainPage.WhiteButton10.click();
        Thread.sleep(2500);
        assert mainPage.FidelisFonds12024.getText().equals("Informacije ugovaratelju osiguranja života vezano za jedinice Fidelis investicijskih fondova INF FidelisLife 1-2024") : "Expected side menu document";
        mainPage.WhiteButton11.click();


    }

    @Epic("sCore Croatia")
    @Feature("Export to excel")
    @Description("Checking funcionality of exporting data to excel")
    @Step("Checking funcionality of exporting data to excel - action Export to excel")
    @Owner("Nikola Stavrov")
    @Test(priority = 490)
    public void ExportToExcelCroatia() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
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


    @Epic("sCore Croatia")
    @Feature("SPNFT")
    @Description("Checking funcionality of SPNFT/Smaragd service")
    @Step("Checking funcionality of SPNFT - Creating documents with persons on SPNFT lists")
    @Owner("Nikola Stavrov")
    @Test(priority = 500)
    public void SPNFTCroatia() throws Exception {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.linkTabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("37621561405");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }


    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of TB")
    @Step("Creating new contract of TB - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 510)
    public void NewContractTB() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.TB, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("53196123668");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click(); Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of TB")
    @Step("Creating new contract of TB - standard basic flow with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 520)
    public void NewContractIndexationTB() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.TB, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("12");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.IndexationCRO, mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("53196123668");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of TB")
    @Step("Creating new contract of TB - standard basic flow with vinculation standard bank")
    @Owner("Nikola Stavrov")
    @Test(priority = 530)
    public void NewContractVinculationTB() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.TB, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.labelVinkulacijom, mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("53196123668");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkTabVinculations.click();
        mainPage.AddVinculation.click();
        new Select(mainPage.Creditor).selectByIndex(1);
        new Select(mainPage.FirstVinculationBank).selectByIndex(8);
        mainPage.CreditLoanNumber.sendKeys("12332144221");
        mainPage.linkAcceptVinculation.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click(); Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
        mainPage.linkTabVinculations.click();
        mainPage.VinculationsAction.click();
        mainPage.IspisVinkulacija.click();
        Thread.sleep(6000);
        assert mainPage.VinculationStatus.getText().equals("Aktivna") : "Expected vinculation status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of TB")
    @Step("Creating new contract of TB - standard basic flow with vinculation person")
    @Owner("Nikola Stavrov")
    @Test(priority = 540)
    public void NewContractVinculationPersonTB() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.TB, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.labelVinkulacijom, mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("53196123668");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkTabVinculations.click();
        mainPage.AddVinculation.click();
        new Select(mainPage.Creditor).selectByIndex(2);
        mainPage.inputNameVinculation.sendKeys("Nikola");
        mainPage.inputSurnameVinculation.sendKeys("Testic");
        mainPage.getInputIdentificationNumberVinculation.sendKeys("10889064376");
        mainPage.CreditLoanNumber.sendKeys("12332144221");
        mainPage.linkAcceptVinculation.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click(); Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
        mainPage.linkTabVinculations.click();
        mainPage.VinculationsAction.click();
        mainPage.IspisVinkulacija.click();
        Thread.sleep(6000);
        assert mainPage.VinculationStatus.getText().equals("Aktivna") : "Expected vinculation status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of TB")
    @Step("Creating new contract of TB - standard basic flow with vinculation company")
    @Owner("Nikola Stavrov")
    @Test(priority = 550)
    public void NewContractVinculationCompanyTB() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.TB, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.labelVinkulacijom, mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("53196123668");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkTabVinculations.click();
        mainPage.AddVinculation.click();
        new Select(mainPage.Creditor).selectByIndex(3);
        mainPage.Naziv.sendKeys("Nikola Firmetina");
        mainPage.inputOIBVinculationCompany.sendKeys("79933188513");
        mainPage.CreditLoanNumber.sendKeys("1231230142");
        mainPage.linkAcceptVinculation.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
        mainPage.linkTabVinculations.click();
        mainPage.VinculationsAction.click();
        mainPage.IspisVinkulacija.click();
        Thread.sleep(6000);
        assert mainPage.VinculationStatus.getText().equals("Aktivna") : "Expected vinculation status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MO")
    @Step("Creating new contract of MO - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 560)
    public void NewContractMO() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.MO, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("11");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("81540506790");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("180");
        mainPage.WeightConcernPerson.sendKeys("70");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click(); Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MO")
    @Step("Creating new contract of MO - standard basic flow with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 570)
    public void NewContractIndexationMO() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.MO, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.IndexationCRO, mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("81540506790");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("180");
        mainPage.WeightConcernPerson.sendKeys("70");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MODOR")
    @Step("Creating new contract of MODOR - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 580)
    public void NewContractMODOR() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.MODOR, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("64080250224");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.HeightConcernPerson.sendKeys("183");
        mainPage.WeightConcernPerson.sendKeys("75");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MODOR")
    @Step("Creating new contract of MODOR - standard basic flow with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 590)
    public void NewContractIndexationMODOR() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.MODOR, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("12");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.IndexationCRO, mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("64080250224");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("6000");
        mainPage.HeightConcernPerson.sendKeys("183");
        mainPage.WeightConcernPerson.sendKeys("75");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click(); Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of ROPOS")
    @Step("Creating new contract of ROPOS - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 600)
    public void NewContractROPOS() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.ROPOS, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("97451659348");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkTabVinculations.click();
        mainPage.AddVinculation.click();
        new Select(mainPage.Creditor).selectByIndex(2);
        mainPage.inputNameVinculation.sendKeys("Nikola");
        mainPage.inputSurnameVinculation.sendKeys("Testic");
        mainPage.getInputIdentificationNumberVinculation.sendKeys("10889064376");
        mainPage.CreditLoanNumber.sendKeys("12332144221");
        mainPage.linkAcceptVinculation.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
        mainPage.linkTabVinculations.click();
        mainPage.VinculationsAction.click();
        mainPage.IspisVinkulacija.click();
        Thread.sleep(6000);
        assert mainPage.VinculationStatus.getText().equals("Aktivna") : "Expected vinculation status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of FidelisLife")
    @Step("Creating new contract of FidelisLife - standard basic flow 2035")
    @Owner("Nikola Stavrov")
    @Test(priority = 610)
    public void NewContractFidelisLife2035() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.FidelisLife, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        for (WebElement webElement1 : Arrays.asList(mainPage.FirstQuestion, mainPage.SecondQuestion, mainPage.ThirdQuestion, mainPage.FourthQuestion, mainPage.FirstQuestion1, mainPage.SecondQuestion1, mainPage.ThirdQuestion1, mainPage.FourthQuestion1, mainPage.FirstQuestion2, mainPage.SecondQuestion2, mainPage.ThirdQuestion2, mainPage.FourthQuestion2, mainPage.SaveTP, mainPage.PrintTP, mainPage.linkCreateNewContract)) {
            webElement1.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("96857952493");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        Thread.sleep(2500);
        mainPage.ZdravSam.click();
        mainPage.Alkohol.sendKeys("0");
        mainPage.Nepusac.click();
        mainPage.NeDroga.click();
        mainPage.DRImePrezime.click();
        mainPage.DRImePrezime.sendKeys("Dobri Doca");
        mainPage.NeDeformitet.click();
        mainPage.NeObiteljBolest.click();
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.TestPrikladnosti, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";

    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of FidelisLife")
    @Step("Creating new contract of FidelisLife - standard basic flow with indexation 2035")
    @Owner("Nikola Stavrov")
    @Test(priority = 620)
    public void NewContractFidelisLifeIndexation2035() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.FidelisLife, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        for (WebElement webElement1 : Arrays.asList(mainPage.FirstQuestion, mainPage.SecondQuestion, mainPage.ThirdQuestion, mainPage.FourthQuestion, mainPage.FirstQuestion1, mainPage.SecondQuestion1, mainPage.ThirdQuestion1, mainPage.FourthQuestion1, mainPage.FirstQuestion2, mainPage.SecondQuestion2, mainPage.ThirdQuestion2, mainPage.FourthQuestion2, mainPage.SaveTP, mainPage.PrintTP, mainPage.linkCreateNewContract)) {
            webElement1.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.IndexationCRO.click();
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("96857952493");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        Thread.sleep(2500);
        mainPage.ZdravSam.click();
        mainPage.Alkohol.sendKeys("0");
        mainPage.Nepusac.click();
        mainPage.NeDroga.click();
        mainPage.DRImePrezime.click();
        mainPage.DRImePrezime.sendKeys("Dobri Doca");
        mainPage.NeDeformitet.click();
        mainPage.NeObiteljBolest.click();
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.TestPrikladnosti, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";

    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of FidelisLife")
    @Step("Creating new contract of FidelisLife - standard basic flow 2040")
    @Owner("Nikola Stavrov")
    @Test(priority = 630)
    public void NewContractFidelisLife2040() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.FidelisLife, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        for (WebElement webElement1 : Arrays.asList(mainPage.FirstQuestion, mainPage.SecondQuestion, mainPage.ThirdQuestion, mainPage.FourthQuestion, mainPage.FirstQuestion1, mainPage.SecondQuestion1, mainPage.ThirdQuestion1, mainPage.FourthQuestion1, mainPage.FirstQuestion2, mainPage.SecondQuestion2, mainPage.ThirdQuestion2, mainPage.FourthQuestion2, mainPage.SaveTP, mainPage.PrintTP, mainPage.linkCreateNewContract)) {
            webElement1.click(); }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("86176652379");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        Thread.sleep(2500);
        mainPage.ZdravSam.click();
        mainPage.Alkohol.sendKeys("0");
        mainPage.Nepusac.click();
        mainPage.NeDroga.click();
        mainPage.DRImePrezime.click();
        mainPage.DRImePrezime.sendKeys("Dobri Doca");
        mainPage.NeDeformitet.click();
        mainPage.NeObiteljBolest.click();
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.TestPrikladnosti, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";

    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of FidelisLife")
    @Step("Creating new contract of FidelisLife - standard basic flow 2045")
    @Owner("Nikola Stavrov")
    @Test(priority = 640)
    public void NewContractFidelisLife2045() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.FidelisLife, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        for (WebElement webElement1 : Arrays.asList(mainPage.FirstQuestion, mainPage.SecondQuestion, mainPage.ThirdQuestion, mainPage.FourthQuestion, mainPage.FirstQuestion1, mainPage.SecondQuestion1, mainPage.ThirdQuestion1, mainPage.FourthQuestion1, mainPage.FirstQuestion2, mainPage.SecondQuestion2, mainPage.ThirdQuestion2, mainPage.FourthQuestion2, mainPage.SaveTP, mainPage.PrintTP, mainPage.linkCreateNewContract)) {
            webElement1.click(); }
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("86176652379");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        Thread.sleep(2500);
        mainPage.ZdravSam.click();
        mainPage.Alkohol.sendKeys("0");
        mainPage.Nepusac.click();
        mainPage.NeDroga.click();
        mainPage.DRImePrezime.click();
        mainPage.DRImePrezime.sendKeys("Dobri Doca");
        mainPage.NeDeformitet.click();
        mainPage.NeObiteljBolest.click();
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.TestPrikladnosti, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";

    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of FidelisLife")
    @Step("Creating new contract of FidelisLife - standard basic flow 2050")
    @Owner("Nikola Stavrov")
    @Test(priority = 650)
    public void NewContractFidelisLife2050() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.FidelisLife, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        for (WebElement webElement1 : Arrays.asList(mainPage.FirstQuestion, mainPage.SecondQuestion, mainPage.ThirdQuestion, mainPage.FourthQuestion, mainPage.FirstQuestion1, mainPage.SecondQuestion1, mainPage.ThirdQuestion1, mainPage.FourthQuestion1, mainPage.FirstQuestion2, mainPage.SecondQuestion2, mainPage.ThirdQuestion2, mainPage.FourthQuestion2, mainPage.SaveTP, mainPage.PrintTP, mainPage.linkCreateNewContract)) {
            webElement1.click(); }
        mainPage.DurationInYear.sendKeys("25");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(5);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("86176652379");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        Thread.sleep(2500);
        mainPage.ZdravSam.click();
        mainPage.Alkohol.sendKeys("0");
        mainPage.Nepusac.click();
        mainPage.NeDroga.click();
        mainPage.DRImePrezime.click();
        mainPage.DRImePrezime.sendKeys("Dobri Doca");
        mainPage.NeDeformitet.click();
        mainPage.NeObiteljBolest.click();
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.TestPrikladnosti, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";

    }
    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of FidelisLife")
    @Step("Creating new contract of FidelisLife - standard basic flow 2055")
    @Owner("Nikola Stavrov")
    @Test(priority = 660)
    public void NewContractFidelisLife2055 () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.FidelisLife, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.CustomerName.sendKeys("Test");
        mainPage.CustomerVocational.sendKeys("Test");
        mainPage.CustomerSurname.sendKeys("Test");
        mainPage.CustomerTitle.sendKeys("Test");
        mainPage.CustomerOIB.sendKeys("27996811116");
        mainPage.CustomerOccupation.sendKeys("Test");
        mainPage.DistributorName.sendKeys("Test");
        mainPage.DistributorNameSurname.sendKeys("Test");
        for (WebElement webElement1 : Arrays.asList(mainPage.FirstQuestion, mainPage.SecondQuestion, mainPage.ThirdQuestion, mainPage.FourthQuestion, mainPage.FirstQuestion1, mainPage.SecondQuestion1, mainPage.ThirdQuestion1, mainPage.FourthQuestion1, mainPage.FirstQuestion2, mainPage.SecondQuestion2, mainPage.ThirdQuestion2, mainPage.FourthQuestion2, mainPage.SaveTP, mainPage.PrintTP, mainPage.linkCreateNewContract)) {
            webElement1.click(); }
        mainPage.DurationInYear.sendKeys("30");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(5);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("86176652379");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("8000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        new Select(mainPage.ChosenAmountSum).selectByIndex(2);
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        Thread.sleep(2500);
        mainPage.ZdravSam.click();
        mainPage.Alkohol.sendKeys("0");
        mainPage.Nepusac.click();
        mainPage.NeDroga.click();
        mainPage.DRImePrezime.click();
        mainPage.DRImePrezime.sendKeys("Dobri Doca");
        mainPage.NeDeformitet.click();
        mainPage.NeObiteljBolest.click();
        for (WebElement webElement : Arrays.asList(mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        mainPage.linkAcceptMoneyLaundry2.click();
        mainPage.linkActivate.click();
        mainPage.linkTabPrintouts.click();
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.TestPrikladnosti, mainPage.linkCertificationSignature)) {
            webElement.click(); Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MO")
    @Step("Creating new contract of MO - Foreigner")
    @Owner("Nikola Stavrov")
    @Test(priority = 670)
    public void NewContractForeignerMO() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.MO, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("18824724184");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("6500");
        mainPage.HeightConcernPerson.sendKeys("180");
        mainPage.WeightConcernPerson.sendKeys("70");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        assert mainPage.divOsiguranaOsobaStrani.getText().equals("Osigurana osoba strani državljanin"): "Expected messagge";
        assert mainPage.divStrani.getText().equals("Ugovaratelj strani državljanin"): "Expected messagge";
        for (WebElement webElement1 : Arrays.asList(mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement1.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click(); Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("Čeka procjenu rizika") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MO")
    @Step("Creating new contract of MO - Occupation not on the list")
    @Owner("Nikola Stavrov")
    @Test(priority = 680)
    public void NewContractOccupationListMO() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.MO, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("88540543380");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("6000");
        mainPage.HeightConcernPerson.sendKeys("180");
        mainPage.WeightConcernPerson.sendKeys("70");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        assert mainPage.divZanimanje2.getText().equals("Zanimanje"): "Expected messagge";
        for (WebElement webElement1 : Arrays.asList(mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement1.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click(); Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("Čeka procjenu rizika") : "Expected Contract status";
    }

    @Epic("sCore Croatia")
    @Feature("New Contract")
    @Description("Creating new contract of MODOR")
    @Step("Creating new contract of MODOR - Occupation")
    @Owner("Nikola Stavrov")
    @Test(priority = 690)
    public void NewContractOccupationMODOR() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreAgentUW CRO");
        mainPage.inputPassword.sendKeys("Werts!23!!g00!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.MODOR, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.sendKeys("Zagreb");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        for (WebElement webElement : Arrays.asList(mainPage.TabPersons, mainPage.UgovaraOsiguranikIstoLice2, mainPage.Dodaj)) {
            webElement.click(); }
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.inputOIB.sendKeys("23799916743");
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
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-1000, 0);");
        mainPage.divDodaj.click();
        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame1));
        mainPage.linkMainContentBusinessEntity.click();
        js.executeScript("window.scrollBy(0, -500);");
        mainPage.linkTabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("6500");
        mainPage.HeightConcernPerson.sendKeys("185");
        mainPage.WeightConcernPerson.sendKeys("80");
        mainPage.Accept.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputAlkohol.sendKeys("0");
        mainPage.inputImePrezimeDoktor.sendKeys("Doktor Doca");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
       // assert mainPage.divZanimanje2.getText().equals("Zanimanje"): "Expected messagge";
        for (WebElement webElement1 : Arrays.asList(mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniPlaMirovinaIli)) {
            webElement1.click(); }
        mainPage.inputStalniIzvori.sendKeys("123");
        for (WebElement webElement : Arrays.asList(mainPage.RH, mainPage.StalniRezidentDa, mainPage.DaIdentifikacijskiBroj, mainPage.NeDrugaOsoba, mainPage.NeZakonski, mainPage.inputDjelatnostStranke)) {
            webElement.click(); }
        mainPage.inputDjelatnostStranke.sendKeys("Zakonski Test");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptMoneyLaundry2, mainPage.linkActivate, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.linkIspisOriginalaPolisa, mainPage.linkIspisOriginalaPismoZahvale, mainPage.linkIspisOriginalaNalogZaPlacanje, mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(5000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspješno odrađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("A") : "Expected Contract status";
    }

        @AfterMethod
        public void tearDown (){
            driver.quit();


        }

    }






