package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(css = "#btn_Activate")
    public WebElement linkActivate;

    @FindBy(css = "#Kol8 div[align='left']")
    public WebElement divJokerPlusTarifa;

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

    @FindBy(css = "label[for='Kol14_60']")
    public WebElement Vinculation;

    @FindBy(css = "#ribbon_menu_area")
    public WebElement RibbonMenu;

    @FindBy(css = "html > body > form > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > div > ul:nth-of-type(1) > li:nth-of-type(1) > a")
    public WebElement NewDocument;

    @FindBy(css = "html > body > form > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > div > ul:nth-of-type(1) > li:nth-of-type(1) > ul > li:nth-of-type(2) > div > a")
    public WebElement RibbonMenuNewContract;

    @FindBy(css = "#tab_Persons")
    public WebElement TabPersons;

    @FindBy(xpath = "/html/body/form/div[4]/div[2]/div/div/div[1]/div/div/div/label")
    public WebElement UgovaraOsiguranikIstoLice2;

    @FindBy(xpath = "//a[contains(@onclick, '0);(1,')]")
    public WebElement Dodaj;
    
    @FindBy(xpath = "//*[@id='MainContent_wucIndividualBusinessEntitySearch_tbFirstName']")
    public WebElement inputName;

    @FindBy(css = "#MainContent_wucIndividualBusinessEntitySearch_tbIdentificationNumber")
    public WebElement IdentificationNumber;

    @FindBy(css = "#MainContent_wucIndividualBusinessEntitySearch_SearchButton")
    public WebElement ClientSearch;

    @FindBy(css = "#MainContent_wucIndividualBusinessEntitySearch_IndividualBusinessEntitiesListView_ProcessingButton_0")
    public WebElement ClientPreview;

    @FindBy(css = "#MainContent_IndividualClientLifeFormView_lbAccept")
    public WebElement ClientAccept;

    @FindBy(xpath = "//a[contains(@onclick, '0);(6,')]")
    public WebElement DodajOsiguranik;

    @FindBy(css = "a[onclick='return showIFrame(\"https://qa-score.uniqa.rs/BusinessEntities/IFrameForms/IFrameClientMain/1/4/0/1/2/1/0/2/0/1/0/0/0/0/1/0/418/2035694/209\", 1000, 600, 1, 0);(6, -1, \":0:1\");']")
    public WebElement AddPlatilac;

    @FindBy(css = "label[for='Kol17'] span")
    public WebElement UgovaraPlatilacIstoLice;

    @FindBy(xpath = "//label[@for='Kol17']")
    public WebElement labelUgovaraPlatilacIstoLice;

    @FindBy(css = "label[for='Kol15']")
    public WebElement labelUgovaraOsiguranikImajuZakonskog;

    @FindBy(css = "a[onclick='return showIFrame(\"https://qa-score.uniqa.rs/BusinessEntities/IFrameForms/IFrameClientMain/1/4/0/1/10/1/0/2/1/0/0/0/0/0/1/0/602/2058373/209\", 1000, 600, 1, 0);(10, -1, \":0:1\");']")
    public WebElement AddZakonskiZastupnik;

    @FindBy(css = "a[onclick='return removeItemFromGrid(2, -1, \":0:1\");']")
    public WebElement AddDeathBeneficiary;

    @FindBy(css = "a[onclick='return removeItemFromGrid(3, -1, \":0:1\");']")
    public WebElement AddDozivljenje;

    @FindBy(css = "#Kol2")
    public WebElement inputOpis;

    @FindBy(css = "input[id='Kol3']")
    public WebElement inputProcenat;

    @FindBy(css = "a[id='btn_Accept']")
    public WebElement AcceptDeathBeneficiares;

    @FindBy(css = "a[onclick='return showDocumentNotificationIFrame(2035694,1,1,\"https://qa-score.uniqa.rs/BusinessEntities/IFrameForms/IFrameContactAddresses/1/0/2/209\", 1000, 600, 1, 0);(5, -1, \":0:1\");']")
    public WebElement AddAddress;

    @FindBy(css = "a[onclick='return showDocumentNotificationIFrame(2035694,2,1,\"https://qa-score.uniqa.rs/BusinessEntities/IFrameForms/IFrameSMSNotification/1/0/2/209\", 1000, 600, 1, 0);(8, -1, \":0:1\");']")
    public WebElement AddSMS;

    @FindBy(css = "#tab_Vinculations")
    public WebElement linkTabVinculations;

    @FindBy(css = "a[onclick='return removeItemFromGrid(1, -1, \":0:1\");']")
    public WebElement AddVinculation;

    @FindBy(css = "select[id='Kol23']")
    public WebElement Creditor;

    @FindBy(css = "#Kol8")
    public WebElement FirstVinculationBank;

    @FindBy(css = "input[mappingkey='sTech.sCore.Models.Vinculation.FirstName']")
    public WebElement inputNameVinculation;

    @FindBy(css = "input[id='Kol17']")
    public WebElement inputSurnameVinculation;

    @FindBy(css = "#Kol18")
    public WebElement getInputIdentificationNumberVinculation;

    @FindBy(css = "#Kol19")
    public WebElement Naziv;

    @FindBy(css = "#Kol20")
    public WebElement PIB;

    @FindBy(css = "#Kol21")
    public WebElement MBR;

    @FindBy(css = "#Kol15")
    public WebElement CreditLoanNumber;

    @FindBy(css = "a[id='btn_Accept']")
    public WebElement linkAcceptVinculation;

    @FindBy(css = "#tab_MoneyLaundry")
    public WebElement linkTabMoneyLaundry;

    @FindBy(css = "label[for='qnn_1_0_1']")
    public WebElement labelStednja;

    @FindBy(css = "label[for='qnn_1_1_1']")
    public WebElement labelZaposlen;

    @FindBy(css = "label[for='qnn_1_3_0']")
    public WebElement labelStalniZaradaPorodiPrimanja;

    @FindBy(css = "#btn_AcceptMoneyLaundry")
    public WebElement linkAcceptMoneyLaundry;

    @FindBy(css = "#tab_AssociateMoneyLaundry")
    public WebElement linkTabAssociateMoneyLaundry;

    @FindBy(css = "label[for='qnn_1_0_0']")
    public WebElement labelRadioInline;

    @FindBy(css = "label[for='qnn_1_1_0']")
    public WebElement labelRadioInline2;

    @FindBy(css = "label[for='qnn_1_2_0']")
    public WebElement labelRadioInline3;

    @FindBy(css = "label[for='qnn_1_3_0']")
    public WebElement labelRadioInline4;

    @FindBy(css = "label[for='qnn_1_4_1']")
    public WebElement labelRadioInline5;

    @FindBy(css = "#btn_AcceptMoneyLaundry")
    public WebElement linkAcceptMoneyLaundry2;

    @FindBy(css = "#btn_CertificationOfSignature")
    public WebElement linkCertificationSignature;

    @FindBy(css = "#tab_Printouts")
    public WebElement linkTabPrintouts;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(1) > td:nth-of-type(19) > span > a > img")
    public WebElement image;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(2) > td:nth-of-type(19) > span > a > img")
    public WebElement image2;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(3) > td:nth-of-type(19) > span > a > img")
    public WebElement image3;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(4) > td:nth-of-type(19) > span > a > img")
    public WebElement image4;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(5) > td:nth-of-type(19) > span > a > img")
    public WebElement image5;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(6) > td:nth-of-type(19) > span > a > img")
    public WebElement image6;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(7) > td:nth-of-type(19) > span > a > img")
    public WebElement image7;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(8) > td:nth-of-type(19) > span > a > img")
    public WebElement image8;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div > div > table > tbody > tr:nth-of-type(9) > td:nth-of-type(19) > span > a > img")
    public WebElement image9;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 0, 1);']")
    public WebElement Polisa;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 1, 1);']")
    public WebElement AMLKlijent;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 2, 1);']")
    public WebElement AMLSaradnik;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 3, 1);']")
    public WebElement PotvrdaZaPreuzimanje;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 4, 1);']")
    public WebElement PropratnoPismo;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 5, 1);']")
    public WebElement Uplatnica;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 6, 1);']")
    public WebElement PUI;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 7, 1);']")
    public WebElement Izjava;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 8, 1);']")
    public WebElement IOOPSRB;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 3, 1);']")
    public WebElement UplatnicaPonuda;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 5, 1);']")
    public WebElement IOOPPonuda;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 6, 1);']")
    public WebElement IzjavaPonuda;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 4, 1);']")
    public WebElement PUIPonuda;

    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div/div[3]/ul/li")
    public WebElement CertificationSignatureMessage;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(1) > div > div > div:nth-of-type(1) > div:nth-of-type(5)")
    public WebElement StatusUgovora;

    @FindBy(css = "#btn_Confirm")
    public WebElement linkConfirmBOC;

    @FindBy(css = "#btn_CreatePolicy")
    public WebElement CreatePolicy;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > fieldset > div > div > div > div:nth-of-type(1)")
    public WebElement divOsiguranikStrani;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > fieldset > div > div > div > div:nth-of-type(2)")
    public WebElement divUgovaraStrani;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > fieldset > div > div > div > div:nth-of-type(3)")
    public WebElement divPlatilac;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > fieldset > div > div > div > div:nth-of-type(4)")
    public WebElement divPlatilacPolitickiIzlozenaOsoba;

    @FindBy(css = "#Kol8 div[align='left']")
    public WebElement divZanimanje;

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

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div:nth-of-type(2) > div > button")
    public WebElement LifeInsurance;

    @FindBy(css = "html > body > div > div > div > div > ul > div > div:nth-of-type(1) > svg")
    public WebElement SideMenuPOS;

    @FindBy(css = "html > body > div > div > div > div > ul > div:nth-of-type(2) > div > div > div > a:nth-of-type(1) > div > span")
    public WebElement SideMenuLifeInsurance;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")
    public WebElement AktiviranjePolise;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement AktiviranjePolisePrint;

    @FindBy(css = "html > body > div > div:nth-of-type(1) > main > table:nth-of-type(2) > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")
    public WebElement JokerPlusPUI;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement JokerPlusPUIPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(2) > td:nth-of-type(1)")
    public WebElement FavoritPUI;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement FavoritPUIPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(3) > td:nth-of-type(1)")
    public WebElement RizikoKreditPUI;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(3) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement RizikoKreditPUIPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(4) > td:nth-of-type(1)")
    public WebElement SpektarPUI;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(4) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement SpektarPUIPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(5) > td:nth-of-type(1)")
    public WebElement IOOP;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(2) > tbody > tr:nth-of-type(5) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement IOOPPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")
    public WebElement IzjavaZS;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement IzjavaZSPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(23) > td:nth-of-type(1)")
    public WebElement ZU;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(23) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement ZUPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")
    public WebElement FATCA;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement FATCAPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(3) > td:nth-of-type(1)")
    public WebElement ClientQuestionnaire;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(3) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement ClientQuestionnairePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(4) > td:nth-of-type(1)")
    public WebElement UserQuestionnaire;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(4) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UserQuestionnairePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(5) > td:nth-of-type(1)")
    public WebElement PEPQuestionnaire;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(5) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PEPQuestionnairePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(6) > td:nth-of-type(1)")
    public WebElement CompanyQuestionnaire;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(6) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement CompanyQuestionnairePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(7) > td:nth-of-type(1)")
    public WebElement AssociatesQuestionnaire;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(4) > tbody > tr:nth-of-type(7) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement AssociatesQuestionnairePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(3) > td:nth-of-type(1)")
    public WebElement GeneralConditions;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(3) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement GeneralConditionsPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(2) > td:nth-of-type(1)")
    public WebElement PovratPremije;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PovratPremijePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(3) > td:nth-of-type(1)")
    public WebElement PreknjizenjeUplate;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(3) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PreknjizenjeUplatePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(4) > td:nth-of-type(1)")
    public WebElement PromenaAdrese;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(4) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PromenaAdresePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(5) > td:nth-of-type(1)")
    public WebElement PromenaKorisnika;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(5) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PromenaKorisnikaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(6) > td:nth-of-type(1)")
    public WebElement PromenaPrezimena;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(6) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PromenaPrezimenaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(7) > td:nth-of-type(1)")
    public WebElement PromenaUgovaraca;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(7) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PromenaUgovaracaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(8) > td:nth-of-type(1)")
    public WebElement ZahtevIsplatuZivot;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(8) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement ZahtevIsplatuZivotPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(9) > td:nth-of-type(1)")
    public WebElement ZahtevDuplikatPolise;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(9) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement ZahtevDuplikatPolisePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(10) > td:nth-of-type(1)")
    public WebElement ZahtevPredujam;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(10) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement ZahtevPredujamPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(11) > td:nth-of-type(1)")
    public WebElement ZahtevPromenuUgovornihElemenata;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(1) > tbody > tr:nth-of-type(11) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement ZahtevPromenuUgovornihElemenataPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(2) > td:nth-of-type(1)")
    public WebElement Lab1Lab2;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement Lab1Lab2Print;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(3) > td:nth-of-type(1)")
    public WebElement MedicinskiA;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(3) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement MedicinskiAPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(4) > td:nth-of-type(1)")
    public WebElement MedicinskiB;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(4) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement MedicinskiBPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(5) > td:nth-of-type(1)")
    public WebElement SpisakUstanova;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(5) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement SpisakUstanovaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(6) > td:nth-of-type(1)")
    public WebElement UpitnikAlergije;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(6) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikAlergijePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(7) > td:nth-of-type(1)")
    public WebElement UpitnikUrinarna;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(7) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikUrinarnaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(8) > td:nth-of-type(1)")
    public WebElement UpitnikDijabetes;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(8) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikDijabetesPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(9) > td:nth-of-type(1)")
    public WebElement UpitnikEpilepsija;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(9) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikEpilepsijaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(10) > td:nth-of-type(1)")
    public WebElement UpitnikGenitourinarniProblemi;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(10) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikGenitourinarniProblemiPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(11) > td:nth-of-type(1)")
    public WebElement UpitnikKamenBubregu;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(11) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikKamenBubreguPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(12) > td:nth-of-type(1)")
    public WebElement UpitnikKoznaOboljenja;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(12) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikKoznaOboljenjaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(13) > td:nth-of-type(1)")
    public WebElement UpitnikKronovaBolest;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(13) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikKronovaBolestPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(14) > td:nth-of-type(1)")
    public WebElement UpitnikNeuroloskaMentalna;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(14) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikNeuroloskaMentalnaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(15) > td:nth-of-type(1)")
    public WebElement UpitnikDisajnihOrgana;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(15) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikDisajnihOrganaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(16) > td:nth-of-type(1)")
    public WebElement UpitnikKostijuMisica;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(16) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikKostijuMisicaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(17) > td:nth-of-type(1)")
    public WebElement UpitnikOperacijaMladez;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(17) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikOperacijaMladezPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(18) > td:nth-of-type(1)")
    public WebElement UpitnikPovredaNakonSaobracajneNesrece;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(18) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikPovredaNakonSaobracajneNesrecePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(19) > td:nth-of-type(1)")
    public WebElement UpitnikPovredeGlave;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(19) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikPovredeGlavePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(20) > td:nth-of-type(1)")
    public WebElement UpitnikReumatoidniArtritis;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(20) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikReumatoidniArtritisPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(21) > td:nth-of-type(1)")
    public WebElement UpitnikPoremecajStitne;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(21) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikPoremecajStitnePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(22) > td:nth-of-type(1)")
    public WebElement UpitnikViskokPritisak;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(3) > tbody > tr:nth-of-type(22) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikViskokPritisakPrint;

    @FindBy(css = "html > body > div > div:nth-of-type(1) > main > table:nth-of-type(4) > tbody > tr:nth-of-type(2) > td:nth-of-type(1)")
    public WebElement BeleskaPranjeNovca;

    @FindBy(css = "html > body > div > div:nth-of-type(1) > main > table:nth-of-type(4) > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement BeleskaPranjeNovcaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")
    public WebElement UpitZanimanjeMup;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitZanimanjeMupPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(2) > td:nth-of-type(1)")
    public WebElement UpitnikLovom;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikLovomPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(3) > td:nth-of-type(1)")
    public WebElement UpitnikAvijacija;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(3) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikAvijacijaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(4) > td:nth-of-type(1)")
    public WebElement UpitnikBiciklizam;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(4) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikBiciklizamPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(5) > td:nth-of-type(1)")
    public WebElement UpitnikBorilackeVestine;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(5) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikBorilackeVestinePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(6) > td:nth-of-type(1)")
    public WebElement UpitnikFudbal;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(6) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikFudbalPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(7) > td:nth-of-type(1)")
    public WebElement UpitnikKosarka;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(7) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikKosarkaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(8) > td:nth-of-type(1)")
    public WebElement UpitnikMotoSport;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(8) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg > path:nth-of-type(2)")
    public WebElement UpitnikMotoSportPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(9) > td:nth-of-type(1)")
    public WebElement UpitnikOdbojka;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(9) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikOdbojkaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(10) > td:nth-of-type(1)")
    public WebElement UpitnikPadobranstvo;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(10) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikPadobranstvoPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(11) > td:nth-of-type(1)")
    public WebElement UpitnikParaglajding;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(11) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikParaglajdingPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(12) > td:nth-of-type(1)")
    public WebElement UpitnikPlaninarenje;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(12) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikPlaninarenjePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(13) > td:nth-of-type(1)")
    public WebElement UpitnikPomorac;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(13) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikPomoracPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(14) > td:nth-of-type(1)")
    public WebElement UpitnikRonjenje;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(14) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikRonjenjePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(15) > td:nth-of-type(1)")
    public WebElement UpitnikRudari;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(15) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikRudariPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(16) > td:nth-of-type(1)")
    public WebElement UpitnikRukomet;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(16) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikRukometPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(17) > td:nth-of-type(1)")
    public WebElement UpitnikVatrogasac;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(17) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikVatrogasacPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(19) > td:nth-of-type(1)")
    public WebElement UpitnikZanimanjeSportHobi;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(19) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikZanimanjeSportHobiPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(20) > td:nth-of-type(1)")
    public WebElement UpitnikZimskeSportove;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(20) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikZimskeSportovePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(21) > td:nth-of-type(1)")
    public WebElement UpitnikZanimanjeObezbedjenje;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(5) > tbody > tr:nth-of-type(21) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UpitnikZanimanjeObezbedjenjePrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(1) > td:nth-of-type(1)")
    public WebElement DopunskoNaknada;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement DopunskoNaknadaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(2) > td:nth-of-type(1)")
    public WebElement DopunskoNezgoda;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement DopunskoNezgodaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(4) > td:nth-of-type(1)")
    public WebElement PosebniUsloviLomKostiju;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(4) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PosebniUsloviLomKostijuPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(5) > td:nth-of-type(1)")
    public WebElement PosebniUsloviPrivremenaRadna;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(5) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement PosebniUsloviPrivremenaRadnaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(6) > td:nth-of-type(1)")
    public WebElement TabelaInvaliditetaPOS;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(6) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement TabelaInvaliditetaPOSPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(7) > td:nth-of-type(1)")
    public WebElement DzokerPlus;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(7) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement DzokerPlusPrint;

    @FindBy(css = "html > body > div > div:nth-of-type(1) > main > table:nth-of-type(6) > tbody > tr:nth-of-type(8) > td:nth-of-type(1)")
    public WebElement UsloviHIBolesti;

    @FindBy(css = "html > body > div > div:nth-of-type(1) > main > table:nth-of-type(6) > tbody > tr:nth-of-type(8) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UsloviHIBolestiPrint;

    @FindBy(css = "html > body > div > div:nth-of-type(1) > main > table:nth-of-type(6) > tbody > tr:nth-of-type(9) > td:nth-of-type(1)")
    public WebElement UsloviHINezgoda;

    @FindBy(css = "html > body > div > div:nth-of-type(1) > main > table:nth-of-type(6) > tbody > tr:nth-of-type(9) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UsloviHINezgodaPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(10) > td:nth-of-type(1)")
    public WebElement UsloviRizikoKredit;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(10) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UsloviRizikoKreditPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(11) > td:nth-of-type(1)")
    public WebElement UsloviTezeBolesti;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(11) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UsloviTezeBolestiPrint;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(12) > td:nth-of-type(1)")
    public WebElement UsloviOsiguranjeDece;

    @FindBy(css = "html > body > div > div > main > table:nth-of-type(6) > tbody > tr:nth-of-type(12) > td:nth-of-type(2) > a > span:nth-of-type(1) > svg")
    public WebElement UsloviOsiguranjeDecePrint;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div:nth-of-type(4) > div > button")
    public WebElement SpektarPOS;

    @FindBy(css = "textarea[aria-invalid='false']")
    public WebElement ClientName;

    @FindBy(css = "#dateOfBirth")
    public WebElement inputDateBirth;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div:nth-of-type(1) > div > div:nth-of-type(4) > label:nth-of-type(2) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement inputGender;

    @FindBy(css = "#height")
    public WebElement inputHeight;

    @FindBy(css = "#weight")
    public WebElement inputWeight;

    @FindBy(css = "#durationOfInsuranceYears")
    public WebElement inputDurationInsuranceYears;

    @FindBy(css = "input[value='true']")
    public WebElement inputIndexation;

    @FindBy(css = "input[value='false']")
    public WebElement inputIndexation2;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(5) > div:nth-of-type(2) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement inputCalculationBase;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div > div:nth-of-type(5) > div:nth-of-type(2) > div > label:nth-of-type(2) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement inputCalculationBase2;

    @FindBy(css = "#amount")
    public WebElement inputAmount;

    @FindBy(css = "button[aria-label='[object Object]']")
    public WebElement PrikaziPakete;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(1) > div > div > div:nth-of-type(7) > span > span:nth-of-type(1) > input")
    public WebElement Kompakt;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div > div:nth-of-type(7) > span > span:nth-of-type(1) > input")
    public WebElement Optimum;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div > div > div:nth-of-type(7) > span > span:nth-of-type(1) > input")
    public WebElement Premium;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(4) > div > div > div:nth-of-type(7) > span > span:nth-of-type(1) > input")
    public WebElement TezeBolestiPaket;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(5) > div > div > div:nth-of-type(7) > span > span:nth-of-type(1) > input")
    public WebElement TezeBolestiPlus;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(2) > div > div:nth-of-type(6) > div > div > div:nth-of-type(7) > span > span:nth-of-type(1) > input")
    public WebElement PremiumPlus;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(2) > div > div > div > div:nth-of-type(4) > div > button:nth-of-type(2) > span:nth-of-type(1)")
    public WebElement InfoOfferPrint;

    @FindBy(xpath = "//button[contains(@style, 'right;')]")
    public WebElement Ugovaranje;

    @FindBy(css = "#identificationNumber")
    public WebElement inputIdentificationNumber;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(1) > button > span:nth-of-type(1) > svg")
    public WebElement JMBGSearch;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(1) > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement Checkbox;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(2) > div > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement inputPostOfficeAddressSame;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(2) > div:nth-of-type(3) > div > label:nth-of-type(2) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement inputHasNotification;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(4) > div:nth-of-type(4) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement FunkcionerYes;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(4) > div:nth-of-type(5) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement PolitickiIzlozenaYes;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(4) > div:nth-of-type(6) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement MedijskiEksponiranaYes;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(4) > div:nth-of-type(6) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement FATCAIndiciaYes;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(4) > div:nth-of-type(8) > div > div:nth-of-type(1) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement SADDrzavljanstvo;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div:nth-of-type(2) > div > div > div > div > div:nth-of-type(4) > div:nth-of-type(9) > div > div:nth-of-type(2) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement PoreskiObveznikSAD;

    @FindBy(css = "html > body > div:nth-of-type(1) > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(2) > button:nth-of-type(2) > span:nth-of-type(1)")
    public WebElement NextPagePerson;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div > div > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(2) > button > span:nth-of-type(1) > svg")
    public WebElement DodajKorisnika;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div > div > div > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(1) > div > div:nth-of-type(1) > div > input")
    public WebElement inputNameKorisnika;

    @FindBy(xpath = "/html/body/div/div[1]/main/div[3]/div/div/div/div[2]/button[2]")
    public WebElement NextPageKorisnik;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(2) > button:nth-of-type(2)")
    public WebElement NextPageKorisnik1;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(2) > button:nth-of-type(2) > span:nth-of-type(1)")
    public WebElement NextPageZU;

    @FindBy(css = "input[value='Štednja']")
    public WebElement inputStednja;

    @FindBy(css = "input[value='Zaposlen']")
    public WebElement inputZaposlen;

    @FindBy(css = "input[value*='ili']")
    public WebElement inputStalniZaradaPorodiPrimanja;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement LosaReputacija;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(3) > div > div > div:nth-of-type(2) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement TajnostTransakcija;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(4) > div > div > div:nth-of-type(2) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement Identifikacija;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(5) > div > div > div:nth-of-type(2) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement Transakcija;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(6) > div > div > div:nth-of-type(2) > div > label:nth-of-type(1) > span:nth-of-type(1) > span:nth-of-type(1) > input")
    public WebElement InformacijeKlijent;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(2) > button:nth-of-type(2) > span:nth-of-type(1)")
    public WebElement NextPageAML;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(2) > button:nth-of-type(2) > span:nth-of-type(1)")
    public WebElement NextPagePlacanje;

    @FindBy(css = "button[class='jss111 jss434 jss438 jss443 jss430'] span[class='jss176']")
    public WebElement Aktiviraj;

    @FindBy(css = "button[class='jss111 jss434 jss438 jss443 jss430'] span[class='jss435']")
    public WebElement spanAktiviraj;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div:nth-of-type(3) > table > tbody > tr:nth-of-type(1) > td:nth-of-type(2) > button > span:nth-of-type(1)")
    public WebElement PrintOffer;

    @FindBy(css = "html > body > div > div > main > div:nth-of-type(3) > div > div > div > div:nth-of-type(1) > div:nth-of-type(3) > table > tbody > tr:nth-of-type(2) > td:nth-of-type(2) > button > span:nth-of-type(1)")
    public WebElement UplatnicaPrint;

    @FindBy(css = "button[class='jss111 jss434 jss438 jss443 jss431'] span[class='jss435']")
    public WebElement PotvrdaPotpisa;

    @FindBy(css = "button[class='jss111 jss434 jss438 jss443 jss432'] span[class='jss435']")
    public WebElement IzmenaPonistenje;

    @FindBy(css = "a[onclick='return showIFrame(\"https://mne-test-iis2.stech.loc/BusinessEntities/IFrameForms/IFrameClientMain/3/4/0/4/2/1/0/2/1/1/0/0/0/0/1/0/595/634900/43\", 1000, 600, 1, 0);(6, -1, \":0:1\");']")
    public WebElement OsiguranikDodaj;


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

    @FindBy(css = "#Kol2")
    public WebElement StartOfInsurance;

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

    @FindBy(css = "#selProducts")
    public WebElement ProductsMNE;

    @FindBy(css = "label[for='Kol14_195']")
    public WebElement SMEKMPCheckbox;

    @FindBy(css = "#Kol2")
    public WebElement DatumPocetka;

    @FindBy(css = "label[for='qnn_1_0_1'] span")
    public WebElement Stednja;

    @FindBy(css = "label[for='qnn_1_1_1'] span")
    public WebElement Zaposlen;

    @FindBy(css = "label[for='qnn_1_2_0'] span")
    public WebElement StalniIzvori;

    @FindBy(css = "label[for='qnn_1_8_0'] span")
    public WebElement NegativnaSaznanja;

    @FindBy(css = "label[for='qnn_1_9_0'] span")
    public WebElement TajnostTransakcije;

    @FindBy(css = "label[for='qnn_1_10_0'] span")
    public WebElement IdentifikacijaProblem;

    @FindBy(css = "label[for='qnn_1_11_0'] span")
    public WebElement KlijentInformacije;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 0, 1);']")
    public WebElement PolisaStampaj;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 1, 1);']")
    public WebElement KID;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 2, 1);']")
    public WebElement StampaAML;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 3, 1);']")
    public WebElement PismoPropratno;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 4, 1);']")
    public WebElement StampaUplatnica;

    @FindBy(css = "#inp_7271_1")
    public WebElement inputDozivljenje;

    @FindBy(css = "#btn_Confirm")
    public WebElement linkConfirm;

    @FindBy(css = "#btn_CreatePolicy")
    public WebElement linkCreatePolicy;

    @FindBy(css = "#MainContent_IndividualClientLifeFormView_UpdateButton")
    public WebElement linkMainContentIndividualClient;

    @FindBy(css = "button[class='swal2-confirm swal2-styled']")
    public WebElement SavePerson;
    
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

    @FindBy(css = "#tab_Persons")
    public WebElement linkTabPersons;

    @FindBy(css = "label[for='Kol14_60']")
    public WebElement labelVinkulacijom;

    @FindBy(css = "#MainContent_wucIndividualBusinessEntitySearch_tbOIB")
    public WebElement inputOIB;

    @FindBy(css = "#MainContent_wucIndividualBusinessEntitySearch_SearchButton")
    public WebElement personSearch;

    @FindBy(css = "#MainContent_wucIndividualBusinessEntitySearch_IndividualBusinessEntitiesListView_ProcessingButton_0")
    public WebElement personPreview;

    @FindBy(css = "#MainContent_IndividualClientLifeFormView_lbAccept")
    public WebElement personAccept;

    @FindBy(css = "a[onclick='return showDocumentNotificationIFrame(628746,1,4,\"https://aasv098.uniqa.hr/BusinessEntities/IFrameForms/IFrameContactAddresses/4/3192288/2/87\", 1000, 600, 1, 0);(5, -1, \":0:1\");']")
    public WebElement AddContactAddress;

    @FindBy(css = "#MainContent_ucBusinessEntityNotifications_BusinessEntityAddressesListView_btnSelect_1")
    public WebElement linkMainContentBusinessEntity;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(15) > div > div > div > div:nth-of-type(2) > div > div")
    public WebElement divDodaj;

    @FindBy(css = "#tab_Concerns")
    public WebElement linkTabConcerns;

    @FindBy(css = "#qnn_6_6")
    public WebElement inputAlkohol;

    @FindBy(css = "#qnn_6_9")
    public WebElement inputImePrezimeDoktor;

    @FindBy(css = "label[for='qnn_6_4_0']")
    public WebElement NEZdrav;

    @FindBy(css = "#qnn_6_4_0_0")
    public WebElement NEZdravOpis;

    @FindBy(css = "label[for='qnn_1_2_0']")
    public WebElement labelStalniPlaMirovinaIli;

    @FindBy(css = "#qnn_1_2_0_0")
    public WebElement inputStalniIzvori;

    @FindBy(css = "label[for='qnn_1_3_0']")
    public WebElement RH;

    @FindBy(css = "label[for='qnn_1_4_1']")
    public WebElement StalniRezidentDa;

    @FindBy(css = "label[for='qnn_1_5_0']")
    public WebElement DaIdentifikacijskiBroj;

    @FindBy(css = "label[for='qnn_1_7_1']")
    public WebElement NeDrugaOsoba;

    @FindBy(css = "label[for='qnn_1_9_0']")
    public WebElement NeZakonski;

    @FindBy(css = "#qnn_1_10")
    public WebElement inputDjelatnostStranke;

    @FindBy(css = "#tab_Printouts")
    public WebElement linkTabPrintoutsCRO;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 0, 1);']")
    public WebElement linkIspisOriginalaPolisa;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 1, 1);']")
    public WebElement linkIspisOriginalaPismoZahvale;

    @FindBy(css = "a[onclick='return openItemForPrint(1, 2, 1);']")
    public WebElement linkIspisOriginalaNalogZaPlacanje;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div > div > div > div > table > tbody > tr > td:nth-of-type(8) > span > a > img")
    public WebElement VinculationsAction;

    @FindBy(css = "a[onclick='return openItemFromGrid(1, 0, \":1:2\");']")
    public WebElement IspisVinkulacija;
    
    @FindBy(css = "td[class$='4']")
    public WebElement VinculationStatus;

    @FindBy(css = "#Kol22")
    public WebElement inputOIBVinculationCompany;

    @FindBy(xpath = "//*[@id='btn_Print']")
    public WebElement PrintTestPrikladnosti;

    @FindBy(xpath = "//*[@id='btn_CreateNewContract']")
    public WebElement linkCreateNewContract;

    @FindBy(xpath = "//label[@for='qnn_6_0_1']")
    public WebElement ZdravSam;

    @FindBy(xpath = "//*[@id='qnn_6_1']")
    public WebElement Alkohol;

    @FindBy(xpath = "//label[@for='qnn_6_2_0']")
    public WebElement Nepusac;

    @FindBy(xpath = "//label[@for='qnn_6_3_0']")
    public WebElement NeDroga;

    @FindBy(xpath = "//*[@id='qnn_6_4']")
    public WebElement DRImePrezime;

    @FindBy(xpath = "//label[@for='qnn_6_5_0']")
    public WebElement NeDeformitet;

    @FindBy(xpath = "//label[@for='qnn_6_6_0']")
    public WebElement NeObiteljBolest;

    @FindBy(xpath = "//a[@onclick='return openItemForPrint(1, 3, 1);']")
    public WebElement TestPrikladnosti;

    @FindBy(xpath = "//label[@for='Kol14_90']")
    public WebElement labelUgovorenoPoveAnjePremije;

    @FindBy(xpath = "//*[@id='Kol62']")
    public WebElement VrijednostPovecanjaPremije;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > fieldset > div > div > div > div:nth-of-type(1)")
    public WebElement divOsiguranaOsobaStrani;

    @FindBy(css = "html > body > form > div:nth-of-type(4) > div:nth-of-type(2) > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > fieldset > div > div > div > div:nth-of-type(2)")
    public WebElement divStrani;

    @FindBy(css = "#Kol8 div[align='left']")
    public WebElement divZanimanje2;


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

    @FindBy(css = "div[class$='comfortextraplus']")
    public WebElement ComfortExtraPlus;


    @FindBy(css = "#Kol112")
    public WebElement BusinessUnit;

    @FindBy(css = "#Kol25")
    public WebElement BrojPonude;

    @FindBy(css = "#qnn_6_7")
    public WebElement inputZU;

    @FindBy(css = "#qnn_6_15")
    public WebElement inputZUUniqo;

    @FindBy(css = "a[onclick='return showIFrame(\"https://t-unba-iis.uniqa.ba/BusinessEntities/IFrameForms/IFrameClientMain/5/4/0/7/17/1/0/2/1/0/0/0/0/0/1/0/548/668750/29\", 1000, 600, 1, 0);(22, -1, \":0:1\");']")
    public WebElement linkDodajOsiguranik;

    @FindBy(css = "a[onclick='return removeItemFromGrid(2, -1, \":0:1\");']")
    public WebElement KorisnikSmrt;

    @FindBy(css = "label[for='Kol17']")
    public WebElement labelUgovaraIstoLice;

    @FindBy(css = "input[id='Kol17']")
    public WebElement ClientInfoBA;

    @FindBy(css = "#tab_Concerns")
    public WebElement TabConcernsBA;

    @FindBy(css = "#tab_MoneyLaundry")
    public WebElement TabMoneyLaundry;

    @FindBy(css = "label[for='qnn_1_0_1']")
    public WebElement labelTednja;

    @FindBy(css = "label[for='qnn_1_1_1']")
    public WebElement labelZaposlenBA;

    @FindBy(css = "label[for='qnn_1_2_0']")
    public WebElement labelStalniPlataPorodiPrimanja;

    @FindBy(css = "label[for='qnn_1_3_1']")
    public WebElement UsvojeIme;

    @FindBy(css = "label[for='qnn_1_4_0']")
    public WebElement TrecaOsoba;

    @FindBy(css = "label[for='qnn_1_9_0']")
    public WebElement ClanPorodicePolisa;

    @FindBy(css = "label[for='qnn_1_11_0']")
    public WebElement FatcaIndicija;

    @FindBy(css = "label[for='qnn_1_12_0']")
    public WebElement SaznanjaNegativna;

    @FindBy(css = "label[for='qnn_1_13_0']")
    public WebElement TransakcijaTajnost;

    @FindBy(css = "label[for='qnn_1_14_0']")
    public WebElement IdentifikacijaProblemBA;

    @FindBy(css = "label[for='qnn_1_15_1']")
    public WebElement InformacijeKlijentBA;

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
