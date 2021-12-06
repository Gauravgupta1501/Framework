package com.metlife.components.PageObjects;



public class PageObject_Home {

    	
    	//public String username = "//input[@id='username']";
    	public String username = "//input[@id='userNameId']";
    	//public String password = "//input[@name='password']";
    	public String password = "//input[@id='passwordId']";
    	//public String signIn = "//input[@name='submit']";
    	public String signIn = "//button[@class='login-btn ml-button-primary loginButton']";
    	public String portalAccount = "(//a[contains(text(),'View Accounts')])[2]";
    	public String accessCode = "//input[@id='txtAccessCode']";
    	
    	//Admin portal
    	public String usernameAdmin = "//input[@type='text']";
    	public String passwordAdmin = "//input[@type='password']";
    	public String signInAdmin = "//input[@type='submit']";
    	public String organization = "(//td[@class='headertext'])[1]";
    	public String organizationName = "//input[@name='organizationName']";
    	public String relationWithMetlife = "//select[@name='metlifeRelationShip']";
    	public String relationWithMetlifeOption = "//option[@value='AU']";
    	public String goAdmin1 ="(//input[@src='/MetLinkPortal/jsp/admin/images/btn_go.gif'])[1]";
    	public String goOrg1 = "(//input[@src='../jsp/images/btn_go.gif'])[1]";
    	public String goOrg2 = "(//input[@src='../jsp/images/btn_go.gif'])[2]";
    	public String ABCCompany = "(//a[text()='ABC COMPANY'])[1]";
    	public String submitAdmin = "//input[@src='../jsp/images/btn_submit.gif']";
    	public String changeRecordAdmin = "//img[@src='../jsp/images/btn_changerecord.gif']";
    	public String homeAdmin = "//a[text()='Home']";
    	public String viewchangeOrganization = "(//td[@class='tableHeading'])[2]";
    	public String searchCriteria1 = "(//input[@name ='searchCriteria'])[1]";
    	public String goAdmin2 = "(//input[@src='/MetLinkPortal/jsp/admin/images/btn_go.gif'])[2]";
    	public String customersAdmin = "(//td[@class='headertext'])[4]";
    	public String addnewcustomer = "(//td[@class='headertext'])[5]";
    	public String goAdmin3 = "(//input[@src='/MetLinkPortal/jsp/admin/images/btn_go.gif'])[3]";
    	public String viewChangeCustomer = "(//td[@class='headertext'])[6]";
    	public String searchCriteria2 = "(//input[@name ='searchCriteria'])[2]";
    	public String searchCriteriaORG = "(//input[@name ='searchCriteria'])";
    	public String goAdmin4 = "(//input[@src='/MetLinkPortal/jsp/admin/images/btn_go.gif'])[4]";
    	public String customerAdmin = "//a[contains(text(),'Customers')]";
    	public String editCustomerInfo = "(//td[@class='headertext'])[1]";
    	public String customerSubmit = "//input[@src='../jsp/images/btn_submit.gif']";
    	public String usersAdmin = "(//td[@class='headertext'])[7]";
    	public String usersAdmin1 = "(//td[@class='headertext'])[1]";
    	public String newUserAdmin = "(//input[@name ='searchString'])[1]";
    	public String goAdmin5 = "(//input[@src='/MetLinkPortal/jsp/admin/images/btn_go.gif'])[5]";
    	public String addUserAdmin = "(//img[@src='./jsp/images/btn_adduser.gif'])[1]";
    	public String addnewUser = "(//td[@class='headertext'])[8]";
    	public String viewChangeUser = "(//td[@class='headertext'])[9]";
    	public String searchcriteria3 = "(//input[@name ='searchString'])[2]";
    	public String goAdmin6 = "(//input[@src='/MetLinkPortal/jsp/admin/images/btn_go.gif'])[6]";
    	public String organizations = "//a[text()='Organizations']";
    	public String customers = "//a[text()='Customers']";
    	public String users = "//a[text()='Users']";
    	public String contentMngmt = "//a[text()='Content Mgmt']";
    	public String groups = "//a[text()='Groups']";
    	public String upload = "//a[text()='Upload']";
    	public String recertification = "//a[text()='Recertification']";
    	public String custNumAdmin = "//input[@name='addCriteria']";
    	public String custGoAdmin = "(//input[@src='/EmployerAdminWeb/jsp/images/btn_go.gif'])[1]";
    	public String custGoAdmin1 = "(//input[@src='/EmployerAdminWeb/jsp/images/btn_go.gif'])[2]";
    	public String customerAdminNo = "(//td[@class='datafill'])[1]";
    	public String customerAdminNo1 = "//a[contains(text(),'0028330')]";
    	public String custsubmit1 = "//img[@src='../jsp/images/btn_submit.gif']";
    	public String custNumberDD = "//select[@name='searchType']";
    	public String custNumberOp = "//option[@value='custnumber']";
    	public String gousersAdmin1 = "(//input[@name='submit'])[1]";
    	public String gousersAdmin2 = "(//input[@name='submit'])[2]";
       	public String lastnameUsers = "//input[@name='lastname']";
    	public String firstnameUsers = "//input[@name='firstname']";
    	public String siteaccessUsers = "//input[@name='metlink']";
    	public String definesecuritynow = "//img[@src='./jsp/images/btn_definesecuritynow.gif']";
    	public String definesecurityLater = "//img[@src='./jsp/images/btn_definesecuritylater.gif']";
    	public String viewchangeRecordUsers = "//img[@src='./jsp/images/btn_viewchangerecord.gif']";
    	public String userTypeDD = "//select[@name='userType']";
    	public String userTypeOp = "//option[@value='I']";
    	public String searchTypeuserDD1 = "(//select[@name='searchType'])[1]";
    	public String searchTypeuserOp1 = "(//option[@value='Onumber'])[1]";
    	public String searchbyUserDD = "(//select[@name='searchType'])[2]";
    	public String searchbyUserOp = "//option[@value='ULname']";
    	public String searchbyUserText = "//input[@id='txtOrgNameNo22']";
    	public String userLN = "/html/body/form/table/tbody/tr[2]/td[2]/table[2]/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[3]/td[1]/a";
    	public String userRecordAdmin = "//td[contains(text(),' User Record ')]";
    	public String addnewContent = "(//input[@name='contentOption'])[1]";
    	public String submitCM  = "//img[@src='./jsp/images/btn_submit.gif']";
    	public String referenceName = "//input[@id='txt_refname']";
    	public String mainheadLine = "//textarea[@id='headline']";
    	public String submitCM1 = "//input[@src='./jsp/images/btn_submit.gif']";
    	public String continueCM = "//img[@name='btn_continue']";
    	public String submitCM2 = "//img[@src='/EmployerAdminWeb/jsp/images/btn_submit.gif']";
    	public String returnToMenu = "(//img[@src='/EmployerAdminWeb/jsp/images/btn_returntomenu.gif'])[2]";
    	public String manageExistingContent = "(//input[@name='contentOption'])[2]";
    	public String prioritySortActiveContent = "(//input[@name='contentOption'])[3]";
    	public String addManageGroups = "(//input[@name='contentOption'])[4]";
    	public String submitCM3 = "//img[@src='./jsp/images/btn_submit.gif']";
    	public String emailUploadAdmin = "//input[@name='email']";
    	public String submitGroup1 = "(//img[@src='./jsp/images/btn_submit.gif'])[1]";
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	public String Add_View_Change_employee = "//a[text()='Add/View/Change employee(s)']";
    	public String customer = "//select[@name='customerSelected']";
    	public String next1 = "//input[@name='submit']";
    	public String option1 = "//option[@value= '5760607,T#ALLIANCE FOR COLLEGE-READY PUBLIC SCHOOLS (05760607)']";
    	public String option2 = "//option[@value= '0017250,U#CATERPILLAR INC. (0017250)']";
    	public String option3 = "//option[@value= '1137000,C#CITIGROUP (01137000)']";
    	public String option4 = "//option[@value= '0175860,C#ENDOLOGIX, INC. (0175860)']";
    	public String option5 = "//option[@value= '5914085,C#EZBILL UAT CUST1 REPUBLISH (5914085)']";
    	public String option6 = "//option[@value= '5998049,C#MACOUPIN COUNTY EMPLOYEES (5998049)']";
    	public String option7 = "//option[@value= '5533057,T#NORTHFIELD MANUFACTURING, INC. (05533057)']";
    	public String option8 = "//option[@value= '0211370,C#VALLEY PRESBYTERIAN HOSPITAL (0118899)']";
    	public String Select_Customer = "//a[contains(text(),'Select Customer')]";
    	public String Search_Again = "//img[@src='jsp/images/search_again.gif']";
    	public String Change_Customer = "//a[contains(text(),'Change Customer')]";
    	public String AddNewEmp = "//a[contains(text(),'Add a new employee')]";
    	public String Cancel = "//img[@src='jsp/images/btn_cancel.gif']";
    	public String view_ChangeEmp = "//a[contains(text(),'View/change an employee')]";
    	public String view_Change_MulEmp = "//a[contains(text(),'View/change multiple employees')]";
    	public String lastName = "(//input[@type='text'])[2]";
    	public String goSubmit1 = "//input[@src='../jsp/images/btn_go.gif']";
    	public String goSubmit = "//img[@src='jsp/images/btn_go.gif']";
    	public String employe = "(//u[contains(text(),'')])[6]";
    	public String view_ChangeEmploye = "//img[@src='../jsp/images/view_ch_emp.gif']";
    	public String addCoverage = "//img[@src='../jsp/images/Add-Coverage.gif']";
    	public String Lastname = "(//input[@type='text'])[5]";
    	public String GoButton = "//img[@src='jsp/images/btn_go.gif']";
    	public String continueAddingNewEmploye = "/html/body/table[2]/tbody/tr[3]/td[2]/form/table[2]/tbody/tr/td/table/tbody/tr[1]/td/a[2]";
    	public String cancelAdding = "//img[@src='jsp/images/btn_cancel.gif']";
    	public String name = "//a[text()='ABRION, BELEV']";
    	public String continueAddingEmp = "/html/body/table[2]/tbody/tr[3]/td[2]/form/table[2]/tbody/tr/td/table/tbody/tr[1]/td/a[2]";
    	public String empIDnew = "//input[@name='employeeId']";
    	public String empIDconfirm = "//input[@name='confirmEmployeeID']";
    	public String Ssn1 = "//input[@name='ssn1']";
    	public String Ssn2 = "//input[@name='ssn2']";
    	public String Ssn3 = "//input[@name='ssn3']";
    	public String Lname = "//input[@name='lastName']";
    	public String Fname = "//input[@name='firstName']";
    	public String add1 = "//input[@name='address1']";
    	public String add2 = "//input[@name='address2']";
    	public String City = "//input[@name='city']";
    	public String statedd = "//select[@name='stateCode']";
    	public String stateop = "//option[@value='AK']";
    	public String zipCode1 = "//input[@name='zipCode1']";
    	public String zipCode2 = "//input[@name='zipCode2']";
    	public String birthDateMm =  "//input[@name='birthDateMm']";
    	public String birthDatedd = "//input[@name='birthDateDd']";
    	public String birthDateYY = "//input[@name='birthDateYyyy']";
    	public String GenderF = "(//input[@name='gender'])[2]";
    	public String hireDateMm = "//input[@name='hireDateMm']";
    	public String hireDatedd = "//input[@name='hireDateDd']";
    	public String hireDateYY = "//input[@name='hireDateYyyy']";
    	public String divisioCode = "//select[@name='divisionCode']";
    	public String divisionCodeop = "(//option[@value='0001'])[1]";
    	public String classCodedd = "//select[@name='classCode']";
    	public String classCodeop = "(//option[@value='0001'])[2]";
    	public String empLteradio = "(//input[@name='lateEntrantFlag'])[2]";
    	public String isQualifyradio = "(//input[@name='isQualifying'])[2]";
    	public String nextN = "//img[@src='jsp/images/btn_next.gif']";
    	
