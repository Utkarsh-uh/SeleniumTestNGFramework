package pages;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

public class BaseClass {
	
	Properties prop;
	FileInputStream fis;
	
	public BaseClass() throws IOException
	{
		prop= new Properties();
		String path = System.getProperty("user.dir")+"\\config.properties";
	    fis= new FileInputStream(path);
		prop.load(fis);
	}

}


