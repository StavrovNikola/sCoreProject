package com.example.scoreproject;
import com.google.common.collect.ImmutableMap;
import dev.failsafe.CircuitBreaker;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


public class sCoreSerbia {
    private MainPage mainPage;
    WebDriver driver = new ChromeDriver();


    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        //options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        mainPage = new MainPage(driver);


    }

    //INFO OFFERS
    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 10)
    public void InfoOfferRizikoKreditUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoKredit.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        Select select3 = new Select(mainPage.DurationInMonths);
        select3.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("15");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Spektar with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 20)
    public void InfoOfferSpektarUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Spektar.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
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
        mainPage.inputSumDozivljenje.click();
        mainPage.inputSumDozivljenje.clear();
        mainPage.inputSumDozivljenje.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Joker with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 30)
    public void InfoOfferJokerUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Joker.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("25");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
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
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.click();
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.clear();
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 40)
    public void InfoOfferRizikoUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Riziko.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("187");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Favorit with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 50)
    public void InfoOfferFavoritUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Favorit.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(5);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.click();
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.clear();
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.sendKeys("12500");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Joker Old with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 60)
    public void InfoOfferJokerOldUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.JokerOld.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("3");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(10);
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
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();

    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Dozivotni riziko with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 70)
    public void InfoOfferDozivotniRizikoUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.DozivotniRiziko.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
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

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 80)
    public void InfoOfferRizikoKreditBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreBOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoKredit.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        Select select3 = new Select(mainPage.DurationInMonths);
        select3.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("15");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Spektar with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 90)
    public void InfoOfferSpektarBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreBOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SpektarBOC.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
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
        mainPage.inputSumDozivljenje.click();
        mainPage.inputSumDozivljenje.clear();
        mainPage.inputSumDozivljenje.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Joker with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 100)
    public void InfoOfferJokerBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreBOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.JokerBOC.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("25");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
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
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.click();
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.clear();
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 110)
    public void InfoOfferRizikoBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreBOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Riziko.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("187");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Favorit with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 120)
    public void InfoOfferFavoritBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreBOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Favorit.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(5);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.click();
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.clear();
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.sendKeys("12500");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Joker Old with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 130)
    public void InfoOfferJokerOldBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreBOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.JokerOld.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("3");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(10);
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
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Dozivotni riziko with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 140)
    public void InfoOfferDozivotniRizikoBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreBOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.DozivotniRizikoBOC.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
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

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 150)
    public void InfoOfferRizikoKreditAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        for (WebElement webElement : Arrays.asList(mainPage.DozivotniNe, mainPage.NextQuestion, mainPage.MladjiOd14Ne, mainPage.NextQuestion, mainPage.OsiguranjeKreditaDa, mainPage.InfoOffer)) {
            Thread.sleep(1000);
            webElement.click();
        }
        mainPage.Product.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        Select select3 = new Select(mainPage.DurationInMonths);
        select3.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("15");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Spektar with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 160)
    public void InfoOfferSpektarAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        for (WebElement webElement : Arrays.asList(mainPage.DozivotniNe, mainPage.NextQuestion, mainPage.MladjiOd14Ne, mainPage.NextQuestion, mainPage.OsiguranjeKreditaNe, mainPage.NextQuestion, mainPage.SamoStednjaNe, mainPage.NextQuestion, mainPage.RizikSmrtiNe, mainPage.InfoOffer)) {
            Thread.sleep(1000);
            webElement.click();
        }
        mainPage.Product.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
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
        mainPage.inputSumDozivljenje.click();
        mainPage.inputSumDozivljenje.clear();
        mainPage.inputSumDozivljenje.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Joker with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 170)
    public void InfoOfferJokerAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        for (WebElement webElement : Arrays.asList(mainPage.DozivotniNe, mainPage.NextQuestion, mainPage.MladjiOd14Ne, mainPage.NextQuestion, mainPage.OsiguranjeKreditaNe, mainPage.NextQuestion, mainPage.SamoStednjaDa, mainPage.NextQuestion, mainPage.JokerPlusNe, mainPage.NextQuestion, mainPage.JokerPremiumDa, mainPage.InfoOffer)) {
            Thread.sleep(1000);
            webElement.click();
        }
        mainPage.Product.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("25");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
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
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.click();
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.clear();
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 180)
    public void InfoOfferRizikoAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        for (WebElement webElement : Arrays.asList(mainPage.DozivotniNe, mainPage.NextQuestion, mainPage.MladjiOd14Ne, mainPage.NextQuestion, mainPage.OsiguranjeKreditaNe, mainPage.NextQuestion, mainPage.SamoStednjaNe, mainPage.NextQuestion, mainPage.RizikSmrtiDa, mainPage.NextQuestion, mainPage.PovratPremijeNe, mainPage.NextQuestion, mainPage.OsiguranjeInvesticijeNe, mainPage.InfoOffer)) {
            Thread.sleep(1000);
            webElement.click();
        }
        mainPage.Product.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.HeightConcernPerson.click();
        mainPage.HeightConcernPerson.sendKeys("187");
        mainPage.WeightConcernPerson.click();
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Favorit with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 190)
    public void InfoOfferFavoritAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        for (WebElement webElement : Arrays.asList(mainPage.DozivotniNe, mainPage.NextQuestion, mainPage.MladjiOd14Da, mainPage.InfoOffer)) {
            Thread.sleep(1000);
            webElement.click();
        }
        mainPage.Product.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(5);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.click();
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.clear();
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.sendKeys("18000");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Joker old with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 200)
    public void InfoOfferJokerOldAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        for (WebElement webElement : Arrays.asList(mainPage.DozivotniNe, mainPage.NextQuestion, mainPage.MladjiOd14Ne, mainPage.NextQuestion, mainPage.OsiguranjeKreditaNe, mainPage.NextQuestion, mainPage.SamoStednjaDa, mainPage.NextQuestion, mainPage.JokerPlusDa, mainPage.InfoOffer)) {
            Thread.sleep(1000);
            webElement.click();
        }
        mainPage.Product.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("3");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(10);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
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

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Dozivotni riziko with Agent role ")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 210)
    public void InfoOfferDozivotniRizikoAgent() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreAgent");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        for (WebElement webElement : Arrays.asList(mainPage.DozivotniDa, mainPage.InfoOffer)) {
            Thread.sleep(1000);
            webElement.click();
        }
        mainPage.Product.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
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

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of SME KMP with UW role ")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 220)
    public void InfoOfferSMEKMPUW() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoKredit.click();
        mainPage.SMEKeyPerson.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("5");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select3 = new Select(mainPage.Valute);
        select3.selectByIndex(5);
        Select select4 = new Select(mainPage.Clause);
        select4.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        //  Select select5 = new Select(mainPage.DurationInMonths);
        //  select5.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select6 = new Select(mainPage.InsuredSum);
        select6.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
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
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of SME KMP with BOC role ")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 230)
    public void InfoOfferSMEKMPBOC() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreBOC");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.RizikoKredit.click();
        mainPage.SMEKeyPerson.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("4");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select3 = new Select(mainPage.Valute);
        select3.selectByIndex(5);
        Select select4 = new Select(mainPage.Clause);
        select4.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        //  Select select5 = new Select(mainPage.DurationInMonths);
        //  select5.selectByIndex(1);
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
        mainPage.ConcernInterest.click();
        mainPage.ConcernInterest.clear();
        mainPage.ConcernInterest.sendKeys("15");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    //ANNULATIONS
    @Epic("sCore Serbia")
    @Feature("Annulations")
    @Description("Annulations of info offer ")
    @Step("Annulation of info offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 240)
    public void AnnulationCustomerWithdrawalInfoOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Serbia")
    @Feature("Annulations")
    @Description("Annulations of info offer ")
    @Step("Annulation of info offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 250)
    public void AnnulationContractReplacementInfoOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Serbia")
    @Feature("Annulations")
    @Description("Annulations of offer ")
    @Step("Annulation of offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 260)
    public void AnnulationCustomerWithdrawalOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(19);
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Serbia")
    @Feature("Annulations")
    @Description("Annulations of offer ")
    @Step("Annulation of offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 270)
    public void AnnulationContractReplacementOffer() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        Select select = new Select(mainPage.DocumentType);
        select.selectByIndex(4);
        Select select1 = new Select(mainPage.Status);
        select1.selectByIndex(19);
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }


    @Epic("sCore Serbia")
    @Feature("Annulations")
    @Description("Annulations of activated info offer ")
    @Step("Annulation of activated info offer - Customer withdrawal")
    @Owner("Nikola Stavrov")
    @Test(priority = 280)
    public void AnnulationCustomerWithdrawalInfoOfferActivated() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(1);
        mainPage.Annule.click();


    }

    @Epic("sCore Serbia")
    @Feature("Annulations")
    @Description("Annulations of activated info offer ")
    @Step("Annulation of activated info offer - Customer replacement")
    @Owner("Nikola Stavrov")
    @Test(priority = 290)
    public void AnnulationContractReplacementInfoOfferActivated() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        Select select2 = new Select(mainPage.AnnulationType);
        select2.selectByIndex(2);
        mainPage.Annule.click();


    }

    @Epic("sCore Serbia")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Client request")
    @Owner("Nikola Stavrov")
    @Test(priority = 300)
    public void CancellationClientRequest() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(1);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(1);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }


    @Epic("sCore Serbia")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Uniqa request")
    @Owner("Nikola Stavrov")
    @Test(priority = 310)
    public void CancellationUniqaRequest() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(8);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }

    @Epic("sCore Serbia")
    @Feature("Cancellations")
    @Description("Policy cancellation")
    @Step("Cancellation - Death")
    @Owner("Nikola Stavrov")
    @Test(priority = 320)
    public void CancellationReasonDeath() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        Select select2 = new Select(mainPage.CancellationType);
        select2.selectByIndex(3);
        Select select3 = new Select(mainPage.CancellationReason);
        select3.selectByIndex(13);
        mainPage.CancellationNote.click();
        mainPage.CancellationNote.sendKeys("Raskid Test");
        mainPage.SaveCancellation.click();


    }

    @Epic("sCore Serbia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy")
    @Owner("Nikola Stavrov")
    @Test(priority = 330)
    public void Reactivation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        Thread.sleep(3500);
        mainPage.OfferDateSearchSRB.click();
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.CertificationSignature.click();
        mainPage.Reactivation.click();

    }

    @Epic("sCore Serbia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Annul last cancellation")
    @Owner("Nikola Stavrov")
    @Test(priority = 340)
    public void ReactivationAnnulLastCancellation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        Thread.sleep(3500);
        mainPage.OfferDateSearchSRB.click();
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        mainPage.AnnulLastCancellation.click();

    }

    @Epic("sCore Serbia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Annul client request")
    @Owner("Nikola Stavrov")
    @Test(priority = 350)
    public void ReactivationAnnulClientRequest() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        Thread.sleep(3500);
        mainPage.OfferDateSearchSRB.click();
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.CertificationSignature.click();
        mainPage.AnnulClientRequest.click();

    }

    @Epic("sCore Serbia")
    @Feature("Reactivation")
    @Description("Policy reactivation")
    @Step("Reactivation of the cancelled policy - Rejection")
    @Owner("Nikola Stavrov")
    @Test(priority = 360)
    public void ReactivationRejection() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
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
        Thread.sleep(3500);
        mainPage.OfferDateSearchSRB.click();
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        mainPage.RequestActivation.click();
        mainPage.Rejection.click();

    }

    @Epic("sCore Serbia")
    @Feature("Indexation")
    @Description("Creating info offer of Spektar with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")

    @Test(priority = 370)
    public void IndexationSpektar() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Spektar.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(2);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.Indexation.click();
        Select select3 = new Select(mainPage.IndexValue);
        select3.selectByIndex(1);
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
        mainPage.inputSumDozivljenje.click();
        mainPage.inputSumDozivljenje.clear();
        mainPage.inputSumDozivljenje.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Indexation")
    @Description("Creating info offer of Joker with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")

    @Test(priority = 380)
    public void IndexationJoker() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Joker.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("25");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(3);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(1);
        mainPage.Indexation.click();
        Select select3 = new Select(mainPage.IndexValue);
        select3.selectByIndex(1);
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
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.click();
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.clear();
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.sendKeys("10000");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();


    }

    @Epic("sCore Serbia")
    @Feature("Indexation")
    @Description("Creating info offer of Favorit with indexation")
    @Step("Creating info offer with indexation")
    @Owner("Nikola Stavrov")

    @Test(priority = 390)
    public void IndexationFavorit() {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.Favorit.click();
        mainPage.ClientInfo.click();
        mainPage.ClientInfo.sendKeys("Test Lice");
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("18");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        Select select = new Select(mainPage.PaymentDinamic);
        select.selectByIndex(1);
        Select select1 = new Select(mainPage.Clause);
        select1.selectByIndex(1);
        Select select2 = new Select(mainPage.PaymentMethod);
        select2.selectByIndex(2);
        Select select3 = new Select(mainPage.Banka);
        select3.selectByIndex(5);
        mainPage.Indexation.click();
        Select select6 = new Select(mainPage.IndexValue);
        select6.selectByIndex(1);
        mainPage.TabConcerns.click();
        Select select4 = new Select(mainPage.InsuredSum);
        select4.selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        Select select5 = new Select(mainPage.GenderConcernPerson);
        select5.selectByIndex(2);
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.click();
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.clear();
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.sendKeys("12500");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.Activate.click();
        mainPage.Print.click();



    }
    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 400)
    public void NewContractSpektar () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Life/SpektarPremium/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("12");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("beograd");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(2);

        WebElement ValutnaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[3]/div/div/select"));
        Select select2 = new Select(ValutnaKlauzula);
        select2.selectByVisibleText("Da");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Uplatnica");

        js.executeScript("window.scrollBy(0, 500);");

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
        JMBG.sendKeys("1504999700243");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platilac = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platilac.click();

        js.executeScript("window.scrollBy(-500, 0);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMBG = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMBG.click();
        ZakonskiJMBG.clear();
        ZakonskiJMBG.sendKeys("2205989700241");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(750, 0);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        Thread.sleep(1500);
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("Sestra");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement PorukaSviKorisnici = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
        assert PorukaSviKorisnici.getText().equals("Niste uneli sve korisnike osiguranja na stranici lica") : "Očekivana poruka nakon taba Lica";

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("3500");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("190");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("85");

        js.executeScript("window.scrollBy(0, 750);");

        WebElement Dozivljenje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[2]/div/fieldset/div/div/div[2]/div/div[2]/div[2]/div/div/input"));
        Thread.sleep(1000);
        Dozivljenje.clear();
        Dozivljenje.click();
        Dozivljenje.sendKeys("3000");

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaRizici = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaRizici.getText().equals("Uspešno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon snimanja rizika";

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement PorukaUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUpitnik.getText().equals("Uspešno snimljen upitnik.") : "Očekivana poruka nakon snimanja upitnika";

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

        WebElement NoviUgovor = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert NoviUgovor.getText().equals("Novi ugovor je uspešno aktiviran.") : "Očekivana poruka nakon Aktivacije";

        WebElement NovaPolisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[3]"));
        assert NovaPolisa.getText().equals("Ponuda je uspešno kreirana.") : "Očekivana poruka nakon Aktivacije";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PorukaSnimljenAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaSnimljenAML.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement PorukaStampaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaStampaAML.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement AMLSaradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        AMLSaradnik.click();

        WebElement NE1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[2]"));
        NE1.click();

        WebElement NE2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[2]"));
        NE2.click();

        WebElement NE3 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        NE3.click();

        WebElement NE4 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE4.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE5.click();

        WebElement PrihvatiAML1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML1.click();;

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PolisaAkcija.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(8000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Thread.sleep(4500);
        PotvrdaPotpisa.click();

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Joker")
    @Step("Creating new contract of Joker - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 410)
    public void NewContractJoker () throws Exception {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Life/JokerPremium/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("11");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("beograd");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByVisibleText("Kvartalno");

        WebElement ValutnaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[3]/div/div/select"));
        Select select2 = new Select(ValutnaKlauzula);
        select2.selectByVisibleText("Da");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Uplatnica");

        js.executeScript("window.scrollBy(0, 500);");

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
        JMBG.sendKeys("2410995710022");


        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatioca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatioca.click();

        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(2000);

        WebElement PravnoPlatilac = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select4 = new Select(PravnoPlatilac);
        select4.selectByVisibleText("Pravno");

        WebElement AktivnaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[3]/div[2]/label/input"));
        AktivnaLica.click();

        WebElement PIBPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIBPravno.click();
        PIBPravno.sendKeys("100048772");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravno.click();

        WebElement PrihvatiPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravno.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(-500, 0);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMBG = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMBG.click();
        ZakonskiJMBG.clear();
        ZakonskiJMBG.sendKeys("2205989700241");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(750, 0);");

        WebElement KorisnikZaDozivljenje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        KorisnikZaDozivljenje.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("Sestra");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("3000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("190");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("85");

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement TrajniInvaliditet = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[2]/div/fieldset/div/div/div[2]/div/div[5]/div[2]/div/div/input"));
        TrajniInvaliditet.clear();
        TrajniInvaliditet.sendKeys("3000");

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspešno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon Ugovornih elemenata";

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

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PorukaSnimljenAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaSnimljenAML.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement PorukaStampaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaStampaAML.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement AMLSaradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        AMLSaradnik.click();

        WebElement NE1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[2]"));
        NE1.click();

        WebElement NE2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[2]"));
        NE2.click();

        WebElement NE3 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        NE3.click();

        WebElement NE4 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE4.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE5.click();

        WebElement PrihvatiAML1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML1.click();;

        WebElement PorukaAMLSnimljen1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaAMLSnimljen1.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement PorukaAMLŠtampa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaAMLŠtampa1.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PolisaAkcija.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(5000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();
        Thread.sleep(3500);

        WebElement PotvrdaPotpisaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaPoruka.getText().equals("Potvrda potpisa uspešno urađena.") : "Očekivana poruka nakon Potvrde potpisa";

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

    }


    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Favorit")
    @Step("Creating new contract of Favorit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 420)
    public void NewContractFavorit () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Life/FavoritPremium/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("15");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("beograd");


        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(4);

        WebElement ValutnaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[3]/div/div/select"));
        Select select2 = new Select(ValutnaKlauzula);
        select2.selectByVisibleText("Da");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Uplatnica");

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement DodajUgovaraca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/a"));
        DodajUgovaraca.click();
        Thread.sleep(2000);

        // Ovde je uradjen driver.switchTo().frame(iFrame) kako bih hvatao elemente sa iFrame

        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(-500, 0);");

        WebElement DodajPlatioca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatioca.click();

        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(2000);

        WebElement PravnoPlatilac = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select4 = new Select(PravnoPlatilac);
        select4.selectByVisibleText("Pravno");

        WebElement AktivnaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[3]/div[2]/label/input"));
        AktivnaLica.click();

        WebElement PIBPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIBPravno.click();
        PIBPravno.sendKeys("100048772");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravno.click();

        WebElement PrihvatiPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravno.click();
        Thread.sleep(2500);

        js.executeScript("window.scrollBy(-500, 0);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMB.click();
        ZakonskiJMB.clear();
        ZakonskiJMB.sendKeys("2205989700241");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(1000, 0);");


        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("4000");

        js.executeScript("window.scrollBy(0, 500);");

        WebElement TrajniInvaliditetNezgoda = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[2]/div/fieldset/div/div/div[2]/div/div[2]/div[2]/div/div/input"));
        Thread.sleep(1000);
        TrajniInvaliditetNezgoda.clear();
        TrajniInvaliditetNezgoda.click();
        TrajniInvaliditetNezgoda.sendKeys("4000");

        js.executeScript("window.scrollBy(500, 0);");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspešno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon Ugovornih elemenata";

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

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
        assert PorukaAML.getText().equals("Popunite Upitnik o sprečavanju pranja novca i priložite fotokopiju lične karte.") : "Očekivana poruka nakon Aktivacije";

        WebElement NoviUgovor = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert NoviUgovor.getText().equals("Novi ugovor je uspešno aktiviran.") : "Očekivana poruka nakon Aktivacije";

        WebElement NovaPolisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert NovaPolisa.getText().equals("Polisa je uspešno kreirana.") : "Očekivana poruka nakon Aktivacije";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PorukaSnimljenAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaSnimljenAML.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement PorukaStampaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaStampaAML.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement AMLSaradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        AMLSaradnik.click();

        WebElement NE1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[2]"));
        NE1.click();

        WebElement NE2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[2]"));
        NE2.click();

        WebElement NE3 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        NE3.click();

        WebElement NE4 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE4.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE5.click();

        WebElement PrihvatiAML1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML1.click();

        WebElement PorukaAMLSnimljen1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaAMLSnimljen1.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement PorukaAMLŠtampa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaAMLŠtampa1.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PolisaAkcija.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(8000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PotvrdaPotpisaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaPoruka.getText().equals("Potvrda potpisa uspešno urađena.") : "Očekivana poruka nakon Potvrde potpisa";

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);
    }


    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko Kredit")
    @Step("Creating new contract of Riziko Kredit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 430)
    public void NewContractRizikoKredit () throws Exception{
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Life/RizikoKredit/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("15");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("beograd");


        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByVisibleText("Kvartalno");

        WebElement ValutnaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[3]/div/div/select"));
        Select select2 = new Select(ValutnaKlauzula);
        select2.selectByVisibleText("Da");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Trajni nalog");

        //js.executeScript("window.scrollBy(0, 500);");

        Thread.sleep(1000);

        WebElement Banka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[5]/div/div/select"));
        Select select4 = new Select(Banka);
        select4.selectByVisibleText("Addiko Bank a.d. Beograd");

        WebElement DuzinaTrajanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[8]/div/div/select"));
        Select select5 = new Select(DuzinaTrajanja);
        select5.selectByVisibleText("Godine");
        Thread.sleep(2000);

        //js.executeScript("window.scrollBy(1000, 0);");

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
        JMBG.sendKeys("1504999700243");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platilac = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platilac.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMB.click();
        ZakonskiJMB.clear();
        ZakonskiJMB.sendKeys("2205989700241");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(750, 0);");

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

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("10000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("185");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("80");

        WebElement KamatnaStopa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[8]/div/input"));
        KamatnaStopa.clear();
        KamatnaStopa.sendKeys("5");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspešno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon Ugovornih elemenata";

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement PorukaUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUpitnik.getText().equals("Uspešno snimljen upitnik.") : "Očekivana poruka nakon snimanja upitnika";

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

        WebElement Vinkulacije = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        Vinkulacije.click();

        WebElement DodajVinkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div/div/div/div[2]/div/div/a"));
        DodajVinkulaciju.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PrvaVinkulacionaBanka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/fieldset/div[2]/div/div/div/select"));
        Select select6 = new Select(PrvaVinkulacionaBanka);
        select6.selectByVisibleText("Addiko Bank a.d. Beograd");

        js.executeScript("window.scrollBy(500, 0);");

        WebElement PrihvatiVinkulaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiVinkulaciju.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PorukaSnimljenAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaSnimljenAML.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement PorukaStampaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaStampaAML.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement AMLSaradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[11]/a"));
        AMLSaradnik.click();

        WebElement NE1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[2]"));
        NE1.click();

        WebElement NE2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[2]"));
        NE2.click();

        WebElement NE3 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        NE3.click();

        WebElement NE4 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE4.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[3]"));
        NE5.click();

        WebElement PrihvatiAML1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML1.click();;

        WebElement PorukaAMLSnimljen1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaAMLSnimljen1.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement PorukaAMLŠtampa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaAMLŠtampa1.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[8]/a"));
        StampanaDokumenta.click();

        WebElement PolisaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PolisaAkcija.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(7000);

        //  js.executeScript("window.scrollBy(500, 0);");


        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PotvrdaPotpisaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaPoruka.getText().equals("Potvrda potpisa uspešno urađena.") : "Očekivana poruka nakon Potvrde potpisa";

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);


    }
    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko")
    @Step("Creating new contract of Riziko - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 440)
    public void NewContractRiziko () throws Exception{
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Life/Riziko/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("16");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("beograd");


        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByVisibleText("Mesečno");

        WebElement ValutnaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[3]/div/div/select"));
        Select select2 = new Select(ValutnaKlauzula);
        select2.selectByVisibleText("Da");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Administrativna zabrana");

        js.executeScript("window.scrollBy(0, 500);");

        Thread.sleep(1000);

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
        JMBG.sendKeys("1504999700243");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatioca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatioca.click();

        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(2000);

        WebElement PravnoPlatilac = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select4 = new Select(PravnoPlatilac);
        select4.selectByVisibleText("Pravno");

        WebElement AktivnaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[3]/div[2]/label/input"));
        AktivnaLica.click();

        WebElement PIBPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIBPravno.click();
        PIBPravno.sendKeys("100048772");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravno.click();

        WebElement PrihvatiPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravno.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMB.click();
        ZakonskiJMB.clear();
        ZakonskiJMB.sendKeys("2205989700241");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(-500, 0);");

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

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("25000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("190");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("82");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspešno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon Ugovornih elemenata";

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();
        WebElement PorukaUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUpitnik.getText().equals("Uspešno snimljen upitnik.") : "Očekivana poruka nakon snimanja upitnika";

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

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
        assert PorukaAML.getText().equals("Popunite Upitnik o sprečavanju pranja novca i priložite fotokopiju lične karte.") : "Očekivana poruka nakon Aktivacije";

        WebElement NoviUgovor = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert NoviUgovor.getText().equals("Novi ugovor je uspešno aktiviran.") : "Očekivana poruka nakon Aktivacije";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PorukaSnimljenAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaSnimljenAML.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement PorukaStampaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaStampaAML.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement AMLSaradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        AMLSaradnik.click();

        WebElement NE1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[2]"));
        NE1.click();

        WebElement NE2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[2]"));
        NE2.click();

        WebElement NE3 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        NE3.click();

        WebElement NE4 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE4.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE5.click();

        WebElement PrihvatiAML1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML1.click();;

        WebElement PorukaAMLSnimljen1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaAMLSnimljen1.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement PorukaAMLŠtampa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaAMLŠtampa1.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PolisaAkcija.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PolisaStampaj.click();
        Thread.sleep(13000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PotvrdaPotpisaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaPoruka.getText().equals("Potvrda potpisa uspešno urađena.") : "Očekivana poruka nakon Potvrde potpisa";

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);


    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Dozivotni Riziko")
    @Step("Creating new contract of Dozivotni Riziko - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 450)
    public void NewContractDozivotniRiziko () throws Exception {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Life/DozivotniRiziko/NewContract/New/General");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("beograd");


        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByVisibleText("Kvartalno");

        WebElement ValutnaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[3]/div/div/select"));
        Select select2 = new Select(ValutnaKlauzula);
        select2.selectByVisibleText("Da");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Trajni nalog");

        Thread.sleep(1000);

        WebElement Banka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[5]/div/div/select"));
        Select select4 = new Select(Banka);
        select4.selectByVisibleText("ERSTE BANK AD");

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
        JMBG.sendKeys("1504000700241");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platilac = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platilac.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMB.click();
        ZakonskiJMB.clear();
        ZakonskiJMB.sendKeys("2205989700241");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(0, 750);");

        WebElement KorisnikZaSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[12]/div/div/div/div[2]/div/div/a"));
        KorisnikZaSlucajSmrti.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("BratTest");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("2000");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement PorukaUEL = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PorukaUEL.getText().equals("Uspešno snimljen predmet osiguranja i rizici") : "Očekivana poruka nakon Ugovornih elemenata";

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

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PorukaSnimljenAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaSnimljenAML.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement PorukaStampaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaStampaAML.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement AMLSaradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        AMLSaradnik.click();

        WebElement NE1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[2]"));
        NE1.click();

        WebElement NE2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[2]"));
        NE2.click();

        WebElement NE3 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        NE3.click();

        WebElement NE4 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE4.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE5.click();

        WebElement PrihvatiAML1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML1.click();;

        WebElement PorukaAMLSnimljen1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaAMLSnimljen1.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement PorukaAMLŠtampa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaAMLŠtampa1.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PolisaAkcija.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(8000);

        //  js.executeScript("window.scrollBy(500, 0);");

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PotvrdaPotpisaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaPoruka.getText().equals("Potvrda potpisa uspešno urađena.") : "Očekivana poruka nakon Potvrde potpisa";

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);


    }


    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of SME KMP")
    @Step("Creating new contract of SME KMP - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 460)
    public void NewContractSMEKMP () throws Exception{
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Life/RizikoKredit/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("5");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("beograd");

        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement SMEKljucniCovekMark = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[2]/div/div/div/ul/li[3]/label"));
        SMEKljucniCovekMark.click();
        Thread.sleep(2500);

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByVisibleText("Polugodišnje");

        WebElement Valuta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[2]/div/div/select"));
        Select select6 = new Select(Valuta);
        select6.selectByVisibleText("RSD");

        WebElement ValutnaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[3]/div/div/select"));
        Select select2 = new Select(ValutnaKlauzula);
        select2.selectByVisibleText("Ne");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Trajni nalog");

        //js.executeScript("window.scrollBy(0, 500);");

        Thread.sleep(1000);

        WebElement Banka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[5]/div/div/select"));
        Select select4 = new Select(Banka);
        select4.selectByVisibleText("Addiko Bank a.d. Beograd");

        WebElement Lica = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[2]/a"));
        Lica.click();

        WebElement NazivBrojTarife = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div/div[1]/div"));
        assert NazivBrojTarife.getText().equals("Život - Riziko Kredit Tarifa 20012501 - Novi ugovor") : "Provera broja tarife";

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
        JMBG.sendKeys("1504000700241");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Platilac = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/div/div/label"));
        Platilac.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMB.click();
        ZakonskiJMB.clear();
        ZakonskiJMB.sendKeys("2205989700241");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(750, 0);");

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

        js.executeScript("window.scrollBy(1000, 0);");

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("10000");

        WebElement Visina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/input"));
        Visina.sendKeys("185");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/input"));
        Tezina.sendKeys("80");

        WebElement KamatnaStopa = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[8]/div/input"));
        KamatnaStopa.clear();
        KamatnaStopa.sendKeys("15");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

        WebElement SacuvajteUpitnik = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div/a"));
        SacuvajteUpitnik.click();

        WebElement Izracunaj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Izracunaj.click();
        Thread.sleep(2500);

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

        WebElement Vinkulacije = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        Vinkulacije.click();

        WebElement DodajVinkulaciju = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div/div/div/div[2]/div/div/a"));
        DodajVinkulaciju.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement PrvaVinkulacionaBanka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/fieldset/div[2]/div/div/div/select"));
        Select select7 = new Select(PrvaVinkulacionaBanka);
        select7.selectByVisibleText("Addiko Bank a.d. Beograd");

        js.executeScript("window.scrollBy(500, 0);");

        WebElement PrihvatiVinkulaciju = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiVinkulaciju.click();

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Aktiviraj.click();

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement AMLSaradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        AMLSaradnik.click();

        WebElement NE1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[2]"));
        NE1.click();

        WebElement NE2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[2]"));
        NE2.click();

        WebElement NE3 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        NE3.click();

        WebElement NE4 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE4.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[3]"));
        NE5.click();

        WebElement PrihvatiAML1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML1.click();;

        WebElement PorukaAMLSnimljen1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaAMLSnimljen1.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement PorukaAMLŠtampa1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaAMLŠtampa1.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AMLa";

        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PolisaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PolisaAkcija.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PolisaStampaj.click();

        Thread.sleep(7000);

        //  js.executeScript("window.scrollBy(500, 0);");


        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement PotvrdaPotpisaPoruka = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li"));
        assert PotvrdaPotpisaPoruka.getText().equals("Potvrda potpisa uspešno urađena.") : "Očekivana poruka nakon Potvrde potpisa";

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Joker Old")
    @Step("Creating new contract of Joker Old - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test (priority = 470)
    public void NewContractJokerOld () throws Exception {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.className("form-control"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();
        Thread.sleep(1500);

        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Life/Joker/NewContract/New/General");

        WebElement Trajanje = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[2]/div[5]/div/div/div[2]/div[2]/div/span[2]/input"));
        Trajanje.clear();
        Trajanje.sendKeys("3");

        WebElement MestoUgovaranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[4]/div[4]/div/div/div/div/div[2]/div/input[1]"));
        MestoUgovaranja.sendKeys("beograd");


        Thread.sleep(1500);
        WebElement MestoUgovaranja1 = driver.findElement(By.xpath("/html/body/ul[2]/li[1]/div"));
        MestoUgovaranja1.click();

        WebElement DinamikaPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[1]/div/div/select"));
        Select select = new Select(DinamikaPlacanja);
        select.selectByIndex(1);

        WebElement ValutnaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[3]/div/div/select"));
        Select select2 = new Select(ValutnaKlauzula);
        select2.selectByVisibleText("Da");

        WebElement MetodPlacanja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[3]/div[1]/div[10]/fieldset/div[4]/div/div/select"));
        Select select3 = new Select(MetodPlacanja);
        select3.selectByVisibleText("Uplatnica");

        js.executeScript("window.scrollBy(0, 500);");

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
        JMBG.sendKeys("2704998763813");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement DodajPlatioca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[5]/div/div/div/div[2]/div/div/a"));
        DodajPlatioca.click();

        WebElement iFrame1 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrame1);
        Thread.sleep(2000);

        WebElement PravnoPlatilac = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[1]/div[1]/div/select"));
        Select select4 = new Select(PravnoPlatilac);
        select4.selectByVisibleText("Pravno");

        WebElement AktivnaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[3]/div[2]/label/input"));
        AktivnaLica.click();

        WebElement PIBPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[1]/div[2]/input"));
        PIBPravno.click();
        PIBPravno.sendKeys("100064824");

        WebElement PretraziPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[1]/div[6]/div/div/a"));
        PretraziPravno.click();

        WebElement PregledPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/div[2]/fieldset/div[2]/table/tbody/tr[2]/td[8]/div/a"));
        PregledPravno.click();

        WebElement PrihvatiPravno = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div/div[1]/div[1]/div/a"));
        PrihvatiPravno.click();
        Thread.sleep(3500);

        js.executeScript("window.scrollBy(-500, 0);");

        WebElement ZakonskiZastupnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[10]/div/div/div/label"));
        ZakonskiZastupnik.click();

        WebElement DodajZakonskogZastupnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[11]/div/div/div/div[2]/div/div/a"));
        DodajZakonskogZastupnika.click();

        WebElement iFrameZakonski = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        driver.switchTo().frame(iFrameZakonski);
        Thread.sleep(2000);

        WebElement ZakonskiJMB = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[3]/div[1]/input"));
        ZakonskiJMB.click();
        ZakonskiJMB.clear();
        ZakonskiJMB.sendKeys("2205989700241");

        WebElement PretraziZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziZakonskog.click();

        WebElement PregledZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledZakonskog.click();

        WebElement PrihvatiZakonskog = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiZakonskog.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement KorisnikZaslucajDozivljenja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/a"));
        KorisnikZaslucajDozivljenja.click();

        WebElement OpisKorisnika = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[1]/div/input"));
        OpisKorisnika.click();
        OpisKorisnika.sendKeys("Brat");

        WebElement Procenat = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[3]/div[2]/div/input"));
        Procenat.click();
        Procenat.sendKeys("100");

        WebElement Prihvati = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        Prihvati.click();

        WebElement UgovorniElementi = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[3]/a"));
        UgovorniElementi.click();

        WebElement IznosOS = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/input"));
        IznosOS.clear();
        IznosOS.sendKeys("5000");

        WebElement PrihvatiUE = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiUE.click();

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

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        Aktiviraj.click();

        WebElement PorukaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[1]/ul/li"));
        assert PorukaAML.getText().equals("Popunite Upitnik o sprečavanju pranja novca i priložite fotokopiju lične karte.") : "Očekivana poruka nakon Aktivacije";

        WebElement NoviUgovor = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert NoviUgovor.getText().equals("Novi ugovor je uspešno aktiviran.") : "Očekivana poruka nakon Aktivacije";

        WebElement AML = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[9]/a"));
        AML.click();

        WebElement Stednja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[3]"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[3]"));
        Zaposlen.click();

        WebElement IzvorSredstava = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        IzvorSredstava.click();

        WebElement PrihvatiAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML.click();

        WebElement PorukaSnimljenAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[1]"));
        assert PorukaSnimljenAML.getText().equals("Uspešno snimljen Upitnik za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement PorukaStampaAML = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li[2]"));
        assert PorukaStampaAML.getText().equals("Uspešno kreirana štampa Upitnika za sprečavanje pranja novca.") : "Očekivana poruka nakon popunjavanja AML-a";

        WebElement AMLSaradnik = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[10]/a"));
        AMLSaradnik.click();

        WebElement NE1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[1]/div/div/div/label[2]"));
        NE1.click();

        WebElement NE2 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[2]/div/div/div/label[2]"));
        NE2.click();

        WebElement NE3 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[3]/div/div/div/label[2]"));
        NE3.click();

        WebElement NE4 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[4]/div/div/div/label[2]"));
        NE4.click();

        WebElement NE5 = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/fieldset/div[5]/div/div/div/label[2]"));
        NE5.click();

        WebElement PrihvatiAML1 = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PrihvatiAML1.click();;
        WebElement StampanaDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[7]/a"));
        StampanaDokumenta.click();

        WebElement PonudaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PonudaAkcija.click();

        WebElement PonudaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PonudaStampaj.click();

        Thread.sleep(4000);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        PotvrdaPotpisa.click();

        WebElement BrojPolise = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/div/div[2]/div[1]"));
        String headingtext = BrojPolise.getText();
        System.out.println("Broj polise je: " + headingtext);

        WebElement BOCPotvrdi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        BOCPotvrdi.click();

        WebElement IzdavanjePolise = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[1]/a"));
        IzdavanjePolise.click();

        WebElement PolisaAkcija = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/span/a/img"));
        PolisaAkcija.click();

        WebElement PolisaStampaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/table/tbody/tr[1]/td[19]/ul/li[1]/a"));
        PolisaStampaj.click();
        Thread.sleep(5000);
    }
}









