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
    @Step("Side menu - Premium return")
    @Owner("Nikola Stavrov")
    @Test(priority = 20)
    public void SideMenuPremiumReturn() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PovratPremije.getText().equals("Povrat premije"): "Expected label";
        mainPage.PovratPremijePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Transfer of payment")
    @Owner("Nikola Stavrov")
    @Test(priority = 30)
    public void SideMenuTransferOfPayment() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PreknjizenjeUplate.getText().equals("Preknjizenje uplate"): "Expected label";
        mainPage.PreknjizenjeUplatePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Change of address")
    @Owner("Nikola Stavrov")
    @Test(priority = 40)
    public void SideMenuChangeOfAddress() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PromenaAdrese.getText().equals("Promena adrese"): "Expected label";
        mainPage.PromenaAdresePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Change of user")
    @Owner("Nikola Stavrov")
    @Test(priority = 50)
    public void SideMenuChangeOfUser() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PromenaKorisnika.getText().equals("Promena korisnika"): "Expected label";
        mainPage.PromenaKorisnikaPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Change of surname")
    @Owner("Nikola Stavrov")
    @Test(priority = 60)
    public void SideMenuChangeOfSurname() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PromenaPrezimena.getText().equals("Promena prezimena") : "Expected label";
        mainPage.PromenaPrezimenaPrint.click();

    }


    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Change of contract holder")
    @Owner("Nikola Stavrov")
    @Test(priority = 70)
    public void SideMenuChangeOfContractHolder() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PromenaUgovaraca.getText().equals("Promena ugovarača") : "Expected label";
        mainPage.PromenaUgovaracaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Request for life payment")
    @Owner("Nikola Stavrov")
    @Test(priority = 80)
    public void SideMenuRequestForLifePayment() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.ZahtevIsplatuZivot.getText().equals("Zahtev za isplatu_zivot") : "Expected label";
        mainPage.ZahtevIsplatuZivotPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Request for issuing a duplicate policy")
    @Owner("Nikola Stavrov")
    @Test(priority = 90)
    public void SideMenuRequestDuplicatePolicy() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.ZahtevDuplikatPolise.getText().equals("Zahtev za izdavanje duplikata polise") : "Expected label";
        mainPage.ZahtevDuplikatPolisePrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Advance request")
    @Owner("Nikola Stavrov")
    @Test(priority = 100)
    public void SideMenuAdvanceRequest() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.ZahtevPredujam.getText().equals("ZAHTEV ZA PREDUJAM") : "Expected label";
        mainPage.ZahtevPredujamPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Request for change of contractual elements")
    @Owner("Nikola Stavrov")
    @Test(priority = 110)
    public void SideMenuRequestChangeContractualElements() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.ZahtevPromenuUgovornihElemenata.getText().equals("Zahtev za promenu ugovornih elemenata") : "Expected label";
        mainPage.ZahtevPromenuUgovornihElemenataPrint.click();

    }

        @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Favorit PUI")
    @Owner("Nikola Stavrov")
    @Test(priority = 120)
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
    @Test(priority = 130)
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
    @Test(priority = 140)
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
    @Test(priority = 150)
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
    @Step("Side menu - Lab1 and Lab2")
    @Owner("Nikola Stavrov")
    @Test(priority = 160)
    public void SideMenuLab1Lab2() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.Lab1Lab2.getText().equals("Lab 1 i Lab 2"): "Expected label";
        mainPage.Lab1Lab2Print.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Health status declaration")
    @Owner("Nikola Stavrov")
    @Test(priority = 170)
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
    @Step("Side menu - A+")
    @Owner("Nikola Stavrov")
    @Test(priority = 180)
    public void SideMenuA() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.MedicinskiA.getText().equals("Medicinski izvestaj A+"): "Expected label";
        mainPage.MedicinskiAPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - B")
    @Owner("Nikola Stavrov")
    @Test(priority = 190)
    public void SideMenuB() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.MedicinskiB.getText().equals("Medicinski izvestaj B") : "Expected label";
        mainPage.MedicinskiBPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - List of health institutions")
    @Owner("Nikola Stavrov")
    @Test(priority = 200)
    public void SideMenuHealthInstitutions() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.SpisakUstanova.getText().equals("Spisak zdravstvenih ustanova") : "Expected label";
        mainPage.SpisakUstanovaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Allergy questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 210)
    public void SideMenuAllergyQuestionnaire() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikAlergije.getText().equals("upitnik alergije") : "Expected label";
        mainPage.UpitnikAlergijePrint.click();

    }



