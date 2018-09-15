import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetData_PropertyFile
{
	 public static String getDataFromProperties (String filepath, String Key)
	  {
		  String data= null;
		  try
		  {
			  File f = new File(filepath);
			  FileInputStream fis = new FileInputStream(f);
			  Properties prop = new Properties();
			  prop.load(fis);
			  data = prop.get(Key).toString();
		  }
		  
		  catch (Exception e)
		  {
			  e.printStackTrace();
		  }
		  return data;
	  }
}