    	public String view_ChangeAnotherEmp = "//img[@src='jsp/images/tab_NEon_vce.gif']";
    	public String vCEmp = "/html/body/table[1]/tbody/tr/td[3]/a/img";
    	public String selectProcess = "//select[@name='selectedProcess']";
    	public String viewchangeEmp = "//a[contains(text(),'View/Change Multiple Employees')]";
    	public String searchBy = "//select[@name='selectedSearchBy']";
    	public String empLastName = "//option[@value='empLstNm']";
    	public String empLastNameInput = "//input[@name='enteredSearchValue']";
    	public String empName = "//a[text()='ABRION, BELEV']";
    	public String changeEmpInfo = "//img[@src='jsp/images/btn_chempinfo.gif']";
    	public String cancelcoverage = "//img[@src='jsp/images/btn_cancel.gif']";
    	public String viewCoverageHistory = "//a[@class='whitetext']";
    	public String addChangeCoverageInfo = "//img[@src='jsp/images/btn_addchcovinfo.gif']";
    	public String stopcoverage = "//img[@src='jsp/images/btn_stopcoverage.gif']";
    	public String addDependent = "//img[@src='jsp/images/btn_adddependent.gif']";
    	public String PFM = "//select[@name='famInd']";
    	public String PFMOption = "//option[@value='A']";
    	public String additionalchild = "//input[@type='text']";
    	public String nextdependent = "//img[@src='jsp/images/btn_next.gif']";
    	public String viewchangemultipleEmp = "//img[@src='jsp/images/tab_VCEon_vcme.gif']";
    	public String processOption = "//option[@value='1']";
    	public String processOption1 = "//option[@value='2']";
    	public String processOption2 = "//option[@value='3']";
    	public String selectDivisionCode = "//select[@name='divisionCode']";
    	public String divisionCodeOption = "(//option[@value='0001'])[1]";
    	public String classCode = "//select[@name='classCode']";
    	public String classCodeOption = "(//option[@value='0001'])[2]";
    	public String gocode = "//input[@src='jsp/images/btn_go.gif']";
    	public String empchkBox = "//input[@id='toggleAll']";
    	public String clearALL = "//a[contains(text(),'clear all')]";
    	public String empchkboxName = "//input[@id='empCheck11']";
    	public String terminationDD = "//select[@id='empTermReason11']";
    	public String terminationOp = "(//option[@value='IN'])[12]";
    	public String terminateDate = "//input[@id='empTermMM11']";
    	public String terminateButton = "//img[@src='jsp/images/btn_terminate.gif']";
    	public String continueCode = "//input[@src='jsp/images/btn_continue.gif']";
    	public String viewEmployeRecord = "/html/body/table[2]/tbody/tr[3]/td[2]/form/table[4]/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[1]/a";
    	public String salraytxtBox = "//input[@id='empNewSalary11']";
    	public String salaryfreDD = "//select[@id='empSalFrequency11']";
    	public String salaryfreOP = "(//option[@value='A'])[13]";
    	public String salaryDate = "//input[@id='empSalEffMM11']";
    	public String submitsalary = "//img[@src='jsp/images/btn_submit.gif']";
    	
    	//elligibility and enrollment
    	public String employeID = "//input[@name='employeeNumber']";
    	public String viewChangeDependent = "(//img[@src='../jsp/images/view_ch_dep.gif'])[1]";
    	public String enrollNewEmp = "(//input[@name='processIndicator'])[2]";
    	public String employeID1 = "//input[@name='addNewEmpNumber']";
    	public String confirmEmpID = "//input[@name='confirmEmpId']";
    	public String lastName11 = "//input[@name='lastName']";
    	public String newEmployee = "//a[text()='Search for Existing/Enroll New Employee']";
    	public String addDependent1 = "//img[@src='../jsp/images/add_dep_button.gif']";
    	public String viewChangeEmp = "//img[@src='../jsp/images/view_ch_emp.gif']";
    	public String firstName1 = "//input[@name='firstName']";
    	public String genderCode = "//select[@name='genderCode']";
    	public String genderF = "//input[@value='F']";
    	public String relationCode = "//select[@name='relationCode']";
    	public String relation2 = "//option[@value='2']";
    	public String maritalStatus = "//select[@name='maritalStatus']";
    	public String statusSingle = "//option[@value='S']";
    	public String birthDate = "//input[@name='birthDate']";
    	public String effectiveDate = "//input[@name='covEffDate']";
    	public String effDate = "//input[@name='startDate']";
    	public String empCoverage = "//select[@name='covType']";
    	public String empCoverageX = "//option[@value='X']";
    	public String submitDependent = "//img[@src='../jsp/images/btn_submit.gif']";
    	public String cancelCoverage = "//img[@src='../jsp/images/btn_cancel.gif']";
    	//public String addCoverage = "//img[@src='../jsp/images/Add-Coverage.gif']";
    	public String selectCoverage = "//select[@name='covType']";
    	public String LTD = "//option[@value='LT']";
    	public String effectiveDate1 = "//input[@name='startDate']";
    	public String cancellationDate = "//input[@name='endDate']";
    	public String depCode = "//select[@name='depCode']";
    	public String depCodeOption = "//option[@value='1']";
    	public String coverageStatus = "//select[@name='status']";
    	public String coverageStatusE = "//option[@value='E']";
    	public String groupNumber = "//select[@name='groupNumber']";
    	public String groupNumberOption = "//option[@value='0083478']";
    	public String sub = "//select[@name='subCode']";
    	public String subOption = "//option[@value='0003']";
    	public String branch = "//select[@name='branch']";
    	public String branchOption = "//option[@value='0071']";
    	
    	//UIS Enrollment
    	public String lastNameUIS = "//input[@name='empLastName:Search']";
    	public String searchUIS = "//img[@src='jsp/images/search.gif']";
    	public String empNameUIS = "(//u[contains(text(),'')])[1]";
    	public String editEmpDetailsUIS = "//img[@src='jsp/images/btn_editempdetails.gif']";
    	//public String coverageUIS = "(//input[@type='checkbox'])[2]";
    	public String empAddressUIS = "//input[@name='address1']";
    	public String empCityUIS = "//input[@name='city']";
    	public String empStateSelectUIs = "//select[@name='stateCode']";
    	public String empStateOptionUIs = "//option[@value='AK']";
    	public String zipcodeUIS1 = "//input[@name='zipCode3']";
    	//public String zipcodeUIS2 = "";
    	
    	public String addmodifyCoverageUIS = "//img[@src='jsp/images/btn_addmodcov.gif']";
    	public String nextButtonUIS = "//img[@src='jsp/images/btn_next.gif']";
    	public String acceptButtonUIS = "//img[@src='./jsp/images/btn_accept.gif']";
    	
    	public String terminateCoverageUIS = "//img[@src='jsp/images/btn_terminateallcov.gif']";
    	public String coverageUIS = "(//input[@type='checkbox'])[1]";
    	public String coverageDate1 = "//input[@name='0stopDateMm']";
    	public String coverageDate2 = "//input[@name='0stopDateDd']";
    	public String coverageDate3 = "//input[@name='0stopDateDd']";
    	
    	public String viewCoverageHistoryUIS = "(//a[@class='whitetext'])[1]";
    	public String coverageEmp = "(//a[@class='whitetext'])[2]";
    	
    	public String addDependentUIS = "//img[@src='jsp/images/btn_adddep.gif']";
    	public String additionalNoDeptsUIS = "//input[@name='depNum']";
    	public String nextDeptUIS = "//img[@src='./jsp/images/btn_next.gif']";
    	public String firstNameUIS = "//input[@name='1FirstName']";
    	public String relationSelectUIS = "//select[@name='1Relation']";
    	public String relationOptionUIS = "//option[@value='02']";
    	public String date1UIS = "//input[@name='1birthDateMm']";
    	public String date2UIS = "//input[@name='1birthDateDd']";
    	public String date3UIS = "//input[@name='1birthDateYyyy']";
    	public String genderSelectUIS = "//select[@name='1Gender']";
    	public String genderoptionUIS = "//option[@value='2']";
    	public String maritalStatusSelectUIS = "//select[@name='1MaritalStatus']";
    	public String maritalStatusOptionUIS = "//option[@value='MARRIED']";
    	
    	public String changeDeptUIS = "//img[@src='jsp/images/btn_chdepinfo.gif']";
    	
    	public String UISEmpId = "//input[@name='newEmployerProvidedId:Add']";
    	public String UISEmpAdd = "//img[@src='jsp/images/add.gif']";
    	public String empLastname = "//input[@id='lastName']";
    	public String confirmEmpId = "//input[@id='employee.confirmEmployerProvidedId']";
    	public String empFirstName = "//input[@id='txt_lname23']";
    	public String empGender = "//select[@id='gender']";
    	public String empGender1 = "//option[@value='2']";
    	public String empMaritalStatus = "//select[@name='employee.maritalStatus']";
    	public String empMaritalStatus1 = "//option[@value='SINGLE']";
    	
    	public String effDateMM = "//input[@id='effMonth0']";
    	public String effDateDD = "//input[@id='effDay0']";
    	public String effDateYY = "//input[@id='effYear0']";
    	public String statusDropdown = "//select[@name='employee.coverage.0.covStatus']";
    	public String statusOption = "(//option[@value='A'])[1]";
    	public String tierDropdown = "//select[@name='employee.coverage.0.covTier']";
    	public String tierOption = "(//option[@value='3'])[1]";
    	public String reportDropdown = "//select[@id='group0']";
    	public String reportOption = "//option[@value='0085836']";
    	public String branchDropdown = "//select[@id='branch0']";
    	public String branchOption1 = "//option[@value='R001']";
    	public String successMsg = "(//td[@class='redtext'])[2]";
    	
    	public String empIdradio = "(//input[@name='searchType'])[2]";
    	public String empIdText = "//input[@name='employerProvidedId:Search']";
    	
    	public String IdNumRadio = "(//input[@type='radio'])[3]";
    	public String IdNumText = "//input[@name='employeeNumber:Search']";
    	
    	
    	//dental
    	public String dental = "//a[text()='Dental']";
    	public String goDental = "//input[@src='images/btn_go.gif']";
    	public String idCardsSelect= "//select[@name='numCards']";
    	public String idCardsOption = "//option[@value='8']";
    	public String submitDental = "//input[@src='images/btn_submit.gif']";
    	public String printDental = "//input[@src='images/print_friend.gif']";
    	
    	
    	
    	
    	
    	
    	public String Life_Enrollment = "//a[text()='Life Enrollment']";
    	public String Home = "//a[text()='Home']";
    	public String statementHealth = "//a[text()='View a Statement of Health']";
    	public String EligibilityReport = "//a[text()='View Eligibility Report']";
    	public String Dental = "//a[text()='Dental']";
    	public String gobutton = "//input[@src='images/btn_go.gif']";
    	
    	public String LastBilling = "//a[text()='List Billing']";
    	public String PayYourBill = "//a[text()='Pay Your Bill (formerly ePay)']";
    	public String continueButton = "//input[@src='../jsp/images/btn_continue.gif']";
    	public String ReleaseFunds = "//a[text()='Release Funds']";
    	public String Select_Process = "/html/body/form/table/tbody/tr[3]/td[2]/a";
    	public String BankAccount = "/html/body/form/table/tbody/tr[8]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
    	public String AssignBranches = "//a[text()='Assign Branches']";
    	public String ChangeCustomer = "//a[@href='/MetLinkBillingWeb/EFT/initializeEFT.do?efthomepath=true']";
    	public String SelectCustomer = "//select[@name='selCustNum']";
    	public String Option2 = "//option[@value='2356891']";
    	public String Option3 = "//option[@value='5914085']";
    	
