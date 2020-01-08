package GenericMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.Reporter;

public class Filemanager {
	
	public static String getapplnurl() {
		String url="";
		
		try{
Properties pr = new Properties();
FileInputStream fis= new FileInputStream("./config.properties");
pr.load(fis);
url = pr.getProperty("url");
}
		catch(Exception e)
		{
			Reporter.log("Failed to read url",true);
		}
		return url;
		}
	public static String  getgeckodriverkey(){
		String gecko_key="";
		try{
		Properties pr = new Properties();
		FileInputStream fis= new FileInputStream("./config.properties");
		pr.load(fis);
		gecko_key=pr.getProperty("gecko_key");
		}
		catch(Exception e)
		{
			Reporter.log("Failed to read gecko_key",true);
		}
		
		return gecko_key;
	}
	public static String  getgeckodrivervalue(){
		String gecko_value ="";
		try{
		Properties pr = new Properties();
		FileInputStream fis= new FileInputStream("./config.properties");
		pr.load(fis);
		gecko_value =pr.getProperty("gecko_value");
		}
		catch(Exception e)
		{
			Reporter.log("Failed to read gecko_value ",true);
		}
		
		return gecko_value ;
	}

}
