package com.utils_pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.base.Basepage_pom;

public class UtilsTest extends Basepage_pom{

	
public static long Page_LOAD_TIMEOUTS= 250;
public static long IMPLICIT_WAITS = 100;


public static String TESTDATA_SHEET_PATH = "C:\\Users\\info\\eclipse-workspace\\Framework_Structure\\src\\main\\java\\com\\TestData\\TestData.xlsx";
static Workbook book;
static Sheet sheet;
static JavascriptExecutor js;
static WebDriver driver;  // Assuming you have WebDriver initialized somewhere

public void switchToFrame() {
    driver.switchTo().frame("mainpanel");
}

public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
    FileInputStream file = null;
    try {
        file = new FileInputStream(TESTDATA_SHEET_PATH);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    try {
        book = WorkbookFactory.create(file);
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (file != null) {
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    sheet = book.getSheet(sheetName);
    int rowCount = sheet.getLastRowNum();
    int colCount = sheet.getRow(0).getLastCellNum();
    Object[][] data = new Object[rowCount][colCount];

    for (int i = 0; i < rowCount; i++) {
        for (int k = 0; k < colCount; k++) {
            data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
        }
    }

    return data;
}


//Screenshot
public static void takeScreenshotAtEndOfTest() throws IOException {
	
        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
        File srcFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
        String timestamp = String.valueOf(System.currentTimeMillis());
        String screenshotPath = "/Framework_Structures" + timestamp + ".png";

        FileUtils.copyFile(srcFile, new File(screenshotPath));
   
}
}































/*All in short
 * how to take screenshots methods initialize here
 * Reporting[ HTML,Extend Report,TestNG Report}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