    	public String SelfAdminBilling = "//a[text()='Self-Administered Billing (formerly eBilling)']";
    	public String Customers = "//select[@name='customerNumber']";
    	public String OPtion1 = "//option[@value='4021,1137000']";
    	public String OPtion2 = "//option[@value='15563487,92245']";
    	public String billinperiodDD = "//select[@name='billingperiod']";
    	public String billingperiodOP = "//option[@value='42020']";
    	public String ContinueButton = "//img[@src='../jsp/images/btn_continue.gif']";
    	public String ProcessBills = "//a[@href='/MetLinkBillingWeb/Billing/GetBillGroupSelection.do']";
    	public String selectGroup = "//select[@name='group']";
    	public String groupOption = "//option[@value='ALL']";
    	public String continueGroup = "//img[@src='../jsp/images/btn_continue.gif']";
    	public String adjustMyBill = "//*[@id='resultFrame']/table/tbody/tr/td/table/tbody/tr[48]/td[3]/a";
    	public String cancelGroup = "//img[@src='../jsp/images/btn_cancel.gif']";
    	public String viewMyBill = "//*[@id='resultFrame']/table/tbody/tr/td/table/tbody/tr[48]/td[4]/a";
    	public String backtoselectBill = "//img[@src='../jsp/images/btn_backtoselbill.gif']";
    	public String downloanBill = "//*[@id='resultFrame']/table/tbody/tr/td/table/tbody/tr[48]/td[5]/a";
    	public String enterMybill = "//*[@id='resultFrame']/table/tbody/tr/td/table/tbody/tr[46]/td[3]/a"; 	
    	public String SelectProcess = "//a[@href='/MetLinkBillingWeb/Billing/GoToProcessSelection.do']";
    	public String CreateInvoice = "//a[@href='/MetLinkBillingWeb/Billing/GenerateInvoice.do']";
    	public String paymentMethodDD = "//select[@name='paymentMethod']";
    	public String paymentMethodOp = "//option[@value='1']";
    	public String invoiceAmount = "//input[@name='ia_0084962_000003']";	
    	public String viewInvoice = "//a[@href='/MetLinkBillingWeb/Billing/GetInvoiceSummary.do']";
    	public String invoiceModify = "//a[contains(text(),'00017')]";
    	public String printInvoice = "(//td[@class='datafill'])[2]";
    	public String viewAccount = "//a[@href='/MetLinkBillingWeb/Billing/GetGroupSelection.do']";
    	public String groupAccountDD = "//select[@name='groupSelected']";
    	public String continueAccount = "//input[@src='../jsp/images/btn_continue.gif']";
    	public String viewAccDetails = "//a[contains(text(),'View Account Details')]";
    	public String branchName = "(//td[@class='datafill'])[3]";
    	
    	
    	public String AccessEReport = "//a[text()='Access eReporting']";
    	public String DCQ = "//table//tbody//tr//td//a[@href='/eReporting/SQRDCQ/']";
    	public String cancelButton = "//img[@src='/eReporting/images/btn_cancel.gif']";
    	public String DCRSR = "//a[@href='/eReporting/SQRDCR/']";
    	public String DCRRR = "//a[@href='/eReporting/SQRDCR/?action=repeat']";
    	public String createReportPackages = "/html/body/table/tbody/tr/td[2]/a[2]/img";
    	public String Requests = "/html/body/table/tbody/tr/td[2]/a[3]/img";
    	public String Links = "/html/body/table/tbody/tr/td[2]/a[4]/img";
    	public String Admin = "/html/body/table/tbody/tr/td[2]/a[5]/img";
    	public String othercontact = "/html/body/form/table/tbody/tr[1]/td/a[2]/img";
    	public String sharedContact = "/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
    	public String previosFolder = "/html/body/form/table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
    	public String uploadcognos = "//img[@src='/eReporting/images/btn_upload_cognos.gif']";
    	public String addanotherContent = "//img[@src='/eReporting/images/Add Other Content.gif']";
    	public String newFolder = "//img[@src='/eReporting/images/btn_newfolder.gif']";
    	
    	public String downloadLatestForms = "//a[text()='Download the latest forms']";
    	public String Disability = "//*[@id='productListForm']/table/tbody/tr[6]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a";
    	public String CLAIM = "(//td[@class='datafill'])[1]";
    	public String CLAIM1 = "(//td[@class='datafill'])[2]";
    	public String other = "(//td[@class='datafill'])[3]";
    	public String other1 = "(//td[@class='datafill'])[4]";
    	public String other2 = "(//td[@class='datafill'])[5]";
    	public String other3 = "(//td[@class='datafill'])[6]";
    	public String other4 = "(//td[@class='datafill'])[7]";
    	public String other5 = "(//td[@class='datafill'])[8]";
    	public String other6 = "(//td[@class='datafill'])[9]";
    	public String other7 = "(//td[@class='datafill'])[10]";
    	public String other8 = "(//td[@class='datafill'])[11]";
    	public String other9 = "(//td[@class='datafill'])[12]";
    	public String other10 = "(//td[@class='datafill'])[13]";
    	public String other11 = "(//td[@class='datafill'])[14]";
    	public String other12 = "(//td[@class='datafill'])[15]";
    	public String other13 = "(//td[@class='datafill'])[16]";
    	public String other14 = "(//td[@class='datafill'])[17]";
    	public String selectCategory = "//a[contains(text(),'Select Category')]";
    	public String LIfef = "//*[@id='productListForm']/table/tbody/tr[6]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[3]/a";
    	
    	
    	public String pensions = "//a[text()='Pensions']";
    	public String SSN1 = "//input[@name='SSN1a']";
    	public String SSN2 = "//input[@name='SSN1b']";
    	public String SSN3 = "//input[@name='SSN1c']";
    	public String SSNsubmit = "//input[@name='submit']";
    	public String lumpsum = "//img[@name='tab_lumpsum_on']";
    	
    	public String TAM = "//a[text()='Total Absence Management (TAM)']";
    	public String disability ="/html/body/table/tbody/tr[6]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[10]/td[4]/div/a";
    	public String customerSelect = "//*[@id='app']/div/div/div[2]/div/div/div/select";
    	public String customeroption = "//select//option[contains(text(),'CAMPBELL SOUP COMPANY-0101350')]";
    	public String goButton = "//button[@class='primary-orange-btn rect-btn']";
    	public String TAMManagerHome = "//a[text()='TAM Manager Home']";
    	public String manageEmailPreferences = "(//img[@id='submitButton'])[3]";
    	public String closeWindow = "//a[text()='X Close Window']";
    	public String HRHome = "//a[text()='HR Home']";
    	public String customiseManagerHome = "//a[text()='Customize Manager HomePage']";
    	public String print = "//a[text()=' Print']";
    	public String search1 = "(//img[@src='presentation/image/search.jpg'])[1]";
    	public String search2 = "(//button[@class='primary-orange-btn rect-btn'])[1]";
    	public String downloadView = "//*[@id='portalcontent']/div[3]/div/div/div/div/div[2]/table[3]/tbody/tr/td[3]/a";
    	public String downloadView1 = "//*[@id='Main-Content-Section']/div[1]/div/div/div[2]/div/div/div[2]/p/a[1]";
    	public String printOption = "//*[@id='Main-Content-Section']/div[1]/div/div/div[2]/div/div/div[2]/p/a[2]";
    	public String reportNewAbsence = "//a[text()='Report New Absence']";
    	public String firstLastName = "//input[@id='searchValueIntake']";
    	public String firstLastName1 = "//input[@id='searchValue']";
    	public String EmployeName = "(//td[@id='retrieveEmployeeDetailsDivtd0'])[1]";
    	public String absenceDropdown = "//select[@name='listSelection']";
    	public String absenceReason = "//option[@value='NAIP']";
    	public String nextButton1 = "//img[@id='next']";
    	public String AddressDropdown = "//select[@name='comboSelection3']";
    	public String AddressOption = "(//option[@value='Yes'])[1]";
    	public String absenceTypeDropdown = "//select[@name='comboSelection10']";
    	public String absenceTypeOption = "//option[@value='Child Bonding']";
    	public String nextButton2 = "//img[@id='next']";
    	public String absenceReasonDropdown = "//select[@name='comboSelection2']";
    	public String absenceReasonOption = "//option[@value='Birth of Child']";
    	public String absenceStartDate = "(//img[@src='presentation/image/calendar.gif'])[1]";
    	public String absenceStartDate1 = "//a[contains(text(),'12')]";
    	public String EndDate = "(//img[@src='presentation/image/calendar.gif'])[2]";
    	public String EndDate1 = "//a[contains(text(),'13')]";
    	public String NRTWDate = "(//img[@src='presentation/image/calendar.gif'])[3]";
    	public String NRTWDate1 = "//a[contains(text(),'14')]";
    	public String RTWDate = "(//img[@src='presentation/image/calendar.gif'])[4]";
    	public String closeButton = "//a[text()='Close']";
    	public String absenceBeDropdown = "//select[@name='comboSelection7']";
    	public String absenceBeoption = "//option[@value='Continuous']";
    	public String employeMarriedDropdown = "//select[@name='comboSelection8']";
    	public String employeMarriedOption = "//option[@value='Yes or Unknown']";
    	public String childRelationDropdown = "//select[@name='comboSelection3']";
    	public String childRelationOption = "//option[@value='Biological Child']";
    	public String firstDayRadio1 = "(//input[@type='radio'])[1]";
    	public String lastDayRadio2 = "(//input[@type='radio'])[3]";
    	public String spouseWorkDropdown = "//select[@name='comboSelection9']";
    	public String spouseWorkoption = "//option[@value='No']";
    	public String reconfirmPassword = "//input[@id='enterPassword']";
    	public String submitAbsence = "//img[@id='next']";
    	public String go1 = "(//img[@src='presentation/image/button-go-accordion.gif'])[1]";
    	public String AbsenceInquiry = "//a[text()='Absence Inquiry']";
    	public String AdvancedFilters = "//img[@src='presentation/image/filters/advanced-filters.gif']";
    	public String selectFilter = "//select[@id='selFilter']";
    	public String caseStructure = "//option[@value='claimAbsenceTypeDiv']";
    	public String showHideAll = "//a[@class='toggleLink']";
    	public String searchFilter = "//img[@id='searchBtn']";
    	
    	public String DailyStatusView = "//a[text()='Daily Status View']";
    	public String downloadStatusView = "//*[@id='td_download']";
    	public String printstatusView = "//*[@id='hr_print_link']";
    	public String TermsOfUse = "//a[text()='Terms of Use']";
    	public String privacy = "//a[text()='Privacy/HIPAA Notices']";
    	public String contactUs = "//a[text()='Contact Us']";
    	public String absenceCalendar = "//img[@src='presentation/image/calendar.gif']";
    	public String month1 = "//a[text()='Jan']";
    	public String backToPage = "//*[@id='portalcontent']/div[3]/div/div/div/div/div[2]/table[1]/tbody/tr/td/div/a";
    	public String reportNewAbsence1 = "//img[@src='presentation/image/ReportNew.gif']";
    	public String empDemographic = "//span[@id='employeeDemographic']";
    	public String downloadLeaveAbsence = "//img[@src='presentation/image/excel.gif']";
    	public String seeallResutls = "(//strong[contains(text(),'See All Results')])[3]";
    	public String backToPage1 = "//*[@id='portalcontent']/div[2]/div/div[3]/div/div/div[2]/div[2]/a";
    	public String claimnum1 = "//td[@id='disabilityClaimsDivtd0']";
    	public String addMsgAttachments = "//a[text()='Add Message / Attachment']";
    	public String submitMsg = "//img[@id='submitLoad']";
    	public String okButton = "//img[@src='./presentation/image/ok_03.gif']";
    	public String dairyNotes = "//img[@src='presentation/image/diaryNotes.gif']";
    	public String searchIcon = "//img[@src='presentation/image/search.jpg']";
    	public String returntoClaimPage = "//a[@id='returnpagelink']";
    	public String editRTW = "//a[text()='Edit Return to Work Information']";
    	public String editRTWDate = "(//img[@src='presentation/image/calendar.gif'])[6]";
    	public String editRTWDate1 = "//a[text()='10']";
    	public String editRTWSave = "(//img[@id='elementSave'])[15]";
    	public String editRTWSubmit = "//img[@src='presentation/image/btn-submit1.jpg']";
    	public String okButton1 = "//img[@src='presentation/image/ok_03.gif']";
    	public String editClaimInfo = "//a[text()='Edit Claim Information ']";
    	public String empSalary = "//a[text()='Salary']";
    	public String FrequencyDropdown = "//select[@name='inputSALMODE']";
    	public String FrequencyOption = "(//option[@value='Y'])[2]";
    	public String saveSalary = "(//img[@src='presentation/image/btn_save.gif'])[16]";
    	public String claimHistory = "//a[text()='Claim History']";
    	public String empSummary = "//a[contains(text(),'Employee Summary')]";
    	
    	
    	
    	
    	
    	
    	
    	
    	public String home="//a[text()='Home']";
    	 public String life="//a[text()='Life']";
    	 public String customerName="//select[@name='searchDO.customerName']";
    	 public String claimType="//select[@name='searchDO.claimType']";
    	 public String originalClaimType="//select[@name='searchDO.originalClaimantType']";
    	 public String employeeID="//input[@value='eeID']";
    	 public String txt_empID="//input[@name='txt_emp_id']";
    	 public String reTypeEmpID="//input[@name='txt_remp_id']";
    	 public String go="(//img[@alt='go'])[1]";
    	 public String errorMsg="//td[contains(text(),'No match')]";
    	 public String claim="(//td[contains(text(),'Claim')])[2]";
    	 public String firstname="//input[@id='lc_Emp_FirstName']";
    	 public String lastname="//input[@id='lc_Emp_LastName']";
    	 public String suffix="//select[@name='participantInfo.empOtherPersonalInfo.suffix']";
    	 public String gender="(//input[@name='participantInfo.empOtherPersonalInfo.sex'])[2]";
    	 public String month="//input[@id='lc_Emp_DOB_MM']";
    	 public String day="//input[@id='lc_Emp_DOB_DD']";
    	 public String year="//input[@id='lc_Emp_DOB_YYYY']";
    	 public String month2="//input[@id='lc_Emp_DOD_MM']";
    	 public String day2="//input[@id='lc_Emp_DOD_DD']";
    	 public String year2="//input[@id='lc_Emp_DOD_YYYY']";
    	 public String empType="//select[@name='participantInfo.employment.empType']";
    	 public String empStatus="//select[@name='participantInfo.employment.empStatus']";
    	 public String LW_Month ="//input[@id='lc_LastWork_MM']";
    	 public String LW_Day="//input[@id='lc_LastWork_DD']";
    	 public String LW_Year="//input[@id='lc_LastWork_YYYY']";
    	 public String lastPrem_Month="//input[@id='lc_LastPrem_MM']";
    	 public String lastPrem_day="//input[@id='lc_LastPrem_DD']";
    	 public String lastPrem_Year="//input[@id='lc_LastPrem_YYYY']";
    	 public String Hire_Month="//input[@id='lc_HireDT_MM']";
    	 public String Hire_Day="//input[@id='lc_HireDT_DD']";
    	 public String Hire_Year="//input[@id='lc_HireDT_YYYY']";
    	 public String city="//input[@id='lc_Emp_City']";
    	 public String state="//select[@id='lc_Emp_State']";
    	 public String zipCode="//input[@name='participantInfo.employeeAddr.zipCode']";
    	 public String country="//select[@name='participantInfo.employeeAddr.countryName']";
    	 public String reason="//input[@id='lc_Nreason']";
    	 public String reasonForStopping="//textarea[@id='lc_ReasonWorkStop']";
    	 public String BEMonth="//input[@id='lc_BaseEarning_MM']";
    	 public String BEDay="//input[@id='lc_BaseEarning_DD']";
    	 public String BEYear="//input[@id='lc_BaseEarning_YYYY']";
    	 public String baseAnnualEarnings="//input[@id='lc_Base_annual_earnings']";
    	 public String next="//img[@alt='Next button - click to proceed to the next step']";
    	 public String EI_Continue="//td[contains(text(),'Employee Information')]";
    	 public String insurance="(//input[@name='participantInfo.empInsurance.lifeInsuranceCancelFlag'])[2]";
    	 public String premiumInsu="(//input[@name='participantInfo.empInsurance.premiumFailedFlag'])[2]";
    	 public String insAssignment="(//input[@name='participantInfo.empInsurance.insuranceAssignedFlag'])[2]";
    	 public String qualityIns="(//input[@name='participantInfo.empInsurance.employeeQualifyFlag'])[2]";
    	 public String creatediv="//input[@id='lc_NewDiv']";
    	/* public String InsCancelMonth="//input[@id='lc_InsCancelDT_MM']";
    	 public String InsCancelDay="//input[@id='lc_InsCancelDT_DD']";
    	 public String InsCancelYear="//input[@id='lc_InsCancelDT_YYYY']";
    	 public String InsAssignMonth="//input[@id='lc_AssignDT_MM']";
    	 public String InsAssignDD="//input[@id='lc_AssignDT_DD']";
    	 public String InsAssignYear="//input[@id='lc_AssignDT_YYYY']";*/
    	 public String divName="//input[@id='lc_DivisionNo']";
    	 public String conFirstName="//input[@id='lc_ContactFname']";
    	 public String conLastName="//input[@id='lc_ContactLname']";
    	 public String EmployerCity ="//input[@id='lc_EmployerCity']";
    	 public String EmployerState="//select[@id='lc_EmployerState']";
    	 public String EmployerZip="//input[@id='lc_EmployerZip']";
    	 public String EmployerCountry="//select[@id='lc_EmployerCountry']";
    	 public String selectBtn1="(//img[@id='sel_btn'])[1]";
    	 
