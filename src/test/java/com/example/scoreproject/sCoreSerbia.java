package com.example.scoreproject;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
    WebDriver driver;



    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(5);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(10);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(5);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(10);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(5);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(10);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.Valute).selectByIndex(5);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        //  Select select5 = new Select(mainPage.DurationInMonths);
        //  select5.selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.Valute).selectByIndex(5);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        //  Select select5 = new Select(mainPage.DurationInMonths);
        //  select5.selectByIndex(1);
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
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
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
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(1);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
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
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(19);
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
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
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(19);
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
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
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(1);
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
        new Select(mainPage.DocumentType).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(2);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.08.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.AnnulationReactivation.click();
        new Select(mainPage.AnnulationType).selectByIndex(2);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        new Select(mainPage.CancellationType).selectByIndex(1);
        new Select(mainPage.CancellationReason).selectByIndex(1);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.02.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        new Select(mainPage.CancellationType).selectByIndex(2);
        new Select(mainPage.CancellationReason).selectByIndex(8);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.03.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.CancellationReactivation.click();
        new Select(mainPage.CancellationType).selectByIndex(3);
        new Select(mainPage.CancellationReason).selectByIndex(13);
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.04.2024");
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.03.2024");
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
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(12);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(5);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Spektar")
    @Owner("Nikola Stavrov")
    @Test(priority = 480)
    public void ClausesSpektar() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsSRB).selectByIndex(54);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno") : "Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule") : "Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka") : "Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti") : "Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača") : "Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula") : "Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja") : "Excepted Clause";


    }

    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Favorit")
    @Owner("Nikola Stavrov")
    @Test(priority = 490)
    public void ClausesFavorit() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsSRB).selectByIndex(52);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2023");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno") : "Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka") : "Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti") : "Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača") : "Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula") : "Excepted Clause";
        //assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Excepted Clause";


    }

    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Joker")
    @Owner("Nikola Stavrov")
    @Test(priority = 500)
    public void ClausesJoker() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsSRB).selectByIndex(53);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno") : "Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule") : "Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka") : "Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti") : "Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača") : "Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula") : "Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja") : "Excepted Clause";

    }


    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Joker Old")
    @Owner("Nikola Stavrov")
    @Test(priority = 510)
    public void ClausesJokerOld() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsSRB).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        //assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule") : "Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka") : "Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti") : "Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača") : "Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula") : "Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja") : "Excepted Clause";

    }


    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Riziko")
    @Owner("Nikola Stavrov")
    @Test(priority = 520)
    public void ClausesRiziko() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsSRB).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno") : "Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule") : "Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka") : "Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti") : "Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača") : "Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula") : "Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja") : "Excepted Clause";


    }


    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Riziko Kredit")
    @Owner("Nikola Stavrov")
    @Test(priority = 530)
    public void ClausesRizikoKredit() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(4);
        new Select(mainPage.ProductsSRB).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(10);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        //assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno"):"Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule") : "Excepted Clause";
        assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka") : "Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti") : "Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača") : "Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula") : "Excepted Clause";
        assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja") : "Excepted Clause";

    }


    @Epic("sCore Serbia")
    @Feature("Clauses")
    @Description("Checking Clauses and notices")
    @Step("Checking Clauses and notices - Dozivotni Riziko")
    @Owner("Nikola Stavrov")
    @Test(priority = 540)
    public void ClausesDozivotniRiziko() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsSRB).selectByIndex(58);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.Klauzula30DanaStorno.getText().equals("Klauzula 30 dana storno") : "Excepted Clause";
        assert mainPage.UgovaranjeValutneKlauzule.getText().equals("Ugovaranje valutne klauzule") : "Excepted Clause";
        //assert mainPage.TacnostPodataka.getText().equals("Tačnost podataka"):"Excepted Clause";
        assert mainPage.ZastitaPodatakaLicnosti.getText().equals("Zaštita podataka o ličnosti") : "Excepted Clause";
        assert mainPage.KlauzulaZastitaPotrosaca.getText().equals("Klauzula o zaštiti potrošača") : "Excepted Clause";
        assert mainPage.SankcionaKlauzula.getText().equals("Sankciona klauzula") : "Excepted Clause";
        //assert mainPage.InformacijeUgovaracaOsiguranja.getText().equals("Informacije za ugovarača osiguranja"):"Excepted Clause";


    }

    @Epic("sCore Serbia")
    @Feature("Export to excel")
    @Description("Checking funcionality of exporting data to excel")
    @Step("Checking funcionality of exporting data to excel - action Export to excel")
    @Owner("Nikola Stavrov")
    @Test(priority = 540)
    public void ExportToExcelSerbia() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
        mainPage.SearchMenu.click();
        Thread.sleep(3000);
        mainPage.ExportToExcel.click();

    }

    @Epic("sCore Serbia")
    @Feature("SPNFT")
    @Description("Checking funcionality of SPNFT/Smaragd service")
    @Step("Checking funcionality of SPNFT - Creating documents with persons on SPNFT lists")
    @Owner("Nikola Stavrov")
    @Test(priority = 550)
    public void SPNFTSerbia() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Spektar, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1711984181369");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }

    }

    @Epic("sCore Serbia")
    @Feature("POS Bank")
    @Description("Creating new contract in POS Bank application")
    @Step("Creating new contract in POS Bank application - Spektar")
    @Owner("Nikola Stavrov")
    @Test(priority = 560)
    @SuppressWarnings("deprecation")
    public void POSBankSpektar() throws Exception {

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
    @Test(priority = 570)
    @SuppressWarnings("deprecation")
    public void POSBanksRizikoKredit() throws Exception {

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
    @Test(priority = 580)
    @SuppressWarnings("deprecation")
    public void POSBanksJokerPlus() throws Exception {

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
    @Test(priority = 590)
    @SuppressWarnings("deprecation")
    public void POSBanksSmart() throws Exception {

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
    @Test(priority = 600)
    @SuppressWarnings("deprecation")
    public void POSBanksAktiv() throws Exception {

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
    @Test(priority = 610)
    @SuppressWarnings("deprecation")

    public void POSBanksSMEKMP() throws Exception {

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

    @Epic("sCore Serbia")
    @Feature("Mass Print")
    @Description("Mass print of renewal policies")
    @Step("Generating pdf report of mass print for renewal policies - Policies")
    @Owner("Nikola Stavrov")
    @Test(priority = 620)

    public void MassPrintRenewalPolicies() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MassPrint.click();
        new Select(mainPage.Month).selectByIndex(8);
        new Select(mainPage.Year).selectByIndex(1);
        mainPage.Policies.click();


    }

    @Epic("sCore Serbia")
    @Feature("Mass Print")
    @Description("Mass print of renewal policies")
    @Step("Generating pdf report of mass print for renewal policies - Confirmation")
    @Owner("Nikola Stavrov")
    @Test(priority = 630)

    public void MassPrintRenewalConfirmation() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.MassPrint.click();
        new Select(mainPage.Month).selectByIndex(8);
        new Select(mainPage.Year).selectByIndex(1);
        mainPage.Confirmation.click();


    }

    @Epic("sCore Serbia")
    @Feature("Info offer")
    @Description("Creating info offer of Riziko Kredit with UW role - Valute clausule No")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")
    @Test(priority = 640)
    public void InfoOfferRizikoKreditValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Spektar with UW role - Valute clausule No")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 650)
    public void InfoOfferSpektarValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
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
    @Description("Creating info offer of Joker with UW role - Valute clausule No")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 660)
    public void InfoOfferJokerValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Riziko with UW role - Valute clausule No")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 670)
    public void InfoOfferRizikoValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Favorit with UW role - Valute clausule No")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 680)
    public void InfoOfferFavoritValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(5);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Joker Old with UW role - Valute clausule No")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 690)
    public void InfoOfferJokerOldValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(10);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Dozivotni riziko with UW role - Valute clausule No")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 700)
    public void InfoOfferDozivotniRizikoValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Riziko Kredit with BOC role - Valute clausule No")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 710)
    public void InfoOfferRizikoKreditBOCValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Spektar with BOC role - Valute clausule No")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 720)
    public void InfoOfferSpektarBOCValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
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
    @Description("Creating info offer of Joker with BOC role - Valute clausule No")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 730)
    public void InfoOfferJokerBOCValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Riziko with BOC role - Valute clausule No")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 740)
    public void InfoOfferRizikoBOCValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Favorit with BOC role - Valute clausule No")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 750)
    public void InfoOfferFavoritBOCValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(5);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Joker Old with BOC role - Valute clausule No")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 760)
    public void InfoOfferJokerOldBOCValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(10);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Dozivotni riziko with BOC role - Valute clausule No")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 770)
    public void InfoOfferDozivotniRizikoBOCValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Riziko Kredit with Agent role - Valute clausule No")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 780)
    public void InfoOfferRizikoKreditAgentValuteClausuleNo() throws InterruptedException {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Spektar with Agent role - Valute clausule No")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 790)
    public void InfoOfferSpektarAgentValuteClausuleNo() throws InterruptedException {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
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
    @Description("Creating info offer of Joker with Agent role - Valute clausule No")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 800)
    public void InfoOfferJokerAgentValuteClausuleNo() throws InterruptedException {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1990");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Riziko with Agent role - Valute clausule No")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 810)
    public void InfoOfferRizikoAgentValuteClausuleNo() throws InterruptedException {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("35000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1970");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Favorit with Agent role - Valute clausule No")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 820)
    public void InfoOfferFavoritAgentValuteClausuleNo() throws InterruptedException {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(5);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("20000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.2023");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Joker old with Agent role - Valute clausule No")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 830)
    public void InfoOfferJokerOldAgentValuteClausuleNo() throws InterruptedException {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(2);
        new Select(mainPage.Banka).selectByIndex(10);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("30000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of Dozivotni riziko with Agent role - Valute clausule No")
    @Step("Creating info offer with Agent")
    @Owner("Nikola Stavrov")

    @Test(priority = 840)
    public void InfoOfferDozivotniRizikoAgentValuteClausuleNo() throws InterruptedException {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1960");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of SME KMP with UW role - Valute clausule No")
    @Step("Creating info offer with UW")
    @Owner("Nikola Stavrov")

    @Test(priority = 850)
    public void InfoOfferSMEKMPUWValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.Valute).selectByIndex(5);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        //  Select select5 = new Select(mainPage.DurationInMonths);
        //  select5.selectByIndex(1);
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.click();
        mainPage.InsuredSumOrPremium.clear();
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.DateOfBirth.click();
        mainPage.DateOfBirth.sendKeys("01.01.1980");
        new Select(mainPage.GenderConcernPerson).selectByIndex(2);
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
    @Description("Creating info offer of SME KMP with BOC role - Valute clausule No")
    @Step("Creating info offer with BOC")
    @Owner("Nikola Stavrov")

    @Test(priority = 860)
    public void InfoOfferSMEKMPBOCValuteClausuleNo() {

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
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.Valute).selectByIndex(5);
        new Select(mainPage.Clause).selectByIndex(2);
        new Select(mainPage.PaymentMethod).selectByIndex(4);
        //  Select select5 = new Select(mainPage.DurationInMonths);
        //  select5.selectByIndex(1);
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
    @Feature("Conditions")
    @Description("Checking Conditions")
    @Step("Checking Conditions - Spektar")
    @Owner("Nikola Stavrov")
    @Test(priority = 870)
    public void ConditionsSpektar() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsSRB).selectByIndex(54);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.OpstiUsloviVIII2022.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022") : "Excepted Condition";


    }

    @Epic("sCore Serbia")
    @Feature("Conditions")
    @Description("Checking Conditions")
    @Step("Checking Clauses - Favorit")
    @Owner("Nikola Stavrov")
    @Test(priority = 880)
    public void ConditionsFavorit() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsSRB).selectByIndex(52);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2023");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.OpstiUsloviVIII2022.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022") : "Excepted Condition";
        assert mainPage.PosebniUsloviOsiguranjeDece.getText().equals("Posebni uslovi za osiguranje dece - PUOD II/2020") : "Excepted Condition";
        assert mainPage.PosebniUsloviOsiguranjeLica.getText().equals("Posebni uslovi za osiguranje lica od posledica nesrećnog slučaja kao dopunski uslovi uz osiguranje života - PUNE II/2020") : "Excepted Condition";
        assert mainPage.TabelaInvaliditeta.getText().equals("Tabela invaliditeta za određivanje trajnog gubitka opšte radne sposobnosti usled nesrećnog slučaja - TI II/2020") : "Excepted Condition";


    }

    @Epic("sCore Serbia")
    @Feature("Conditions")
    @Description("Checking Conditions")
    @Step("Checking Conditions - Joker")
    @Owner("Nikola Stavrov")
    @Test(priority = 890)
    public void ConditionsJoker() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsSRB).selectByIndex(53);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.OpstiUsloviVIII2022.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022") : "Excepted Condition";
        assert mainPage.PosebniUsloviOsiguranjeLica.getText().equals("Posebni uslovi za osiguranje lica od posledica nesrećnog slučaja kao dopunski uslovi uz osiguranje života - PUNE II/2020") : "Excepted Condition";
        assert mainPage.TabelaInvaliditeta.getText().equals("Tabela invaliditeta za određivanje trajnog gubitka opšte radne sposobnosti usled nesrećnog slučaja - TI II/2020") : "Excepted Condition";


    }


    @Epic("sCore Serbia")
    @Feature("Conditions")
    @Description("Checking Conditions")
    @Step("Checking Conditions - Joker Old")
    @Owner("Nikola Stavrov")
    @Test(priority = 900)
    public void ConditionsJokerOld() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsSRB).selectByIndex(5);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.UŽDVI2021.getText().equals("Uslovi za osiguranje života za slucaj doživljenja - Džoker Plus od 12.07.2021. godine (UŽD VII/2021)") : "Excepted Condition";


    }


    @Epic("sCore Serbia")
    @Feature("Conditions")
    @Description("Checking Conditions")
    @Step("Checking Conditions - Riziko")
    @Owner("Nikola Stavrov")
    @Test(priority = 910)
    public void ConditionsRiziko() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsSRB).selectByIndex(2);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.05.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.OpstiUsloviVIII2022.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022") : "Excepted Condition";


    }


    @Epic("sCore Serbia")
    @Feature("Conditions")
    @Description("Checking Conditions")
    @Step("Checking Conditions - Riziko Kredit")
    @Owner("Nikola Stavrov")
    @Test(priority = 920)
    public void ConditionsRizikoKredit() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsSRB).selectByIndex(4);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.06.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.OpstiUsloviVIII2022.getText().equals("Opšti uslovi za osiguranje života OUŽ VIII/2022") : "Excepted Condition";
        assert mainPage.PUOOSII2020.getText().equals("Posebni uslovi za osiguranje života za slučaj smrti sa opadajućim osiguranim sumama - PUOOS II 2020") : "Excepted Condition";


    }


    @Epic("sCore Serbia")
    @Feature("Conditions")
    @Description("Checking Conditions")
    @Step("Checking Conditions - Dozivotni Riziko")
    @Owner("Nikola Stavrov")
    @Test(priority = 930)
    public void ConditionsDozivotniRiziko() throws Exception {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.Life.click();
        mainPage.SideMenu.click();
        mainPage.Search.click();
        new Select(mainPage.DocumentType).selectByIndex(5);
        new Select(mainPage.ProductsSRB).selectByIndex(58);
        new Select(mainPage.Status).selectByIndex(3);
        mainPage.DateOfContracting.click();
        mainPage.DateOfContracting.sendKeys("01.01.2024");
        mainPage.SearchMenu.click();
        mainPage.ImageSearch.click();
        mainPage.PreviewSRB.click();
        mainPage.TabClausesSRB.click();
        assert mainPage.OUŽVIII2022.getText().equals("Opšti uslovi za osiguranje života od 31.08.2022. godine (OUŽ VIII/2022)") : "Excepted Condition";
        assert mainPage.PUDOŽSIII2023.getText().equals("Posebni uslovi za doživotno osiguranje života za slučaj smrti od 01.03.2023 (PUDOŽS III/2023)") : "Excepted Condition";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 940)
    public void NewContractSpektar () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Spektar, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311982700247");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        ;
        mainPage.inputSumDozivljenje.sendKeys("5000");
        for (WebElement webElement : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            webElement.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }


    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar with vinculation - standard basic flow and standard bank")
    @Owner("Nikola Stavrov")
    @Test(priority = 950)
    public void NewContractVinculationSpektar () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Spektar, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Vinculation.click();
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311982700247");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumDozivljenje.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabVinculations, mainPage.AddVinculation)) {
            element.click();
        }
        new Select(mainPage.Creditor).selectByIndex(1);
        new Select(mainPage.FirstVinculationBank).selectByIndex(10);
        mainPage.CreditLoanNumber.sendKeys("123123321");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar with vinculation - standard basic flow and vinculation on person")
    @Owner("Nikola Stavrov")
    @Test(priority = 960)
    public void NewContractVinculationPersonSpektar () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Spektar, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Vinculation.click();
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311982700247");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumDozivljenje.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabVinculations, mainPage.AddVinculation)) {
            element.click();
        }
        new Select(mainPage.Creditor).selectByIndex(2);
        mainPage.inputNameVinculation.sendKeys("Nikola");
        mainPage.inputSurnameVinculation.sendKeys("Nikolic");
        mainPage.getInputIdentificationNumberVinculation.sendKeys("0403992700243");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar with vinculation - standard basic flow and vinculation on company")
    @Owner("Nikola Stavrov")
    @Test(priority = 970)
    public void NewContractVinculationCompanySpektar() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Spektar, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Vinculation.click();
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("0403972700247");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumDozivljenje.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabVinculations, mainPage.AddVinculation)) {
            element.click();
        }
        new Select(mainPage.Creditor).selectByIndex(3);
        mainPage.Naziv.sendKeys("Nikola Firma");
        mainPage.PIB.sendKeys("107205872");
        mainPage.MBR.sendKeys("107205872");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/*mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar with indexation - standard basic flow and indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 980)
    public void NewContractIndexationSpektar () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Spektar, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("13");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("0403972700247");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumDozivljenje.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Joker")
    @Step("Creating new contract of Joker - standard basic flow with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 990)
    public void NewContractIndexationJoker () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Joker, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("2410995710022");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Joker")
    @Step("Creating new contract of Joker - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 1000)
    public void NewContractJoker() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Joker, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("2410995710022");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko kredit")
    @Step("Creating new contract of Riziko kredit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 1010)
    public void NewContractRizikoKredit() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.RizikoKredit, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311992700245");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.sendKeys("15");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabVinculations, mainPage.AddVinculation)) {
            element.click();
        }
        new Select(mainPage.Creditor).selectByIndex(1);
        new Select(mainPage.FirstVinculationBank).selectByIndex(8);
        mainPage.CreditLoanNumber.sendKeys("4443335556");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko")
    @Step("Creating new contract of Riziko - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 1020)
    public void NewContractRiziko() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Riziko, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("20");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311992700245");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("25000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Joker Old")
    @Step("Creating new contract of Joker Old - basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 1030)
    public void NewContractJokerOld () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.JokerOld, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("3");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311992700245");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("3000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save)) {
            element.click();
        }
        Thread.sleep(2000);
        for (WebElement element : Arrays.asList(mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.UplatnicaPonuda, mainPage.image5, mainPage.PUIPonuda, mainPage.image6, mainPage.IOOPPonuda, mainPage.image7, mainPage.IzjavaPonuda,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("Čeka BOC") : "Expected status";
        mainPage.linkConfirmBOC.click();
        assert mainPage.StatusUgovora.getText().equals("Aktivirana ugovorena") : "Expected status";
        mainPage.CreatePolicy.click();
        mainPage.image.click();
        mainPage.Polisa.click();

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of SME KMP")
    @Step("Creating new contract of SME KMP - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 1040)
    public void NewContractSMEKMP() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.RizikoKredit, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.SMEKeyPerson.click();
        mainPage.DurationInYear.click();
        mainPage.DurationInYear.clear();
        mainPage.DurationInYear.sendKeys("5");
        mainPage.ContentPlaceHolder.click();
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(1);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.Valute).selectByIndex(5);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311992700245");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.sendKeys("15");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkTabVinculations, mainPage.AddVinculation)) {
            element.click();
        }
        mainPage.CreditLoanNumber.sendKeys("4443335556");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Dozivotni riziko")
    @Step("Creating new contract of Dozivotni riziko - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 1050)
    public void NewContractDozivotniRiziko() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.DozivotniRiziko, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1310960700247");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDeathBeneficiary.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("2000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Favorit")
    @Step("Creating new contract of Favorit - standard basic flow")
    @Owner("Nikola Stavrov")
    @Test(priority = 1060)
    public void NewContractFavorit() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Favorit, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311993700249");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(500, 0);");
        mainPage.DodajOsiguranik.click();
        Thread.sleep(2500);
        WebElement iFrame2 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame2));
        mainPage.IdentificationNumber.sendKeys("1105020700246");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(500, 0);");
        Thread.sleep(2500);
        mainPage.labelUgovaraPlatilacIstoLice.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Favorit")
    @Step("Creating new contract of Favorit - standard basic flow with indexation")
    @Owner("Nikola Stavrov")
    @Test(priority = 1070)
    public void NewContractIndexationFavorit() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Favorit, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click();
        }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.Indexation.click();
        new Select(mainPage.IndexValue).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1311993700249");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(500, 0);");
        mainPage.DodajOsiguranik.click();
        Thread.sleep(2500);
        WebElement iFrame2 = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame2));
        mainPage.IdentificationNumber.sendKeys("1105020700246");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click();
        }
        js.executeScript("window.scrollBy(500, 0);");
        Thread.sleep(2500);
        mainPage.labelUgovaraPlatilacIstoLice.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit.sendKeys("5000");
        for (WebElement element : Arrays.asList(mainPage.Accept, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click();
        }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000);
        }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";
    }


    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Joker")
    @Step("Creating new contract of Joker - Functionary")
    @Owner("Nikola Stavrov")
    @Test(priority = 1080)
    public void NewContractFunctionaryJoker () throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Joker, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("0906999700240");
        for (WebElement element : Arrays.asList(mainPage.ClientSearch, mainPage.ClientPreview, mainPage.ClientAccept)) {
            element.click(); }
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.UgovaraPlatilacIstoLice.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.AddDozivljenje.click();
        js.executeScript("window.scrollBy(-500, 0);");
        mainPage.inputOpis.sendKeys("Brat");
        mainPage.inputProcenat.sendKeys("100");
        mainPage.AcceptDeathBeneficiares.click();
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("4000");
        mainPage.HeightConcernPerson.sendKeys("180");
        mainPage.WeightConcernPerson.sendKeys("75");
        mainPage.inputSumTrajniInvaliditetKaoPosledicaNezgode.sendKeys("4000");
        mainPage.Accept.click();
        mainPage.Calculate.click();
        Thread.sleep(3000);
        assert mainPage.divOsiguranikStrani.getText().equals("Osiguranik strani funkcioner"): "Expected message";
        assert mainPage.divUgovaraStrani.getText().equals("Ugovarač strani funkcioner"): "Expected message";
        assert mainPage.divPlatilac.getText().equals("platilac funkcioner"): "Expected message";
        assert mainPage.divPlatilacPolitickiIzlozenaOsoba.getText().equals("platilac politicki izlozena osoba"): "Expected message";
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        for (WebElement element : Arrays.asList(mainPage.Activate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik, /* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("Čeka BOC"): "Expected document status";
        for (WebElement webElement : Arrays.asList(mainPage.linkConfirmBOC, mainPage.CreatePolicy, mainPage.image, mainPage.Polisa)) {
            webElement.click(); Thread.sleep(6000); }
        assert mainPage.StatusUgovora.getText().equals("Aktivirana ugovorena"): "Expected document status";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Spektar")
    @Step("Creating new contract of Spektar - FATCA person")
    @Owner("Nikola Stavrov")
    @Test(priority = 1090)
    public void NewContractFATCASpektar() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Spektar, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("10");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(2);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("0906998700247");
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
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("5000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        ;
        mainPage.inputSumDozivljenje.sendKeys("5000");
        for (WebElement webElement : Arrays.asList(mainPage.Accept, mainPage.SaveQuestionary, mainPage.Calculate, mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            webElement.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko kredit")
    @Step("Creating new contract of Riziko kredit - Risky occupation")
    @Owner("Nikola Stavrov")
    @Test(priority = 1100)
    public void NewContractRiskyOccupationRizikoKredit() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.RizikoKredit, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("18");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("0905988700242");
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
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("10000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.ConcernInterest.sendKeys("10");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        Thread.sleep(3000);
        assert mainPage.divZanimanje.getText().equals("Zanimanje"): "Expected message";
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.linkTabVinculations.click();
        mainPage.AddVinculation.click();
        new Select(mainPage.Creditor).selectByIndex(1);
        new Select(mainPage.FirstVinculationBank).selectByIndex(8);
        mainPage.CreditLoanNumber.sendKeys("12332144221");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("Čeka BOC i UW"): "Expected document status";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko kredit")
    @Step("Creating new contract of Riziko kredit - Occupation not listed")
    @Owner("Nikola Stavrov")
    @Test(priority = 1110)
    public void NewContractOccupationNotListedRizikoKredit() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.RizikoKredit, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("15");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(3);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        new Select(mainPage.DurationInMonths).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1005988700245");
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
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("9000");
        mainPage.HeightConcernPerson.sendKeys("179");
        mainPage.WeightConcernPerson.sendKeys("76");
        mainPage.ConcernInterest.sendKeys("9");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        Thread.sleep(3000);
        assert mainPage.divZanimanje.getText().equals("Zanimanje"): "Expected message";
        mainPage.TechnicalPersons.click();
        mainPage.TechnicalPersonsOpenSearch.click();
        mainPage.TechnicalPersonsOpenSearchSelect.click();
        mainPage.Save.click();
        mainPage.linkTabVinculations.click();
        mainPage.AddVinculation.click();
        new Select(mainPage.Creditor).selectByIndex(1);
        new Select(mainPage.FirstVinculationBank).selectByIndex(8);
        mainPage.CreditLoanNumber.sendKeys("12332144221");
        for (WebElement element : Arrays.asList(mainPage.linkAcceptVinculation, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("Čeka BOC i UW"): "Expected document status";

    }

    @Epic("sCore Serbia")
    @Feature("New Contract")
    @Description("Creating new contract of Riziko")
    @Step("Creating new contract of Riziko - Sports/Hobbies")
    @Owner("Nikola Stavrov")
    @Test(priority = 1120)
    public void NewContractSportsHobbiesRiziko() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        mainPage.inputUsername.sendKeys("sCoreUW");
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        for (WebElement element : Arrays.asList(mainPage.buttonLogin, mainPage.Life, mainPage.Riziko, mainPage.RibbonMenu, mainPage.NewDocument, mainPage.RibbonMenuNewContract)) {
            element.click(); }
        mainPage.DurationInYear.sendKeys("11");
        mainPage.ContentPlaceHolder.sendKeys("Beograd");
        mainPage.ContentPlaceHolder1.click();
        new Select(mainPage.PaymentDinamic).selectByIndex(4);
        new Select(mainPage.Clause).selectByIndex(1);
        new Select(mainPage.PaymentMethod).selectByIndex(1);
        mainPage.TabPersons.click();
        mainPage.UgovaraOsiguranikIstoLice2.click();
        mainPage.Dodaj.click();
        Thread.sleep(2500);
        WebElement iFrame = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
        mainPage.IdentificationNumber.sendKeys("1105988700240");
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
        mainPage.TabConcerns.click();
        new Select(mainPage.InsuredSum).selectByIndex(1);
        mainPage.InsuredSumOrPremium.sendKeys("15000");
        mainPage.HeightConcernPerson.sendKeys("190");
        mainPage.WeightConcernPerson.sendKeys("85");
        mainPage.Accept.click();
        mainPage.SaveQuestionary.click();
        mainPage.Calculate.click();
        Thread.sleep(3000);
        assert mainPage.divZanimanje.getText().equals("Sport/ hobi"): "Expected message";
        for (WebElement element : Arrays.asList(mainPage.TechnicalPersons, mainPage.TechnicalPersonsOpenSearch, mainPage.TechnicalPersonsOpenSearchSelect, mainPage.Save, mainPage.linkActivate, mainPage.linkTabMoneyLaundry, mainPage.labelStednja, mainPage.labelZaposlen, mainPage.labelStalniZaradaPorodiPrimanja, mainPage.linkAcceptMoneyLaundry, mainPage.linkTabAssociateMoneyLaundry, mainPage.labelRadioInline, mainPage.labelRadioInline2, mainPage.labelRadioInline3, mainPage.labelRadioInline4, mainPage.labelRadioInline5, mainPage.linkAcceptMoneyLaundry2, mainPage.linkTabPrintouts)) {
            element.click(); }
        for (WebElement webElement : Arrays.asList(mainPage.image, mainPage.Polisa, mainPage.image2, mainPage.AMLKlijent, mainPage.image3, mainPage.AMLSaradnik,/* mainPage.image4, mainPage.PotvrdaZaPreuzimanje, mainPage.image5, mainPage.PropratnoPismo, mainPage.image6, mainPage.Uplatnica, mainPage.image7, mainPage.PUI, mainPage.image8, mainPage.Izjava, mainPage.image9, mainPage.IOOPSRB,*/ mainPage.linkCertificationSignature)) {
            webElement.click();
            Thread.sleep(6000); }
        assert mainPage.CertificationSignatureMessage.getText().equals("Potvrda potpisa uspešno urađena.") : "Expected message after Certification signature";
        assert mainPage.StatusUgovora.getText().equals("Čeka BOC i UW"): "Expected document status";
}

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    }









