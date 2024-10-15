package com.example.scoreproject;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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


    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
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
        JMBG.sendKeys("1311982700247");

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
        JMBG.sendKeys("1311992700245");

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
        JMBG.sendKeys("1311993700249");

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
        JMBG.sendKeys("1310960700247");

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
        JMBG.sendKeys("1310960700247");

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
    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Spektar")
    @Owner("Nikola Stavrov")
    @Test (priority = 480)
    public void ClausesSpektar () throws Exception {

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

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        Pretraga.click();

        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(5);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[13]/div/div/div/div/div/select"));
        Select select1 = new Select(StatusDokumenta);
        select1.selectByIndex(3);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select2 = new Select(Proizvod);
        select2.selectByIndex(54);

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretrazi.click();
        Thread.sleep(2500);

        WebElement AkcijaPregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/span/a/img"));
        AkcijaPregled.click();

        WebElement Pregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/ul/li[1]/a"));
        Pregled.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement UgovaranjeValutneKlauzule = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Očekivana klauzula";

        WebElement TacnostPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert TacnostPodataka.getText().equals("Tačnost podataka"):"Očekivana klauzula";

        WebElement ZastitaPodatakaOLicnosti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert ZastitaPodatakaOLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement SankcionaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[6]/label"));
        assert SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Očekivana klauzula";

        WebElement InformacijeZaUgovaracaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[7]/label"));
        assert InformacijeZaUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Očekivana klauzula";



    }

    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Favorit")
    @Owner("Nikola Stavrov")
    @Test (priority = 490)
    public void ClausesFavorit () throws Exception {

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

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        Pretraga.click();

        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(5);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[13]/div/div/div/div/div/select"));
        Select select1 = new Select(StatusDokumenta);
        select1.selectByIndex(3);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select2 = new Select(Proizvod);
        select2.selectByIndex(52);

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretrazi.click();
        Thread.sleep(2500);

        WebElement AkcijaPregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/span/a/img"));
        AkcijaPregled.click();

        WebElement Pregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/ul/li[1]/a"));
        Pregled.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022"):"Očekivani uslovi";

        WebElement PosebniUsloviOsiguranjeDece = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert PosebniUsloviOsiguranjeDece.getText().equals("Posebni uslovi za osiguranje dece - PUOD II/2020"):"Očekivani uslovi";

        WebElement PosebniUsloviOsiguranjeDeceNezgoda = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert PosebniUsloviOsiguranjeDeceNezgoda.getText().equals("Posebni uslovi za osiguranje lica od posledica nesrećnog slučaja kao dopunski uslovi uz osiguranje života - PUNE II/2020"):"Očekivani uslovi";

        WebElement TabelaInvaliditeta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert TabelaInvaliditeta.getText().equals("Tabela invaliditeta za određivanje trajnog gubitka opšte radne sposobnosti usled nesrećnog slučaja - TI II/2020"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement UgovaranjeValutneKlauzule = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Očekivana klauzula";

        WebElement TacnostPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert TacnostPodataka.getText().equals("Tačnost podataka"):"Očekivana klauzula";

        WebElement ZastitaPodatakaOLicnosti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert ZastitaPodatakaOLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement SankcionaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[6]/label"));
        assert SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Očekivana klauzula";

        WebElement InformacijeZaUgovaracaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[7]/label"));
        assert InformacijeZaUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Očekivana klauzula";



    }

    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Joker")
    @Owner("Nikola Stavrov")
    @Test (priority = 500)
    public void ClausesJoker () throws Exception {

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

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        Pretraga.click();

        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(5);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[13]/div/div/div/div/div/select"));
        Select select1 = new Select(StatusDokumenta);
        select1.selectByIndex(3);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select2 = new Select(Proizvod);
        select2.selectByIndex(53);

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretrazi.click();
        Thread.sleep(2500);

        WebElement AkcijaPregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/span/a/img"));
        AkcijaPregled.click();

        WebElement Pregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/ul/li[1]/a"));
        Pregled.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022"):"Očekivani uslovi";

        WebElement PosebniUsloviOsiguranjeNesrecniSlucaj = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert PosebniUsloviOsiguranjeNesrecniSlucaj.getText().equals("Posebni uslovi za osiguranje lica od posledica nesrećnog slučaja kao dopunski uslovi uz osiguranje života - PUNE II/2020"):"Očekivani uslovi";

        WebElement TabelaInvaliditeta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert TabelaInvaliditeta.getText().equals("Tabela invaliditeta za određivanje trajnog gubitka opšte radne sposobnosti usled nesrećnog slučaja - TI II/2020"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement UgovaranjeValutneKlauzule = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Očekivana klauzula";

        WebElement TacnostPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert TacnostPodataka.getText().equals("Tačnost podataka"):"Očekivana klauzula";

        WebElement ZastitaPodatakaOLicnosti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert ZastitaPodatakaOLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement SankcionaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[6]/label"));
        assert SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Očekivana klauzula";

        WebElement InformacijeZaUgovaracaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[7]/label"));
        assert InformacijeZaUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Očekivana klauzula";



    }


    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Joker Old")
    @Owner("Nikola Stavrov")
    @Test (priority = 510)
    public void ClausesJokerOld () throws Exception {

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

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        Pretraga.click();

        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(4);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[13]/div/div/div/div/div/select"));
        Select select1 = new Select(StatusDokumenta);
        select1.selectByIndex(10);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select2 = new Select(Proizvod);
        select2.selectByIndex(5);

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretrazi.click();
        Thread.sleep(2500);

        WebElement AkcijaPregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/span/a/img"));
        AkcijaPregled.click();

        WebElement Pregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/ul/li[1]/a"));
        Pregled.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Uslovi za osiguranje života za slucaj doživljenja - Džoker Plus od 12.07.2021. godine (UŽD VII/2021)"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement UgovaranjeValutneKlauzule = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Očekivana klauzula";

        WebElement TacnostPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert TacnostPodataka.getText().equals("Tačnost podataka"):"Očekivana klauzula";

        WebElement ZastitaPodatakaOLicnosti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert ZastitaPodatakaOLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement SankcionaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[6]/label"));
        assert SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Očekivana klauzula";

        WebElement InformacijeZaUgovaracaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[7]/label"));
        assert InformacijeZaUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Očekivana klauzula";



    }



    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Riziko")
    @Owner("Nikola Stavrov")
    @Test (priority = 520)
    public void ClausesRiziko () throws Exception {

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

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        Pretraga.click();

        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(5);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[13]/div/div/div/div/div/select"));
        Select select1 = new Select(StatusDokumenta);
        select1.selectByIndex(3);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select2 = new Select(Proizvod);
        select2.selectByIndex(2);

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretrazi.click();
        Thread.sleep(2500);

        WebElement AkcijaPregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[4]/td[34]/div/div/span/a/img"));
        AkcijaPregled.click();

        WebElement Pregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[4]/td[34]/div/div/ul/li[1]/a"));
        Pregled.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement TacnostPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert TacnostPodataka.getText().equals("Tačnost podataka"):"Očekivana klauzula";

        WebElement UgovaranjeValutneKlauzule = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Očekivana klauzula";

        WebElement ZastitaPodatakaOLicnosti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert ZastitaPodatakaOLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement SankcionaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[6]/label"));
        assert SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Očekivana klauzula";

        WebElement InformacijeZaUgovaracaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[7]/label"));
        assert InformacijeZaUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Očekivana klauzula";



    }


    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Riziko Kredit")
    @Owner("Nikola Stavrov")
    @Test (priority = 530)
    public void ClausesRizikoKredit () throws Exception {

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

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        Pretraga.click();

        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(4);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[13]/div/div/div/div/div/select"));
        Select select1 = new Select(StatusDokumenta);
        select1.selectByIndex(10);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select2 = new Select(Proizvod);
        select2.selectByIndex(4);

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretrazi.click();
        Thread.sleep(2500);

        WebElement AkcijaPregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/span/a/img"));
        AkcijaPregled.click();

        WebElement Pregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/ul/li[1]/a"));
        Pregled.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement TacnostPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert TacnostPodataka.getText().equals("Tačnost podataka"):"Očekivana klauzula";

        WebElement UgovaranjeValutneKlauzule = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Očekivana klauzula";

        WebElement ZastitaPodatakaOLicnosti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert ZastitaPodatakaOLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement SankcionaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[6]/label"));
        assert SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Očekivana klauzula";

        WebElement InformacijeZaUgovaracaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[7]/label"));
        assert InformacijeZaUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Očekivana klauzula";

        js.executeScript("window.scrollBy(-500, 0);");

        WebElement PregledPolise = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        PregledPolise.click();

        WebElement KlauzuleNapomene1 = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene1.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022"):"Očekivani uslovi";

        WebElement PosebniUsloviSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert PosebniUsloviSlucajSmrti.getText().equals("Posebni uslovi za osiguranje života za slučaj smrti sa opadajućim osiguranim sumama - PUOOS II 2020"):"Očekivani uslovi";



    }


    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Dozivotni Riziko")
    @Owner("Nikola Stavrov")
    @Test (priority = 540)
    public void ClausesDozivotniRiziko () throws Exception {

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

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        Pretraga.click();

        WebElement TipDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[2]/div/div/div/div/div/select"));
        Select select = new Select(TipDokumenta);
        select.selectByIndex(5);

        WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[13]/div/div/div/div/div/select"));
        Select select1 = new Select(StatusDokumenta);
        select1.selectByIndex(3);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr/td[3]/div/div/div/div/div/select"));
        Select select2 = new Select(Proizvod);
        select2.selectByIndex(58);

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretrazi.click();
        Thread.sleep(2500);

        WebElement AkcijaPregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/span/a/img"));
        AkcijaPregled.click();

        WebElement Pregled = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[13]/div/div/div/div[2]/div/div/div[4]/div/table/tbody/tr[1]/td[34]/div/div/ul/li[1]/a"));
        Pregled.click();

        WebElement KlauzuleNapomene = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div/ul/li[6]/a"));
        KlauzuleNapomene.click();

        WebElement OpstiUsloviOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li/label"));
        assert OpstiUsloviOsiguranja.getText().equals("Opšti uslovi za osiguranje života od 31.08.2022. godine (OUŽ VIII/2022)"):"Očekivani uslovi";

        WebElement PosebniUsloviSlucajSmrti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[1]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert PosebniUsloviSlucajSmrti.getText().equals("Posebni uslovi za doživotno osiguranje života za slučaj smrti od 01.03.2023 (PUDOŽS III/2023)"):"Očekivani uslovi";

        js.executeScript("window.scrollBy(0, -500);");

        WebElement Klauzula30DanaStorno = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[1]/label"));
        assert Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Očekivana klauzula";

        WebElement UgovaranjeValutneKlauzule = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[2]/label"));
        assert UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule"):"Očekivana klauzula";

        WebElement TacnostPodataka = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[3]/label"));
        assert TacnostPodataka.getText().equals("Tačnost podataka"):"Očekivana klauzula";

        WebElement ZastitaPodatakaOLicnosti = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[4]/label"));
        assert ZastitaPodatakaOLicnosti.getText().equals("Zaštita podataka o ličnosti"):"Očekivana klauzula";

        WebElement KlauzulaOZastitiPotrosaca = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[5]/label"));
        assert KlauzulaOZastitiPotrosaca.getText().equals("Klauzula o zaštiti potrošača"):"Očekivana klauzula";

        WebElement SankcionaKlauzula = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[6]/label"));
        assert SankcionaKlauzula.getText().equals("Sankciona klauzula"):"Očekivana klauzula";

        WebElement InformacijeZaUgovaracaOsiguranja = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[4]/div/fieldset/div/div/div/ul/li[7]/label"));
        assert InformacijeZaUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Očekivana klauzula";



    }
    @Epic("sCore Serbia")
    @Feature("Export to excel")
    @Description("Checking funcionality of exporting data to excel")
    @Step("Checking funcionality of exporting data to excel - action Export to excel")
    @Owner("Nikola Stavrov")
    @Test (priority = 540)
    public void ExportToExcelSerbia () throws Exception {

        WebDriver driver = new ChromeDriver();
        //JavascriptExecutor js = (JavascriptExecutor) driver;


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

        WebElement BocniMeni = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div"));
        BocniMeni.click();
        Thread.sleep(2500);

        WebElement Pretraga = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul[1]/li[1]/a"));
        Pretraga.click();

        WebElement DatumUgovaranjaOd = driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div/div[9]/div[1]/div/input"));
        DatumUgovaranjaOd.click();
        DatumUgovaranjaOd.sendKeys("01.06.2024");

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[3]/a"));
        Pretrazi.click();
        Thread.sleep(3500);

        WebElement IzveziUExcel = driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div/div[2]/a"));
        IzveziUExcel.click();

    }

    @Epic("sCore Serbia")
    @Feature("SPNFT")
    @Description("Checking funcionality of SPNFT/Smaragd service")
    @Step("Checking funcionality of SPNFT - Creating documents with persons on SPNFT lists")
    @Owner("Nikola Stavrov")
    @Test (priority = 550)
    public void SPNFTSerbia () throws Exception {

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
        JMBG.sendKeys("1711984181369");

        WebElement PretraziLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[8]/div/a"));
        PretraziLice.click();

        WebElement PregledLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[2]/table/tbody/tr[2]/td[9]/div/a"));
        PregledLica.click();
        Thread.sleep(1500);

        WebElement PrihvatiLice = driver.findElement(By.xpath("/html/body/form/div[2]/div[2]/div/fieldset/div[1]/div[1]/div[1]/div[1]/div/a"));
        PrihvatiLice.click();
        Thread.sleep(2500);

        js.executeScript("window.scrollBy(0, 500);");

        //WebElement PorukaSPNFT = driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[2]/ul"));
        //assert PorukaSPNFT.getText().equals("Unešeno lice se nalazi na sankcionoj listi EU i/ili PEP listi! Nije moguć dalji rad na dokumentu.") : "Očekivana poruka nakon dodavanja lica sa sankcione liste";



    }
    @Epic("sCore Serbia")
    @Feature("POS Bank")
    @Description("Creating new contract in POS Bank application")
    @Step("Creating new contract in POS Bank application - Spektar")
    @Owner("Nikola Stavrov")
    @Test (priority = 560)
    @SuppressWarnings("deprecation")
    public void POSBankSpektar () throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://qa-score.uniqa.rs/scorepos/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("Raiff_yuajko");

        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[2]/input"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();
        Thread.sleep(3500);

        WebElement Zivot = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div/button/div[1]"));
        Zivot.click();
        Thread.sleep(2500);

        WebElement Spektar = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div[4]/div/button/div[2]"));
        Spektar.click();
        Thread.sleep(2000);

        WebElement ImePrezime = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[1]/div/div/textarea[3]"));
        ImePrezime.click();
        ImePrezime.clear();
        ImePrezime.sendKeys("Nikola Testic");

        WebElement DatumRodjenja = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div/div/input"));
        DatumRodjenja.sendKeys("01.02.1992");

        WebElement Pol = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[4]/label[2]/span[1]/span[1]/input"));
        Pol.click();

        WebElement Visina = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div/div[1]/div/input"));
        Visina.sendKeys("190");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div/div[2]/div/input"));
        Tezina.sendKeys("85");

        WebElement OS = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[5]/div[2]/div/label[1]/span[2]"));
        OS.click();

        WebElement Iznos = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[6]/div/div/input"));
        Iznos.sendKeys("3000");

        WebElement PrikaziPakete = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/button/span[1]"));
        PrikaziPakete.click();
        Thread.sleep(6000);

        WebElement KompaktPaket = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[7]/span/span[1]/input"));
        KompaktPaket.click();

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Ugovaranje = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[4]/div/button[3]/span[1]"));
        Ugovaranje.click();
        Thread.sleep(3500);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/input"));
        JMBG.click();
        JMBG.clear();
        JMBG.sendKeys("0102992700243");

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/button"));
        Pretrazi.click();
        Thread.sleep(2000);

        WebElement UOIstoLice = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[1]/label[1]/span[1]/span[1]/input"));
        UOIstoLice.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement AdresaPosta = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/label[1]/span[1]/span[1]/input"));
        AdresaPosta.click();

        WebElement SMSObavestenja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[3]/div/label[2]/span[1]/span[1]/input"));
        SMSObavestenja.click();

        WebElement Dalje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        Dalje.click();
        Thread.sleep(8500);

        WebElement DaljeKorisnik = driver.findElement(By.xpath("/html/body/div/div[1]/main/div[3]/div/div/div/div[2]/button[2]"));
        DaljeKorisnik.click();
        Thread.sleep(2000);

      /*   WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        Select select = new Select(ZU);
        select.selectByIndex(0);
*/

        WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        ZU.click();

        WebElement IzjavaZu = driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]"));
        IzjavaZu.click();
        Thread.sleep(3000);
/*
        WebElement ZUTekst = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[1]/label"));
        Thread.sleep(2500);
        assert ZUTekst.getText().equals("Izjavljujem da sam zdrav/a i da nisam ni pod kakvim vidom lečenja, \r\n" + //
                "        da nisam podvrgnut/a medicinskom ispitivanju, niti sam u procesu čekanja da lekarski pregled počnu, \r\n" + //
                "        kao i da mi nije nikada preporučena bilo koja vrsta medicinskog ispitivanja iz bilo kog razloga. \r\n" + //
                "        Dalje, tvrdim da: ▪ nisam imao/la bolest koja je zahtevala lečenje duže od 2 nedelje u kontinuitetu; \r\n" + //
                "        ▪ nisam bio hospitalizovan/a, niti podvrgnut/a bilo kakvom medicinskom ispitivanju; ▪ \r\n" + //
                "        nije mi nikada dijagnostifikovano, niti sam ikada ispitivan/a ili lečen/a od bilo koje forme srčanog\r\n" + //
                "         ili moždanog oboljenja, zloćudnog tumora, dijabetesa melitusa. HIV-a i AIDs-a. \r\n" + //
                "         Izjavljujem da moje zanimanje ne uključuje nijedno od opasnih poslova kao što su: \r\n" + //
                "         rad na visinama iznad 10m; rad na ribarskim, vojnim brodovima i ofšor (offshore) platformama;\r\n" + //
                "          rad ispod zemlje i na površinskim kopovima; rad sa eksplozivnim materijama i komercijalno podvodno ronjenje;\r\n" + //
                "           kao i da se ne bavim, niti učestvujem ni u jednom opasnom ili ekstremnom sportu kao što je: \r\n" + //
                "           ronjenje dublje od 30m, planinarenje na visinama iznad 3.000m, \r\n" + //
                "           skakanje padobranom ili bilo koja vrsta aero sportova.") : "Očekivani tekst nakon odabira upitnika";
*/
        WebElement DaljeZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeZU.click();
        Thread.sleep(4000);

        WebElement Stednja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[3]/div/div/div[2]/div/label[2]/span[2]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[4]/div/div/div[2]/div/label[1]/span[2]"));
        StalniIzvori.click();

        WebElement LosaReputacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        LosaReputacija.click();

        WebElement Transakcija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[3]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Transakcija.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[4]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Identifikacija.click();

        WebElement Terorizam = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[5]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Terorizam.click();

        WebElement Informacije = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[6]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Informacije.click();

        WebElement DaljeAML = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeAML.click();
        Thread.sleep(2500);

        WebElement DaljePlacanje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljePlacanje.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div/div[2]/button[2]/span[1]"));
        Aktiviraj.click();
        Thread.sleep(7500);

        WebElement PolisaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[1]/td[2]/button/span[1]"));
        PolisaStampa.click();
        Thread.sleep(13500);

        WebElement UplatnicaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[2]/td[2]/button/span[1]"));
        UplatnicaStampa.click();
        Thread.sleep(5500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[3]/span[1]"));
        PotvrdaPotpisa.click();

        WebElement BrojDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[1]/h6"));
        String headingtext = BrojDokumenta.getText();
        System.out.println(headingtext);

        WebElement Status = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        String headingtext1 = Status.getText();
        System.out.println(headingtext1);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[3]/h6"));
        String headingtext2 = Proizvod.getText();
        System.out.println(headingtext2);

    /*    WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        assert StatusDokumenta.getText().equals("Čeka BOC") : "Očekivani status nakon potvrde potpisa";
        */
    }

/*
            @AfterMethod
            public void tearDown() throws Exception {
            driver.quit();

*/

    @Epic("sCore Serbia")
    @Feature("POS Bank")
    @Description("Creating new contract in POS Bank application")
    @Step("Creating new contract in POS Bank application - RizikoKredit")
    @Owner("Nikola Stavrov")
    @Test (priority = 570)
    @SuppressWarnings("deprecation")
    public void POSBanksRizikoKredit () throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://qa-score.uniqa.rs/scorepos/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("Raiff_yuajko");

        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[2]/input"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();
        Thread.sleep(3500);

        WebElement Zivot = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div/button/div[1]"));
        Zivot.click();
        Thread.sleep(2500);

        WebElement RizikoKredit = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div[7]/div/button/div[2]"));
        RizikoKredit.click();
        Thread.sleep(2000);

        WebElement ImePrezime = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[1]/div/div/textarea[3]"));
        ImePrezime.click();
        ImePrezime.clear();
        ImePrezime.sendKeys("Nikola Stankovic");

        WebElement DatumRodjenja = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div/div/input"));
        DatumRodjenja.sendKeys("20.12.1975");

        WebElement Pol = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[4]/label[2]/span[1]/span[1]/input"));
        Pol.click();

        WebElement Visina = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div/div[1]/div/input"));
        Visina.sendKeys("185");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div/div[2]/div/input"));
        Tezina.sendKeys("82");
        Thread.sleep(1500);

        WebElement TrajanjeMeseci = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div/div/input"));
        TrajanjeMeseci.click();
        TrajanjeMeseci.clear();
        TrajanjeMeseci.sendKeys("120");

        WebElement OS = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[7]/div/div/input"));
        OS.click();

        WebElement Iznos = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[7]/div/div/input"));
        Iznos.click();
        Iznos.clear();
        Iznos.sendKeys("3500");

        WebElement NominalnaKamatnaStopa = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[8]/div/div/input"));
        NominalnaKamatnaStopa.click();
        NominalnaKamatnaStopa.clear();
        NominalnaKamatnaStopa.sendKeys("5");

        WebElement PrikaziPakete = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/button/span[1]"));
        PrikaziPakete.click();
        Thread.sleep(6000);

        WebElement RizikoKreditPaket = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/div/div/div/div/div[5]/span/span[1]/input"));
        RizikoKreditPaket.click();

        //  js.executeScript("window.scrollBy(0, 1500);");

        WebElement Ugovaranje = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[3]/div/button[3]"));
        Ugovaranje.click();
        Thread.sleep(3500);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/input"));
        JMBG.click();
        JMBG.clear();
        JMBG.sendKeys("2012975752025");

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/button"));
        Pretrazi.click();
        Thread.sleep(2000);

        WebElement UOIstoLice = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[1]/label[1]/span[1]/span[1]/input"));
        UOIstoLice.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement AdresaPosta = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/label[1]/span[1]/span[1]/input"));
        AdresaPosta.click();

        WebElement SMSObavestenja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[3]/div/label[2]/span[1]/span[1]/input"));
        SMSObavestenja.click();

        WebElement Dalje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        Dalje.click();

        WebElement DaljeKorisnik = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeKorisnik.click();
        Thread.sleep(2000);

      /*   WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        Select select = new Select(ZU);
        select.selectByIndex(0);
*/

        WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        ZU.click();

        WebElement IzjavaZu = driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]"));
        IzjavaZu.click();