    	 public String coverages="//td[contains(text(),'Select enrolled coverages')]";
    	 public String optionalLife="//input[@id='lc_checkbox_cvgName0']";
    	 public String LastYears="//input[@id='lc_disableIndDate']";
    	 //next
    	 public String covInfo="//td[contains(text(),'Coverage Information')]";
    	 public String amount="//input[@id='lc_txtCvgAmt0']";
    	 public String effMonth="//input[@id='lc_cvg_BeginDtMM0']";
    	 public String effDay="//input[@id='lc_cvg_BeginDtDD0']";
    	 public String effYear="//input[@id='lc_cvg_BeginDtYY0']";
    	 public String EndDtMonth="//input[@id='lc_cvg_EndDtMM0']";
    	 public String EndDtDay="//input[@id='lc_cvg_EndDtDD0']";
    	 public String EndDtYear="//input[@id='lc_cvg_EndDtYY0']";
    	 public String optionDes="//select[@id='lc_option_dscr0']";
    	 public String Value="//input[@value='No']";
    	 public String selectreport="//select[@id='lc_rptNo0']";
    	 public String selectSubCode="//select[@id='lc_subcode0']";
    	 public String selectBranch="//select[@id='lc_branch0']";
    	 //next
    	 public String informatinformation="//td[contains(text(),' Informant Information')]";
    	 public String noRadioBtn1="//input[@id='lc_Info_Qstn_RadioNo']";
    	 public String noRadioBtn2="//input[@id='lc_Bene_Qstn_RadioNo']";
         public String yesRadioBtn1="//input[@id='lc_Info_Qstn_RadioYes']";
         public String yesRadioBtn2 ="//input[@id='lc_Bene_Qstn_RadioYes']";
         public String yesRadioBtn3="//input[@id='lc_Bene_Qstn_Signed_RadioYes']";
         public String informantDetails = "//select[@id='lc_Info_Person_infoDesignation']";
         public String relationship="//select[@id='lc_Info_Person_relToInsured']";
         public String lastnameInfo="//input[@id='lc_Info_Person_LastName']";
         public String firstnameInfo="//input[@id='lc_Info_Person_FirstName']";
         public String CityInfo="//input[@id='lc_Info_City']";
         public String stateInfo="//select[@id='lc_Info_Addr_State']";
         public String zipcodeInfo="//input[@id='lc_Info_Zipcode']";
         public String countryInfo="//select[@id='selInfoCountry']";
         public String PHNo="//input[@id='lc_Info_phone_NUS']";
         public String BeneType="//select[@id='selBeneType']";
         public String primary="//input[@id='cvgsForBeneficiary[0].PrmryRadioFlag']";
         public String funeral="(//input[@name='beneficiary.funeralInd'])[2]";
         public String coverage="//input[@id='cvgsForBeneficiary[0].MultiBox']";
         public String share="//input[@id='cvgsForBeneficiary[0].SharePerc']";
         public String BeneRelationship="//select[@id='lc_bene_Person_relToInsured']";
         public String BeneFirstname ="//input[@id='lc_Bene_Person_FirstName']";
         public String BeneLastName="//input[@id='lc_Bene_Person_LastName']";
         public String ssn1="//input[@id='lc_Bene_Person_SSN1']";
         public String ssn2="//input[@id='lc_Bene_Person_SSN2']";
         public String ssn3="//input[@id='lc_Bene_Person_SSN3']";
         public String BeneDobMonth="//input[@id='lc_Bene_Person_DateMM']";
         public String BeneDobDay="//input[@id='lc_Bene_Person_DateDD']";
         public String BeneDobYear="//input[@id='lc_Bene_Person_DateYY']";
         public String BeneAddress="//input[@id='lc_Bene_Addr1']";
         public String BeneCity="//input[@id='lc_Bene_City']";
         public String BeneState="//select[@id='lc_Bene_Addr_State']";
         public String BeneZip="//input[@id='lc_Bene_Zipcode']";
         public String BeneCountry="//select[@id='selCountry']";
         public String BenePhNo="//input[@id='lc_Bene_Desgn_Page_phone_NUS']";
         public String suffix2="//select[@id='lc_Bene_Person_Suffix']";
         public String coverage2="//input[@id='cvgsForBeneficiary[0].MultiBox']";
         public String review="//td[@class='progressindactive']";
         public String pwd="//input[@id='password']";
         public String submit="//img[@title='submit']";
         public String reasonForStop="//textarea[@id='lc_ReasonWorkStop']";
         public String save="(//img[@alt='save'])[1]";
         public String gettingStarted="//a[text()='Getting Started']";
         public String claims="//input[@id='lcgs_rdo_claims']";
         public String savedDrafts="//input[@id='lcgs_rdo_drafts']";
         public String SelectEmpID_SSN="//select[@id='cmb_search_choice']";
         public String EmpSSNS1="//input[@id='empssns1']";
         public String EmpSSNS2="//input[@id='empssns2']";
         public String EmpSSNS3="//input[@id='empssns3']";
         public String empID="//input[@id='lcgs_lname']";
         public String goo= "(//img[@src='/LifeClaimsWeb/presentation/images/btn_go.gif'])[5]";
         public String EmpName="(//table[@id='saved_table' and @border='0']//following::a[1])[1]";
         public String claimtablelink="(//table[@id='claim_table' and @border='0']//following::a[1])[1]";
    	 //next
    	 public String Life="//img[@alt='Life']";
    	 
    	 public String finishLater="//img[@alt='finish later']";
    	 public String address1="//input[@id='lc_Emp_Addr1']";
    	 public String EmpAddress="//input[@id='lc_EmployerAddr']";
    	 public String InfoAddress="//input[@id='lc_Info_Addr1']";
    	 public String NextReviewpage="(//img[@title='Next button - click to proceed to the next step'])[1]";
    	 public String claimSubmitted="(//td[@class='boldtext']//following::td)[1]";
    	 public String submitOtherClaim="//a[text()='Submit another claim or finish an incomplete claim']";
    	 
    	 public String beneficiaryFile = "//select[@id='lc_bene_signed']";
    	 public String DepSSN1="//input[@id='depssn1']";
    	 public String DepSSN2="//input[@id='depssn2']";
    	 public String DepSSN3="//input[@id='depssn3']";
    	 public String RetypeDepSSN1="//input[@id='retypedepssn1']";
    	 public String RetypeDepSSN2="//input[@id='retypedepssn2']";
    	 public String RetypeDepSSN3="//input[@id='retypedepssn3']";
    	 public String DepRelationship ="//select[@name='participantInfo.depOtherPersonalInfo.relation']";
    	 public String DepFirstName="//input[@id='lc_Dep_FirstName']";
    	 public String DepLastName="//input[@id='lc_Dep_LastName']";
    	 public String DepSuffix="//select[@name='participantInfo.depOtherPersonalInfo.suffix']";
    	 public String DepGender ="(//input[@name='participantInfo.depOtherPersonalInfo.sex'])[1]";
    	 public String DepDOBMM="//input[@id='lc_Dep_DOB_MM']";
    	 public String DepDOBDD="//input[@id='lc_Dep_DOB_DD']";
    	 public String DepDOBYYYY="//input[@id='lc_Dep_DOB_YYYY']";
    	 public String DepDODMM="//input[@id='lc_Dep_DOD_MM']";
    	 public String DepDODDD="//input[@id='lc_Dep_DOD_DD']";
    	 public String DepDODYYYY="//input[@id='lc_Dep_DOD_YYYY']";
    	 public String DepAddress1="//input[@id='lc_Dep_Addr1']";
    	 public String DepCity="//input[@id='lc_Dep_City']";
    	 public String DepState="//select[@id='lc_Dep_State']";
    	 public String DepZip="//input[@id='lc_Dep_ZipCode']";
    	 public String DepCountry="//select[@id='lc_Dep_Country']";
    	 
    	 
    	 public String EmpID2="//input[@id='lcgs_srchempid']";
    	 public String EmpSSN1="//input[@id='empssn1']";
    	 public String EmpSSN2="//input[@id='empssn2']";
    	 public String EmpSSN3="//input[@id='empssn3']";
    	 
