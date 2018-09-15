import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadData_PropertyFile
{
	
	
		
		 public static void main (String [] args) throws Exception
		  {
			  String data = GetData_PropertyFile.getDataFromProperties("C://rahulAutomate//programsrritesh//DesignFrameWork-Test\test-config\testData.properties", "name");
			  System.out.println(data);
		  }
		 

	
}
	
	
	
 


