package testscript;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.junit.Assert;


public class ExecuteLeadTest {
	public static void main(String [] args) throws Exception{
		
		Keywords key = new Keywords();
		
		ArrayList data = new ArrayList();
		
	File src = new File("C:\\Users\\VASANT\\Desktop\\LeadSuite.xlsx");
	
	FileInputStream f = new FileInputStream(src);		
	
	XSSFWorkbook wbk = new XSSFWorkbook(f);
	
	Sheet s = wbk.getSheet("teststep");
	
	Iterator itr = s.iterator();
	
	while(itr.hasNext()){
	
		Row rowitr = (Row)itr.next();
		
		Iterator cellitr = rowitr.cellIterator();
		
		while(cellitr.hasNext()){
		
			Cell cell1 = (Cell)cellitr.next();
			
			switch(cell1.getCellType()){
			
			case Cell.CELL_TYPE_NUMERIC:
			
				data.add(cell1.getNumericCellValue());
				
				break;
				
			case Cell.CELL_TYPE_STRING:
			
				data.add(cell1.getStringCellValue());
				
				break;
				
			case Cell.CELL_TYPE_BOOLEAN:
			
				data.add(cell1.getBooleanCellValue());
				
				break;
					
				}
				
			}
		}
		
		for(int i =0; i< data.size(); i++){
		
			if(data.get(i).equals("openbrowser")){
										
			String keyword = (String)data.get(i);
			
			String testdata = (String)data.get(i+1);
			
			String objectname = (String)data.get(i+2);
			
			String runmode = (String)data.get(i+3);
			
			System.out.println(keyword);
			
			System.out.println(testdata);
			
			System.out.println(objectname);
			
			System.out.println(runmode);
			
			if(runmode.equals("yes")){
			
				key.openbrowser();
			}
		}
			
			
				
	
		if(data.get(i).equals("navigate")){
			
			String keyword = (String)data.get(i);
			
			String testdata = (String)data.get(i+1);
			
			String objectname = (String)data.get(i+2);
			
			String runmode = (String)data.get(i+3);
			
			System.out.println(keyword);
			
			System.out.println(testdata);
			
			System.out.println(objectname);
			
			System.out.println(runmode);
			
			if(runmode.equals("yes")){
			
				key.navigate(testdata);
			}
		}

		if(data.get(i).equals("input")){
			
			String keyword = (String)data.get(i);
			
			String testdata = (String)data.get(i+1);
			
			String objectname = (String)data.get(i+2);
			
			String runmode = (String)data.get(i+3);
			
			System.out.println(keyword);
			
			System.out.println(testdata);
			
			System.out.println(objectname);
			
			System.out.println(runmode);
			
			if(runmode.equals("yes")){
			
				key.input(testdata, objectname);
				
			}
			
					
		}
		
	
		if(data.get(i).equals("click")){
			
			
			String keyword = (String)data.get(i);
			
			String testdata = (String)data.get(i+1);
			
			String objectname = (String)data.get(i+2);
			
			String runmode = (String)data.get(i+3);
			
			System.out.println(keyword);
			
			System.out.println(testdata);
			
			System.out.println(objectname);
			
			System.out.println(runmode);
			
			if(runmode.equals("yes")){
			
				key.click(objectname);
				
			}
		}
		/*
	
			if(data.get(i).equals("verifytitle")){
				
				
				String keyword = (String)data.get(i);
				
				String testdata = (String)data.get(i+1);
				
				String objectname = (String)data.get(i+2);
				
				String runmode = (String)data.get(i+3);
				
				System.out.println(keyword);
				
				System.out.println(testdata);
				
				System.out.println(objectname);
				
				System.out.println(runmode);
				
				if(runmode.equals("yes")){
				
					String actualvalue = key.verifytitle();
					
					Assert.assertEquals(testdata, actualvalue);
					
				}
				
		}
		*/
	}
	
					
		
	}
	
	

	}