    	 public String RetypeEmpSSN1="//input[@id='retypeempssn1']";
    	 public String RetypeEmpSSN2="//input[@id='retypeempssn2']";
    	 public String RetypeEmpSSN3="//input[@id='retypeempssn3']";
    	 public String claimNumText="//td[@class='datafill']/strong";
    	 public String claimNum="//input[@id='lcgs_srchClaimNum']";
    	 public String docType="//select[@name='docType']";
    	 public String choosefile="//input[@id='file']";
    	 public String fileSubmit="//input[@id='submitbutton']"; ////td[@class='datafill']/input
    	 public String claimGo="(//img[@src='/LifeClaimsWeb/presentation/images/btn_go.gif'])[3]";
    	public String uploadFiles="//img[@src='/LifeClaimsWeb/presentation/images/btn_upload.gif']";	
    	public String returnContinue="//img[@title='continue']"; 
    	public String deleteCancel="//img[@title='cancel']";
    	public String Delete="(//td[@class='datafill']/a/img)[1]";
    	
    	
    	public String change1 = "//td[contains(text(),'On what date was the employee last physically at work?')]";
    	public String change3 = "//td[contains(text(),'Did the employee elect an increase in coverage within the last 2 years?')]";
    	public String change5 = "(//td[@class='datafill'])[8]";
    	public String change7 = "(//td[contains(text(),'Preferred Contact Method:')])[1]";
    	public String contactHover = "(//img[@src='/LifeClaimsWeb/presentation/images/ico_help.gif'])[4]";
    	public String HoverMsg = "//td[contains(text(),'Your name here as the person submitting the claim.')]";
    	public String addressHover = "(//img[@src='/LifeClaimsWeb/presentation/images/ico_help.gif'])[5]";
    	public String HoverAddMsg = "//td[contains(text(),'This is the address where the notice of claim payment will be sent.')]";
    	public String coverageAmountHover = "(//img[@src='/LifeClaimsWeb/presentation/images/ico_help.gif'])[2]";
    	public String coverageHoverMsg = "(//td[@class='datafill'])[8]";
    	public String commentsFields = "//td[contains(text(),'Do you want to provide comments?')]";
    	public String commentOptions = "//select[@id='lc_Info_Person_infoCommets']";
    	public String commentYes = "(//select//option[@value='1'])[6]";
    	public String commentNo = "(//select//option[@value='1'])[6]";
    	public String commentYes1 = "(//textarea[@id='lc_Info_Comments'])[1]";
    	public String email = "(//input[@id='lc_Info_Person_EmailAddress'])[1]";
    	public String Mno1 = "(//input[@name='txt_s51'])[2]";
    	public String Mno2 = "(//input[@name='txt_s52'])[2]";
    	public String Mno3 = "(//input[@name='txt_s53'])[2]";
    	
    	public String EligibilityEnroll = "//a[text()='Eligibility/Enrollment File Transaction Reports']";
    	public String Eoption1 = "//option[@value= '0017250']";
    	public String Eoption2 = "//option[@value= '1137000']";
    	public String Eoption3 = "//option[@value= '0085079']";
    	public String Eoption4 = "//option[@value= '0118839']";
    	public String back = "//img[@src='jsp/images/btn_back.gif']";
    	
    	
    	public String customisedResources = "//a[text()='Customized Resources']";
    	public String clickHere1 = "(//a[text()='Click Here'])[1]";
    	public String selectResource = "(//a[text()='Select Resource'])";
    	public String clickHere2 = "(//a[text()='Click Here'])[2]";
    	public String clickHere3 = "(//a[text()='Click Here'])[3]";
    	public String clickHere4 = "(//a[text()='Click Here'])[4]";
    	public String clickHere5 = "(//a[text()='Click Here'])[5]";
    	public String clickHere6 = "(//a[text()='Click Here'])[6]";
    	public String clickHere7 = "(//a[text()='Click Here'])[7]";
    	public String clickHere8 = "(//a[text()='Click Here'])[8]";
    	public String clickHere9 = "(//a[text()='Click Here'])[9]";
    	//public String clickHere10 = "(//a[text()='Click Here'])[10]";
    	//public String clickHere11 = "(//a[text()='Click Here'])[11]";
    	//public String clickHere12 = "(//a[text()='Click Here'])[12]";
    	public String clickHere13 = "(//a[text()='Click Here'])[13]";
    	public String clickHere14 = "(//a[text()='Click Here'])[14]";
    	public String clickHere15 = "(//a[text()='Click Here'])[15]";
    	public String clickHere16 = "(//a[text()='Click Here'])[16]";
    	public String clickHere17 = "(//a[text()='Click Here'])[17]";
    	public String clickHere18 = "(//a[text()='Click Here'])[18]";
    	public String clickHere19 = "(//a[text()='Click Here'])[19]";
    	public String clickHere20 = "(//a[text()='Click Here'])[20]";
    	public String clickHere21 = "(//a[text()='Click Here'])[21]";
    	public String clickHere22 = "(//a[text()='Click Here'])[22]";
    	public String clickHere23 = "(//a[text()='Click Here'])[23]";
    	public String clickHere24 = "(//a[text()='Click Here'])[24]";
    	public String clickHere25 = "(//a[text()='Click Here'])[25]";
    	public String clickHere26 = "(//a[text()='Click Here'])[26]";
    	public String clickHere27 = "(//a[text()='Click Here'])[27]";
    	public String clickHere28 = "(//a[text()='Click Here'])[28]";
    	public String clickHere29 = "(//a[text()='Click Here'])[29]";
    	public String clickHere30 = "(//a[text()='Click Here'])[30]";
    	public String clickHere31 = "(//a[text()='Click Here'])[31]";
    	public String clickHere32 = "(//a[text()='Click Here'])[32]";
    	public String clickHere33 = "(//a[text()='Click Here'])[33]";
    	public String clickHere34 = "(//a[text()='Click Here'])[34]";
    	public String clickHere35 = "(//a[text()='Click Here'])[35]";
    	public String clickHere36 = "(//a[text()='Click Here'])[36]";
    	public String clickHere37 = "(//a[text()='Click Here'])[37]";
    	public String clickHere38 = "(//a[text()='Click Here'])[38]";
    	
    	
    	public String help = "//img[@src='/MetLinkPortal/jsp/metlink/images/navbar/help.jpg']";
    	public String accessingMetllink = "(//td[@class='dataul'])[1]";
    	public String UnPSwd = "(//td[@class='dataul'])[2]";
    	public String accountSecurity = "(//td[@class='dataul'])[3]";
    	public String backtomainMenu = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td[1]/a";
    	public String generalWebsite = "(//td[@class='dataul'])[4]";
    	public String liveCustomerSupport = "(//td[@class='dataul'])[5]";
    	public String hardwareSoftware = "(//td[@class='dataul'])[6]";
    	public String browserComp = "(//td[@class='dataul'])[7]";
    	public String howtocontactUs = "(//td[@class='dataul'])[8]";
    	public String featureSupport = "(//td[@class='dataul'])[9]";
    	public String otherMetlifeServices = "(//td[@class='dataul'])[10]";
    	//public String ContactUs = "//img[@src='/MetLinkPortal/jsp/metlink/images/navbar/contactus.jpg']";
    	public String CUfirstName = "//input[@name='firstName']";
    	public String CULastName = "//input[@name='lastName']";
    	public String CUEmail = "//input[@name='email']";
    	public String CUCustomerName = "//input[@name='customerName']";
    	public String CUSubject = "//select[@name='subject']";
    	public String CUSubject1 = "//option[@value='Comment or Suggestion']";
    	public String CUComments = "//textarea[contains(text(),'1000 Character(s) Max')]";
    	public String CUSubmit = "//input[@name='submit']";

    	public String ContactUs = "//img[@src='/MetLinkPortal/jsp/metlink/images/navbar/contactus.jpg']";
    	public String profile = "//img[@src='/MetLinkPortal/jsp/metlink/images/navbar/profile.jpg']";
    	public String signOut = "//img[@src='/MetLinkPortal/jsp/metlink/images/navbar/signout.jpg']";
    	public String edit1 = "(//img[@src='/MetLinkPortal/jsp/metlink/images/edit.gif'])[1]";
    	public String cancel = "(//img[@src='/MetLinkPortal/jsp/metlink/images/cancel.gif'])";
    	public String edit2 = "(//img[@src='/MetLinkPortal/jsp/metlink/images/edit.gif'])[2]";
    	public String CurrentPassword = "//input[@name='password']";
    	public String submitPassword = "//input[@src='/MetLinkPortal/jsp/metlink/images/submit.gif']";
    	public String continuePassword = "//img[@src='/MetLinkPortal/jsp/metlink/images/btn_continue.gif']";
    	public String edit3 = "(//img[@src='/MetLinkPortal/jsp/metlink/images/edit.gif'])[3]";
    	
    	public String ViewYourCurrentBill = "//a[text()='View your current bill']";
    	public String division = "//select[@name='division']";
    	public String division0002 = "//option[@value='0001']";
    	public String continueDivision = "//input[@src='images/btn_continue.gif']";
    	public String printCurrentInvoice = "/html/body/table/tbody/tr[8]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
    	public String viewBillingHistory = "//img[@src='images/tab_VCBon_vbh.gif']";
    	public String downloadSpreadSheet  = "//a[text()=' Download as spreadsheet']";
    	public String printFriendlyVersion1 = "//img[@src='images/pfriend.gif']";
    	public String closeWindow1 = "//img[@src='images/btn_closewindow.gif']";
    	public String BillingPeriod = "/html/body/table[2]/tbody/tr[9]/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
    	public String previousBill = "(//img[@src='images/btn_prevbill.gif'])[1]";
    	public String nextBill = "(//img[@src='images/btn_nextbill.gif'])[1]";
    	public String viewcurrentBill = "//img[@src='images/tab_PCIon_vcb.gif']";
    	public String goButton1 = "//input[@src='images/btn_go.gif']";
    	public String changeCustomer1 = "//a[@href='/ListBillingWeb/lbEntry.do']";
    	public String customerName1 = "//select[@name='custnum']";
    	public String customerOption = "//option[@value='5737247']";
    	
    	//web SBR
    	public String logintab = "//a[text()='Login']";
    	public String userName = "//input[@name='userId']";
    	public String passwordSBR = "(//input[@name='password'])[1]";
    	public String signInSBR = "//img[@src='/metlife/presentation/images/metlink_signin_but_18.gif']";
    	public String okMsg = "//input[@type='button']";
    	public String productsTab = "//a[text()='Products']";
    	public String servicesTab = "//a[text()='Services']";
    	public String contactUsTab = "//a[@href='/metlife/sbr/contactUsAction?pageId=112']";
    	public String FN = "//input[@name='txtFirstName']";
    	public String LN = "//input[@name='txtLastName']";
    	public String emailId = "//input[@name='txtEmailId']";
    	public String telephone = "//input[@name='txtTelNo']";
    	public String comments = "//textarea[@name='txaComment']";
    	public String submitContact = "//img[@src='/metlife/presentation/images/submit.gif']";
    	public String forgotYourPassword = "//a[@href='javascript:submitForgotPwd();']";
    	public String backButton = "//img[@src='/metlife/presentation/images/btn_back.gif']";
    	
    	//SBR e-reporting
    	public String eReporting = "/html/body/div[4]/div[1]/img[1]";
    	public String planName = "//option[@value='U AARKEY       ']";
    	public String continuePlan1 = "(//img[@src='/metlife/presentation/images/btn_continue.gif'])[1]";
    	public String selectAll = "//img[@src='/metlife/presentation/images/btn_selectall.gif']"; 
    	public String continuePlan2 = "(//img[@src='/metlife/presentation/images/btn_continue.gif'])[2]";
    	public String reportName = "//select[@name='cboReport']";
    	public String reportNameOption = "//option[@value='8']";
    	public String DateMM = "//input[@name='txtReportRequestDateMM']";
    	public String DateDD = "//input[@name='txtReportRequestDateDD']";
    	public String DateYY = "//input[@name='txtReportRequestDateYYYY']";
    	public String submitRequest = "(//img[@src='/metlife/presentation/images/btn_submitrequest.gif'])[2]";
    	public String ok = "(//img[@src='/metlife/presentation/images/btn_ok.gif'])";
    	
    	public String ReportHistory = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[3]/a";
    	public String planNameRH = "/html/body/form[1]/table/tbody/tr[2]/td[3]/table[5]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[4]/a";
    	public String statusPlan = "/html/body/form[1]/table/tbody/tr[2]/td[3]/table[5]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[3]/td[8]/a";
    	public String statusPlan1 = "/html/body/form[1]/table/tbody/tr[2]/td[3]/table[5]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[5]/td[8]/a";
    	public String nextPlan = "//img[@src='/metlife/presentation/images/btn_next.gif']";
    	public String lastPlan = "//img[@src='/metlife/presentation/images/btn_last.gif']";
    	public String previousPlan = "//img[@src='/metlife/presentation/images/btn_previous.gif']";
    	public String firstPlan = "//img[@src='/metlife/presentation/images/btn_first.gif']";
    	public String checkboxPlan = "(//input[@type='checkbox'])[2]";
    	public String deletePlan = "//img[@src='/metlife/presentation/images/btn_delete.gif']";
    	