/*
        WebElement ZUTekst = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[1]/label"));
        Thread.sleep(2500);
        assert ZUTekst.getText().equals("Izjavljujem da sam zdrav/a i da nisam ni pod kakvim vidom lečenja, \r\n" + //
                "        da nisam podvrgnut/a medicinskom ispitivanju, niti sam u procesu čekanja da lekarski pregled počnu, \r\n" + //
                "        kao i da mi nije nikada preporučena bilo koja vrsta medicinskog ispitivanja iz bilo kog razloga. \r\n" + //
                "        Dalje, tvrdim da: ▪ nisam imao/la bolest koja je zahtevala lečenje duže od 2 nedelje u kontinuitetu; \r\n" + //
                "        ▪ nisam bio hospitalizovan/a, niti podvrgnut/a bilo kakvom medicinskom ispitivanju; ▪ \r\n" + //
                "        nije mi nikada dijagnostifikovano, niti sam ikada ispitivan/a ili lečen/a od bilo koje forme srčanog\r\n" + //
                "         ili moždanog oboljenja, zloćudnog tumora, dijabetesa melitusa. HIV-a i AIDs-a. \r\n" + //
                "         Izjavljujem da moje zanimanje ne uključuje nijedno od opasnih poslova kao što su: \r\n" + //
                "         rad na visinama iznad 10m; rad na ribarskim, vojnim brodovima i ofšor (offshore) platformama;\r\n" + //
                "          rad ispod zemlje i na površinskim kopovima; rad sa eksplozivnim materijama i komercijalno podvodno ronjenje;\r\n" + //
                "           kao i da se ne bavim, niti učestvujem ni u jednom opasnom ili ekstremnom sportu kao što je: \r\n" + //
                "           ronjenje dublje od 30m, planinarenje na visinama iznad 3.000m, \r\n" + //
                "           skakanje padobranom ili bilo koja vrsta aero sportova.") : "Očekivani tekst nakon odabira upitnika";
*/
        WebElement DaljeZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        Thread.sleep(3500);
        DaljeZU.click();

        Thread.sleep(3500);

        WebElement Stednja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[3]/div/div/div[2]/div/label[2]/span[2]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[4]/div/div/div[2]/div/label[1]/span[2]"));
        StalniIzvori.click();

        WebElement LosaReputacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        LosaReputacija.click();

        WebElement Transakcija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[3]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Transakcija.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[4]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Identifikacija.click();

        WebElement Terorizam = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[5]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Terorizam.click();

        WebElement Informacije = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[6]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Informacije.click();

        WebElement DaljeAML = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeAML.click();
        Thread.sleep(2500);

        WebElement DaljePlacanje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljePlacanje.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div/div[2]/button[2]/span[1]"));
        Aktiviraj.click();
        Thread.sleep(7500);

        WebElement PolisaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[1]/td[2]/button/span[1]"));
        PolisaStampa.click();
        Thread.sleep(15500);

        WebElement UplatnicaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[2]/td[2]/button/span[1]"));
        UplatnicaStampa.click();
        Thread.sleep(5500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[3]/span[1]"));
        PotvrdaPotpisa.click();

        WebElement BrojDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[1]/h6"));
        String headingtext = BrojDokumenta.getText();
        System.out.println(headingtext);

        WebElement Status = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        String headingtext1 = Status.getText();
        System.out.println(headingtext1);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[3]/h6"));
        String headingtext2 = Proizvod.getText();
        System.out.println(headingtext2);

    /*    WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        assert StatusDokumenta.getText().equals("Čeka BOC") : "Očekivani status nakon potvrde potpisa";
        */
    }

