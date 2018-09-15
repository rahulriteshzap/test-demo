
public class ReadData_Excel {

	public static void main(String[] args) throws Exception
	{
		String Data = GetData_Excel.getDataFromExcel("C://rahulAutomate//programsrritesh//DesignFrameWork-Test//data//execution-data.xls", "Sheet1", 0, 0);
				
				System.out.println(Data);
	}

}
