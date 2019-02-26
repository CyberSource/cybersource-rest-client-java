package qascripts.Utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import au.com.bytecode.opencsv.CSVWriter;

public class CsvUtility {
	
	 public static void writingToCsv(String testCaseId,String sampleCodeName,String result,String message,String Id,String responseCode,boolean flag) throws IOException{
	    	File opFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\CSV_Files\\TestReport\\TestResults.csv");
			CSVWriter writer = new CSVWriter(new FileWriter(opFile,true));
	    	Date date=new Date();
	    	if(flag){
	    		if(Id!=null){
	    			String[] outputArr = { testCaseId,sampleCodeName,result +" :" +responseCode + "-" + Id,message, date.toString() };
					writer.writeNext(outputArr);
	    		} else{
	    			String[] outputArr = { testCaseId,sampleCodeName,result +" :" +responseCode,message, date.toString() };
					writer.writeNext(outputArr);
	    		}
	    		
	    	} else{
	    		String[] outputArr = { testCaseId,sampleCodeName,result,message,date.toString() };
				writer.writeNext(outputArr);
	    	}
	    	
			writer.close();
	    }
	 
}