/*
            @AfterMethod
            public void tearDown() throws Exception {
            driver.quit();



*/

    @Epic("sCore Serbia")
    @Feature("POS Bank")
    @Description("Creating new contract in POS Bank application")
    @Step("Creating new contract in POS Bank application - JokerPlus")
    @Owner("Nikola Stavrov")
    @Test (priority = 580)
    @SuppressWarnings("deprecation")
    public void POSBanksJokerPlus () throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://qa-score.uniqa.rs/scorepos/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("Raiff_yuajko");

        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[2]/input"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();
        Thread.sleep(3500);

        WebElement Zivot = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div/button/div[1]"));
        Zivot.click();
        Thread.sleep(2500);

        WebElement JokerPlus = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div[6]/div/button/div[2]"));
        JokerPlus.click();
        Thread.sleep(2000);

        WebElement ImePrezime = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[1]/div/div/textarea[3]"));
        ImePrezime.click();
        ImePrezime.clear();
        ImePrezime.sendKeys("Nikola Stankovic");

        WebElement DatumRodjenja = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div/div/input"));
        DatumRodjenja.sendKeys("20.12.1975");

        WebElement Pol = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[4]/label[2]/span[1]/span[1]/input"));
        Pol.click();

    /*  WebElement Visina = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div/div[1]/div/input"));
        Visina.sendKeys("185");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div/div[2]/div/input"));
        Tezina.sendKeys("82");
        Thread.sleep(1500);

        WebElement TrajanjeMeseci = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div/div/input"));
        TrajanjeMeseci.click();
        TrajanjeMeseci.clear();
        TrajanjeMeseci.sendKeys("120");
 */
        WebElement OS = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[3]/div/div/label[1]/span[2]"));
        OS.click();

        WebElement Iznos = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[4]/div/div/input"));
        Iznos.click();
        Iznos.clear();
        Iznos.sendKeys("350000");

 /*     WebElement NominalnaKamatnaStopa = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[8]/div/div/input"));
        NominalnaKamatnaStopa.click();
        NominalnaKamatnaStopa.clear();
        NominalnaKamatnaStopa.sendKeys("5");
 */
        WebElement PrikaziPakete = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/button/span[1]"));
        PrikaziPakete.click();
        Thread.sleep(4000);

        WebElement JokerPlus3Godine = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[5]/span/span[1]/input"));
        JokerPlus3Godine.click();

        //  js.executeScript("window.scrollBy(0, 1500);");

        WebElement Ugovaranje = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[3]/div/button[3]"));
        Ugovaranje.click();
        Thread.sleep(3500);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/input"));
        JMBG.click();
        JMBG.clear();
        JMBG.sendKeys("2012975752025");

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/button"));
        Pretrazi.click();
        Thread.sleep(2000);

        WebElement UOIstoLice = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[1]/label[1]/span[1]/span[1]/input"));
        UOIstoLice.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement AdresaPosta = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/label[1]/span[1]/span[1]/input"));
        AdresaPosta.click();

        WebElement SMSObavestenja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[3]/div/label[2]/span[1]/span[1]/input"));
        SMSObavestenja.click();

        WebElement Dalje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        Dalje.click();
        Thread.sleep(8500);

        WebElement DaljeKorisnik = driver.findElement(By.xpath("/html/body/div/div[1]/main/div[3]/div/div/div/div[2]/button[2]"));
        DaljeKorisnik.click();
        Thread.sleep(3000);

      /*   WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        Select select = new Select(ZU);
        select.selectByIndex(0);


       WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        ZU.click();

        WebElement IzjavaZu = driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]"));
        IzjavaZu.click();

        WebElement ZUTekst = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[1]/label"));
        Thread.sleep(2500);
        assert ZUTekst.getText().equals("Izjavljujem da sam zdrav/a i da nisam ni pod kakvim vidom lečenja, \r\n" + //
                "        da nisam podvrgnut/a medicinskom ispitivanju, niti sam u procesu čekanja da lekarski pregled počnu, \r\n" + //
                "        kao i da mi nije nikada preporučena bilo koja vrsta medicinskog ispitivanja iz bilo kog razloga. \r\n" + //
                "        Dalje, tvrdim da: ▪ nisam imao/la bolest koja je zahtevala lečenje duže od 2 nedelje u kontinuitetu; \r\n" + //
                "        ▪ nisam bio hospitalizovan/a, niti podvrgnut/a bilo kakvom medicinskom ispitivanju; ▪ \r\n" + //
                "        nije mi nikada dijagnostifikovano, niti sam ikada ispitivan/a ili lečen/a od bilo koje forme srčanog\r\n" + //
                "         ili moždanog oboljenja, zloćudnog tumora, dijabetesa melitusa. HIV-a i AIDs-a. \r\n" + //
                "         Izjavljujem da moje zanimanje ne uključuje nijedno od opasnih poslova kao što su: \r\n" + //
                "         rad na visinama iznad 10m; rad na ribarskim, vojnim brodovima i ofšor (offshore) platformama;\r\n" + //
                "          rad ispod zemlje i na površinskim kopovima; rad sa eksplozivnim materijama i komercijalno podvodno ronjenje;\r\n" + //
                "           kao i da se ne bavim, niti učestvujem ni u jednom opasnom ili ekstremnom sportu kao što je: \r\n" + //
                "           ronjenje dublje od 30m, planinarenje na visinama iznad 3.000m, \r\n" + //
                "           skakanje padobranom ili bilo koja vrsta aero sportova.") : "Očekivani tekst nakon odabira upitnika";

        WebElement DaljeZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        Thread.sleep(3000);
        DaljeZU.click();
 */
        WebElement Stednja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[3]/div/div/div[2]/div/label[2]/span[2]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[4]/div/div/div[2]/div/label[1]/span[2]"));
        StalniIzvori.click();

        WebElement LosaReputacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        LosaReputacija.click();
        Thread.sleep(2500);

        WebElement Transakcija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[3]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Transakcija.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[4]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Identifikacija.click();

        WebElement Terorizam = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[5]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Terorizam.click();

        WebElement Informacije = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[6]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Informacije.click();

        WebElement DaljeAML = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeAML.click();
        Thread.sleep(2500);

        WebElement DaljePlacanje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljePlacanje.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div/div[2]/button[2]/span[1]"));
        Aktiviraj.click();
        Thread.sleep(7500);

        WebElement PolisaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[1]/td[2]/button/span[1]"));
        PolisaStampa.click();
        Thread.sleep(15500);

        WebElement UplatnicaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[2]/td[2]/button/span[1]"));
        UplatnicaStampa.click();
        Thread.sleep(5500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[3]/span[1]"));
        PotvrdaPotpisa.click();

        WebElement BrojDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[1]/h6"));
        String headingtext = BrojDokumenta.getText();
        System.out.println(headingtext);

        WebElement Status = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        String headingtext1 = Status.getText();
        System.out.println(headingtext1);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[3]/h6"));
        String headingtext2 = Proizvod.getText();
        System.out.println(headingtext2);

    /*    WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        assert StatusDokumenta.getText().equals("Čeka BOC") : "Očekivani status nakon potvrde potpisa";
        */
    }

