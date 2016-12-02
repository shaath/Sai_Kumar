package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import functions.orgMaster;

public class Hybrid 
{

	@Test
	public void Hybrid_Driver() throws IOException
	{
		String res=null;
		orgMaster om=new orgMaster();
		String xlpath="F:\\Anu_Sara\\Selenium\\src\\TestData\\Hybrid.xlsx";
		String xlout="F:\\Anu_Sara\\Selenium\\src\\results\\Hybridres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("empreg");
		
		int tcrc=ws.getLastRowNum();
		int tsrc=ws1.getLastRowNum();
		int emprc=ws2.getLastRowNum();
		
		for (int i = 1; i <= tcrc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsrc; j++) 
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcId.equalsIgnoreCase(tstcId)) 
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
							break;
						case "login":
//							String u=ws2.getRow(1).getCell(1).getStringCellValue();
//							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							
							for (int k = 1; k <= emprc; k++) 
							{
								String f=ws2.getRow(k).getCell(0).getStringCellValue();
								String l=ws2.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								ws2.getRow(k).createCell(2).setCellValue(res);
							}
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(5).getStringCellValue();
							String uname=ws2.getRow(1).getCell(6).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(7).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(8).getStringCellValue();
							
							res=om.org_Usereg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String user=ws2.getRow(1).getCell(9).getStringCellValue();
							String up=ws2.getRow(1).getCell(10).getStringCellValue();
							res=om.org_Login(user, up);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						//Result updation in test steps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						//Result updation in test case sheet
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
					
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
