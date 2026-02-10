package com.qa.pages_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.Basepage_pom;

public class Student_application extends Basepage_pom {

	//1.driver and this for current class reference

	public Student_application() {
		PageFactory.initElements(driver, this);	
	}

	////////////////////////////////--->> EDUCATIONAL DETAILS START<<---/////////////////////////////////////////////////////////////////
	@FindBy(id="ABCNumber")
	WebElement abc_number;

	@FindBy(id="PRN")
	WebElement prn_number;

	@FindBy(xpath = "//button[normalize-space()='Select Your College']")
	WebElement selectCollegeDropdown;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'HR College')]")
	WebElement hrCollegeOption;


	//////////////////////////////////////////////////////////	

	@FindBy(xpath = "//button[normalize-space()='Select Your Education Level']")
	WebElement selectedEducationLevelDropdown;

	@FindBy(xpath = "//nb-option[@id='nb-option-77']")
	WebElement bachelorOption;


	////////////////////////////////////////////////////////////////////////////////

	@FindBy(xpath = "//button[normalize-space()='Select Your Course']")
	WebElement educationCourseDropdown;

	@FindBy(xpath = "//nb-option-list//nb-option[contains(.,'BCOM')]")
	WebElement bcomOption;

	////////////////////////////////////////////////////////////////////////////////////

	@FindBy(xpath = "//nb-radio[.//span[contains(text(),'No')]]//label")
	WebElement noRadioBtn;

	///////////////////////////////////////////////////////////////////////////////////////////

	@FindBy(xpath = "//nb-select[@id='enrollmentYear']//button[@type='button']")
	WebElement yearofenrollDropdown;

	@FindBy(xpath = "//nb-option[normalize-space()='2003']")
	WebElement year2003Option;

	///////////////////////////////////////////////////////////////////////////////////
	@FindBy(css = "nb-select#enrollmentYearStandard button[type='button']")
	WebElement entrylevelstandardDropdown;

	@FindBy(xpath = "//nb-option[normalize-space()='FIRST YEAR']")
	WebElement firstYearOption;


	//////////////////////////////////////////////////////////////////////////
	@FindBy(css = "nb-select#leavingYear button[type='button']")
	WebElement leavingYearDropdown;

	@FindBy(xpath = "//nb-option[normalize-space()='2005']")
	WebElement year2005Option;


	////////////////////////////////////////////////////////////////////
	@FindBy(css = "nb-select#leavingYearStandard button[type='button']")
	WebElement leavingYearStandardDropdown;

	@FindBy(xpath = "//nb-option[normalize-space()='THIRD YEAR']")
	WebElement thirdYearOptionLeavingStd;


	/////////////////////////////////////////////////////////
	@FindBy(css = "nb-select#tcpattern button[type='button']")
	WebElement examPatternDropdown;

	@FindBy(xpath= "//nb-option[normalize-space()='YEARLY']")
	WebElement yearlyoption;

	/*@FindBy(xpath = "//nb-option[normalize-space()='SEMESTER']")
	WebElement semesterOption;*/


	/////////////////////////////////////////////////////
	//@FindBy(xpath = "(//nb-checkbox//span[contains(@class,'custom-checkbox')])[1]")
	//WebElement semesterFirstCheckbox;

	@FindBy(xpath= "(//nb-checkbox//span[contains(@class,'custom-checkbox')])[1]")
	WebElement FirstYearCheckbox;

	//@FindBy(xpath = "(//nb-checkbox//span[contains(@class,'custom-checkbox')])[2]")
	//WebElement semesterTwoCheckbox;

	@FindBy(xpath= "(//nb-checkbox//span[contains(@class,'custom-checkbox')])[2]")
	WebElement SecondYearCheckbox;

	//@FindBy(xpath = "(//nb-checkbox//span[contains(@class,'custom-checkbox')])[3]")
	//WebElement semesterThreeCheckbox;

	@FindBy(xpath= "(//nb-checkbox//span[contains(@class,'custom-checkbox')])[3]")
	WebElement ThirdYearCheckbox;

	/////////////////////////////////////////////////////
	@FindBy(xpath = "//button[@id='educationSaveBtn']")
	WebElement educational_details_save_btn;
	////////////////////////////////--->> EDUCATIONAL DETAILS  END<<---/////////////////////////////////////////////////////////////////

	////////////////////////////////--->> REASON DETAILS  START<<---/////////////////////////////////////////////////////////////////

	@FindBy(xpath="//button[normalize-space()='Type Your Reason Here']")
	WebElement Reason_for_Transcript_Certificate_dropdown;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'OTHER')]")
	WebElement select_reason_as_other;
	///////////////////////////////////////////////////////////////////////

	@FindBy(xpath="//input[@id='exam']")
	WebElement enter_purpose;


	@FindBy(xpath="//input[@id='universities']")
	WebElement enter_university_name;


	///////////////////////////////////////////////////////////////////////

	@FindBy(xpath="//button[normalize-space()='Transcript Preference']")
	WebElement Your_Preferred_Option_For_Transcript_Download;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'EMAIL')]")
	WebElement select_transcript_download_option;

	@FindBy(xpath="//button[@id='reasonSaveBtn']")
	WebElement save_btn_for_reason_details;


	////////////////////////////////--->> COURSE DETAILS  START<<---/////////////////////////////////////////////////////////////////

	///////// --->>AddEduDetails -1<<---///////////
	@FindBy(xpath = "//button[@id='addEduDetailsBtn1']")
	WebElement add_education_btn_first_year;

	@FindBy(xpath = "//nb-select[@id='endmonthCtrl1']")
	WebElement exam_month_dropdown;

	@FindBy(xpath = "//nb-option-list//nb-option[contains(.,'APRIL')]")
	WebElement exam_month_dropdown_option;

	@FindBy(xpath="//nb-select[@id='endyearCtrl0']")
	WebElement exam_year_dropdown;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'2003')]")
	WebElement exam_year_dropdown_option;

	@FindBy(xpath="//input[@id='subjectName1']")
	WebElement select_subjectname1_testfield;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'Foundation Course – I')]")
	WebElement subjectname_1;

	@FindBy(xpath="//input[@id='total_overall1']")
	WebElement select_subjectname1_overallmarks_field;

	@FindBy(xpath="//button[normalize-space()='Add Subject']")
	WebElement addsubject_btn_1;

	@FindBy(xpath="//input[@id='subjectName2']")
	WebElement select_subjectname2_testfield;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'Tax Procedure & Practice – I')]")
	WebElement subjectname_2;

	@FindBy(xpath="//input[@id='total_overall2']")
	WebElement select_subjectname2_overallmarks_field;

	@FindBy(xpath="//button[normalize-space()='Add Subject']")
	WebElement addsubject_btn_2;

	@FindBy(xpath="//input[@id='subjectName3']")
	WebElement select_subjectname3_testfield;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'Business Economics')]")
	WebElement subjectname_3;

	@FindBy(xpath="//input[@id='total_overall3']")
	WebElement select_subjectname3_overallmarks_field;


	@FindBy(xpath="//input[@id='total_overall_out1']")
	WebElement total_max_marks_obtn_first_year_textfield;

	@FindBy(xpath="//input[@id='percentage1']")
	WebElement select_percentagefirstyear_testfield;


	@FindBy(xpath="//button[@id='saveButton']")
	WebElement save_first_year_educational_details;

	///////// --->>AddEduDetail-2<<---///////////
	@FindBy(xpath = "//button[@id='addEduDetailsBtn2']")
	WebElement add_education_btn_second_year;
	
	@FindBy(xpath = "//nb-select[@id='endmonthCtrl1']")
	WebElement exam_month_dropdown_second_year;
	
	@FindBy(xpath = "//nb-option-list//nb-option[contains(.,'JULY')]")
	WebElement exam_month_dropdown_option_second_year;
	
	@FindBy(xpath="//nb-select[@id='endyearCtrl0']")
	WebElement exam_year_dropdown_second_year;
	
	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'2004')]")
	WebElement exam_year_dropdown_option_second_year;
	
	@FindBy(xpath="//input[@id='subjectName1']")
	WebElement subjectname1_testfield_second_year;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'Tax Procedure & Practice – III')]")
	WebElement second_year_subjectname_1;

	@FindBy(xpath="//input[@id='total_overall1']")
	WebElement select_subjectname1_overallmarks_field_second_year;

	@FindBy(xpath="//button[normalize-space()='Add Subject']")
	WebElement second_year_addsubject_btn_1;
	
	@FindBy(xpath="//input[@id='subjectName2']")
	WebElement subjectname2_testfield_second_year;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'Business Economics – II')]")
	WebElement second_year_subjectname_2;

	@FindBy(xpath="//input[@id='total_overall2']")
	WebElement select_subjectname2_overallmarks_field_second_year;

	@FindBy(xpath="//button[normalize-space()='Add Subject']")
	WebElement second_year_addsubject_btn_2;
	
    @FindBy(xpath="//input[@id='subjectName3']")
	WebElement subjectname3_testfield_second_year;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'Business Law')]")
	WebElement second_year_subjectname_3;

	@FindBy(xpath="//input[@id='total_overall3']")
	WebElement select_subjectname3_overallmarks_field_second_year;
	
	@FindBy(xpath="//input[@id='total_overall_out1']")
	WebElement total_max_marks_obtn_first_year_textfield_second_year;

	@FindBy(xpath="//input[@id='percentage1']")
	WebElement select_percentagefirstyear_testfield_second_year;

	@FindBy(xpath="//button[@id='saveButton']")
	WebElement save_second_year_educational_details;
	
	///////// --->>AddEduDetail-3<<---///////////
	
	@FindBy(xpath = "//button[@id='addEduDetailsBtn3']")
	WebElement add_education_btn_third_year;
	
	@FindBy(xpath = "//nb-select[@id='endmonthCtrl1']")
	WebElement exam_month_dropdown_third_year;
	
	@FindBy(xpath = "//nb-option-list//nb-option[contains(.,'OCTOBER')]")
	WebElement exam_month_dropdown_option_third_year;
	
	@FindBy(xpath="//nb-select[@id='endyearCtrl0']")
	WebElement exam_year_dropdown_third_year;
	
	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'2005')]")
	WebElement exam_year_dropdown_option_third_year;

	@FindBy(xpath="//input[@id='subjectName1']")
	WebElement subjectname1_testfield_third_year;
	
	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'Management & Human Resource Development')]")
	WebElement third_year_subjectname_1;

	@FindBy(xpath="//input[@id='total_overall1']")
	WebElement select_subjectname1_overallmarks_field_third_year;

	@FindBy(xpath="//button[normalize-space()='Add Subject']")
	WebElement third_year_addsubject_btn_1;
	
	@FindBy(xpath="//input[@id='subjectName2']")
	WebElement subjectname2_testfield_third_year;

	@FindBy(xpath="//nb-option-list//nb-option[contains(.,'Tax Procedure & Practice – VI')]")
	WebElement third_year_subjectname_2;

	@FindBy(xpath="//input[@id='total_overall2']")
	WebElement subjectname2_overallmarks_field_third_year;
	
	@FindBy(xpath="//input[@id='total_overall_out1']")
	WebElement total_max_marks_obtn_first_year_textfield_third_year;

	@FindBy(xpath="//input[@id='percentage1']")
	WebElement select_percentagefirstyear_testfield_third_year;

	@FindBy(xpath="//input[@id='overall_mark_obt1']")
    WebElement enter_overall_marks_obtain;
	
	@FindBy(xpath="//input[@id='overall_mark_out1']")
	WebElement enter_overall_max_marks;

	@FindBy(xpath="//input[@id='overall_percentage1']")
	WebElement enter_overall_percentage;
	
	@FindBy(xpath="//button[@id='saveButton']")
	WebElement save_third_year_educational_details;
	
    @FindBy(xpath="//button[@id='courseNextBtn']")
    WebElement course_details_next_btn;



	////////////////////////////////--->> COURSE DETAILS  END<<---/////////////////////////////////////////////////////////////////

	////////////////////////////////--->> Upload marksheet  START<<---/////////////////////////////////////////////////////////////////

    @FindBy(xpath = "p-fileupload[@id='fileUpload1']//input[@type='file']")
	WebElement first_year_markshee_Upload;
    
    @FindBy(xpath = "p-fileupload[@id='fileUpload2']//input[@type='file']")
	WebElement second_year_markshee_Upload;
    
    @FindBy(xpath = "p-fileupload[@id='fileUpload3']//input[@type='file']")
	WebElement third_year_markshee_Upload;
    
    @FindBy(xpath="//button[@id='uploadNextBtn']")
    WebElement next_btn_upload_marksheet;

	

	////////////////////////////////--->> Upload marksheet  END<<---/////////////////////////////////////////////////////////////////

	////////////////////////////// --->> ACTION FOR EDUCATIONAL DETAILS START <<----///////////////////////////////////////////////////////
	//Action
	public void Education_Detail_as_ABC_PRN() {
		abc_number.sendKeys("3246546");
		prn_number.sendKeys("2314564646464");

	}

	public void selectCollege_dropdown() {
		//selectCollegeDropdown.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(selectCollegeDropdown)).click();

	}
	public void selectcollegeoption() {
		//hrCollegeOption.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(hrCollegeOption)).click();

	}

	public void selectEducationLevel_dropdown() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(selectedEducationLevelDropdown)).click();

	}

	public void select_education_level() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(bachelorOption)).click();

	}

	public void selectEducationCourse_dropdown() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(educationCourseDropdown)).click();

	}

	public void select_education_course() {
		bcomOption.click();

		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(bcomOption)).click();

	}

	public void radio_btn_student_studying_in_college() {
		//noRadioBtn.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(noRadioBtn)).click();

	}

	public void selectEnrollmentYear_dropdown() {
		//yearofenrollDropdown.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(yearofenrollDropdown)).click();
	}	

	public void select_Enrollment_year_option() {
		//year2020Option.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(year2003Option)).click();

	}

	public void selectEntryLevelStandard_dropdown() {
		//entrylevelstandardDropdown.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(entrylevelstandardDropdown)).click();
	}	

	public void select_EntryLevel_Std_option() {
		//firstYearOption.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(firstYearOption)).click();

	}

	public void selectLeavingYear_dropdown() {
		leavingYearDropdown.click();

		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(leavingYearDropdown)).click();
	}	
	public void select_leaving_year_option() {
		year2005Option.click();

		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(year2024Option)).click();

	}

	public void selectLeavingYearStandard_dropdown() {
		//leavingYearStandardDropdown.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(leavingYearStandardDropdown)).click();

	}	
	public void select_leaving_year_std_option() {
		//firstYearOptionLeavingStd.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(thirdYearOptionLeavingStd)).click();

	}


	public void selectExamPattern_dropdown() {
		//examPatternDropdown.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(examPatternDropdown)).click();
	}

	public void select_exam_pattern_option() {	
		//semesterOption.click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(semesterOption)).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(yearlyoption)).click();

	}

	public void selectsemfirstbox() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(FirstYearCheckbox)).click();
	}

	public void selectsemsecondbox() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(SecondYearCheckbox)).click();
	}

	public void selectsemthirdbox() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ThirdYearCheckbox)).click();
	}

	public void Education_Detail_save_btn() {
		//educational_details_save_btn.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(educational_details_save_btn)).click();

	}


	////////////////////////////// --->> ACTION FOR EDUCATIONAL DETAILS END <<----///////////////////////////////////////////////////////



	//////////////////////////////--->> ACTION FOR REASON DETAILS START <<----///////////////////////////////////////////////////////


	public void select_reason_for_Transcript_Certificate_dropdown() {
		//Reason_for_Transcript_Certificate_dropdown.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Reason_for_Transcript_Certificate_dropdown)).click();
	}

	public void select_reason_option() {
		//select_reason_as_other.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(select_reason_as_other)).click();
	}

	public void enter_purpose_text_box() {
		enter_purpose.sendKeys("TEST");
	}

	public void enter_university_name() {
		enter_university_name.sendKeys("North Maharashtra");
	}

	public void select_Preferred_Option_For_Transcript_dropdown() {
		Your_Preferred_Option_For_Transcript_Download.click();

	}

	public void select_select_transcript_download_option() {
		select_transcript_download_option.click();

	}

	public void reason_details_save_btn() {
		save_btn_for_reason_details.click();

	}

	//////////////////////////////--->> ACTION FOR REASON DETAILS END <<----///////////////////////////////////////////////////////



	//////////////////////////////--->> ACTION FOR COURSE DETAILS START  <<----///////////////////////////////////////////////////////

	//addEduDetails->1
	public void btn_educational_detail_first_year() {
		//add_education_btn_first_yeasr.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(add_education_btn_first_year)).click();	
	}

	public void exam_month_dropdown() {
		//exam_month_dropdown.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(exam_month_dropdown)).click();	
	}
	public void select_exam_month_dropdown_option() {
		//exam_year_dropdown.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(exam_month_dropdown_option)).click();
	}
	public void select_exam_year_dropdown() {
		//exam_year_dropdown.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(exam_year_dropdown)).click();
	}
	public void select_exam_year_dropdown_option() {
		//exam_year_dropdown_option.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(exam_year_dropdown_option)).click();
	}	
	public void select_subjectname1_textfield_1() {
		select_subjectname1_testfield.click();
	}
	public void select_subjectname_1() {
		subjectname_1.click();
	}
	public void enter_marks_for_subject_1() {
		select_subjectname1_overallmarks_field.sendKeys("10");	
	}
	public void add_subject_1() {
		addsubject_btn_1.click();	
	}
	public void select_subjectname2_textfield_2() {
		select_subjectname2_testfield.click();
	}
	public void select_subjectname_2() {
		subjectname_2.click();
	}
	public void enter_marks_for_subject_2() {
		select_subjectname2_overallmarks_field.sendKeys("20");
	}
	public void add_subject_2() {
		addsubject_btn_2.click();	
	}
	public void select_subjectname3_testfield_3() {
		select_subjectname3_testfield.click();
	}
	public void add_subject_3_() {
		subjectname_3.click();	
	}
	public void enter_marks_for_subject_3() {
		select_subjectname3_overallmarks_field.sendKeys("30");
	}
	public void add_total_max_marks_obtn_first_year() {
		total_max_marks_obtn_first_year_textfield.sendKeys("250");
	}
	public void add_select_percentagefirstyear_testfield() {
		select_percentagefirstyear_testfield.sendKeys("65");
	}
	public void save_education_details_first_year() {
		//save_first_year_educational_details.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(save_first_year_educational_details)).click();
	}

	//addEduDetails->2
	public void btn_educational_detail_second_year() {
		//add_education_btn_second_year.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(add_education_btn_second_year)).click();	
	}
	public void select_exam_month_dropdown_second_year() {
		exam_month_dropdown_second_year.click();	
	}
	public void select_exam_month_dropdown_option_second_year() {
		exam_month_dropdown_option_second_year.click();
	}
	public void select_exam_year_dropdown_second_year() {
		exam_year_dropdown_second_year.click();
	}
    public void select_exam_year_dropdown_option_second_year() {
	exam_year_dropdown_option_second_year.click();
    }
    public void select_subjectname1_textfield_1_sec_year() {
    subjectname1_testfield_second_year.click();
    }
    public void select_subjectname_1_second_year() {
    second_year_subjectname_1.click();
    }
    public void enter_marks_for_subject_1_second_year() {
    select_subjectname1_overallmarks_field_second_year.sendKeys("10");
    }
    public void add_subject_1_second_year() {
    second_year_addsubject_btn_1.click();
    }
    public void select_subjectname2_textfield_2_seco_year() {
    subjectname2_testfield_second_year.click();
    }
    public void select_subjectname_2_second_year() {
    second_year_subjectname_2.click();	
    }
    public void enter_marks_for_subject_2_second_year() {
    select_subjectname2_overallmarks_field_second_year.sendKeys("20");
    }
    public void add_subject_2_second_year() {
    second_year_addsubject_btn_2.click();	
    }
    public void select_subjectname3_textfield_3_seco_year() {
    subjectname3_testfield_second_year.click();
    }
    public void select_subjectname_3_second_year() {
    second_year_subjectname_3.click();	
    }
    public void enter_marks_for_subject_3_second_year() {
    select_subjectname3_overallmarks_field_second_year.sendKeys("30");
    }
    public void add_total_max_marks_obtn_second_year() {
    total_max_marks_obtn_first_year_textfield_second_year.sendKeys("250");
	}
	
	public void add_select_percentagefirstyear_testfield_second_year() {
	select_percentagefirstyear_testfield_second_year.sendKeys("65");
	} 
	public void save_education_details_second_year() {
		//save_first_year_educational_details.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(save_second_year_educational_details)).click();
	}
	//addEduDetails->3
	
	public void btn_educational_detail_third_year() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(add_education_btn_third_year)).click();	
	}
	
	public void select_exam_month_dropdown_third_year() {
	exam_month_dropdown_third_year.click();	
	}

	public void select_exam_month_dropdown_option_third_year() {
	exam_month_dropdown_option_third_year.click();	
	}
	
	public void selec_exam_year_dropdown_third_year() {
	//exam_year_dropdown_third_year.click();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(exam_year_dropdown_third_year)).click();
	}
	
	public void select_exam_year_dropdown_option_third_year() {
	exam_year_dropdown_option_third_year.click();	
	}
	
	public void select_subjectname1_textfield_1_third_year() {
	//subjectname1_testfield_third_year.click();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(subjectname1_testfield_third_year)).click();
	}
	
	public void select_subjectname_1_third_year() {
	third_year_subjectname_1.click();	
	}
	public void enter_marks_for_subject_1_third_year() {
	select_subjectname1_overallmarks_field_third_year.sendKeys("10");	
	}
	public void add_subject_1_third_year() {
	third_year_addsubject_btn_1.click();	
	}
	public void select_subjectname2_testfield_third_year() {
	subjectname2_testfield_third_year.click();	
	}
    public void select_subjectname_2_third_year() {
    third_year_subjectname_2.click();	
    }
    public void select_subjectname2_overallmarks_field_third_year() {
    subjectname2_overallmarks_field_third_year.sendKeys("20");
    }
    public void add_total_max_marks_obtn_first_year_textfield_third_year() {
    total_max_marks_obtn_first_year_textfield_third_year.sendKeys("250");
    }
    public void add_select_percentagefirstyear_testfield_third_year() {
    select_percentagefirstyear_testfield_third_year.sendKeys("70");
    }
    public void add_overall_marks_obtain() {
    enter_overall_marks_obtain.sendKeys("65");
    }
    public void add_overall_max_marks() {
    enter_overall_max_marks.sendKeys("100");	
    }
    public void add_overall_percentage() {
    enter_overall_percentage.sendKeys("50");
    }
    public void save_educational_details__third_year_() {
    save_third_year_educational_details.click();
    }
    public void click_on_course_details_next_btn() {
    //course_details_next_btn.click();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(course_details_next_btn)).click();
    
    }
    

    
	//////////////////////////////--->> ACTION FOR COURSE DETAILS END <<----///////////////////////////////////////////////////////






	//////////////////////////////--->> ACTION FOR Marksheets Upload  START  <<----///////////////////////////////////////////////////////

    public void upload_First_Year_Marksheet(String filePath) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p-fileupload[@id='fileUpload1']//input[@type='file']")));
        upload.sendKeys(filePath);
    }

    public void upload_Second_Year_Marksheet(String filePath) {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p-fileupload[@id='fileUpload2']//input[@type='file']")));
        upload.sendKeys(filePath);
    }

    public void upload_Third_Year_Marksheet(String filePath) {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p-fileupload[@id='fileUpload3']//input[@type='file']")));
        upload.sendKeys(filePath);
    }
    
    public void click_next_btn_upload_marksheet() {
    	//next_btn_upload_marksheet.click();
    	WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(next_btn_upload_marksheet)).click();
        
    }
	//////////////////////////////--->> ACTION FOR Marksheets Upload  END  <<----///////////////////////////////////////////////////////




}


