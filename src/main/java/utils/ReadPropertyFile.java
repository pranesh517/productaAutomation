package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public Properties getPropData() throws IOException {
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}

}
