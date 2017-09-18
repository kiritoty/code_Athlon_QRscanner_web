package qrcode;

import java.io.File;
import java.io.FileWriter;

public class table {
	public static boolean createTable(String dbName, String tableName){
		try {
			// returns pathnames for files and directory
			File file = new File(dbName,tableName);
			//create files
			file.createNewFile();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public static boolean insert(String insertString, String dbName, String tableName){
		try{
			// returns pathnames for files and directory
			File table = new File(dbName,tableName);
			//use bufferedWriter to include fileWriter
			FileWriter fw = new FileWriter(table,true);
			//write insertString
			fw.append(insertString + "\r\n");
			fw.flush();
			fw.close();
			return true;
		}catch (Exception e) {
			return false;
		}
	} 
	
	public static boolean dropTable(String dbName, String tableName){
		try {
			// returns pathnames for files and directory
			File table = new File(dbName,tableName);
			//drop files
			table.delete();
			return true;
		} catch (Exception e) {
			return false;
		}
	} 
}

