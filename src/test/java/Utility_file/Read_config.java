package Utility_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Read_config {
	Properties pro;
  public void readconfig() throws Exception {
	  File file = new File("C:\\Users\\user\\eclipse-workspace\\Gencare\\Configuration\\config.properties");
	  try {
		FileInputStream fis =new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
	} catch (Exception e) {
		e.printStackTrace();
  }
}
  public String chromedriverconfig() {
	 String chromepath1 = pro.getProperty("chromepath");
	 return chromepath1;
  }
  public String geckodriverconfig() {
		 String firefoxpath1 = pro.getProperty("firefoxpath");
		 return firefoxpath1;
	  }
  public String iepath() {
		 String iepath = pro.getProperty("firefoxpath");
		 return iepath;
	  }
  

  
}
