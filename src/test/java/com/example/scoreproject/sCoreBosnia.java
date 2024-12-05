package com.example.scoreproject;
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

public class sCoreBosnia {

    private MainPage mainPage;
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(2);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(1);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1982");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("13500");
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
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(2);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("14");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(1);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("170");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("60");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        mainPage.inputPassword.sendKeys("Sarajevo123!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Classic.click();
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
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
        mainPage.inputPassword.sendKeys("Sarajevo123!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Comfort.click();
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("12000");
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
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        mainPage.inputPassword.sendKeys("Sarajevo123!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Uniqo.click();
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(2);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        mainPage.inputPassword.sendKeys("Sarajevo123!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Kapital.click();
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("25");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("18000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1995");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        mainPage.inputPassword.sendKeys("Sarajevo123!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.ComfortDual.click();
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("9");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("23000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(1);
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("170");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("60");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(1);
        new Select(mainPage.Status).selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(1);
        new Select(mainPage.Status).selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(30);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(30);
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(1);
        new Select(mainPage.Status).selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(1);
        new Select(mainPage.Status).selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearchBA.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        new Select(mainPage.CancellationType).selectByIndex(1);
        new Select(mainPage.CancellationReason).selectByIndex(1);
        new Select(mainPage.CancellationOption).selectByIndex(1);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        new Select(mainPage.CancellationType).selectByIndex(2);
        new Select(mainPage.CancellationReason).selectByIndex(9);
        new Select(mainPage.CancellationOption).selectByIndex(1);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        new Select(mainPage.CancellationType).selectByIndex(3);
        new Select(mainPage.CancellationReason).selectByIndex(14);
        new Select(mainPage.CancellationOption).selectByIndex(1);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(4000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.CancellationReactivation.click();
        new Select(mainPage.CancellationType).selectByIndex(4);
        new Select(mainPage.CancellationReason).selectByIndex(16);
        new Select(mainPage.CancellationOption).selectByIndex(1);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(12);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(12);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(12);
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
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(12);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(2);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(1);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("15");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(2);
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
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
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.ClientInfoBA.click();
        mainPage.ClientInfoBA.clear();
        mainPage.ClientInfoBA.sendKeys("Test Test");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("13");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.ExclusionPaymentMethode.click();
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("22000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.DateOfBirth1.click();
        mainPage.DateOfBirth1.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson1).selectByIndex(1);
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
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Classic")
    @Owner("Nikola Stavrov")
    @Test(priority = 520)
    public void ClausesClassic() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsBA).selectByIndex(1);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.03.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.PreviewCRO.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19") : "Excepted General Conditions";
        assert mainPage.SpecialConditionsClassic.getText().equals("Dodatni uslovi za osiguranje života za slučaj doživljenja i smrti DUZM I/19") : "Excepted Special Conditions";


    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Comfort")
    @Owner("Nikola Stavrov")
    @Test(priority = 530)
    public void ClausesComfort() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsBA).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.04.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.Preview.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19") : "Excepted General Conditions";
        assert mainPage.SpecialConditionsComfort.getText().equals("Posebni uslovi za dopunsko osiguranje od posljedica nesretnog slučaja (nezgode) uz osiguranje života PUDN I/19") : "Excepted Special Conditions";


    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Uniqo")
    @Owner("Nikola Stavrov")
    @Test(priority = 540)
    public void ClausesUniqo() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsBA).selectByIndex(3);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.Preview.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19") : "Excepted General Conditions";
        assert mainPage.SpecialConditionsUniqo.getText().equals("Dodatni uslovi za osiguranje života za slučaj doživljenja djeteta DUZDD I/19") : "Excepted Special Conditions";
        assert mainPage.SpecialConditionsUniqo1.getText().equals("Posebni uslovi za dopunsko osiguranje od posljedica nesretnog slučaja (nezgode) uz osiguranje života PUDN I/19") : "Excepted Special Conditions";

        // assert DodatniUsloviOsiguranjeDjeteta.getText().equals("Dodatni uslovi za osiguranje života za slučaj doživljenja djeteta DUZDD I/19"):"Očekivani uslovi";


    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Kapital")
    @Owner("Nikola Stavrov")
    @Test(priority = 550)
    public void ClausesKapital() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsBA).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.Preview.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19") : "Excepted General Conditions";
        assert mainPage.SpecialConditionsKapital.getText().equals("Dodatni uslovi za osiguranje života za slučaj doživljenja DUZ I/19") : "Excepted Special Conditions";
        assert mainPage.SpecialConditionsKapital1.getText().equals("Posebni uslovi za dopunsko osiguranje od posljedica nesretnog slučaja (nezgode) uz osiguranje života PUDN I/19") : "Excepted Special Conditions";


    }

    @Epic("sCore Bosnia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - ComfortDual")
    @Owner("Nikola Stavrov")
    @Test(priority = 560)
    public void ClausesComfortDual() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("andrea.petrovic");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsBA).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.OfferDateSearch.click();
        mainPage.ImageSearchBA.click();
        mainPage.Preview.click();
        mainPage.TabClauses.click();
        assert mainPage.GenerelacConditions.getText().equals("Opšti uslovi za osiguranje života OUZV I/19") : "Excepted General Conditions";
        assert mainPage.SpecialConditionsComfortDual.getText().equals("Dodatne uslove za osiguranje života za slučaj doživljenja i smrti i nastupa teške bolesti dvije osobe DUZTD I/19") : "Excepted Special Conditions";


    }

