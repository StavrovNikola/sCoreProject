package com.example.scoreproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


// page_url = https://www.jetbrains.com/
public class MainPage {

    //SERBIA 
    @FindBy(xpath = "//*[@id='Username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@value='login']")
    public WebElement buttonLogin;

    @FindBy(xpath = "//div[contains(@class, 'ico_life')]")
    public WebElement Life;

    @FindBy(xpath = "/html/body/form/div[4]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/label[1]")
    public WebElement DozivotniDa;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement DozivotniNe;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > label:nth-of-type(1)")
    public WebElement MladjiOd14Da;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement MladjiOd14Ne;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > div > div:nth-of-type(2) > label:nth-of-type(1)")
    public WebElement OsiguranjeKreditaDa;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement OsiguranjeKreditaNe;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > div > div:nth-of-type(2) > label:nth-of-type(1)")
    public WebElement SamoStednjaDa;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(4) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement SamoStednjaNe;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(5) > div > div:nth-of-type(2) > label:nth-of-type(1)")
    public WebElement JokerPlusDa;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(5) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement JokerPlusNe;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(6) > div > div:nth-of-type(2) > label:nth-of-type(1)")
    public WebElement JokerPremiumDa;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(6) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement JokerPremiumNe;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(7) > div > div:nth-of-type(2) > label:nth-of-type(1)")
    public WebElement RizikSmrtiDa;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(7) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement RizikSmrtiNe;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(8) > div > div:nth-of-type(2) > label:nth-of-type(1)")
    public WebElement PovratPremijeDa;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(8) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement PovratPremijeNe;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(9) > div > div:nth-of-type(2) > label:nth-of-type(1)")
    public WebElement OsiguranjeInvesticijeDa;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(9) > div > div:nth-of-type(2) > label:nth-of-type(2)")
    public WebElement OsiguranjeInvesticijeNe;

    @FindBy(css = "#backBtn")
    public WebElement PreviousQuestion;

    @FindBy(css = "#nextBtn")
    public WebElement NextQuestion;

    @FindBy(css = "label[class='radio productTypeRadio checked']")
    public WebElement InfoOffer;

    @FindBy(css = "label[class$='productTypeRadio']")
    public WebElement NewContract;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div:nth-of-type(4) > a > div")
    public WebElement Product;
    
    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > div > div > div:nth-of-type(2) > a:nth-of-type(15) > div > div > div")
    public WebElement DozivotniRiziko;

    @FindBy(xpath = "/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/div[2]/a[4]/div/div/div")
    public WebElement RizikoKredit;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > div > div > div:nth-of-type(2) > a:nth-of-type(12) > div > div > div")
    public WebElement Spektar;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(1) > div > div > div > div:nth-of-type(2) > a:nth-of-type(11) > div > div > div")
    public WebElement Joker;
    
    @FindBy(css = "div[class$='favoritpremium']")
    public WebElement Favorit;

    @FindBy(css = "div[class='box_product hvr-grow ico_riziko']")
    public WebElement Riziko;

    @FindBy(css = "div[class$='joker']")
    public WebElement JokerOld;

    @FindBy(css = "div[class$='spektarpremium']")
    public WebElement SpektarBOC;

    @FindBy(css = "div[class$='jokerpremium']")
    public WebElement JokerBOC;

    @FindBy(css = "div[class='box_product hvr-grow ico_dozivotniriziko']")
    public WebElement DozivotniRizikoBOC;

    @FindBy(xpath = "//*[@id='Kol17']")
    public WebElement ClientInfo;

    @FindBy(css = "input[onchange='validateRegEx(this, event); toggleDurationInYear(value); spinnerValueSet3();']")
    public WebElement DurationInYear;

    @FindBy(xpath = "//*[@id='ContentPlaceHolder1_Kol29_uc_idWucPlaces_tbPlaces']")
    public WebElement ContentPlaceHolder;

    @FindBy(xpath = "/html/body/ul[2]/li[1]/div")
    public WebElement ContentPlaceHolder1;

    @FindBy(xpath = "//*[@id='Kol24']")
    public WebElement PaymentDinamic;

    @FindBy(css = "#Kol22")
    public WebElement Valute;

    @FindBy(css = "#Kol23")
    public WebElement Clause;

    @FindBy(xpath = "//*[@id='Kol21']")
    public WebElement PaymentMethod;

    @FindBy(css = "#Kol30")
    public WebElement Banka;

    @FindBy(xpath = "//*[@id='Kol51']")
    public WebElement DurationInMonths;

    @FindBy(css = "label[for='Kol14_195']")
    public WebElement SMEKeyPerson;

    @FindBy(xpath = "//a[@id='tab_Concerns']")
    public WebElement TabConcerns;

    @FindBy(css = "select[mappingkey='sTech.sCore.Models.CalculationDirection']")
    public WebElement InsuredSum;

    @FindBy(css = "input[mappingkey='sTech.sCore.Models.Concern.InsuredSumOrPremium']")
    public WebElement InsuredSumOrPremium;

