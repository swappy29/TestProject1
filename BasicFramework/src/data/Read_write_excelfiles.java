package data;

import utilities.XLS_Reader;

public class Read_write_excelfiles {

	
		
		XLS_Reader d=new XLS_Reader("C:\\Users\\Vrajesh\\Documents\\testing\\NikulTest.xlsx");
		public String CorrectEmail=d.getCellData("Data1", "UserName", 2);
		public String WrongEmail=d.getCellData("Data1", "UserName", 3);
		public String WrongPassword=d.getCellData("Data1", "Password", 2);
		public String EmailErr_msg=d.getCellData("Data1", "Email Error", 2);
		public String PasswordErr_msg=d.getCellData("Data1", "Password Error", 2);
	

}
