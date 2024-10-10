package com.example.scoreproject;
import com.google.common.collect.ImmutableMap;
import dev.failsafe.CircuitBreaker;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
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
        // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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

}







