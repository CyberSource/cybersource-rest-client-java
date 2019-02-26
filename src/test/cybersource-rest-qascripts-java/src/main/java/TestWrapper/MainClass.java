package TestWrapper;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import sampleCodeJava.SampleCode;


public class MainClass {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("********************************QA scripts begins*****************************");
		File opFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\CSV_Files\\Output.csv");
		CSVWriter writer = new CSVWriter(new FileWriter(opFile,true));
		String [] columnNames = "API_Name#TestCaseID#Result#Remarks#TimeStamp".split("#");
		File outFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\CSV_Files\\Output.csv");
		CSVReader csvReaderOP = new CSVReader(new FileReader(outFile));
		try{
			if(csvReaderOP.readNext()[0]==""){}
			}
		catch(NullPointerException ne)
		{
			writer.writeNext(columnNames);
		}
		writer.close();
		//the code above is for writing the column names in the output file		
		
		File driverFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\CSV_Files\\Driver\\driver.csv");
		CSVReader csvReader = new CSVReader(new FileReader(driverFile));
		String[] columns = null;
		csvReader.readNext();
		while((columns = csvReader.readNext()) != null)
		{
			if(columns[2].equals("1"))
			{
				SampleCode.RunMethod(columns[1].replace("Sample", ""));
			}
		}
		
		csvReader.close();
		System.out.println("********************************QA scripts ends*****************************");
	}
}