    @FindBy(css = "input[mappingkey='sTech.sCore.Models.ConcernPerson.DateOfBirth']")
    public WebElement DateOfBirth;

    @FindBy(css = "select[mappingkey='sTech.sCore.Models.ConcernPerson.Gender']")
    public WebElement GenderConcernPerson;

    @FindBy(css = "input[mappingkey='sTech.sCore.Models.ConcernPerson.Height']")
    public WebElement HeightConcernPerson;

    @FindBy(css = "input[mappingkey='sTech.sCore.Models.ConcernPerson.Weight']")
    public WebElement WeightConcernPerson;

    @FindBy(xpath = "//input[@mappingkey='sTech.sCore.Models.Concern.Interest']")
    public WebElement ConcernInterest;

    @FindBy(css = "#inp_7310_1")
    public WebElement inputSumDozivljenje;

    @FindBy(css = "#inp_7324_1")
    public WebElement inputSumTrajniInvaliditetKaoPosledicaNezgode;

    @FindBy(css = "#inp_7334_1")
    public WebElement getInputSumTrajniInvaliditetKaoPosledicaNezgodeFavorit;

    @FindBy(css = "label[for='chk_7331'] span")
    public WebElement TezeBolesti;

    @FindBy(css = "#inp_7331_1")
    public WebElement inputSumTezeBolesti;

    @FindBy(css = "label[for='chk_7323']")
    public WebElement SmrtUsledNezgode;

    @FindBy(css = "#inp_7323_1")
    public WebElement inputSumSmrtUsledNezgode;

    @FindBy(css = "label[for='chk_7325'] span")
    public WebElement LomKostijuNezgoda;

    @FindBy(css = "#sel_7325_1")
    public WebElement LomKostiuNezgodaDDL;

    @FindBy(css = "label[for='chk_7326'] span")
    public WebElement DnevnaNaknadaNezgoda;

    @FindBy(css = "#sel_7326_1")
    public WebElement DnevnaNaknadaNezgodaDDL;

    @FindBy(css = "label[for='chk_7327'] span")
    public WebElement DnevnaNaknadaBolestPorodjaj;

    @FindBy(css = "#sel_7327_1")
    public WebElement DnevnaNaknadaBolestPorodjajDDL;

    @FindBy(css = "label[for='chk_7328'] span")
    public WebElement HirurskeIntervencijeNezgoda;

    @FindBy(css = "#sel_7328_1")
    public WebElement HirurskeIntervencijeNezgodaDDL;

    @FindBy(css = "label[for='chk_7329'] span")
    public WebElement HirurkseIntervencijeBolest;

    @FindBy(css = "#sel_7329_1")
    public WebElement HirurkseIntervencijeBolestDDL;

    @FindBy(css = "label[for='chk_7330'] span")
    public WebElement Bolovanje42Dana;

    @FindBy(xpath = "//*[@id='btn_Accept']")
    public WebElement Accept;
    
    @FindBy(xpath = "//*[@id='btn_SaveQuestionary']")
    public WebElement SaveQuestionary;

    @FindBy(xpath = "//*[@id='btn_Calculate']")
    public WebElement Calculate;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(1) > div > div > div:nth-of-type(1) > div:nth-of-type(3) > a")
    public WebElement TechnicalPersons;

    @FindBy(xpath = "//a[@id='ContentPlaceHolder1_wucTechnicalPersons_BtnOpenSearch']")
    public WebElement TechnicalPersonsOpenSearch;

    @FindBy(xpath = "//*[@id='ContentPlaceHolder1_wucTechnicalPersons_LsvSearch_SelectButton_5']")
    public WebElement TechnicalPersonsOpenSearchSelect;

    @FindBy(xpath = "//a[@id='btn_Save']")
    public WebElement Save;

    @FindBy(xpath = "//*[@id='btn_Activate']")
    public WebElement Activate;

    @FindBy(xpath = "//*[@id='btn_Print']")
    public WebElement Print;

    //MONTENEGRO

    @FindBy(css = "div[class$='joker']")
    public WebElement JokerMNE;

    @FindBy(css = "div[class$='rizikokredit']")
    public WebElement RizikoKreditMNE;

    @FindBy(css = "div[class$='rizikoplus']")
    public WebElement RizikoPlusMNE;

    @FindBy(css = "div[class$='favorit']")
    public WebElement FavoritMNE;

    @FindBy(css = "div[class='box_product hvr-grow ico_spektar']")
    public WebElement SpektarMNE;

    @FindBy(css = "div[class$='rizikovitalkredit']")
    public WebElement RizikoVitalKreditMNE;

    @FindBy(css = "div[class='box_product hvr-grow ico_rizikokreditppi']")
    public WebElement SMEKMPMNE;

    @FindBy(css = "#inp_7271_1")
    public WebElement inputSumDozivljenjeMNE;










   

   
  
 
 

    
    
    
    
    
    
    
    

    





    
    
    
    
    
    
    
    
    

    




  
    
   



    

    
    
    
    
    
    
    
    
    

    





    
    
    

    
    

   

    







    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