/*
            @AfterMethod
            public void tearDown() throws Exception {
            driver.quit();



*/
    @Epic("sCore Serbia")
    @Feature("POS Bank")
    @Description("Creating new contract in POS Bank application")
    @Step("Creating new contract in POS Bank application - Smart")
    @Owner("Nikola Stavrov")
    @Test (priority = 590)
    @SuppressWarnings("deprecation")
    public void POSBanksSmart () throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://qa-score.uniqa.rs/scorepos/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("Raiff_yuajko");

        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[2]/input"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();
        Thread.sleep(3500);

        WebElement Zivot = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div/button/div[1]"));
        Zivot.click();
        Thread.sleep(2500);

        WebElement Smart = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div[3]/div/button/div[2]"));
        Smart.click();
        Thread.sleep(2000);

        WebElement ImePrezime = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[1]/div/div/textarea[3]"));
        ImePrezime.click();
        ImePrezime.clear();
        ImePrezime.sendKeys("Petar PetrovicBanke");

        WebElement DatumRodjenja = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div/div/input"));
        DatumRodjenja.sendKeys("12.03.1992");

        WebElement PrikaziPakete = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/button/span[1]"));
        PrikaziPakete.click();
        Thread.sleep(6000);

        WebElement SmartPaket = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div[2]/label/span[1]/span[1]/input"));
        SmartPaket.click();

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Ugovaranje = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[3]/div/button[3]/span[1]"));
        Ugovaranje.click();
        Thread.sleep(3500);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/input"));
        JMBG.click();
        JMBG.clear();
        JMBG.sendKeys("1203992700248");

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/button"));
        Pretrazi.click();
        Thread.sleep(2000);

        WebElement UOIstoLice = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[1]/label[1]/span[1]/span[1]/input"));
        UOIstoLice.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement AdresaPosta = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/label[1]/span[1]/span[1]/input"));
        AdresaPosta.click();

        WebElement SMSObavestenja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[3]/div/label[2]/span[1]/span[1]/input"));
        SMSObavestenja.click();

        WebElement Dalje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        Dalje.click();
        Thread.sleep(5000);

        WebElement DaljeKorisnik = driver.findElement(By.xpath("/html/body/div/div[1]/main/div[3]/div/div/div/div[2]/button[2]"));
        DaljeKorisnik.click();
        Thread.sleep(2000);

      /*   WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        Select select = new Select(ZU);
        select.selectByIndex(0);
*/

        WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        ZU.click();

        WebElement IzjavaZu = driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]"));
        IzjavaZu.click();
