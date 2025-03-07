package com.Mar3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	FileInputStream fis;
	File f;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ReadExcel() // constrcutor
	{	
			try {
				 f= new File("src\\test\\java\\com\\Mar3\\Book1.xlsx");
				fis = new FileInputStream(f);
				wb = new XSSFWorkbook(fis);
			} catch (IOException e)
			{				
				e.printStackTrace();
			}
		}
	public String getdata(int shno,int row,int col) {
		sh=wb.getSheetAt(shno);
		String value=sh.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	//number of rows
	public int getRowCount(int shno)
	{
		sh= wb.getSheetAt(shno);
		int row=sh.getLastRowNum();
		return row;
	}
 
	//number of columns
		public short getColumnCount(int shno)
		{
			sh= wb.getSheetAt(shno);
			short col= sh.getRow(2).getLastCellNum();
			return col;
		}
}
 
	


