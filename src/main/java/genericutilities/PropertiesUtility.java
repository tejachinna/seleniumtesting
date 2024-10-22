package genericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * This class contains reusable to read data from properties file
 * @author Raviteja
 */
public class PropertiesUtility {
	Properties property;
	/*
	 * This Method intializes Properties file
	 * @param filepath
	 */
   public void propertiesInit(String filepath) throws IOException {
	   FileInputStream fis = null ;
	   try {
		   fis = new FileInputStream(filepath);
		   
	   }  catch ( FileNotFoundException e) {
		   e.printStackTrace();
		   
	   }
		 property = new Properties();
		 try {
			 property.load(fis);
		 }  catch (IOException e) {
			 e.printStackTrace();
		 }
   }
		 /**
		  * This method fetches data from properties file
		  * @param Key
		  * @return String
		  **/
		 
 public String getDataFromProperties(String Key){
			 return property.getProperty(Key);
 
		
		
		
   }
}