@Epic("POS Bank")
@Feature("Side menu")
@Description("Checking and printing documents from Side menu")
@Step("Side menu - Kidney and urinary diseases questionnaire")
@Owner("Nikola Stavrov")
@Test(priority = 220)
public void SideMenuKidneyUrinaryDiseases() throws InterruptedException {

    mainPage.inputUsername.click();
    mainPage.inputUsername.sendKeys("Raiff_yuajko");
    mainPage.inputPassword.click();
    mainPage.inputPassword.sendKeys("OvoJ3Test");
    mainPage.buttonLogin.click();
    mainPage.LifeInsurance.click();
    mainPage.SideMenuPOS.click();
    mainPage.SideMenuLifeInsurance.click();
    Thread.sleep(2000);
    assert mainPage.UpitnikUrinarna.getText().equals("upitnik bubrezna i urinarna oboljenja") : "Expected label";
    mainPage.UpitnikUrinarnaPrint.click();

}

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Diabetes questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 230)
    public void SideMenuDiabetes() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikDijabetes.getText().equals("upitnik dijabetes") : "Expected label";
        mainPage.UpitnikDijabetesPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Epilepsy questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 240)
    public void SideMenuEpilepsy () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikEpilepsija.getText().equals("epilepsy questionnaire") : "Expected label";
        mainPage.UpitnikEpilepsijaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire genitourinary problems-diseases")
    @Owner("Nikola Stavrov")
    @Test(priority = 250)
    public void SideMenuGenitourinary () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikGenitourinarniProblemi.getText().equals("upitnik genitourinarni problemi-oboljenja") : "Expected label";
        mainPage.UpitnikGenitourinarniProblemiPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Question mark kidney stone")
    @Owner("Nikola Stavrov")
    @Test(priority = 260)
    public void SideMenuKidneyStone () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikKamenBubregu.getText().equals("upitnik kamen u bubregu") : "Expected label";
        mainPage.UpitnikKamenBubreguPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Skin diseases questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 270)
    public void SideMenuSkinDisease () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikKoznaOboljenja.getText().equals("upitnik kozna oboljenja") : "Expected label";
        mainPage.UpitnikKoznaOboljenjaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Crohn's disease questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 280)
    public void SideMenuCrohnDisease () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikKronovaBolest.getText().equals("upitnik Kronova bolest") : "Expected label";
        mainPage.UpitnikKronovaBolestPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire of neurological and mental diseases")
    @Owner("Nikola Stavrov")
    @Test(priority = 290)
    public void SideMenuNeurologicalMentalDiseases () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikNeuroloskaMentalna.getText().equals("upitnik neuroloska i mentalna oboljenja") : "Expected label";
        mainPage.UpitnikNeuroloskaMentalnaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire respiratory diseases")
    @Owner("Nikola Stavrov")
    @Test(priority = 300)
    public void SideMenuRespiratoryDiseases () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikDisajnihOrgana.getText().equals("upitnik oboljenje disajnih organa") : "Expected label";
        mainPage.UpitnikDisajnihOrganaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Bone, muscle and joint disease questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 310)
    public void SideMenuBoneMuscleDisease () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikKostijuMisica.getText().equals("upitnik oboljenje kostiju, misica i zglobova") : "Expected label";
        mainPage.UpitnikKostijuMisicaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Mole surgery questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 320)
    public void SideMenuMoleSurgery () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikOperacijaMladez.getText().equals("upitnik operacija mladeža") : "Expected label";
        mainPage.UpitnikOperacijaMladezPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Injury questionnaire after traffic an accident")
    @Owner("Nikola Stavrov")
    @Test(priority = 330)
    public void SideMenuInjuryTraffic () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikPovredaNakonSaobracajneNesrece.getText().equals("upitnik povreda nakon saobr. nesrece") : "Expected label";
        mainPage.UpitnikPovredaNakonSaobracajneNesrecePrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Head injury questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 340)
    public void SideMenuHeadInjury () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikPovredeGlave.getText().equals("upitnik povrede glave") : "Expected label";
        mainPage.UpitnikPovredeGlavePrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Rheumatoid arthritis questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 350)
    public void SideMenuRheumatoidArthritis () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikReumatoidniArtritis.getText().equals("upitnik reumatoidni artritis") : "Expected label";
        mainPage.UpitnikReumatoidniArtritisPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Thyroid disorder questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 360)
    public void SideMenuThyroidDisorder () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikPoremecajStitne.getText().equals("upitnik za poremecaj stitne zlezde") : "Expected label";
        mainPage.UpitnikPoremecajStitnePrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - High blood pressure questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 370)
    public void SideMenuHighBloodPressure () throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikViskokPritisak.getText().equals("upitnik za viskok krvni pritisak") : "Expected label";
        mainPage.UpitnikViskokPritisakPrint.click();

    }


    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Health status declaration")
    @Owner("Nikola Stavrov")
    @Test(priority = 380)
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