    	public String maintainTemplates = "/html/body/form[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[6]/td[3]/a";
    	public String createnewTemplate = "//img[@src='/metlife/presentation/images/btn_createnewtemplate.gif']";
    	public String productTemplate = "(//input[@type='checkbox'])[1]";
    	public String continueTemplate = "//img[@src='/metlife/presentation/images/btn_continue.gif']";
    	public String templateName = "//input[@name='txtTemplateName']";
    	public String templateAttribute = "//option[@value='63']";
    	public String selectAttribute = "//img[@src='/metlife/presentation/images/btn_rightarrow.gif']";
    	public String saveTemplate = "(//input[@src='/metlife/presentation/images/btn_save.gif'])[2]";
    	public String deleteTemplate = "(//img[@src='/metlife/presentation/images/btn_delete.gif'])[2]";
    	public String selectTemplate = "//select[@name='cboTemplate']";
    	public String TemplateOption = "//option[@value='662|ANJALI']";
    	public String saveTemplate1 = "(//img[@src='/metlife/presentation/images/btn_save.gif'])[2]";
    	
    	public String scheduleReport = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[3]/a";
    	public String AddScheduleReportClient = "//img[@src='/metlife/presentation/images/btn_addrepforclients.gif']";
    	public String selectPlanName = "//select[@name='cboPlan']";
    	public String planNameOption = "//option[@value='CB1STMIDAMCU   ']";
    	public String frequencySelect = "//select[@name='cboFrequency']";
    	public String frequencyOption = "(//option[@value='1'])[2]";
    	public String description = "//input[@name='txtReportDesc']";
    	public String planNameReport = "(//a[text()='1st MidAmerica Credit Union'])[1]";
    	
    	//products
    	public String products = "/html/body/div[3]/div[2]/img[1]";
    	public String MetflexExec = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[3]/a";
    	public String fastFacts = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[3]/a";
    	public String fundLineUp = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[6]/td[3]/a";
    	public String performanceBenchmark = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[3]/a";
    	public String prospectuses = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[10]/td[3]/a";
    	public String quarterlyReporting = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[12]/td[3]/a";
    	public String fundPerformance = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[14]/td[3]/a";
    	public String FP1 = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[16]/td[3]";
    	public String printFriendlyVersion = "//img[@src='/metlife/presentation/images/pfriend.gif']";
    	public String downloadMs = "//img[@src='/metlife/presentation/images/btn_downloadtoxl.gif']";
    	public String seePreviousMonths = "//img[@src='/metlife/presentation/images/btn_seeprevmonths.gif']";
    	public String LargeCap = "//a[text()=' Large Cap ']";
    	public String SmallCap = "//a[text()=' Small Cap ']";
    	public String global = "//a[text()=' Global ']";
    	public String returnToTop = "/html/body/form[1]/table/tbody/tr[2]/td[3]/table[24]/tbody/tr[4]/td/a";
    	public String FP2 = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[18]/td[3]";
    	public String FP3 = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[20]/td[3]";
    	public String FP4 = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[22]/td[3]";
    	public String FP5 = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[24]/td[3]";
    	
    	public String MetlifePPVL = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[3]";
    	public String BoliFund = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[3]/a";
    	public String BoliPerformance = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[6]/td[3]/a";
    	public String BoliQuarterly = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[3]/a";
    	public String ColiFund = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[10]/td[3]/a";
    	public String ColiPerformance = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[12]/td[3]/a";
    	public String ColiQuarterly = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[14]/td[3]";
    	public String fastFactsP = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[16]/td[3]/a";
    	public String stateApproval = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[18]/td[3]/a";
    	public String fundPerformanceP = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[20]/td[3]/a";
    	public String returns = "(//a[@class='leftnavexpanded'])[9]";
    	public String dailyUnitvalues = "/html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[24]/td[3]/a";
    	public String downloadHistory = "(//a[@class='leftnavexpanded'])[11]";
    	public String subu = "//a[text()=' subu ']";
    	public String balanced = "//a[text()=' Balanced ']";
    	public String bankLoan = "//a[text()=' Bank Loan ']";
    	public String downloadDatevalue = "//img[@src='/metlife/presentation/images/btn_downloadtoxl_data.gif']";
    	public String backDownload = "//img[@src='/metlife/presentation/images/btn_back.gif']";
    	public String downloadDisplayedValues = "//img[@src='/metlife/presentation/images/btn_downloadduvtoxl.gif']";
    	public String jobName = "/html/body/form[1]/table/tbody/tr[2]/td[3]/table[3]/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[3]/td[4]/a";
    	
    	//metlife DCVL
    	public String DCVL = "(//a[@class='leftnav'])[3]";
    	public String FundLineUp = "(//a[@class='leftnavexpanded'])[1]";
    	public String performanceBenchmarkD = "(//a[@class='leftnavexpanded'])[2]";
    	public String prospectusesD1 = "(//a[@class='leftnavexpanded'])[3]";
    	public String prospectusesD2 = "(//a[@class='leftnavexpanded'])[4]";
    	public String QuarterlyReportingD = "(//a[@class='leftnavexpanded'])[5]";
    	public String FundPerformanceD = "(//a[@class='leftnavexpanded'])[5]";
    	public String FundPerformanceB = "(//a[@class='leftnavexpanded'])[6]";

    	public String fundperformanceP = "(//a[@class='leftnavexpanded'])[6]";
    	public String returnsD = "(//a[@class='leftnavexpanded'])[5]";
    	public String returnsP = "(//a[@class='leftnavexpanded'])[6]";
    	public String returnsb = "(//a[@class='leftnavexpanded'])[4]";
    	public String dailyUnitValues1 = "(//a[@class='leftnavexpanded'])[5]";
    	public String dailyUnitValues = "(//a[@class='leftnavexpanded'])[6]";
    	public String dailyUnitValuesP = "(//a[@class='leftnavexpanded'])[7]";
    	public String downloadHistoryD = "(//a[@class='leftnavexpanded'])[7]";
    	public String downloadHistoryP = "(//a[@class='leftnavexpanded'])[8]";
    	public String returnToTop1 = "/html/body/form[1]/table/tbody/tr[2]/td[3]/table[21]/tbody/tr[4]/td/a"; 
    	
    	//BOLI 
    	public String BOLI = "(//a[@class='leftnav'])[4]";
    	public String FastFacts = "(//a[@class='leftnavexpanded'])[1]";
    	public String ResetRates = "(//a[@class='leftnavexpanded'])[2]";
    	
    	//BOLI Advantage
    	public String BOLIAdvantage = "(//a[@class='leftnav'])[5]";
    	
    	//GA New Money BOLI
    	public String GABOLI = "(//a[@class='leftnav'])[6]";
    	
    	//CUL/EBUL/EC
    	public String CULEBULEC = "(//a[@class='leftnav'])[7]";
    	public String ULInterestRateDispaly = "//img[@src='/metlife/presentation/images/btn_UL_IRC_display.gif']";
    	public String ULInterestRateExcel	= "//img[@src='/metlife/presentation/images/btn_IRC_XL.gif']";
    	
    	//MetTowerPPVL_BOLI
    	public String PPVL_BOLI = "(//a[@class='leftnav'])[8]";
    	
    	//MetTower PPVL_COLI
    	public String PPVL_COLI = "(//a[@class='leftnav'])[9]";
    	public String COLIFastFacts = "(//a[@class='leftnavexpanded'])[1]";
    	public String ICOLIFastFacts = "(//a[@class='leftnavexpanded'])[2]";
    	public String stateApprovalMap = "(//a[@class='leftnavexpanded'])[3]";
    	public String separateAccounts = "(//a[@class='leftnavexpanded'])[4]";
    	public String PCFundLineUp = "(//a[@class='leftnavexpanded'])[4]";
    	public String PCPerformanceBenchmark = "(//a[@class='leftnavexpanded'])[5]";
    	public String PCQuarterlyReporting = "(//a[@class='leftnavexpanded'])[6]";
    	public String PCFundPerformance = "(//a[@class='leftnavexpanded'])[7]";
    	public String PCReturns = "(//a[@class='leftnavexpanded'])[8]";
    	public String PCDailyUnitValues = "(//a[@class='leftnavexpanded'])[9]";
    	public String PCDownload = "(//a[@class='leftnavexpanded'])[10]";
    	public String PCVariableInsurance = "(//a[@class='leftnavexpanded'])[11]";
    	
    	//Brighthouse PPVL_BOLI
    	public String BrightHousePPVLBOLI = "(//a[@class='leftnav'])[10]";
    	
    	//BrightHouse PPVL_COLI
    	public String BrighthousePPVLCOLI = "(//a[@class='leftnav'])[11]";
    	
    	//Metlife USA
    	public String MetlifeUSA = "(//a[@class='leftnav'])[12]";
    	public String corporateSelect = "(//a[@class='leftnav'])[2]";
    	public String investmentDivisions = "(//a[@class='leftnavexpanded'])[1]";
    	public String performanceNet = "(//a[@class='leftnavexpanded'])[1]";
    	public String performanceNet1 = "(//a[@class='leftnavexpanded'])[2]";
    	public String prospectUses = "(//a[@class='leftnavexpanded'])[3]";
    	public String corporateVaraible1 = "(//a[@class='leftnav'])[3]";
    	public String corporatePrivateVariable = "(//a[@class='leftnav'])[4]";
    	public String corporateVariableLife2 = "(//a[@class='leftnav'])[5]";
    	public String corporateVariableLife3 = "(//a[@class='leftnav'])[6]";
    	public String corporateVariableLife4 = "(//a[@class='leftnav'])[7]";
    	
    	//MetTowerLife Portfolio
    	public String MetTowerLife = "(//a[@class='leftnav'])[13]";
    	public String SPUL07 = "(//a[@class='leftnavexpanded'])[1]";
    	public String SPUL05 = "(//a[@class='leftnavexpanded'])[2]";
    	public String SPUL03 = "(//a[@class='leftnavexpanded'])[3]";
    	public String SPUL98 = "(//a[@class='leftnavexpanded'])[4]";
    	public String SPUL97 = "(//a[@class='leftnavexpanded'])[4]";
    	
    	//GenAm
    	public String GenAm = "(//a[@class='leftnav'])[14]";
    	public String NetReturns = "(//a[@class='leftnavexpanded'])[1]";
    	
    	//IPPVL
    	public String IPPVL = "(//a[@class='leftnav'])[15]";
    	
    	
    	//service center
    	public String serviceCenter = "//img[@src='../../images/nav/nav_servicecenter.gif']";
    	public String serviceCenter1 = "//img[@src='../../images/nav/nav_servicecenter_on.gif']";
    	public String onlineTransactions = "(//a[@class='leftnav'])[1]";
    	public String submitTransaction = "(//a[@class='leftnavexpanded'])[1]";
    	public String selectProduct = "//select[@id='productId']";
    	public String ProductOption = "(//option[@value='1'])[1]";
    	public String transactionType = "//select[@id='transactionTypeId']";
    	public String transactionTypeOption = "(//option[@value='1'])[2]";
    	public String transactionLevel = "//select[@id='transactionLevelId']";
    	public String transactionLevelOption = "(//option[@value='1'])[3]";
    	public String clientId = "//select[@id='clientId']";
    	public String clientIdOption = "(//option[@value='GB1STHORIZON010_104_07/28/2006'])";
    	public String fundName = "(//option[@value='587[&&]BOLI - MetLife Fixed Income Index Account (S/A 587)'])";
    	public String rightArrow = "//img[@src='/metlife/presentation/images/btn_rightarrow.gif']";
    	public String continueFund = "//img[@src='/metlife/presentation/images/btn_continue.gif']";
    	public String fundPercent = "//input[@type='text']";
    	public String submitFund = "//img[@src='/metlife/presentation/images/btn_submit.gif']";
    	
    	public String transactionHistory = "(//a[@class='leftnavexpanded'])[1]";
    	public String reviewTransaction = "(//a[@class='leftnavexpanded'])[2]";
    	public String brokerClients = "(//a[@class='leftnavexpanded'])[3]";
    	public String internalUsers = "(//a[@class='leftnavexpanded'])[4]";
    	public String reviewButton= "(//img[@src='/metlife/presentation/images/btn_review.gif'])[1]";
    	public String generateMetrics = "(//a[@class='leftnavexpanded'])[5]";
    	public String brokerClients1 = "(//a[@class='leftnavexpanded'])[4]";
    	public String internalusers1 = "(//a[@class='leftnavexpanded'])[5]";
    	
    	public String FAQ = "(//a[@class='leftnav'])[2]";
    	public String Illustrations = "(//a[@class='leftnav'])[2]";
    	public String overtureIllustrations = "(//a[@class='leftnavexpanded'])[1]";
    	public String fullcaseInforce = "(//a[@class='leftnavexpanded'])[1]";
    	public String individualPolicy = "(//a[@class='leftnavexpanded'])[2]";
    	public String inforceDownload = "(//a[@class='leftnavexpanded'])[3]";
    	public String metlifeForms = "(//a[@class='leftnav'])[4]";
    	public String batchFillhistory = "(//a[@class='leftnavexpanded'])[1]";
    	public String MetlifeUSAForm = "(//a[@class='leftnav'])[5]";
    	public String helpfulWebsite = "(//a[@class='leftnavexpanded'])";
    	public String contacts = "(//a[@class='leftnav'])[6]";
    	public String deathClaim = "(//a[@class='leftnav'])[6]";
    	
