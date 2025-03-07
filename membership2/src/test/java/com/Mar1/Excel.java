package com.Mar1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	@Test
	public static void main(String[]args)
	{		
		FileInputStream fis;
		File f;
		XSSFWorkbook wb;
		XSSFSheet sh;
		
		try {
			 f= new File("src\\test\\java\\com\\Mar1\\Book1.xlsx");
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
			sh= wb.getSheetAt(0);
			
//			String data= sh.getRow(2).getCell(1).getStringCellValue();
//			System.out.println(data);
			
			System.out.println(sh.getLastRowNum());
			System.out.println(sh.getRow(2).getLastCellNum());
			
			for(int r=0 ; r<= sh.getLastRowNum() ; r++)
			{
				for(int c=0; c<sh.getRow(2).getLastCellNum() ; c++)
				{
					System.out.print(sh.getRow(r).getCell(c).getStringCellValue() + "  ");
				}
				System.out.println();
			}		
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
 
}
