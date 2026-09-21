package generic_fileUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {

	FileInputStream fis;

	public String readDataFromProperty(String key) throws Exception {
		fis = new FileInputStream("./src/test/resources/CommonData.properties");
		Properties p = new Properties();
		p.load(fis);
		System.out.println("new cls");
		return p.getProperty(key);
	}
}