    	//illustrationUpdates
    	public String illustrationsUpdates = "//img[@src='../../images/nav/nav_breakingnews.gif']";
    	
    	//administration
    	public String administration = "//img[@src='../../images/nav/nav_administration.gif']";
    	public String maintainRole = "(//a[@class='leftnav'])[1]";
    	public String roleNameSelect = "//select[@name='cboRoleId']";
    	public String roleOption = "//option[@value='6']";
    	public String functions = "(//option[@value='46'])[2]";
    	public String historyPageViewSelect = "//select[@name='historyConfigId']";
    	public String historyPageViewOption = "(//option[@value='1'])[2]";
    	public String saveAdmin = "//img[@src='/metlife/presentation/images/btn_save.gif']";
    	
    	public String addRole = "(//a[@class='leftnavexpanded'])[2]";
    	public String roleName = "//input[@name='txtRoleName']";
    	public String roleFunctions = "//option[@value='11']";
    	public String rightArrow1 = "(//img[@src='/metlife/presentation/images/btn_rightarrow.gif'])[1]";
    	
    	public String maintaiUsers = "(//a[@class='leftnav'])[2]";
    	public String maintainUsersSelect = "//select[@name='cboSearchCategory']";
    	public String maintainUsersOption = "//option[@value='11']";
    	public String searchFilterUsers = "//input[@name='txtSearchFilter']";
    	public String searchUser = "//img[@src='/metlife/presentation/images/btn_search.gif']";
    	
    	public String addUser = "(//a[@class='leftnavexpanded'])[2]";
    	
    	public String illustrationUpdates = "(//a[@class='leftnav'])[4]";
    	public String documentName = "(//td[@class='boldtext'])[4]";
    	public String radioButton = "(//input[@name='radioDelete'])[9]";
    	public String editIllustration = "//img[@src='/metlife/presentation/images/btn_edit.gif']";
    	public String saveIllustration = "//img[@src='/metlife/presentation/images/btn_save.gif']";
    	public String confirmationMsg = "//img[@src='/metlife/presentation/images/btn_ok.gif']";
    	public String deleteIllustration = "//img[@src='/metlife/presentation/images/btn_delete.gif']";
    	
    	public String addIllustration = "(//a[@class='leftnavexpanded'])[2]";
    	public String title = "//input[@name='title']";
    	public String startDateMon = "(//input[@type='text'])[2]";
    	public String startDateDate = "(//input[@type='text'])[3]";
    	public String startDateYear = "(//input[@type='text'])[4]";
    	public String endDateMon = "(//input[@type='text'])[5]";
    	public String endDateDate = "(//input[@type='text'])[6]";
    	public String endDateYear = "(//input[@type='text'])[7]";
    	
    	public String maintainDept = "(//a[@class='leftnav'])[9]";
    	public String viewContacts = "(//img[@src='/metlife/presentation/images/ico_xls.gif'])[1]";
    	public String editDocument = "(//img[@src='/metlife/presentation/images/ico_edit.gif'])[1]";
    	public String deleteDocument = "(//img[@src='/metlife/presentation/images/ico_delete.gif'])[1]";
    	public String cancelDocument = "//img[@src='/metlife/presentation/images/btn_cancel.gif']";
    	public String addDept = "//img[@src='/metlife/presentation/images/btn_add.gif']";
    	
    	public String editDept = "(//a[@class='leftnavexpanded'])[2]";
    	
    	public String maintainFootnotes = "(//a[@class='leftnav'])[13]";
    	public String pageSelect = "//select[@name='cboDocumentTypeCode']";
    	public String pageOption = "//option[@value='UDV']";
    	public String searchPage = "//img[@src='/metlife/presentation/images/btn_search.gif']";
    	public String resultsSNO = "(//td[@class='datafill'])[6]";
    	public String editResults = "(//img[@src='/metlife/presentation/images/ico_edit.gif'])[1]";
    	public String saveResults = "(//img[@src='/metlife/presentation/images/btn_save.gif'])[1]";
    	
    	public String addFootnotes = "(//a[@class='leftnavexpanded'])[2]";
    	public String companySelect = "//select[@name='cboBrokerCompanyId']";
    	public String companyOption = "//option[@value='1']";
    	//public String pageSelect = "//select[@name='cboDocumentTypeCode']";
    	public String footnotesDescription = "//textarea[@name='strFootnoteDescritpion']";
    	
    	public String sortFootness = "(//a[@class='leftnavexpanded'])[2]";
    	
    	public String maintainNotifications = "(//a[@class='leftnav'])[15]";
    	public String notificationAlert = "(//input[@type='text'])[1]";
    	public String startTime1 = "(//input[@type='text'])[5]";
    	public String startTime2 = "(//input[@type='text'])[6]";
    	public String endDate1 = "(//input[@type='text'])[7]";
    	public String endDate2 = "(//input[@type='text'])[8]";
    	public String endDate3 = "(//input[@type='text'])[9]";
    	public String endTime1 = "(//input[@type='text'])[10]";
    	public String endTime2 = "(//input[@type='text'])[11]";
    	public String functionCategory = "(//option[@value='2'])[1]";
    	public String alertMsg = "//*[@id='rte']/body";
    	
    	public String reCertification = "(//a[@class='leftnav'])[16]";
    	public String dailyReport = "//td[@id='daily_xl']";
    	public String weeklyReport = "//td[@id='weekly_xl']";
    	public String processedReport = "//td[@id='processed_xl']";
    	
    	//upper links
    	public String homeSBR = "//img[@src='/metlife/presentation/images/navbar/home.jpg']";
    	public String profileSBR = "//img[@src='/metlife/presentation/images/navbar/profile.jpg']";
    	public String privacySBR = "//a[text()='Privacy']";
    	public String legalSBR = "//a[text()='Legal']";
    	public String signOutSBR = "//img[@src='/metlife/presentation/images/navbar/signout.jpg ']";
    	
    	
    	/////// terminal funding //////
    	public String usernameTF = "//input[@id='userNameId']";
    	public String passwordTF = "//input[@id='passwordId']";
    	public String logInTF = "//span[@id='dijit_form_Button_0_label']";
    	public String MGIP = "//span[text()='MetLife Guaranteed Income Program']";
    	public String MGIpPlan = "//a[contains(text(),'ACE MGIP Test Group 1')]";
    	public String MGIPPlan2 = "//a[contains(text(),'MGIP Qualified - Indiana UAT')]";
    	public String selectStateTF = "//select[@id='state']";
    	public String StateOptionTF = "//option[@value='CA']";
    	public String submitStateTF = "//img[@src='images/shared/btn_submit1.gif']";
    	
        public  String ForSecutiyoverlay = "//h1[@id='divAccessCodeTitle']";
        public  String OTP = "//*[@id='divAccessCode']//p[2]//span[2]";
        public  String Acesscode = "//*[@name='accesscode']";
        public  String NextBtn = "//*[@id='dijit_form_Button_0_label']";

    	
    	public String deductionsTF = "//a[text()='Deductions']";
    	public String viewPaymentHistoryTF = "(//td[@class='navytextmedium'])[6]";
    	public String printTF = "//a[contains(text(),' Printable View')]";
    	public String changeOfAddressTF = "//a[text()='Change of Address']";
    	public String changeButtonTF = "(//input[@id='changeButton'])";
    	public String cancelButtonTF = "(//input[@name='$Submit$1'])";
    	public String cancelButtonTF1 = "(//input[@name='$Submit$4'])";
    	public String changeBankInfoTF = "//a[text()='Change Bank Information']";
    	public String changeButton1 = "(//input[@name='$Submit'])";
    	public String changeTaxStatus = "//a[text()='Change Tax Status']";
    	public String cancelButtonTF2 = "(//input[@name='$Submit$0'])";
    	public String managemyaccount = "//a[@href='/v3benadmin/app?service=external/MyBenefits:ManageMyAccount&sp=SManageMyAccount']";
    	public String forms = "(//a[@href='/v3benadmin/app?service=external/MyBenefits:Forms&sp=SForms'])[1]";
    	public String changeofName = "(//a[contains(text(),'Change of Name')])[1]";
    	public String changeofBen = "(//a[contains(text(),'Change of Beneficiary')])[1]";
    	public String requestforVerification = "(//a[contains(text(),'Request for Income Verification')])[1]";
    	public String stateTaxForms = "/html/body/table[1]/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/a[4]";
    	public String requestforDuplicate = "/html/body/table[1]/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/a[5]";
    	public String deathStatement = "/html/body/table[1]/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/a[6]";
    	public String lostStolenCheck = "/html/body/table[1]/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/a[7]";
    	
    	public String FAQS = "(//a[@href='/v3benadmin/app?service=external/MyBenefits:FAQ&sp=SFAQS'])[1]";
    	public String Q1 = "(//a[@class='bluelinksmedium'])[1]";
    	public String Q2 = "(//a[@class='bluelinksmedium'])[2]";
    	public String Q3 = "(//a[@class='bluelinksmedium'])[3]";
    	public String Q4 = "(//a[@class='bluelinksmedium'])[4]";
    	public String Q5 = "(//a[@class='bluelinksmedium'])[5]";
    	public String Q6 = "(//a[@class='bluelinksmedium'])[6]";
    	public String Q7 = "(//a[@class='bluelinksmedium'])[7]";
    	public String Q8 = "(//a[@class='bluelinksmedium'])[8]";
    	public String Q9 = "(//a[@class='bluelinksmedium'])[9]";
    	public String Q10 = "(//a[@class='bluelinksmedium'])[10]";
    	public String Q11 = "(//a[@class='bluelinksmedium'])[11]";
    	public String Q12 = "(//a[@class='bluelinksmedium'])[12]";
    	public String backtoTopLink1 = "(//a[@class='SmallTextLink'])[1]";
    	public String backtoTopLink2 = "(//a[@class='SmallTextLink'])[2]";
    	public String backtoTopLink3 = "(//a[@class='SmallTextLink'])[3]";
    	public String backtoTopLink4 = "(//a[@class='SmallTextLink'])[4]";
    	public String backtoTopLink5 = "(//a[@class='SmallTextLink'])[5]";
    	public String backtoTopLink6 = "(//a[@class='SmallTextLink'])[6]";
    	public String backtoTopLink7 = "(//a[@class='SmallTextLink'])[7]";
    	public String backtoTopLink8 = "(//a[@class='SmallTextLink'])[8]";
    	public String backtoTopLink9 = "(//a[@class='SmallTextLink'])[9]";
    	public String backtoTopLink10 = "(//a[@class='SmallTextLink'])[10]";
    	public String backtoTopLink11 = "(//a[@class='SmallTextLink'])[11]";
    	public String backtoTopLink12 = "(//a[@class='SmallTextLink'])[12]";
    	
    	public String glossary = "(//a[@href='/v3benadmin/app?service=external/MyBenefits:Glossary&sp=SGlossary'])[1]";
    	
    	public String productInfoTF = "(//a[text()='Product Information'])[1]";
    	public String productInfo2TF = "(//a[text()='Product Information'])[2]";
    	public String whyanAnnuity = "//a[contains(text(),'Why an annuity?')]";
    	public String learnhowtheprogramworks = "(//a[@href='path.do?target=work'])[3]";
    	public String learnMore1 = "(//a[text()='Learn more'])[1]";
    	public String close1 = "(//a[text()='close'])[1]";
    	public String learnMore2 = "(//a[text()='Learn more'])[2]"; 
    	public String close2 = "(//a[text()='close'])[2]";
    	public String learnMore3 = "(//a[text()='Learn more'])[3]";
    	public String close3 = "(//a[text()='close'])[3]";  	
    	public String commonQuestionsTF = "(//a[text()='Common Questions'])[1]";
    	public String showAllanswers = "//a[@id='expCol']";
    	public String MGIP2 = "(//a[text()='Metlife Guaranteed Income Program'])[2]";
    	public String howdoesitWorks = "(//a[text()='How does it work?'])[2]";	
    	public String commonQuestions2TF = "(//a[text()='Common Questions'])[2]";
    	public String question1TF = "(//a[@class='bluelinksmedium'])[1]";
    	