    @Epic("sCore Bosnia")
    @Feature("Export to excel")
    @Description("Checking funcionality of exporting data to excel")
    @Step("Checking funcionality of exporting data to excel - action Export to excel")
    @Owner("Nikola Stavrov")
    @Test(priority = 570)
    public void ExportToExcelBosnia() throws Exception {

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
    @Test(priority = 580)
    public void SPNFTBosnia() throws Exception {
        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Classic, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.BrojPonude.sendKeys("0001000288");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1505981180052");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }


    }

    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Classic")
    @Step("Creating new contract of Classic - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 590)
    public void NewContractClassic() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Classic, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.BrojPonude.sendKeys("0001000289");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1012984180057");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.KorisnikSmrt.click();
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("600");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.inputZU.sendKeys("DR");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
        for (WebElement webElement : Arrays.asList(mainPage.TechnicalPersonSearch, mainPage.TechnicalPerson, mainPage.Save, mainPage.linkActivate, mainPage.TabMoneyLaundry, mainPage.labelTednja, mainPage.labelZaposlenBA, mainPage.labelStalniPlataPorodiPrimanja, mainPage.UsvojeIme, mainPage.TrecaOsoba, mainPage.ClanPorodicePolisa, mainPage.FatcaIndicija, mainPage.SaznanjaNegativna, mainPage.TransakcijaTajnost, mainPage.IdentifikacijaProblemBA, mainPage.InformacijeKlijentBA, mainPage.linkAcceptMoneyLaundry, mainPage.linkCertificationSignature)) {
            webElement.click(); }
    }

    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Comfort")
    @Step("Creating new contract of Comfort - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 600)
    public void NewContractComfort() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Comfort, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.BrojPonude.sendKeys("0001000290");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("12");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1012984180057");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.KorisnikSmrt.click();
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("750");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.inputZU.sendKeys("DR");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
        for (WebElement webElement : Arrays.asList(mainPage.TechnicalPersonSearch, mainPage.TechnicalPerson, mainPage.Save, mainPage.linkActivate, mainPage.TabMoneyLaundry, mainPage.labelTednja, mainPage.labelZaposlenBA, mainPage.labelStalniPlataPorodiPrimanja, mainPage.UsvojeIme, mainPage.TrecaOsoba, mainPage.ClanPorodicePolisa, mainPage.FatcaIndicija, mainPage.SaznanjaNegativna, mainPage.TransakcijaTajnost, mainPage.IdentifikacijaProblemBA, mainPage.InformacijeKlijentBA, mainPage.linkAcceptMoneyLaundry, mainPage.linkCertificationSignature)) {
            webElement.click(); }
    }

    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Kapital")
    @Step("Creating new contract of Kapital - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 610)
    public void NewContractKapital() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Kapital, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.BrojPonude.sendKeys("0001000291");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("16");
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1012984180057");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.KorisnikSmrt.click();
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("500");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.inputZU.sendKeys("DR");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
        for (WebElement webElement : Arrays.asList(mainPage.TechnicalPersonSearch, mainPage.TechnicalPerson, mainPage.Save, mainPage.linkActivate, mainPage.TabMoneyLaundry, mainPage.labelTednja, mainPage.labelZaposlenBA, mainPage.labelStalniPlataPorodiPrimanja, mainPage.UsvojeIme, mainPage.TrecaOsoba, mainPage.ClanPorodicePolisa, mainPage.FatcaIndicija, mainPage.SaznanjaNegativna, mainPage.TransakcijaTajnost, mainPage.IdentifikacijaProblemBA, mainPage.InformacijeKlijentBA, mainPage.linkAcceptMoneyLaundry, mainPage.linkCertificationSignature)) {
            webElement.click(); }
    }

    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Uniqo")
    @Step("Creating new contract of Uniqo - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 620)
    public void NewContractUniqo() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Uniqo, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.BrojPonude.sendKeys("0001000292");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1012984180057");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(500, 0);");
        mainPage.DodajOsiguranik.click();
        Thread.sleep(2500);
        WebElement iFrame2 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame2));
        mainPage.IdentificationNumber.sendKeys("0711020700240");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(500, 0);");
        Thread.sleep(2500);
        mainPage.labelUgovaraIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.KorisnikSmrt.click();
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("100");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("25");
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.inputZU.sendKeys("DR");
        mainPage.inputZUUniqo.sendKeys("DR");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
        for (WebElement webElement : Arrays.asList(mainPage.TechnicalPersonSearch, mainPage.TechnicalPerson, mainPage.Save, mainPage.linkActivate, mainPage.TabMoneyLaundry, mainPage.labelTednja, mainPage.labelZaposlenBA, mainPage.labelStalniPlataPorodiPrimanja, mainPage.UsvojeIme, mainPage.TrecaOsoba, mainPage.ClanPorodicePolisa, mainPage.FatcaIndicija, mainPage.SaznanjaNegativna, mainPage.TransakcijaTajnost, mainPage.IdentifikacijaProblemBA, mainPage.InformacijeKlijentBA, mainPage.linkAcceptMoneyLaundry, mainPage.linkCertificationSignature)) {
            webElement.click(); }
    }

    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Comfort Dual")
    @Step("Creating new contract of Comfort Dual - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 630)
    public void NewContractComfortDual() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.ComfortDual, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.BrojPonude.sendKeys("0001000293");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("11");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1012984180057");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(-500, 0);");
        Thread.sleep(2500);
        mainPage.linkDodajOsiguranik.click();
        Thread.sleep(2500);
        WebElement iFrame2 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame2));
        mainPage.IdentificationNumber.sendKeys("2104986150002");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(500, 0);");
        Thread.sleep(2500);
        mainPage.labelUgovaraIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.KorisnikSmrt.click();
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcernsBA.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("1000");
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("180");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("75");
        mainPage.HeightConcernPerson1.click();
        mainPage.HeightConcernPerson1.sendKeys("180");
        mainPage.WeightConcernPerson1.click();
        mainPage.WeightConcernPerson1.sendKeys("80");
        mainPage.Accept.click();
        mainPage.inputZU.sendKeys("DR");
        mainPage.inputZUUniqo.sendKeys("DR");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
        for (WebElement webElement : Arrays.asList(mainPage.TechnicalPersonSearch, mainPage.TechnicalPerson, mainPage.Save, mainPage.linkActivate, mainPage.TabMoneyLaundry, mainPage.labelTednja, mainPage.labelZaposlenBA, mainPage.labelStalniPlataPorodiPrimanja, mainPage.UsvojeIme, mainPage.TrecaOsoba, mainPage.ClanPorodicePolisa, mainPage.FatcaIndicija, mainPage.SaznanjaNegativna, mainPage.TransakcijaTajnost, mainPage.IdentifikacijaProblemBA, mainPage.InformacijeKlijentBA, mainPage.linkAcceptMoneyLaundry, mainPage.linkCertificationSignature)) {
            webElement.click(); }
    }

    @Epic("sCore Bosnia")
    @Feature("New Contract")
    @Description("Creating new contract of Comfort Extra Plus")
    @Step("Creating new contract of Comfort Extra Plus - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 640)
    public void NewContractComfortExtraPlus() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("amina.masic");
        mainPage.inputPassword.sendKeys("Uniqa2024.!");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.ComfortExtraPlus, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        new Select(mainPage.BusinessUnit).selectByIndex(21);
        mainPage.BrojPonude.sendKeys("0001000294");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1012984180057");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.KorisnikSmrt.click();
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("3500");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.inputZU.sendKeys("DR");
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        new Select(mainPage.SalesUnitChanel).selectByIndex(1);
        Thread.sleep(2500);
        new Select(mainPage.SalesUnitPartner).selectByIndex(2);
        Thread.sleep(2500);
        for (WebElement webElement : Arrays.asList(mainPage.TechnicalPersonSearch, mainPage.TechnicalPerson, mainPage.Save, mainPage.linkActivate, mainPage.TabMoneyLaundry, mainPage.labelTednja, mainPage.labelZaposlenBA, mainPage.labelStalniPlataPorodiPrimanja, mainPage.UsvojeIme, mainPage.TrecaOsoba, mainPage.ClanPorodicePolisa, mainPage.FatcaIndicija, mainPage.SaznanjaNegativna, mainPage.TransakcijaTajnost, mainPage.IdentifikacijaProblemBA, mainPage.InformacijeKlijentBA, mainPage.linkAcceptMoneyLaundry, mainPage.linkCertificationSignature, mainPage.CreatePolicy, mainPage.PolisaStampaj)) {
            webElement.click(); }
    }

        @Epic("sCore Bosnia")
        @Feature("Info offer")
        @Description("Creating info offer of Comfort Extra Plus with Agent role ")
        @Step("Creating info offer with Agent")
        @Owner("Nikola Stavrov")
        @Test(priority = 650)
        public void InfoOfferComfortExtraPlusAgent() {

            mainPage.inputUsername.click();
            mainPage.inputUsername.sendKeys("andrea.petrovic");
            mainPage.inputPassword.click();
            mainPage.inputPassword.sendKeys("OvoJ3Test");
            mainPage.buttonLogin.click();
            mainPage.Life.click();
            mainPage.ComfortExtraPlus.click();
            new Select(mainPage.BusinessUnit).selectByIndex(21);
            mainPage.ClientInfoBA.click();
            mainPage.ClientInfoBA.clear();
            mainPage.ClientInfoBA.sendKeys("Test Test");
            mainPage.DurationInYear.click();
            mainPage.DurationInYear.clear();
            mainPage.DurationInYear.sendKeys("10");
            new Select(mainPage.PaymentDinamic).selectByIndex(1);
            new Select(mainPage.PaymentMethod).selectByIndex(1);
            mainPage.TabConcernsBA.click();
            new Select(mainPage.InsuredSum).selectByIndex(1);
            mainPage.InsuredSumOrPremium.click();
            mainPage.InsuredSumOrPremium.clear();
            mainPage.InsuredSumOrPremium.sendKeys("3000");
            mainPage.DateOfBirth.click();
            mainPage.DateOfBirth.sendKeys("01.01.1980");
            new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
            @Description("Creating info offer of Comfort Extra Plus with BOC role ")
            @Step("Creating info offer with BOC")
            @Owner("Nikola Stavrov")
            @Test(priority = 660)
            public void InfoOfferComfortExtraPlusBOC() throws InterruptedException {

                mainPage.inputUsername.click();
                mainPage.inputUsername.sendKeys("martina.pandzic");
                mainPage.inputPassword.click();
                mainPage.inputPassword.sendKeys("OvoJ3Test");
                mainPage.buttonLogin.click();
                mainPage.Life.click();
                mainPage.ComfortExtraPlus.click();
                new Select(mainPage.BusinessUnit).selectByIndex(21);
                mainPage.ClientInfoBA.click();
                mainPage.ClientInfoBA.clear();
                mainPage.ClientInfoBA.sendKeys("Test Test");
                mainPage.DurationInYear.click();
                mainPage.DurationInYear.clear();
                mainPage.DurationInYear.sendKeys("10");
                new Select(mainPage.PaymentDinamic).selectByIndex(1);
                new Select(mainPage.PaymentMethod).selectByIndex(4);
                mainPage.TabConcernsBA.click();
                new Select(mainPage.InsuredSum).selectByIndex(1);
                mainPage.InsuredSumOrPremium.click();
                mainPage.InsuredSumOrPremium.clear();
                mainPage.InsuredSumOrPremium.sendKeys("13500");
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
                new Select(mainPage.SalesUnitChanel).selectByIndex(1);
                Thread.sleep(2500);
                new Select(mainPage.SalesUnitPartner).selectByIndex(2);
                Thread.sleep(2500);
                mainPage.TechnicalPersonSearch.click();
                mainPage.TechnicalPerson.click();
                mainPage.Save.click();
                mainPage.Activate.click();
                mainPage.Print.click();

            }

            @Epic("sCore Bosnia")
            @Feature("Info offer")
            @Description("Creating info offer of Comfort Extra Plus with UW role ")
            @Step("Creating info offer with UW")
            @Owner("Nikola Stavrov")
            @Test(priority = 670)
            public void InfoOfferComfortExtraPlusUW() throws InterruptedException {

                mainPage.inputUsername.click();
                mainPage.inputUsername.sendKeys("elvira.hadzimusovic");
                mainPage.inputPassword.click();
                mainPage.inputPassword.sendKeys("Sarajevo123!");
                mainPage.buttonLogin.click();
                mainPage.Life.click();
                mainPage.ComfortExtraPlus.click();
                new Select(mainPage.BusinessUnit).selectByIndex(21);
                mainPage.ClientInfoBA.click();
                mainPage.ClientInfoBA.clear();
                mainPage.ClientInfoBA.sendKeys("Test Test");
                mainPage.DurationInYear.click();
                mainPage.DurationInYear.clear();
                mainPage.DurationInYear.sendKeys("10");
                new Select(mainPage.PaymentDinamic).selectByIndex(1);
                new Select(mainPage.PaymentMethod).selectByIndex(4);
                mainPage.TabConcernsBA.click();
                new Select(mainPage.InsuredSum).selectByIndex(1);
                mainPage.InsuredSumOrPremium.click();
                mainPage.InsuredSumOrPremium.clear();
                mainPage.InsuredSumOrPremium.sendKeys("12000");
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
                new Select(mainPage.SalesUnitChanel).selectByIndex(1);
                Thread.sleep(2500);
                new Select(mainPage.SalesUnitPartner).selectByIndex(2);
                Thread.sleep(2500);
                mainPage.TechnicalPersonSearch.click();
                mainPage.TechnicalPerson.click();
                mainPage.Save.click();
                mainPage.Activate.click();
                mainPage.Print.click();

            }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    }





