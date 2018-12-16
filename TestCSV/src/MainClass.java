
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0, row=0;
		CSVEngine csvt = new CSVEngine();
		String data[][]= new String[5][5];
		data = csvt.readDataLineByLine("F:\\Codes\\TestCSV\\Test.csv");
		for (;i<5;i++) {
			for(;j<5;j++)
				System.out.println(data[row][j]);
		}
	}
	
	

}