/*
        WebElement ZUTekst = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[1]/label"));
        Thread.sleep(2500);
        assert ZUTekst.getText().equals("Izjavljujem da sam zdrav/a i da nisam ni pod kakvim vidom lečenja, \r\n" + //
                "        da nisam podvrgnut/a medicinskom ispitivanju, niti sam u procesu čekanja da lekarski pregled počnu, \r\n" + //
                "        kao i da mi nije nikada preporučena bilo koja vrsta medicinskog ispitivanja iz bilo kog razloga. \r\n" + //
                "        Dalje, tvrdim da: ▪ nisam imao/la bolest koja je zahtevala lečenje duže od 2 nedelje u kontinuitetu; \r\n" + //
                "        ▪ nisam bio hospitalizovan/a, niti podvrgnut/a bilo kakvom medicinskom ispitivanju; ▪ \r\n" + //
                "        nije mi nikada dijagnostifikovano, niti sam ikada ispitivan/a ili lečen/a od bilo koje forme srčanog\r\n" + //
                "         ili moždanog oboljenja, zloćudnog tumora, dijabetesa melitusa. HIV-a i AIDs-a. \r\n" + //
                "         Izjavljujem da moje zanimanje ne uključuje nijedno od opasnih poslova kao što su: \r\n" + //
                "         rad na visinama iznad 10m; rad na ribarskim, vojnim brodovima i ofšor (offshore) platformama;\r\n" + //
                "          rad ispod zemlje i na površinskim kopovima; rad sa eksplozivnim materijama i komercijalno podvodno ronjenje;\r\n" + //
                "           kao i da se ne bavim, niti učestvujem ni u jednom opasnom ili ekstremnom sportu kao što je: \r\n" + //
                "           ronjenje dublje od 30m, planinarenje na visinama iznad 3.000m, \r\n" + //
                "           skakanje padobranom ili bilo koja vrsta aero sportova.") : "Očekivani tekst nakon odabira upitnika";
*/
        WebElement DaljeZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        DaljeZU.click();
        Thread.sleep(4000);

        WebElement Stednja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[3]/div/div/div[2]/div/label[2]/span[2]"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[4]/div/div/div[2]/div/label[1]/span[2]"));
        StalniIzvori.click();

        WebElement LosaReputacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        LosaReputacija.click();

        WebElement Transakcija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[3]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Transakcija.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[4]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Identifikacija.click();

        WebElement Terorizam = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[5]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Terorizam.click();

        WebElement Informacije = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[6]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Informacije.click();

        WebElement DaljeAML = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeAML.click();
        Thread.sleep(2500);

        WebElement DaljePlacanje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljePlacanje.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div/div[2]/button[2]/span[1]"));
        Aktiviraj.click();
        Thread.sleep(7500);

        WebElement PolisaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[1]/td[2]/button/span[1]"));
        PolisaStampa.click();
        Thread.sleep(13500);

        WebElement UplatnicaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[2]/td[2]/button/span[1]"));
        UplatnicaStampa.click();
        Thread.sleep(5500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[3]/span[1]"));
        PotvrdaPotpisa.click();

        WebElement BrojDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[1]/h6"));
        String headingtext = BrojDokumenta.getText();
        System.out.println(headingtext);

        WebElement Status = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        String headingtext1 = Status.getText();
        System.out.println(headingtext1);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[3]/h6"));
        String headingtext2 = Proizvod.getText();
        System.out.println(headingtext2);


    }
    @Epic("sCore Serbia")
    @Feature("POS Bank")
    @Description("Creating new contract in POS Bank application")
    @Step("Creating new contract in POS Bank application - Aktiv")
    @Owner("Nikola Stavrov")
    @Test (priority = 600)
    @SuppressWarnings("deprecation")
    public void POSBanksAktiv () throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://qa-score.uniqa.rs/scorepos/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("Raiff_yuajko");

        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[2]/input"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();
        Thread.sleep(3500);

        WebElement Zivot = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div/button/div[1]"));
        Zivot.click();
        Thread.sleep(2500);

        WebElement Aktiv = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div[2]/div/button/div[2]"));
        Aktiv.click();
        Thread.sleep(2000);

        WebElement ImePrezime = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[1]/div/div/textarea[3]"));
        ImePrezime.click();
        ImePrezime.clear();
        ImePrezime.sendKeys("Petar PetrovicBanke");

        WebElement DatumRodjenja = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div/div/input"));
        DatumRodjenja.sendKeys("12.03.1992");

        WebElement PrikaziPakete = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/button/span[1]"));
        PrikaziPakete.click();
        Thread.sleep(6000);

        WebElement AktivPaket = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/div/div[4]/div/div/div/div[2]/label/span[1]/span[1]/input"));
        AktivPaket.click();

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Ugovaranje = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[3]/div/button[3]/span[1]"));
        Ugovaranje.click();
        Thread.sleep(3500);

        WebElement JMBG = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/input"));
        JMBG.click();
        JMBG.clear();
        JMBG.sendKeys("1203992700248");

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/button"));
        Pretrazi.click();
        Thread.sleep(2000);

        WebElement UOIstoLice = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[1]/label[1]/span[1]/span[1]/input"));
        UOIstoLice.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement AdresaPosta = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/label[1]/span[1]/span[1]/input"));
        AdresaPosta.click();

        WebElement SMSObavestenja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div[3]/div/label[2]/span[1]/span[1]/input"));
        SMSObavestenja.click();

        WebElement Dalje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        Dalje.click();
        Thread.sleep(5000);

        WebElement DaljeKorisnik = driver.findElement(By.xpath("/html/body/div/div[1]/main/div[3]/div/div/div/div[2]/button[2]"));
        DaljeKorisnik.click();
        Thread.sleep(2000);

      /*   WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        Select select = new Select(ZU);
        select.selectByIndex(0);
*/
/*
        WebElement ZUTekst = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[1]/label"));
        Thread.sleep(2500);
        assert ZUTekst.getText().equals("Izjavljujem da sam zdrav/a i da nisam ni pod kakvim vidom lečenja, \r\n" + //
                "        da nisam podvrgnut/a medicinskom ispitivanju, niti sam u procesu čekanja da lekarski pregled počnu, \r\n" + //
                "        kao i da mi nije nikada preporučena bilo koja vrsta medicinskog ispitivanja iz bilo kog razloga. \r\n" + //
                "        Dalje, tvrdim da: ▪ nisam imao/la bolest koja je zahtevala lečenje duže od 2 nedelje u kontinuitetu; \r\n" + //
                "        ▪ nisam bio hospitalizovan/a, niti podvrgnut/a bilo kakvom medicinskom ispitivanju; ▪ \r\n" + //
                "        nije mi nikada dijagnostifikovano, niti sam ikada ispitivan/a ili lečen/a od bilo koje forme srčanog\r\n" + //
                "         ili moždanog oboljenja, zloćudnog tumora, dijabetesa melitusa. HIV-a i AIDs-a. \r\n" + //
                "         Izjavljujem da moje zanimanje ne uključuje nijedno od opasnih poslova kao što su: \r\n" + //
                "         rad na visinama iznad 10m; rad na ribarskim, vojnim brodovima i ofšor (offshore) platformama;\r\n" + //
                "          rad ispod zemlje i na površinskim kopovima; rad sa eksplozivnim materijama i komercijalno podvodno ronjenje;\r\n" + //
                "           kao i da se ne bavim, niti učestvujem ni u jednom opasnom ili ekstremnom sportu kao što je: \r\n" + //
                "           ronjenje dublje od 30m, planinarenje na visinama iznad 3.000m, \r\n" + //
                "           skakanje padobranom ili bilo koja vrsta aero sportova.") : "Očekivani tekst nakon odabira upitnika";
*/
        WebElement DaljeZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        DaljeZU.click();
        Thread.sleep(6000);

        js.executeScript("window.scrollBy(0, -500);");
        Thread.sleep(2000);

        WebElement Stednja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[3]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Zaposlen.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[4]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        StalniIzvori.click();

        WebElement LosaReputacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        LosaReputacija.click();

        WebElement Transakcija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[3]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Transakcija.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[4]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Identifikacija.click();

        WebElement Terorizam = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[5]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Terorizam.click();

        WebElement Informacije = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[6]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Informacije.click();

        WebElement DaljeAML = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeAML.click();
        Thread.sleep(2500);

        WebElement DaljePlacanje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljePlacanje.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div/div[2]/button[2]/span[1]"));
        Aktiviraj.click();
        Thread.sleep(7500);

        WebElement PolisaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[1]/td[2]/button/span[1]"));
        PolisaStampa.click();
        Thread.sleep(13500);

        WebElement UplatnicaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[2]/td[2]/button/span[1]"));
        UplatnicaStampa.click();
        Thread.sleep(5500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[3]/span[1]"));
        PotvrdaPotpisa.click();

        WebElement BrojDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[1]/h6"));
        String headingtext = BrojDokumenta.getText();
        System.out.println(headingtext);

        WebElement Status = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        String headingtext1 = Status.getText();
        System.out.println(headingtext1);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[3]/h6"));
        String headingtext2 = Proizvod.getText();
        System.out.println(headingtext2);


    }
    @Epic("sCore Serbia")
    @Feature("POS Bank")
    @Description("Creating new contract in POS Bank application")
    @Step("Creating new contract in POS Bank application - SME KMP")
    @Owner("Nikola Stavrov")
    @Test (priority = 610)
    @SuppressWarnings("deprecation")

    public void POSBanksSMEKMP () throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://qa-score.uniqa.rs/scorepos/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("r103cv664");

        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[2]/input"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();
        Thread.sleep(3500);

        WebElement Zivot = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div/button/div[1]"));
        Zivot.click();
        Thread.sleep(2500);

        WebElement SMEKMP = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div[2]/div/button/div[2]"));
        SMEKMP.click();
        Thread.sleep(2000);

        WebElement ImePrezime = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[1]/div/div/textarea[3]"));
        ImePrezime.click();
        ImePrezime.clear();
        ImePrezime.sendKeys("Nikola Stankovic");

        WebElement DatumRodjenja = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div/div/input"));
        DatumRodjenja.sendKeys("20.12.1975");

        WebElement Pol = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[4]/label[2]/span[1]/span[1]/input"));
        Pol.click();

        WebElement Visina = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div/div[1]/div/input"));
        Visina.sendKeys("185");

        WebElement Tezina = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div/div[2]/div/input"));
        Tezina.sendKeys("82");
        Thread.sleep(1500);

        WebElement TrajanjeMeseci = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div/div/input"));
        TrajanjeMeseci.click();
        TrajanjeMeseci.clear();
        TrajanjeMeseci.sendKeys("60");

        WebElement OS = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[7]/div/div/input"));
        OS.click();

        WebElement Iznos = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[1]/div[2]/div/div[7]/div/div/input"));
        Iznos.click();
        Iznos.clear();
        Iznos.sendKeys("5000");

        WebElement PrikaziPakete = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/button/span[1]"));
        PrikaziPakete.click();
        Thread.sleep(6000);

        WebElement RizikoKreditPaket = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[2]/div/div/div/div/div[5]/span/span[1]/input"));
        RizikoKreditPaket.click();

        //  js.executeScript("window.scrollBy(0, 1500);");

        WebElement Ugovaranje = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div/div/div/div[3]/div/button[3]"));
        Ugovaranje.click();
        Thread.sleep(3500);

        WebElement PIB = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/form/div/div[1]/div/div[4]/div/div/input"));
        PIB.click();
        PIB.clear();
        PIB.sendKeys("100064824");
        Thread.sleep(2500);

        WebElement Pretrazi = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/form/div/div[1]/div/div[4]/button"));
        Pretrazi.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement Dalje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        Dalje.click();


      /*   WebElement ZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div/div/div"));
        Select select = new Select(ZU);
        select.selectByIndex(0);
*/

        WebElement JMBGOsiguranika = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/div/div/input"));
        JMBGOsiguranika.click();
        JMBGOsiguranika.clear();
        JMBGOsiguranika.sendKeys("2012975752025");

        WebElement PretraziLiceO = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/button"));
        PretraziLiceO.click();

        js.executeScript("window.scrollBy(0, 1000);");

        WebElement Dalje1 = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        Dalje1.click();

        WebElement DaljeKorisnik = driver.findElement(By.xpath("/html/body/div/div[1]/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeKorisnik.click();
        Thread.sleep(2000);
/*
        WebElement ZUTekst = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div/div[2]/div/div/div[1]/label"));
        Thread.sleep(2500);
        assert ZUTekst.getText().equals("Izjavljujem da sam zdrav/a i da nisam ni pod kakvim vidom lečenja, \r\n" + //
                "        da nisam podvrgnut/a medicinskom ispitivanju, niti sam u procesu čekanja da lekarski pregled počnu, \r\n" + //
                "        kao i da mi nije nikada preporučena bilo koja vrsta medicinskog ispitivanja iz bilo kog razloga. \r\n" + //
                "        Dalje, tvrdim da: ▪ nisam imao/la bolest koja je zahtevala lečenje duže od 2 nedelje u kontinuitetu; \r\n" + //
                "        ▪ nisam bio hospitalizovan/a, niti podvrgnut/a bilo kakvom medicinskom ispitivanju; ▪ \r\n" + //
                "        nije mi nikada dijagnostifikovano, niti sam ikada ispitivan/a ili lečen/a od bilo koje forme srčanog\r\n" + //
                "         ili moždanog oboljenja, zloćudnog tumora, dijabetesa melitusa. HIV-a i AIDs-a. \r\n" + //
                "         Izjavljujem da moje zanimanje ne uključuje nijedno od opasnih poslova kao što su: \r\n" + //
                "         rad na visinama iznad 10m; rad na ribarskim, vojnim brodovima i ofšor (offshore) platformama;\r\n" + //
                "          rad ispod zemlje i na površinskim kopovima; rad sa eksplozivnim materijama i komercijalno podvodno ronjenje;\r\n" + //
                "           kao i da se ne bavim, niti učestvujem ni u jednom opasnom ili ekstremnom sportu kao što je: \r\n" + //
                "           ronjenje dublje od 30m, planinarenje na visinama iznad 3.000m, \r\n" + //
                "           skakanje padobranom ili bilo koja vrsta aero sportova.") : "Očekivani tekst nakon odabira upitnika";
*/
        WebElement DaljeZU = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        Thread.sleep(3500);
        DaljeZU.click();

        Thread.sleep(3500);

        WebElement Stednja = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Stednja.click();

        WebElement Zaposlen = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[3]/div/div/div[2]/div/label[2]/span[2]"));
        Zaposlen.click();

        WebElement DOO = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[4]/div/div/div[3]/div/div/div/label[1]/span[1]/span[1]/input"));
        DOO.click();

        WebElement StalniIzvori = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[1]/div[5]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        StalniIzvori.click();

        WebElement LosaReputacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        LosaReputacija.click();

        WebElement Transakcija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[3]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Transakcija.click();

        js.executeScript("window.scrollBy(0, 500);");

        WebElement Identifikacija = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[4]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Identifikacija.click();

        WebElement Terorizam = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[5]/div/div/div[2]/div/label[1]/span[1]/span[1]/input"));
        Terorizam.click();

        WebElement Informacije = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[2]/div[6]/div/div/div[2]/div/label[2]/span[1]/span[1]/input"));
        Informacije.click();

        WebElement DaljeAML = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]/span[1]"));
        DaljeAML.click();
        Thread.sleep(2500);

        js.executeScript("window.scrollBy(0, 1500);");


        WebElement DaljePlacanje = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[2]"));
        DaljePlacanje.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 1500);");

        WebElement Aktiviraj = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div/div[2]/button[2]/span[1]"));
        Aktiviraj.click();
        Thread.sleep(7500);

        WebElement PolisaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[1]/td[2]/button/span[1]"));
        PolisaStampa.click();
        Thread.sleep(15500);

        WebElement UplatnicaStampa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[1]/div[3]/table/tbody/tr[2]/td[2]/button/span[1]"));
        UplatnicaStampa.click();
        Thread.sleep(5500);

        WebElement PotvrdaPotpisa = driver.findElement(By.xpath("/html/body/div/div/main/div[3]/div/div/div/div[2]/button[3]/span[1]"));
        PotvrdaPotpisa.click();

        WebElement BrojDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[1]/h6"));
        String headingtext = BrojDokumenta.getText();
        System.out.println(headingtext);

        WebElement Status = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        String headingtext1 = Status.getText();
        System.out.println(headingtext1);

        WebElement Proizvod = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[3]/h6"));
        String headingtext2 = Proizvod.getText();
        System.out.println(headingtext2);

    /*    WebElement StatusDokumenta = driver.findElement(By.xpath("/html/body/div/div/header/div/div[1]/div[2]/h6"));
        assert StatusDokumenta.getText().equals("Čeka BOC") : "Očekivani status nakon potvrde potpisa";
        */
    }

/*
            @AfterMethod
            public void tearDown() throws Exception {
            driver.quit();



*/




}












