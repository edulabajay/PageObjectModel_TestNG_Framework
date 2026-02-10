package com.testcase_pom;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Basepage_pom;
import com.qa.pages_pom.LoginPage_pom;
import com.qa.pages_pom.Student_application;
import com.qa.pages_pom.Student_dashboard;

public class Student_application_test extends Basepage_pom{

	Student_dashboard dashboard;
	LoginPage_pom loginpage;
	Student_application application;
	
	
	public Student_application_test() {

		//Invoke superclass constructor from basepage_pom
		super();
		
	}
	
	@BeforeMethod
	public void steup() {

		initialize();
		loginpage = new LoginPage_pom();
		dashboard = new Student_dashboard();
		application = new Student_application();
		dashboard = loginpage.login(prop.getProperty("user_name"),prop.getProperty("user_pass"));
		application=dashboard.validate_student_create_new_application_btn();

		   
	}
	
	@Test(priority=1)
	public void validate_new_application_details()  {
		application.Education_Detail_as_ABC_PRN();
		
		//##Education Detail
		application.selectCollege_dropdown();
		application.selectcollegeoption();
		application.selectEducationLevel_dropdown();
		application.select_education_level();
		application.selectEducationCourse_dropdown();
		application.select_education_course();
		application.radio_btn_student_studying_in_college();
		application.selectEnrollmentYear_dropdown();
		application.select_Enrollment_year_option();
		application.selectEntryLevelStandard_dropdown();
		application.select_EntryLevel_Std_option();
		application.selectLeavingYear_dropdown();
		application.select_leaving_year_option();
		application.selectLeavingYearStandard_dropdown();
		application.select_leaving_year_std_option();
		application.selectExamPattern_dropdown();
		application.select_exam_pattern_option();
		application.selectsemfirstbox();
		application.selectsemsecondbox();
		application.selectsemthirdbox();
		application.Education_Detail_save_btn();
		
		//##Reason Detail
		application.select_reason_for_Transcript_Certificate_dropdown();
		application.select_reason_option();
		application.enter_purpose_text_box();
		application.enter_university_name();
		application.select_Preferred_Option_For_Transcript_dropdown();
		application.select_select_transcript_download_option();
		application.reason_details_save_btn();
		
		//##Course Detail
		//addEduDetails->1
		application.btn_educational_detail_first_year();
		application.exam_month_dropdown();
		application.select_exam_month_dropdown_option();
		application.select_exam_year_dropdown();
		application.select_exam_year_dropdown_option();
		application.select_subjectname1_textfield_1();
		application.select_subjectname_1();
		application.enter_marks_for_subject_1();
		application.add_subject_1();
		application.select_subjectname2_textfield_2();
		application.select_subjectname_2();
		application.enter_marks_for_subject_2();
		application.add_subject_2();
		application.select_subjectname3_testfield_3();
		application.add_subject_3_();
		application.enter_marks_for_subject_3();
		application.add_total_max_marks_obtn_first_year();
		application.add_select_percentagefirstyear_testfield();
		application.save_education_details_first_year();
		
		//addEduDetails->2
		application.btn_educational_detail_second_year();
		application.select_exam_month_dropdown_second_year();
		application.select_exam_month_dropdown_option_second_year();
		application.select_exam_year_dropdown_second_year();
		application.select_exam_year_dropdown_option_second_year();
		application.select_subjectname1_textfield_1_sec_year();
		application.select_subjectname_1_second_year();
		application.enter_marks_for_subject_1_second_year();
		application.add_subject_1_second_year();
		application.select_subjectname2_textfield_2_seco_year();
		application.select_subjectname_2_second_year();
        application.enter_marks_for_subject_2_second_year();
		application.add_subject_2_second_year();
		application.select_subjectname3_textfield_3_seco_year();
	    application.select_subjectname_3_second_year();
	    application.enter_marks_for_subject_3_second_year();
	    application.add_total_max_marks_obtn_second_year();
	    application.add_select_percentagefirstyear_testfield_second_year();
	    application.save_education_details_second_year();
		
		//addEduDetails->3
	    application.btn_educational_detail_third_year();
	    application.select_exam_month_dropdown_third_year();
	    application.select_exam_month_dropdown_option_third_year();
        application.selec_exam_year_dropdown_third_year();
        application.select_exam_year_dropdown_option_third_year();
        application.select_subjectname1_textfield_1_third_year();
        application.select_subjectname_1_third_year();
        application.enter_marks_for_subject_1_third_year();
        application.add_subject_1_third_year();
        application.select_subjectname2_testfield_third_year();
        application.select_subjectname_2_third_year();
        application.select_subjectname2_overallmarks_field_third_year();
		application.add_total_max_marks_obtn_first_year_textfield_third_year();
		application.add_select_percentagefirstyear_testfield_third_year();
		application.add_overall_marks_obtain();
		application.add_overall_max_marks();
		application.add_overall_percentage();
		application.save_educational_details__third_year_();
		application.click_on_course_details_next_btn();
		
		
		//##Marksheets Upload
		application.upload_First_Year_Marksheet("C:\\Users\\info\\Downloads\\Solapur.png");
		application.upload_Second_Year_Marksheet("C:\\Users\\info\\Downloads\\1765641457046.jpeg");
		application.upload_Third_Year_Marksheet("C:\\Users\\info\\Downloads\\Business_Plan.pdf");
        application.click_next_btn_upload_marksheet();

		

		
	}
	
	
	
	
	/*
	@Test(priority=2)
	public void validate_selectcollegedropdown() {
		application.selectCollegedropdown();
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	@Test(priority=3)
	public void validate_selectcollegeoption() {
		application.selectcollegeoption();
	}
	
	
	@Test(priority=4)
	public void validate_selectEducationLevel_dropdown() {
		application.selectEducationLevel_dropdown();	
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	
	@Test(priority=5)
	public void validate_select_education_level() {
		application.select_education_level();
	}
	
	
	/*
	@Test(priority=4)
	public void validate_selectEducationCourse() {
		application.selectEducationCourse();
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	/*
	@Test(priority=5)
	public void validate_radio_btn_student_studying_in_college() {
		application.radio_btn_student_studying_in_college();
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	
	@Test(priority=6)
	public void validate_selectEnrollmentYear() {
	   application.selectEnrollmentYear();
	   System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	
	@Test(priority=7)
    public void validate_selectEntryLevelStandard() {
		application.selectEntryLevelStandard();
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	
	@Test(priority=8)
	public void validate_selectLeavingYear() {
		application.selectLeavingYear();
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	
	@Test(priority=9)
	public void validate_selectLeavingYearStandard() {
		application.selectLeavingYearStandard();
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	
	@Test(priority=10)
	public void validate_selectExamPattern() {
		application.selectExamPattern();
		System.out.println("After login URL: " + driver.getCurrentUrl());
		System.out.println("After login Title: " + driver.getTitle());
	}
	
	@Test(priority=11)
	public void validate_select_sem_checkbox() {
		application.selectsembox();
	}
	
	@Test(priority=12)
	public void validate_educational_details_save_btn() {
		application.Education_Detail_btn();
	}*/
	
	/*
	@AfterMethod
	public void tear() {
		driver.close();
	}
*/
}
