package data;

public class Read_write_excelfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader d=new Xls_Reader("C:\\Users\\Vrajesh\\Documents\\testing\\NikulTest.xlsx");
		System.out.println(d.getCellData("Data1"," Name", 1));
		
		System.out.println(d.getCellData("Data1", 1,2));
		String correctemail=(d.getCellData("Data1", 1,2));
		System.out.println(correctemail);
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.setCellData("Data1", "Name",11,"Swapnil"));
		d.addColumn("Data1","Swapnil");
	}

}
