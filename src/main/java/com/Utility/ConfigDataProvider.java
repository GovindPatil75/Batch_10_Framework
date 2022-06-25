package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	public ConfigDataProvider() throws Exception {
		String file="C:\\Users\\Dell\\eclipse-workspace\\Batch_10_Framework\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(file);
		 pro=new Properties();
		 pro.load(fis);
	}
	
	public String getQAENV_1() {
		return pro.getProperty("QAENV_1");
	}
}
