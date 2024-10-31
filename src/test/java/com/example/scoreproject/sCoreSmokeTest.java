package com.example.scoreproject;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class sCoreSmokeTest {

    //WebDriver driver = new ChromeDriver();

    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia sCore application - Production")
    @Owner("Nikola Stavrov")
    @Test(priority = 10)
    public void sCoreSmokeSerbiaProduction () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://score.uniqa.rs/POS/Serbia/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("scoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Uniqa2022");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }

    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia sCore application - Dev")
    @Owner("Nikola Stavrov")
    @Test(priority = 20)
    public void sCoreSmokeSerbiaDev () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://s-dev-iis2.stech.loc/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("scoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("scoreUW1");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }

    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia sCore application - Test")
    @Owner("Nikola Stavrov")
    @Test(priority = 30)
    public void sCoreSmokeSerbiaTest () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://qa-score.uniqa.rs/POS/Serbia/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }

    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Croatia sCore application - Production")
    @Owner("Nikola Stavrov")
    @Test(priority = 40)
    public void sCoreSmokeCroatiaProduction () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://score.uniqa.hr/POS/Croatia/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Prosinac1!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Croatia sCore application - Dev")
    @Owner("Nikola Stavrov")
    @Test (priority = 50)
    public void sCoreSmokeCroatiaDev () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://s-dev-iis2.stech.loc/POS/Croatia/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Prosinac1!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Croatia sCore application - Test")
    @Owner("Nikola Stavrov")
    @Test (priority = 60)
    public void sCoreSmokeCroatiaTest () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://aasv098.uniqa.hr/POS/Croatia/NoAD/");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Werts!23!!g00!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Montenegro sCore application - Production")
    @Owner("Nikola Stavrov")
    @Test (priority = 70)
    public void sCoreSmokeMontenegroProduction () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://score.uniqa.me/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("mnescoreTehnika");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("mIkrofon.2021");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia sCore application - Dev")
    @Owner("Nikola Stavrov")
    @Test (priority = 80)
    public void sCoreSmokeMontenegroDev () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://s-dev-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("mnescoreTehnika");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Montenegro sCore application - Test")
    @Owner("Nikola Stavrov")
    @Test (priority = 90)
    public void sCoreSmokeMontenegroTest () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://mne-test-iis2.stech.loc/POS/Montenegro/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Bosnia sCore application - Production")
    @Owner("Nikola Stavrov")
    @Test (priority = 100)
    public void sCoreSmokeBosniaProduction () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://iis1prod.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("elvira.hadzimusovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Uniqa2024!!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Bosnia sCore application - Dev")
    @Owner("Nikola Stavrov")
    @Test (priority = 110)
    public void sCoreSmokeBosniaDev () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://s-dev-iis2.stech.loc/POS/BosniaAndHerzegovina/NoAD");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("elvira.hadzimusovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Uniqa2024!!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Bosnia sCore application - Test")
    @Owner("Nikola Stavrov")
    @Test (priority = 120)
    public void sCoreSmokeBosniaTest () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://t-unba-iis.uniqa.ba/POS/BosniaAndHerzegovina/Products");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("amina.masic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Sarajevo123!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement Zivot = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ucContainer1\"]/div[2]/a[1]/div"));
        Zivot.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia POS bank application - Production")
    @Owner("Nikola Stavrov")
    @SuppressWarnings("deprecation")
    @Test (priority = 130)
    public void POSBankSmokeSerbiaProduction () throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://score.uniqa.rs/scorepos");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("murukalo");

        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[2]/input"));
        Password.sendKeys("murukalo");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();
        Thread.sleep(3500);

        WebElement Zivot = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div/button/div[1]"));
        Zivot.click();
        Thread.sleep(2500);



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia POS bank application - Dev")
    @Owner("Nikola Stavrov")
    @SuppressWarnings("deprecation")
    @Test (priority = 140)
    public void POSBankSmokeSerbiaDev () throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://s-dev-iis2.stech.loc/scorepos/");
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


    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia POS bank application - Test")
    @Owner("Nikola Stavrov")
    @SuppressWarnings("deprecation")
    @Test (priority = 150)
    public void POSBankSmokeSerbiaTest () throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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


    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia BE application - Production")
    @Owner("Nikola Stavrov")
    @Test (priority = 160)
    public void BESmokeSerbiaProduction () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://score.uniqa.rs/BusinessEntities/default/209");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("scoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Uniqa2022");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();





    }

    //sredjeno
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia BE application - Dev")
    @Owner("Nikola Stavrov")
    @Test (priority = 170)
    public void BESmokeSerbiaDev () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://s-dev-iis2.stech.loc/BusinessEntities/default/209");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("scoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("scoreUW1");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Serbia BE application - Test")
    @Owner("Nikola Stavrov")
    @Test (priority = 180)
    public void BESmokeSerbiaTest () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://qa-score.uniqa.rs/BusinessEntities/default/209");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("sCoreUW");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Croatia BE application - Production")
    @Owner("Nikola Stavrov")
    @Test (priority = 190)
    public void BESmokeCroatiaProduction () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://score.uniqa.hr/BusinessEntities/default/87");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Prosinac1!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();


    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Croatia BE application - Dev")
    @Owner("Nikola Stavrov")
    @Test (priority = 200)
    public void BESmokeCroatiaDev () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://s-dev-iis2.stech.loc/BusinessEntities/default/87");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Croatia BE application - Test")
    @Owner("Nikola Stavrov")
    @Test (priority = 210)
    public void BESmokeCroatiaTest () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://aasv098.uniqa.hr/BusinessEntities/default/87");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("sCoreAgentUW CRO");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Werts!23!!g00!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Montenegro BE application - Production")
    @Owner("Nikola Stavrov")
    @Test (priority = 220)
    public void BESmokeMontenegroProduction () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://score.uniqa.me/BusinessEntities/default/43");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("mnescoreTehnika");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("mIkrofon.2021");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();


    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Montenegro BE application - Dev")
    @Owner("Nikola Stavrov")
    @Test (priority = 230)
    public void BESmokeMontenegroDev () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://s-dev-iis2.stech.loc/BusinessEntities/default/43");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("mnescoreTehnika");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Montenegro BE application - Test")
    @Owner("Nikola Stavrov")
    @Test (priority = 240)
    public void BESmokeMontenegroTest () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://mne-test-iis2.stech.loc/BusinessEntities/default/43");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("mcosovic MNE");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("milena");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Bosnia BE application - Production")
    @Owner("Nikola Stavrov")
    @Test (priority = 250)
    public void BESmokeBosniaProduction () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://iis1prod.uniqa.ba/BusinessEntities/Default/29");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("ajdin.aladzuz");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("Rajvosa23!");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();


    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Bosnia BE application - Dev")
    @Owner("Nikola Stavrov")
    @Test (priority = 260)
    public void BESmokeBosniaDev () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://s-dev-iis2.stech.loc/BusinessEntities/Default/29");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("elvira.hadzimusovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();



    }
    @Epic("sCore Smoke Test")
    @Feature("Log in")
    @Description("Smoke test - Log in into application")
    @Step("Smoke testing of Bosnia BE application - Test")
    @Owner("Nikola Stavrov")
    @Test (priority = 270)
    public void BESmokeBosniaTest () throws Exception{
        WebDriver driver = new ChromeDriver();


        driver.get("https://t-unba-iis.uniqa.ba/BusinessEntities/Default/29");
        driver.manage().window().maximize();

        WebElement Username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[1]/input"));
        Username.sendKeys("elvira.hadzimusovic");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("OvoJ3Test");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/form/fieldset/div[4]/button[1]"));
        Prijava.click();

        WebElement FizickaLica = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/a"));
        FizickaLica.click();
        Thread.sleep(2500);

        WebElement PretragaBE = driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/div/ul/li[1]/ul/li[2]/a"));
        PretragaBE.click();


    }


}





