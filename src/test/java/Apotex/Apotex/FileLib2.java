package Apotex.Apotex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * This file is Generic class for data driven testing
 * @author Bharathkumar who are you
 *
 */
public class FileLib2 {
/**
 * This is generic method to read the data from property file
 * @param key
 * @return
 * @throws IOException
 */

public String getpropertydata(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commontestdata.property.txt");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
  }
}
