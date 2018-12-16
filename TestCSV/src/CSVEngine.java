import java.awt.List;
import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class CSVEngine {

	//List<List<String>> outerList = new ArrayList<ArrayList<String>>();
	//ArrayList<String> studentData = new ArrayList<String>();
	
	// Java code to illustrate reading a 
	// CSV file line by line 
	public String[][] readDataLineByLine(String file) 
	{ 

		try { 
			
			String [][] studentDetail = new String[5][8];
			int i=0,j=0;

			// Create an object of filereader 
			// class with CSV file as a parameter. 
			FileReader filereader = new FileReader(file); 

			// create csvReader object passing 
			// file reader as a parameter 
			CSVReader csvReader = new CSVReader(filereader); 
			String[] nextRecord; 
			//nextRecord= csvReader.readNext();
			//System.out.println(nextRecord[4]);
			//nextRecord= csvReader.readNext();
			//System.out.println(nextRecord[3]);
			System.out.println();
			System.out.println();

			// we are going to read data line by line 
			while ((nextRecord = csvReader.readNext()) != null) {
				//studentDetail[i][0] = nextRecord;
				i=0;
				for (String cell : nextRecord) { 
					System.out.print("i="+i);
					studentDetail[i][j] = cell;
					i++;
					
					System.out.print(cell + "\t");
				}
				System.out.println(j+"==j");
				j++;
				
			}
			return studentDetail;
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
			return null;
		} 
	} 

}