    	public String contactUSTF = "(//a[text()='Contact Us'])[1]";
    	public String contactUS2TF = "(//a[text()='Contact Us'])[2]";
    	public String contactUSheading = "(//td[text()='Contact Us'])";
    	public String managemyAccounts2TF = "(//a[text()='Manage My Account'])[1]";
    	public String mangeaccountheading = "(//td[text()='Manage My Account'])[1]";
    	public String forms2 = "(//a[text()='Forms'])[2]";
    	public String formsheading = "(//td[text()='Forms'])";
    	public String FAQs2 = "(//a[text()='FAQs'])[2]";
    	public String FAQsHeading = "(//td[text()='FAQs'])";
    	public String glossary2 = "(//a[text()='Glossary'])[2]";
    	public String glossaryheading = "(//td[text()='Glossary'])";
    	
    	public String transaction1 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/a";
    	public String transaction2 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/a";
    	public String transaction3 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/a";
    	
    	public String form1 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[3]/td[2]/table/tbody/tr[3]/td[2]/a";
    	public String form2 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[3]/td[2]/table/tbody/tr[4]/td[2]/a";
    	public String form3 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[3]/td[2]/table/tbody/tr[5]/td[2]/a";
    	
    	public String otherInfo1 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[5]/td[2]/table/tbody/tr[3]/td[2]/a";
    	public String otherInfo2 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[5]/td[2]/table/tbody/tr[4]/td[2]/a";
    	public String otherInfo3 = "//*[@id='contentTbl']/tbody/tr/td[3]/table/tbody/tr[5]/td[2]/table/tbody/tr[5]/td[2]/a";
    	
    	public String termsOfUse = "//strong[contains(text(),'Terms of Use')]";
    	public String PrivacyTF = "//strong[contains(text(),'Privacy')]";
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	///DISABILITY 
    	
    	public String fileClaim = "(//li[@class='menu-active'])[2]//a[@href='/tamwa/disability/rest/wrap/fileclaim']";
    	public String lastNameD = "(//input[@type='text'])[2]";
    	public String nameD = "//span[contains(text(),'AARON,THOMAS')]";
    	public String nameLink = "//a[@href='/tamwa/disability/rest/wrap/fileclaim/step2']"; 
    	public String select = "(//select[contains(text(),'')])[1]";
    	public String claimTypeD = "(//p//select//option[contains(text(),'FMLA')])[1]";
    	public String button=  "(//button[@class='primary-orange-btn rect-btn'])[3]";
    	public String nextButton = "//button[contains(text(),'Next')]";
    	//public String date = "(//input[@type='text'])[1]";
    	public String calendar = "//span[@class='calender-icon']";
    	public String date = "(//span[contains(text(),'3')])[1]";
    	public String select1 = "//div//select//option[contains(text(),'Select')]";
    	public String selectReason = "//div//select//option[contains(text(),'Childcare')]";
    	public String continueButtonD = "//button[contains(text(),'Continue')]";
    	public String suffixD = "(//input[@type='text'])[7]";
    	public String firstName = "(//input[@type='text'])[4]";
    	public String lastName1 = "(//input[@type='text'])[6]";
    	public String homeadd1 = "(//input[@type='text'])[8]";
    	public String cityD = "(//input[@type='text'])[10]";
    	public String select2 = "(//select[contains(text(),'')])[2]";
    	public String stateD = "(//span[@class='right-fields'])[12]";
    	public String stateOption = "//select//option[contains(text(),'Alaska')]";
    	public String zip = "(//input[@type='text'])[11]";
    	public String zip1 = "(//input[@type='text'])[12]";
    	public String radioButtonD = "(//input[@name='matchInfo'])[1]";
    	public String phnno1 = "(//input[@type='text'])[13]";
    	public String phnno2 = "(//input[@type='text'])[14]";
    	public String phnno3 = "(//input[@type='text'])[15]";
    	public String fax1 = "(//input[@type='text'])[17]";
    	public String fax2 = "(//input[@type='text'])[18]";
    	public String fax3 = "(//input[@type='text'])[19]";
    	public String checkbox = "//input[@type='checkbox']";
    	public String password1 = "//input[@type='password']";
    	public String submitD = "//button[@class='primary-nxt-btn']";
    	public String next1D = "//button[@class='primary-nxt-btn']";
    	public String finishLaterD = "//button[@class='primary-later-btn']";
    	public String saveButton = "(//button[@class='primary-orange-btn rect-btn fl-button-width'])[1]";
    	public String cancelButtonD = "(//button[@class='primary-orange-btn rect-btn fl-button-width'])[2]";
    	public String continueButton1 = "(//button[@class='primary-orange-btn rect-btn fl-button-width'])[3]";

    	public String finishincomClaimsDD = "(//select)[2]";
    	public String finishincomClaimsOp = "(//select)[2]//option[@value='1']";
    	public String goClaim = "(//button[@class='primary-orange-btn rect-btn'])[2]";
    	public String editClaim = "(//a[contains(text(),'Edit')])[1]";
    	public String nextClaim = "//button[@class='primary-nxt-btn']";
    	public String checkboxClaim = "//input[@type='checkbox']";
    	public String passwd = "//input[@id='check']";
    	public String claimConfirm = "//*[@id='Main-Content-Section']/div[1]/div/div/div/div/div/div/div/table/tbody/tr[3]/td[3]";
    	//emp summary
    	
    	 public String empsum = "//a[contains(text(),'Employee Summary')]";
         public String empLN = "(//input[@type='text'])";
         public String empGo = "(//button[@class='primary-orange-btn rect-btn'])";
         public String empName1 = "//*[@id='Main-Content-Section']/div[1]/div/div/div/div/div/table/tbody/tr[1]/td[1]";
         public String currentClaims = "//*[@id='Main-Content-Section']/div[1]/div/div/div[2]/div/div/div/table/tbody/tr/td[1]";
         public String editEmpInfo = "(//span[@class='expand-down-icon'])[1]";
         public String empPhone = "//ul//li//a[contains(text(),'Name')]/.";
         public String saveEmp = "(//button[@class='primary-orange-btn rect-btn'])[19]";
         public String submitEmp = "(//button[@class='primary-orange-btn rect-btn'])[25]";
         public String MI = "//*[@id='NAMESHOWN']/div[1]/input[3]";
         public String okEmp = "(//button[@class='primary-orange-btn rect-btn'])[1]";
         
    	public String addmsgAttachments = "//a[contains(text(),'Add Message / Attachment')]";
    	public String mailAddress = "(//input[@type='text'])[3]";
    	public String submitMsg1 = "(//button[@class='primary-orange-btn rect-btn send-attachment'])";
    	public String dairynotes = "//button[contains(text(),'Diary Notes')]";
    	public String dairynotesheading = "//h3[contains(text(),'Diary Notes')]";
    	public String returntoClaim = "//a[contains(text(),'Return to Claim Detail Page')]";
    	public String RTWtext = "//h3[contains(text(),'Return to Work (RTW) Information')]";
    	public String RTWedit = "//a[contains(text(),'Edit Return to Work date')]";
    	public String returnwork = "//span[contains(text(),'Return to Work Date')]";
    	public String cancelRTW = "(//button[@class='primary-orange-btn rect-btn'])[26]";
    	public String editclaimInfo = "(//span[@class='expand-down-icon'])[2]";
    	public String hoursPerWeek = "//a[text()='Hours Per Week']";
    	public String hoursperweek = "(//input[@type='text'])[20]";
    	public String saveHPW = "(//button[@class='primary-orange-btn rect-btn'])[15]";
    	public String submitHPW = "(//button[@class='primary-orange-btn rect-btn'])[25]";
    	public String viewLeaveDetails = "(//a[contains(text(),'View Leave Details')])[2]";
    	public String leaveHistory = "(//h3[contains(text(),'Leave History')])";
    	public String activityHistory = "(//a[contains(text(),'Activity History')])";
    	public String activityHistory1 = "(//h3[contains(text(),'Activity History')])";
    	public String absenceTrackinghistory = "(//a[contains(text(),'Absence Tracking History')])";
    	public String absenceTrackinghistory1 = "(//h3[contains(text(),'Absence Tracking History')])";
    	//claim enquiry
    	public String claimenquiry = "//a[contains(text(),'Claim Inquiry')]";
    	public String advancedFilters = "//button[contains(text(),'Advanced Filters')]";
    	public String option = "//option[@value='Claim Summary View']";
    	public String Select = "(//select[contains(text(),'')])[1]";
    	public String STD = "(//span//a[contains(text(),'std')])[1]";
    	public String ReceivedDate = "//tr//th[contains(text(),'Received Date')]";
    	public String DisabilityDate = "//tr//th[contains(text(),'Disability Date')]";
    	public String claim1 = "//tr//th[contains(text(),'Claim #')]";
    	public String claimEnddate = "//tr//th[contains(text(),'Claim End Date')]";
    	public String group = "//th[contains(text(),'Group #')]";
    	public String returnToPreviousPage = "//a[contains(text(),'Return to Previous Page')]";
    	public String LtD = "//a[contains(text(),'ltd')]";
    	public String FMLA = "//a[contains(text(),'fmla')]";
    	public String PFL = "//a[contains(text(),'pfl')]";
    	public String status = "//th[contains(text(),'Status')]";
    	public String eess = "//th[contains(text(),'EE#/SS#')]";
    	public String empname = "//th[contains(text(),'Employee Name')]";
    	public String currentclaimsView = "//select//option[@value='Current Claims View']";
    	public String filtersSelect = "(//select[contains(text(),'')])[2]";
    	public String claimStatus = "(//option[@value='3'])[1]";
    	public String disabilityPFL = "//b[contains(text(),'Disability / PFL claims')]";
    	public String approved = "(//label[contains(text(),'Approved')])[1]";
    	public String closed = "(//label[contains(text(),'Closed')])[1]";
    	public String decisionPending = "(//label[contains(text(),'Decision pending')])[1]";
    	public String denied = "(//label[contains(text(),'Denied')])[1]";
    	public String pending = "(//label[contains(text(),'Pending')])[1]";
    	public String suspended = "(//label[contains(text(),'Suspended')])[1]";
    	public String fmlClaims = "(//b[contains(text(),'FML claims')])[1]";
    	public String abandoned = "(//label[contains(text(),'Abandoned')])[1]";
    	public String approved1 = "(//label[contains(text(),'Approved')])[2]";
    	public String cancelled = "(//label[contains(text(),'Cancelled')])[1]";
    	public String closed1 = "(//label[contains(text(),'Closed')])[2]";
    	public String denied1 = "(//label[contains(text(),'Denied')])[2]";
    	public String newStatus = "(//label[contains(text(),'New')])[1]";	
    	public String pending1 = "(//label[contains(text(),'Pending')])[2]";
    	public String reopened = "(//label[contains(text(),'Reopened')])[1]";
    	public String suspended1 = "(//label[contains(text(),'Suspended')])[2]";   	
    	public String AK = "//input[@id='WorkState0']";
    	public String DE = "//input[@id='WorkState7']";
    	public String NH = "//input[@id='WorkState29']";
    	
    	//daily status view
    	public String dailyStatus = "//a[contains(text(),'Daily Status View')]";
    	public String search = "(//button[@class='primary-orange-btn rect-btn'])[1]";
    	public String empnamee = "//span[contains(text(),'Employee Name')]";
    	public String calender = "//span[@class='calender-icon']";
    	public String nov23 = "(//span[contains(text(),'29')])[1]";
    	public String dec4 = "(//span[contains(text(),'4')])[4]";
    	public String AllactivitiesView = "(//b[contains(text(),'All Activities')])[4]";
    	public String sseeid = "//th[contains(text(),'SS#/EE ID')]";
    	public String claimreceiveddate = "(//span[contains(text(),'')])[114]";
    	public String benefitStartDate = "(//span[contains(text(),'')])[116]";
    	public String dateLastWorked = "(//span[contains(text(),'')])[118]";
    	public String returnworkDate = "(//span[contains(text(),'')])[120]";
    	public String triggerEvent = "(//span[contains(text(),'Trigger Event')])";
    	public String backDailystatus = "//a[contains(text(),'Back to Daily Status View')]";
    	public String newClaim = "(//a[contains(text(),'new Claim Submissions')])[3]";
    	public String approvalsClaim = "(//a[contains(text(),'approvals')])[2]";
    	public String suspendedClaims = "(//a[contains(text(),'suspended Claims')])[1]";
    	public String closedClaims = "(//a[contains(text(),'closed Claims')])[1]";
    	public String benefitClaims = "(//a[contains(text(),'benefit Period Updates')])[2]";
    	public String dateLastclaims = "(//a[contains(text(),'date Last Worked Updates')])[1]";

	public PageObject_Home() {
	}

}
	
	
	
	
	




