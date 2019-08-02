package SeleniumDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumExcel {
	WebDriver driver;
	
	 @Test
	public void Supri() throws IOException {
		
		 
		 String Filepath = "C:\\Users\\Training_c2d.02.11\\Doctest.docx";
		 File src=new File(Filepath);
		 
		 String fileExtension=FilenameUtils.getExtension(Filepath);
		 
		 if(fileExtension.equalsIgnoreCase("docx"))
		 {
		 readDocxFile(Filepath);
		 }
		 else if(fileExtension.equalsIgnoreCase("doc"))
		 {
		 readDocxFile(Filepath);
		 }
		 
		 
		
		 
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream Out = new FileOutputStream(src);
		
		
//		XSSFWorkbook wb=new XSSFWorkbook(fis);	
//		XSSFSheet sheet1=wb.getSheetAt(0);
//		
//		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
//		System.out.println("data from excel is : "+data0);
//		
//		String data1=sheet1.getRow(1).getCell(0).getStringCellValue();
//		System.out.println("data from excel is : "+data1);
		//wb.close();
		
		
		
	}

	private void readDocxFile(String filepath) {
		// TODO Auto-generated method stub
		
	}
	}


