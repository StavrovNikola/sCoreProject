package com.example;
import io.qameta.allure.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Arrays;


public class POSBankTest {

    private MainPage mainPage;
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
        assert mainPage.UpitnikEpilepsija.getText().equals("upitnik epilepsija") : "Expected label";
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
    @Test(priority = 390)
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
    @Test(priority = 400)
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
    @Test(priority = 410)
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
    @Test(priority = 420)
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
    @Test(priority = 430)
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
    @Test(priority = 440)
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
    @Step("Side menu - Query occupation MUP")
    @Owner("Nikola Stavrov")
    @Test(priority = 450)
    public void SideMenuOccupationMUP() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitZanimanjeMup.getText().equals("Upit zanimanje MUP"): "Expected label";
        mainPage.UpitZanimanjeMupPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire - hunting")
    @Owner("Nikola Stavrov")
    @Test(priority = 460)
    public void SideMenuHunting() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikLovom.getText().equals("upitnik - bavljenje lovom"): "Expected label";
        mainPage.UpitnikLovomPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire of aviation")
    @Owner("Nikola Stavrov")
    @Test(priority = 470)
    public void SideMenuAviation() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikAvijacija.getText().equals("Upitnik avijacija"): "Expected label";
        mainPage.UpitnikAvijacijaPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire cycling")
    @Owner("Nikola Stavrov")
    @Test(priority = 480)
    public void SideMenuCycling() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikBiciklizam.getText().equals("Upitnik biciklizam"): "Expected label";
        mainPage.UpitnikBiciklizamPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Martial arts questionnaire")
    @Owner("Nikola Stavrov")
    @Test(priority = 490)
    public void SideMenuMartialArts() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikBorilackeVestine.getText().equals("Upitnik borilacke vestine"): "Expected label";
        mainPage.UpitnikBorilackeVestinePrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire football")
    @Owner("Nikola Stavrov")
    @Test(priority = 500)
    public void SideMenuFootball() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikFudbal.getText().equals("Upitnik fudbal"): "Expected label";
        mainPage.UpitnikFudbalPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire basketball")
    @Owner("Nikola Stavrov")
    @Test(priority = 510)
    public void SideMenuBasketball() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikKosarka.getText().equals("Upitnik kosarka"): "Expected label";
        mainPage.UpitnikKosarkaPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire motor sport")
    @Owner("Nikola Stavrov")
    @Test(priority = 520)
    public void SideMenuMotoSport() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikMotoSport.getText().equals("Upitnik moto sport"): "Expected label";
        mainPage.UpitnikMotoSportPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire volleyball")
    @Owner("Nikola Stavrov")
    @Test(priority = 530)
    public void SideMenuVolleyball() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikOdbojka.getText().equals("Upitnik odbojka"): "Expected label";
        mainPage.UpitnikOdbojkaPrint.click();


    }
    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire skydiving")
    @Owner("Nikola Stavrov")
    @Test(priority = 540)
    public void SideMenuSkydiving() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikPadobranstvo.getText().equals("upitnik padobranstvo"): "Expected label";
        mainPage.UpitnikPadobranstvoPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire paragliding")
    @Owner("Nikola Stavrov")
    @Test(priority = 550)
    public void SideMenuParagliding() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikParaglajding.getText().equals("upitnik paraglajding"): "Expected label";
        mainPage.UpitnikParaglajdingPrint.click();

    }
    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire hiking")
    @Owner("Nikola Stavrov")
    @Test(priority = 560)
    public void SideMenuHiking() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikPlaninarenje.getText().equals("upitnik planinarenje"): "Expected label";
        mainPage.UpitnikPlaninarenjePrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire seaman")
    @Owner("Nikola Stavrov")
    @Test(priority = 570)
    public void SideMenuSeaman() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikPomorac.getText().equals("upitnik pomorac"): "Expected label";
        mainPage.UpitnikPomoracPrint.click();

    }
    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire diving")
    @Owner("Nikola Stavrov")
    @Test(priority = 580)
    public void SideMenuDiving() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikPomorac.getText().equals("upitnik ronjenje"): "Expected label";
        mainPage.UpitnikPomoracPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire miners")
    @Owner("Nikola Stavrov")
    @Test(priority = 590)
    public void SideMenuMiners() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikPomorac.getText().equals("Upitnik rudari"): "Expected label";
        mainPage.UpitnikPomoracPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire handball")
    @Owner("Nikola Stavrov")
    @Test(priority = 600)
    public void SideMenuHandball() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikRukomet.getText().equals("Upitnik rukomet"): "Expected label";
        mainPage.UpitnikRukometPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire firefighter")
    @Owner("Nikola Stavrov")
    @Test(priority = 610)
    public void SideMenuFireFighter() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikVatrogasac.getText().equals("upitnik vatrogasac"): "Expected label";
        mainPage.UpitnikVatrogasacPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire for profession, sport, hobby and travel")
    @Owner("Nikola Stavrov")
    @Test(priority = 620)
    public void SideMenuSportHoby() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikZanimanjeSportHobi.getText().equals("Upitnik za zanimanje sport hobi i putovanje"): "Expected label";
        mainPage.UpitnikZanimanjeSportHobiPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Questionnaire for winter sports")
    @Owner("Nikola Stavrov")
    @Test(priority = 630)
    public void SideMenuWinterSports() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikZimskeSportove.getText().equals("Upitnik za zimske sportove"): "Expected label";
        mainPage.UpitnikZimskeSportovePrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - The questionnaire is of interest to Security")
    @Owner("Nikola Stavrov")
    @Test(priority = 640)
    public void SideMenuSecurity() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UpitnikZanimanjeObezbedjenje.getText().equals("Upitnik zanimaje Obezbedjenje"): "Expected label";
        mainPage.UpitnikZanimanjeObezbedjenjePrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Additional daily fee")
    @Owner("Nikola Stavrov")
    @Test(priority = 650)
    public void SideMenuAdditionalDaily() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.DopunskoNaknada.getText().equals("Dopunsko dnevna naknada"): "Expected label";
        mainPage.DopunskoNaknadaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Additional accident")
    @Owner("Nikola Stavrov")
    @Test(priority = 660)
    public void SideMenuAdditionaAccident() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.DopunskoNezgoda.getText().equals("Dopunsko nezgoda"): "Expected label";
        mainPage.DopunskoNezgodaPrint.click();

    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - General Conditions")
    @Owner("Nikola Stavrov")
    @Test(priority = 670)
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

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Special conditions bone fracture")
    @Owner("Nikola Stavrov")
    @Test(priority = 680)
    public void SideMenuBoneFracture() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PosebniUsloviLomKostiju.getText().equals("Posebni uslovi lom kostiju"): "Expected label";
        mainPage.PosebniUsloviLomKostijuPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Special conditions temporary work incapacity")
    @Owner("Nikola Stavrov")
    @Test(priority = 690)
    public void SideMenuWorkIncapacity() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.PosebniUsloviPrivremenaRadna.getText().equals("Posebni uslovi privremena radna nesposobnost"): "Expected label";
        mainPage.PosebniUsloviPrivremenaRadnaPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Joker Plus conditions")
    @Owner("Nikola Stavrov")
    @Test(priority = 700)
    public void SideMenuJokerPlusConditions() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.DzokerPlus.getText().equals("Uslovi Dzoker plus"): "Expected label";
        mainPage.DzokerPlusPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Table of disabilities")
    @Owner("Nikola Stavrov")
    @Test(priority = 710)
    public void SideMenuDisabilitiesTable() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.TabelaInvaliditetaPOS.getText().equals("Tabela invaliditeta"): "Expected label";
        mainPage.TabelaInvaliditetaPOSPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - HI disease conditions")
    @Owner("Nikola Stavrov")
    @Test(priority = 720)
    public void SideMenuHIDisease() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UsloviHIBolesti.getText().equals("Uslovi HI bolesti"): "Expected label";
        mainPage.UsloviHIBolestiPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - HI accident conditions")
    @Owner("Nikola Stavrov")
    @Test(priority = 730)
    public void SideMenuHIAccident() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UsloviHINezgoda.getText().equals("Uslovi HI nezgoda"): "Expected label";
        mainPage.UsloviHINezgodaPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Riziko Kredit conditions")
    @Owner("Nikola Stavrov")
    @Test(priority = 740)
    public void SideMenuRizikoKreditConditions() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UsloviRizikoKredit.getText().equals("Uslovi Riziko kredit"): "Expected label";
        mainPage.UsloviRizikoKreditPrint.click();


    }


    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Conditions Serious illness")
    @Owner("Nikola Stavrov")
    @Test(priority = 750)
    public void SideMenuConditionsIllness() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UsloviTezeBolesti.getText().equals("Uslovi Teže bolesti"): "Expected label";
        mainPage.UsloviTezeBolestiPrint.click();


    }

    @Epic("POS Bank")
    @Feature("Side menu")
    @Description("Checking and printing documents from Side menu")
    @Step("Side menu - Conditions for child insurance")
    @Owner("Nikola Stavrov")
    @Test(priority = 750)
    public void SideMenuChildInsurance() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SideMenuPOS.click();
        mainPage.SideMenuLifeInsurance.click();
        Thread.sleep(2000);
        assert mainPage.UsloviOsiguranjeDece.getText().equals("Uslovi za osiguranje dece"): "Expected label";
        mainPage.UsloviOsiguranjeDecePrint.click();


    }

    @Epic("POS Bank")
    @Feature("New contract")
    @Description("Creating new contract")
    @Step("Creating new contract - Spektar kompakt package")
    @Owner("Nikola Stavrov")
    @Test(priority = 760)
    public void SpektarKompakt() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SpektarPOS.click();
        mainPage.ClientName.click();
        mainPage.ClientName.sendKeys("Petar Petrovic");
        mainPage.inputDateBirth.click();
        mainPage.inputDateBirth.sendKeys("01.02.1992");
        mainPage.inputGender.click();
        mainPage.inputHeight.click();
        mainPage.inputHeight.sendKeys("190");
        mainPage.inputWeight.click();
        mainPage.inputWeight.sendKeys("80");
       // mainPage.inputDurationInsuranceYears.click();
        //Thread.sleep(2500);
      //  mainPage.inputDurationInsuranceYears.clear();
      //  mainPage.inputDurationInsuranceYears.sendKeys("20");
        mainPage.inputIndexation.click();
        mainPage.inputCalculationBase.click();
        mainPage.inputAmount.click();
        mainPage.inputAmount.clear();
        mainPage.inputAmount.sendKeys("15000");
        mainPage.PrikaziPakete.click();
        mainPage.Kompakt.click();
        //mainPage.InfoOfferPrint.click();
        mainPage.Ugovaranje.click();
        mainPage.Checkbox.click();
        mainPage.inputIdentificationNumber.click();
        mainPage.inputIdentificationNumber.sendKeys("0102992700243");
        mainPage.JMBGSearch.click();
        mainPage.inputPostOfficeAddressSame.click();
        mainPage.inputHasNotification.click();
        for (WebElement webElement : Arrays.asList(mainPage.NextPagePerson, mainPage.NextPageKorisnik, mainPage.NextPageZU)) {
            webElement.click(); Thread.sleep(6000); }
        for (WebElement webElement : Arrays.asList(mainPage.inputStednja, mainPage.inputZaposlen, mainPage.inputStalniZaradaPorodiPrimanja, mainPage.LosaReputacija, mainPage.TajnostTransakcija, mainPage.Identifikacija, mainPage.Transakcija, mainPage.InformacijeKlijent)) {
            webElement.click(); Thread.sleep(2000); }
        for (WebElement webElement : Arrays.asList(mainPage.NextPageAML, mainPage.NextPagePlacanje, mainPage.spanAktiviraj, mainPage.PrintOffer, mainPage.UplatnicaPrint, mainPage.PotvrdaPotpisa)) {
            webElement.click(); Thread.sleep(6000); }


    }

    @Epic("POS Bank")
    @Feature("New contract")
    @Description("Creating new contract")
    @Step("Creating new contract - Spektar optimum package")
    @Owner("Nikola Stavrov")
    @Test(priority = 770)
    public void SpektarOptimum() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SpektarPOS.click();
        mainPage.ClientName.click();
        mainPage.ClientName.sendKeys("Petar Petrovic");
        mainPage.inputDateBirth.click();
        mainPage.inputDateBirth.sendKeys("01.02.1992");
        mainPage.inputGender.click();
        mainPage.inputHeight.click();
        mainPage.inputHeight.sendKeys("190");
        mainPage.inputWeight.click();
        mainPage.inputWeight.sendKeys("80");
        // mainPage.inputDurationInsuranceYears.click();
        //Thread.sleep(2500);
        //  mainPage.inputDurationInsuranceYears.clear();
        //  mainPage.inputDurationInsuranceYears.sendKeys("20");
        mainPage.inputIndexation.click();
        mainPage.inputCalculationBase.click();
        mainPage.inputAmount.click();
        mainPage.inputAmount.clear();
        mainPage.inputAmount.sendKeys("15000");
        mainPage.PrikaziPakete.click();
        mainPage.Optimum.click();
        //mainPage.InfoOfferPrint.click();
        mainPage.Ugovaranje.click();
        mainPage.Checkbox.click();
        mainPage.inputIdentificationNumber.click();
        mainPage.inputIdentificationNumber.sendKeys("0102992700243");
        mainPage.JMBGSearch.click();
        mainPage.inputPostOfficeAddressSame.click();
        mainPage.inputHasNotification.click();
        for (WebElement webElement : Arrays.asList(mainPage.NextPagePerson, mainPage.NextPageKorisnik, mainPage.NextPageZU)) {
            webElement.click(); Thread.sleep(6000); }
        for (WebElement webElement : Arrays.asList(mainPage.inputStednja, mainPage.inputZaposlen, mainPage.inputStalniZaradaPorodiPrimanja, mainPage.LosaReputacija, mainPage.TajnostTransakcija, mainPage.Identifikacija, mainPage.Transakcija, mainPage.InformacijeKlijent)) {
            webElement.click(); Thread.sleep(2000); }
        for (WebElement webElement : Arrays.asList(mainPage.NextPageAML, mainPage.NextPagePlacanje, mainPage.spanAktiviraj, mainPage.PrintOffer, mainPage.UplatnicaPrint, mainPage.PotvrdaPotpisa)) {
            webElement.click(); Thread.sleep(6000); }


    }

    @Epic("POS Bank")
    @Feature("New contract")
    @Description("Creating new contract")
    @Step("Creating new contract - Spektar premium package")
    @Owner("Nikola Stavrov")
    @Test(priority = 780)
    public void SpektarPremium() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SpektarPOS.click();
        mainPage.ClientName.click();
        mainPage.ClientName.sendKeys("Petar Petrovic");
        mainPage.inputDateBirth.click();
        mainPage.inputDateBirth.sendKeys("01.02.1992");
        mainPage.inputGender.click();
        mainPage.inputHeight.click();
        mainPage.inputHeight.sendKeys("190");
        mainPage.inputWeight.click();
        mainPage.inputWeight.sendKeys("80");
        // mainPage.inputDurationInsuranceYears.click();
        //Thread.sleep(2500);
        //  mainPage.inputDurationInsuranceYears.clear();
        //  mainPage.inputDurationInsuranceYears.sendKeys("20");
        mainPage.inputIndexation.click();
        mainPage.inputCalculationBase.click();
        mainPage.inputAmount.click();
        mainPage.inputAmount.clear();
        mainPage.inputAmount.sendKeys("15000");
        mainPage.PrikaziPakete.click();
        mainPage.Premium.click();
        //mainPage.InfoOfferPrint.click();
        mainPage.Ugovaranje.click();
        mainPage.Checkbox.click();
        mainPage.inputIdentificationNumber.click();
        mainPage.inputIdentificationNumber.sendKeys("0102992700243");
        mainPage.JMBGSearch.click();
        mainPage.inputPostOfficeAddressSame.click();
        mainPage.inputHasNotification.click();
        for (WebElement webElement : Arrays.asList(mainPage.NextPagePerson, mainPage.NextPageKorisnik, mainPage.NextPageZU)) {
            webElement.click(); Thread.sleep(6000); }
        for (WebElement webElement : Arrays.asList(mainPage.inputStednja, mainPage.inputZaposlen, mainPage.inputStalniZaradaPorodiPrimanja, mainPage.LosaReputacija, mainPage.TajnostTransakcija, mainPage.Identifikacija, mainPage.Transakcija, mainPage.InformacijeKlijent)) {
            webElement.click(); Thread.sleep(2000); }
        for (WebElement webElement : Arrays.asList(mainPage.NextPageAML, mainPage.NextPagePlacanje, mainPage.spanAktiviraj, mainPage.PrintOffer, mainPage.UplatnicaPrint, mainPage.PotvrdaPotpisa)) {
            webElement.click(); Thread.sleep(6000); }


    }

    @Epic("POS Bank")
    @Feature("New contract")
    @Description("Creating new contract")
    @Step("Creating new contract - Spektar teže bolesti package")
    @Owner("Nikola Stavrov")
    @Test(priority = 790)
    public void SpektarTezeBolesti() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SpektarPOS.click();
        mainPage.ClientName.click();
        mainPage.ClientName.sendKeys("Petar Petrovic");
        mainPage.inputDateBirth.click();
        mainPage.inputDateBirth.sendKeys("01.02.1992");
        mainPage.inputGender.click();
        mainPage.inputHeight.click();
        mainPage.inputHeight.sendKeys("190");
        mainPage.inputWeight.click();
        mainPage.inputWeight.sendKeys("80");
        // mainPage.inputDurationInsuranceYears.click();
        //Thread.sleep(2500);
        //  mainPage.inputDurationInsuranceYears.clear();
        //  mainPage.inputDurationInsuranceYears.sendKeys("20");
        mainPage.inputIndexation.click();
        mainPage.inputCalculationBase.click();
        mainPage.inputAmount.click();
        mainPage.inputAmount.clear();
        mainPage.inputAmount.sendKeys("15000");
        mainPage.PrikaziPakete.click();
        mainPage.TezeBolestiPaket.click();
        //mainPage.InfoOfferPrint.click();
        mainPage.Ugovaranje.click();
        mainPage.Checkbox.click();
        mainPage.inputIdentificationNumber.click();
        mainPage.inputIdentificationNumber.sendKeys("0102992700243");
        mainPage.JMBGSearch.click();
        mainPage.inputPostOfficeAddressSame.click();
        mainPage.inputHasNotification.click();
        for (WebElement webElement : Arrays.asList(mainPage.NextPagePerson, mainPage.NextPageKorisnik, mainPage.NextPageZU)) {
            webElement.click(); Thread.sleep(6000); }
        for (WebElement webElement : Arrays.asList(mainPage.inputStednja, mainPage.inputZaposlen, mainPage.inputStalniZaradaPorodiPrimanja, mainPage.LosaReputacija, mainPage.TajnostTransakcija, mainPage.Identifikacija, mainPage.Transakcija, mainPage.InformacijeKlijent)) {
            webElement.click(); Thread.sleep(2000); }
        for (WebElement webElement : Arrays.asList(mainPage.NextPageAML, mainPage.NextPagePlacanje, mainPage.spanAktiviraj, mainPage.PrintOffer, mainPage.UplatnicaPrint, mainPage.PotvrdaPotpisa)) {
            webElement.click(); Thread.sleep(6000); }


    }

    @Epic("POS Bank")
    @Feature("New contract")
    @Description("Creating new contract")
    @Step("Creating new contract - Spektar teže bolesti plus package")
    @Owner("Nikola Stavrov")
    @Test(priority = 800)
    public void SpektarTezeBolestiPlus() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SpektarPOS.click();
        mainPage.ClientName.click();
        mainPage.ClientName.sendKeys("Petar Petrovic");
        mainPage.inputDateBirth.click();
        mainPage.inputDateBirth.sendKeys("01.02.1992");
        mainPage.inputGender.click();
        mainPage.inputHeight.click();
        mainPage.inputHeight.sendKeys("190");
        mainPage.inputWeight.click();
        mainPage.inputWeight.sendKeys("80");
        // mainPage.inputDurationInsuranceYears.click();
        //Thread.sleep(2500);
        //  mainPage.inputDurationInsuranceYears.clear();
        //  mainPage.inputDurationInsuranceYears.sendKeys("20");
        mainPage.inputIndexation.click();
        mainPage.inputCalculationBase.click();
        mainPage.inputAmount.click();
        mainPage.inputAmount.clear();
        mainPage.inputAmount.sendKeys("15000");
        mainPage.PrikaziPakete.click();
        mainPage.TezeBolestiPlus.click();
        //mainPage.InfoOfferPrint.click();
        mainPage.Ugovaranje.click();
        mainPage.Checkbox.click();
        mainPage.inputIdentificationNumber.click();
        mainPage.inputIdentificationNumber.sendKeys("0102992700243");
        mainPage.JMBGSearch.click();
        mainPage.inputPostOfficeAddressSame.click();
        mainPage.inputHasNotification.click();
        for (WebElement webElement : Arrays.asList(mainPage.NextPagePerson, mainPage.NextPageKorisnik, mainPage.NextPageZU)) {
            webElement.click(); Thread.sleep(6000); }
        for (WebElement webElement : Arrays.asList(mainPage.inputStednja, mainPage.inputZaposlen, mainPage.inputStalniZaradaPorodiPrimanja, mainPage.LosaReputacija, mainPage.TajnostTransakcija, mainPage.Identifikacija, mainPage.Transakcija, mainPage.InformacijeKlijent)) {
            webElement.click(); Thread.sleep(2000); }
        for (WebElement webElement : Arrays.asList(mainPage.NextPageAML, mainPage.NextPagePlacanje, mainPage.spanAktiviraj, mainPage.PrintOffer, mainPage.UplatnicaPrint, mainPage.PotvrdaPotpisa)) {
            webElement.click(); Thread.sleep(6000); }

    }

    @Epic("POS Bank")
    @Feature("New contract")
    @Description("Creating new contract")
    @Step("Creating new contract - Spektar premium plus package")
    @Owner("Nikola Stavrov")
    @Test(priority = 810)
    public void SpektarPremiumPlus() throws InterruptedException {

        mainPage.inputUsername.click();
        mainPage.inputUsername.sendKeys("Raiff_yuajko");
        mainPage.inputPassword.click();
        mainPage.inputPassword.sendKeys("OvoJ3Test");
        mainPage.buttonLogin.click();
        mainPage.LifeInsurance.click();
        mainPage.SpektarPOS.click();
        mainPage.ClientName.click();
        mainPage.ClientName.sendKeys("Petar Petrovic");
        mainPage.inputDateBirth.click();
        mainPage.inputDateBirth.sendKeys("01.02.1992");
        mainPage.inputGender.click();
        mainPage.inputHeight.click();
        mainPage.inputHeight.sendKeys("190");
        mainPage.inputWeight.click();
        mainPage.inputWeight.sendKeys("80");
        // mainPage.inputDurationInsuranceYears.click();
        //Thread.sleep(2500);
        //  mainPage.inputDurationInsuranceYears.clear();
        //  mainPage.inputDurationInsuranceYears.sendKeys("20");
        mainPage.inputIndexation.click();
        mainPage.inputCalculationBase.click();
        mainPage.inputAmount.click();
        mainPage.inputAmount.clear();
        mainPage.inputAmount.sendKeys("15000");
        mainPage.PrikaziPakete.click();
        mainPage.PremiumPlus.click();
        //mainPage.InfoOfferPrint.click();
        mainPage.Ugovaranje.click();
        mainPage.Checkbox.click();
        mainPage.inputIdentificationNumber.click();
        mainPage.inputIdentificationNumber.sendKeys("0102992700243");
        mainPage.JMBGSearch.click();
        mainPage.inputPostOfficeAddressSame.click();
        mainPage.inputHasNotification.click();
        for (WebElement webElement : Arrays.asList(mainPage.NextPagePerson, mainPage.NextPageKorisnik, mainPage.NextPageZU)) {
            webElement.click(); Thread.sleep(6000); }
        for (WebElement webElement : Arrays.asList(mainPage.inputStednja, mainPage.inputZaposlen, mainPage.inputStalniZaradaPorodiPrimanja, mainPage.LosaReputacija, mainPage.TajnostTransakcija, mainPage.Identifikacija, mainPage.Transakcija, mainPage.InformacijeKlijent)) {
            webElement.click(); Thread.sleep(2000); }
        for (WebElement webElement : Arrays.asList(mainPage.NextPageAML, mainPage.NextPagePlacanje, mainPage.spanAktiviraj, mainPage.PrintOffer, mainPage.UplatnicaPrint, mainPage.PotvrdaPotpisa)) {
            webElement.click(); Thread.sleep(6000); }

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }

     }
