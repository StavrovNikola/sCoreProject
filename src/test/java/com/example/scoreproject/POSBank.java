package com.example.scoreproject;

import io.qameta.allure.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class POSBank {

    private MainPage mainPage;


    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://qa-score.uniqa.rs/scorepos/");
        mainPage = new MainPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;


    }

    //INFO OFFERS
    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Policy activation")
    @Owner("Nikola Stavrov")
    @Test(priority = 10)
    public void SideMenuPolicyActivation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.AktiviranjePolise.getText().equals("Aktiviranje polise"): "Expected label";
        mainPage.AktiviranjePolisePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Favorit PUI")
    @Owner("Nikola Stavrov")
    @Test(priority = 20)
    public void SideMenuFavoritPUI() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.FavoritPUI.getText().equals("Informacija-Favorit"): "Expected label";
        mainPage.FavoritPUIPrint.click();



    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Riziko kredit PUI")
    @Owner("Nikola Stavrov")
    @Test(priority = 30)
    public void SideMenuRizikoKreditPUI() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.RizikoKreditPUI.getText().equals("Informacija-Riziko kredit"): "Expected label";
        mainPage.RizikoKreditPUIPrint.click();



    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Spektar PUI")
    @Owner("Nikola Stavrov")
    @Test(priority = 40)
    public void SideMenuSpektarPUI() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.SpektarPUI.getText().equals("Informacija-Spektar"): "Expected label";
        mainPage.SpektarPUIPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - IOOP")
    @Owner("Nikola Stavrov")
    @Test(priority = 50)
    public void SideMenuIOOP() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.IOOP.getText().equals("Izjava ZZPL ž"): "Expected label";
        mainPage.IOOPPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Health status declaration")
    @Owner("Nikola Stavrov")
    @Test(priority = 60)
    public void SideMenuHealthStatus() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.IzjavaZS.getText().equals("Izjava o zdravstvenom stanju"): "Expected label";
        mainPage.IzjavaZSPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Health status declaration")
    @Owner("Nikola Stavrov")
    @Test(priority = 70)
    public void SideMenuZU() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.ZU.getText().equals("Zdravstveni upitnik"): "Expected label";
        mainPage.ZUPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - FATCA")
    @Owner("Nikola Stavrov")
    @Test(priority = 80)
    public void SideMenuFATCA() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.FATCA.getText().equals("Fatca"): "Expected label";
        mainPage.FATCAPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Client Questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 90)
    public void SideMenuClientQuestionnaire() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.ClientQuestionnaire.getText().equals("Upitnik za klijente"): "Expected label";
        mainPage.ClientQuestionnairePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - User Questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 100)
    public void SideMenuUserQuestionnaire() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UserQuestionnaire.getText().equals("Upitnik za korisnika"): "Expected label";
        mainPage.UserQuestionnairePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - PEP Questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 110)
    public void SideMenuPEPQuestionnaire() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PEPQuestionnaire.getText().equals("Upitnik za politički izložene osobe-fizičko lice"): "Expected label";
        mainPage.PEPQuestionnairePrint.click();


    }


    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Company Questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 120)
    public void SideMenuCompanyQuestionnaire() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.CompanyQuestionnaire.getText().equals("Upitnik za ugovarača osiguranja-privredno društvo"): "Expected label";
        mainPage.CompanyQuestionnairePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Associates Questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 130)
    public void SideMenuAssociatesQuestionnaire() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.AssociatesQuestionnaire.getText().equals("Upitnik za saradnike"): "Expected label";
        mainPage.AssociatesQuestionnairePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - General Conditions")
    @Owner("Nikola Stavrov")
    @Test(priority = 140)
    public void SideMenuGeneralConditions() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.GeneralConditions.getText().equals("Opsti uslovi"): "Expected label";
        mainPage.GeneralConditionsPrint.click();


    }

}
