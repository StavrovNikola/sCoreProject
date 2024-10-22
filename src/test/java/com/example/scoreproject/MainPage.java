package com.example.scoreproject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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

    @FindBy(css = "#ribbon_menu_area")
    public WebElement SideMenu;

    @FindBy(css = "html > body > form > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > div > ul:nth-of-type(1) > li:nth-of-type(1) > a")
    public WebElement Search;

    @FindBy(css = "#selDocumentType")
    public WebElement DocumentType;

    @FindBy(css = "#selProducts")
    public WebElement Products;

    @FindBy(css = "#selStatus")
    public WebElement Status;

    @FindBy(css = "#btn_Search")
    public WebElement SearchMenu;

    @FindBy(css = "#Kol7")
    public WebElement DateOfContracting;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(13) > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(4) > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(34) > div > div > span > a > img")
    public WebElement ImageSearch;

    @FindBy(css = "a[onclick='return editItemFromGrid(2, 1, \":1:5\");']")
    public WebElement AnnulationReactivation;

    @FindBy(css = "#Kol1")
    public WebElement AnnulationType;

    @FindBy(css = "#btn_Annule")
    public WebElement Annule;

    @FindBy(css = "a[onclick='return editItemFromGrid(2, 1, \":1:11\");']")
    public WebElement CancellationReactivation;

    @FindBy(css = "#Kol1")
    public WebElement CancellationType;

    @FindBy(css = "#Kol2")
    public WebElement CancellationReason;

    @FindBy(css = "#Kol10")
    public WebElement CancellationOption;

    @FindBy(css = "#Kol12")
    public WebElement CancellationNote;

    @FindBy(css = "#btn_SaveCancellation")
    public WebElement SaveCancellation;

    @FindBy(css = "#btn_Activate")
    public WebElement RequestActivation;

    @FindBy(css = "#btn_AnnulLastCancellation")
    public WebElement AnnulLastCancellation;

    @FindBy(css = "#btn_CertificationOfSignature")
    public WebElement CertificationSignature;

    @FindBy(css = "#btn_AnnulClientRequest")
    public WebElement AnnulClientRequest;

    @FindBy(css = "#btn_Reactivation")
    public WebElement Reactivation;

    @FindBy(css = "#btn_Reject")
    public WebElement Rejection;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(13) > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > table > tbody > tr > td:nth-of-type(7) > div > div:nth-of-type(1)")
    public WebElement OfferDateSearchSRB;

    @FindBy(css = "label[for='Kol14_90']")
    public WebElement Indexation;

    @FindBy(css = "#Kol62")
    public WebElement IndexValue;

    @FindBy(css = "#ribbon_menu_area")
    public WebElement RibbonMenu;

    @FindBy(css = "html > body > form > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > div > ul:nth-of-type(1) > li:nth-of-type(1) > a")
    public WebElement NewDocument;

    @FindBy(css = "html > body > form > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > div > ul:nth-of-type(1) > li:nth-of-type(1) > ul > li:nth-of-type(2) > div > a")
    public WebElement NewContractSRB;

    @FindBy(css = "#tab_Persons")
    public WebElement TabPersons;

    @FindBy(xpath = "/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label")
    public WebElement labelUgovaraOsiguranikIstoLice2;

    @FindBy(xpath = "//a[contains(@onclick, '0);(1,')]")
    public WebElement linkDodaj;

    @FindBy(css = "a[onclick='return showIFrame(\"https://qa-score.uniqa.rs/BusinessEntities/IFrameForms/IFrameClientMain/1/4/0/1/2/1/0/2/0/1/0/0/0/0/1/0/418/2035694/209\", 1000, 600, 1, 0);(6, -1, \":0:1\");']")
    public WebElement linkDodaj2;

    @FindBy(css = "label[for='Kol17']")
    public WebElement UgovaraPlatilacIstoLice;

    @FindBy(css = "a[onclick='return showIFrame(\"https://qa-score.uniqa.rs/BusinessEntities/IFrameForms/IFrameClientMain/1/4/0/1/13/1/0/2/0/0/0/0/0/0/1/0/418/2035694/209\", 1000, 600, 1, 0);(16, -1, \":0:1\");']")
    public WebElement linkDodaj3;

    @FindBy(css = "label[for='Kol15']")
    public WebElement labelUgovaraOsiguranikImajuZakonskog;

    @FindBy(css = "a[onclick='return removeItemFromGrid(2, -1, \":0:1\");']")
    public WebElement linkDodaj4;

    @FindBy(css = "a[onclick='return showDocumentNotificationIFrame(2035694,1,1,\"https://qa-score.uniqa.rs/BusinessEntities/IFrameForms/IFrameContactAddresses/1/0/2/209\", 1000, 600, 1, 0);(5, -1, \":0:1\");']")
    public WebElement linkDodaj5;

    @FindBy(css = "a[onclick='return showDocumentNotificationIFrame(2035694,2,1,\"https://qa-score.uniqa.rs/BusinessEntities/IFrameForms/IFrameSMSNotification/1/0/2/209\", 1000, 600, 1, 0);(8, -1, \":0:1\");']")
    public WebElement linkDodaj6;

    @FindBy(xpath = "//*[@id='MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber']")
    public WebElement inputMainContentWucIndividual2;

    @FindBy(css = "html > body > form > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > div > ul:nth-of-type(1) > li:nth-of-type(3) > a")
    public WebElement MassPrint;

    @FindBy(css = "#Kol1")
    public WebElement Month;

    @FindBy(css = "#Kol2")
    public WebElement Year;

    @FindBy(css = "#Kol3")
    public WebElement Policies;

    @FindBy(css = "#Kol4")
    public WebElement Confirmation;

    @FindBy(css = "a[onclick='return editItemFromGrid(2, 1, \":1:1\");']")
    public WebElement PreviewSRB;

    @FindBy(css = "#tab_Clauses")
    public WebElement TabClausesSRB;

    @FindBy(css = "label[for='Kol2_45']")
    public WebElement Klauzula30DanaStorno;

    @FindBy(css = "label[for='Kol2_51']")
    public WebElement UgovaranjeValutneKlauzule;

    @FindBy(css = "label[for='Kol2_2691']")
    public WebElement TacnostPodataka;

    @FindBy(css = "label[for='Kol2_2704']")
    public WebElement ZastitaPodatakaLicnosti;

    @FindBy(css = "label[for='Kol2_71']")
    public WebElement KlauzulaZastitaPotrosaca;

    @FindBy(css = "label[for='Kol2_4017']")
    public WebElement SankcionaKlauzula;

    @FindBy(css = "label[for='Kol2_1710']")
    public WebElement InformacijeUgovaracaOsiguranja;

    @FindBy(css = "#selProducts")
    public WebElement ProductsSRB;

    @FindBy(css = "label[for='Kol4_3915']")
    public WebElement OpstiUsloviVIII2022;

    @FindBy(css = "label[for='Kol4_2731']")
    public WebElement PosebniUsloviOsiguranjeDece;

    @FindBy(css = "label[for='Kol4_2732']")
    public WebElement PosebniUsloviOsiguranjeLica;

    @FindBy(css = "label[for='Kol4_2733']")
    public WebElement TabelaInvaliditeta;

    @FindBy(css = "label[for='Kol4_3842']")
    public WebElement UŽDVI2021;

    @FindBy(css = "label[for='Kol4_2740']")
    public WebElement PUOOSII2020;

    @FindBy(css = "label[for='Kol4_3994']")
    public WebElement PUDOŽSIII2023;

    @FindBy(css = "label[for='Kol4_3993']")
    public WebElement OUŽVIII2022;





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

    @FindBy(css = "#DurationMonthValue")
    public WebElement DurationInMonthsMNE;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(13) > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(4) > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(40) > div > div > span > a > img")
    public WebElement ImageSearchMNE;

    @FindBy(css = "a[onclick='return editItemFromGrid(2, 1, \":1:11\");']")
    public WebElement CancellationReactivationMNE;

    @FindBy(css = "#btn_Activate")
    public WebElement RequestActivationMNE;

    @FindBy(css = "#btn_AnnulLastCancellation")
    public WebElement AnnulLastCancellationMNE;

    @FindBy(css = "#btn_CertificationOfSignature")
    public WebElement CertificationSignatureMNE;

    @FindBy(css = "#btn_AnnulClientRequest")
    public WebElement AnnulClientRequestMNE;

    @FindBy(css = "#btn_Reactivation")
    public WebElement ReactivationMNE;

    @FindBy(css = "#btn_Reject")
    public WebElement RejectionMNE;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(13) > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > table > tbody > tr > td:nth-of-type(7) > div > div:nth-of-type(1)")
    public WebElement OfferSearchMNE;

    


    //CROATIA

    @FindBy(css = "div[class$='tb']")
    public WebElement TB;

    @FindBy(css = "div[class$='mo']")
    public WebElement MO;

    @FindBy(css = "div[class$='modor']")
    public WebElement MODOR;

    @FindBy(css = "div[class$='ropos']")
    public WebElement ROPOS;

    @FindBy(css = "div[class='box_product hvr-grow ico_gps']")
    public WebElement FidelisLife;

    @FindBy(css = "#Kol18")
    public WebElement ChosenAmountSum;

    @FindBy(css = "#btn_CreateNewContract")
    public WebElement CreateNewContract;

    @FindBy(css = "#ContentPlaceHolder1_tbCustomerFirstName")
    public WebElement CustomerName;

    @FindBy(css = "#ContentPlaceHolder1_tbCustomerProfessionalQualifications")
    public WebElement CustomerVocational;

    @FindBy(css = "#ContentPlaceHolder1_tbCustomerSurname")
    public WebElement CustomerSurname;

    @FindBy(css = "#ContentPlaceHolder1_tbCustomerTitle")
    public WebElement CustomerTitle;

    @FindBy(css = "#ContentPlaceHolder1_tbCustomerOib")
    public WebElement CustomerOIB;

    @FindBy(css = "#ContentPlaceHolder1_tbCustomerOccupation")
    public WebElement CustomerOccupation;

    @FindBy(css = "#ContentPlaceHolder1_tbDistributorSuperiorName")
    public WebElement DistributorName;

    @FindBy(css = "#ContentPlaceHolder1_tbDistributorName")
    public WebElement DistributorNameSurname;

    @FindBy(css = "label[for='qnn_1_0_1'] span")
    public WebElement FirstQuestion;

    @FindBy(css = "label[for='qnn_1_1_0'] span")
    public WebElement SecondQuestion;

    @FindBy(css = "label[for='qnn_1_2_0'] span")
    public WebElement ThirdQuestion;

    @FindBy(css = "label[for='qnn_1_3_4'] span")
    public WebElement FourthQuestion;

    @FindBy(css = "label[for='qnn_2_0_0'] span")
    public WebElement FirstQuestion1;

    @FindBy(css = "label[for='qnn_2_1_0'] span")
    public WebElement SecondQuestion1;

    @FindBy(css = "label[for='qnn_2_2_0'] span")
    public WebElement ThirdQuestion1;

    @FindBy(css = "label[for='qnn_2_3_4'] span")
    public WebElement FourthQuestion1;

    @FindBy(css = "label[for='qnn_3_0_0'] span")
    public WebElement FirstQuestion2;

    @FindBy(css = "label[for='qnn_3_1_0'] span")
    public WebElement SecondQuestion2;

    @FindBy(css = "label[for='qnn_3_2_0'] span")
    public WebElement ThirdQuestion2;

    @FindBy(css = "label[for='qnn_3_3_4'] span")
    public WebElement FourthQuestion2;

    @FindBy(css = "#btn_Save")
    public WebElement SaveTP;

    @FindBy(css = "#btn_Print")
    public WebElement PrintTP;

    @FindBy(css = "a[onclick='return editItemFromGrid(1, 0, \":1:1\");']")
    public WebElement PermanentEmployment;

    @FindBy(xpath = "//*[@id='btn_Activate']")
    public WebElement Activate1;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(14) > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(4) > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(34) > div > div > span > a > img")
    public WebElement ImageSearchCRO;

    @FindBy(css = "a[onclick='return editItemFromGrid(2, 1, \":1:5\");']")
    public WebElement AnnulationCRO;

    @FindBy(css = "a[onclick='return editItemFromGrid(2, 1, \":1:11\");']")
    public WebElement CancellationReactivationCRO;

    @FindBy(css = "label[for='Kol14_40']")
    public WebElement IndexationCRO;

    @FindBy(css = "a[onclick='return editItemFromGrid(2, 1, \":1:1\");']")
    public WebElement PreviewCRO;

    @FindBy(css = "#tab_Clauses")
    public WebElement TabClausesCRO;

    @FindBy(css = "label[for='Kol4_3971']")
    public WebElement OUZ2023;

    @FindBy(css = "label[for='Kol4_3985']")
    public WebElement PUTB2023;

    @FindBy(css = "label[for='Kol4_3972']")
    public WebElement INFTB2023;

    @FindBy(css = "label[for='Kol4_2044']")
    public WebElement IOOPTB;

    @FindBy(css = "label[for='Kol4_3973']")
    public WebElement INFZIV2023;

    @FindBy(css = "label[for='Kol4_2044']")
    public WebElement INFIOOP;

    @FindBy(css = "label[for='Kol4_2816']")
    public WebElement Clause05;

    @FindBy(css = "label[for='Kol4_3976']")
    public WebElement OUZIF2023;

    @FindBy(css = "label[for='Kol4_3911']")
    public WebElement PUZIF2022;

    @FindBy(css = "#ribbon_menu_area")
    public WebElement SideMenuCRO;

    @FindBy(css = "a[onclick*='PredefinedDocumentation']")
    public WebElement SideMenuDocuments;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 0, \":1:1\");']")
    public WebElement WhiteButton;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2)")
    public WebElement INFIOOPSideMenu;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 1, \":1:1\");']")
    public WebElement WhiteButton1;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(2)")
    public WebElement INFTB20231;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 2, \":1:1\");']")
    public WebElement WhiteButton2;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(2)")
    public WebElement TB2016;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(2)")
    public WebElement INFZIV2023SideMenu;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(2)")
    public WebElement MO16;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(2)")
    public WebElement MODOR16;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(2)")
    public WebElement ROPOS16;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(4) > td:nth-of-type(2)")
    public WebElement ROPOS16J;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 3, \":1:1\");']")
    public WebElement WhiteButton3;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 4, \":1:1\");']")
    public WebElement WhiteButton4;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(5) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2050J12024;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 5, \":1:1\");']")
    public WebElement WhiteButton5;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(6) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2055J12024;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 6, \":1:1\");']")
    public WebElement WhiteButton6;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(7) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2035V12024;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 7, \":1:1\");']")
    public WebElement WhiteButton7;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(8) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2040V12024;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 8, \":1:1\");']")
    public WebElement WhiteButton8;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(9) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2045V12024;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 9, \":1:1\");']")
    public WebElement WhiteButton9;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(10) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2050V12024;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 10, \":1:1\");']")
    public WebElement WhiteButton10;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(11) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2055V12024;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 11, \":1:1\");']")
    public WebElement WhiteButton11;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(12) > td:nth-of-type(2)")
    public WebElement FidelisFonds12024;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2035J12024;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2040J12024;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr:nth-of-type(4) > td:nth-of-type(2)")
    public WebElement FidelisLifeTarget2045J12024;





    //BOSNIA

    @FindBy(xpath = "//div[contains(@class, 'ico_classic')]")
    public WebElement Classic;

    @FindBy(xpath = "//div[@class='box_product hvr-grow ico_comfort']")
    public WebElement Comfort;

    @FindBy(xpath = "//div[contains(@class, 'ico_uniqo')]")
    public WebElement Uniqo;

    @FindBy(xpath = "//div[contains(@class, 'ico_kapital')]")
    public WebElement Kapital;

    @FindBy(xpath = "//div[contains(@class, 'ico_comfortdual')]")
    public WebElement ComfortDual;

    @FindBy(css = "#Kol112")
    public WebElement BusinessUnit;

    @FindBy(css = "input[id='Kol17']")
    public WebElement ClientInfoBA;

    @FindBy(css = "#tab_Concerns")
    public WebElement TabConcernsBA;

    @FindBy(css = "#Kol31")
    public WebElement DateOfBirth1;

    @FindBy(css = "#Kol33")
    public WebElement GenderConcernPerson1;

    @FindBy(css = "#Kol34")
    public WebElement HeightConcernPerson1;
    
    @FindBy(css = "#Kol35")
    public WebElement WeightConcernPerson1;

    @FindBy(css = "#ContentPlaceHolder1_wucTechnicalPersons_WucSalesUnitsIntermediaries_DdlSalesUnitsChanel")
    public WebElement SalesUnitChanel;

    @FindBy(css = "#ContentPlaceHolder1_wucTechnicalPersons_WucSalesUnitsIntermediaries_DdlSalesUnitsPartner")
    public WebElement SalesUnitPartner;

    @FindBy(css = "#ContentPlaceHolder1_wucTechnicalPersons_BtnSearch")
    public WebElement TechnicalPersonSearch;

    @FindBy(css = "#ContentPlaceHolder1_wucTechnicalPersons_LsvSearch_SelectButton_0")
    public WebElement TechnicalPerson;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(14) > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(4) > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(34) > div > div > span > a > img")
    public WebElement ImageSearchBA;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(14) > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > table > tbody > tr > td:nth-of-type(7) > div > div:nth-of-type(1)")
    public WebElement OfferDateSearch;

    @FindBy(css = "label[for='Kol14_123']")
    public WebElement ExclusionPaymentMethode;

    @FindBy(css = "a[onclick='return editItemFromGrid(2, 1, \":1:1\");']")
    public WebElement Preview;

    @FindBy(css = "#tab_Clauses")
    public WebElement TabClauses;

    @FindBy(css = "#selProducts")
    public WebElement ProductsBA;

    @FindBy(css = "label[for='Kol4_2773']")
    public WebElement GenerelacConditions;

    @FindBy(css = "label[for='Kol4_2774']")
    public WebElement SpecialConditionsClassic;

    @FindBy(css = "label[for='Kol4_2779']")
    public WebElement SpecialConditionsComfort;

    @FindBy(css = "label[for='Kol4_2778']")
    public WebElement SpecialConditionsUniqo;

    @FindBy(css = "label[for='Kol4_2779']")
    public WebElement SpecialConditionsUniqo1;

    @FindBy(css = "label[for='Kol4_2777']")
    public WebElement SpecialConditionsKapital;

    @FindBy(css = "label[for='Kol4_2779']")
    public WebElement SpecialConditionsKapital1;

    @FindBy(css = "label[for='Kol4_2776']")
    public WebElement SpecialConditionsComfortDual;

    @FindBy(css = "#btn_ExportToExcel")
    public WebElement ExportToExcel;




    

    







































































































































































    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
