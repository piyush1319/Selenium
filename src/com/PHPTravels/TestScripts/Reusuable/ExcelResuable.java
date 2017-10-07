package com.PHPTravels.TestScripts.Reusuable;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelResuable {

	
		public static String getCellValue(String path,String sheet,int r,int c){
			String v="";
			try{
				Workbook wb = WorkbookFactory.create(new FileInputStream(path));
				v= wb.getSheet(sheet).getRow(r).getCell(c).toString();
			}
			catch(Exception e){
			}
			return v;
		}
		
		public static int getRowCount(String path,String sheet){
			int row=0;
			try{
				FileInputStream fis=new FileInputStream(path);
				Workbook wb = WorkbookFactory.create(fis);
				row= wb.getSheet(sheet).getLastRowNum();
			}
			catch(Exception e){
			}
			return row;
		}
	}

	

