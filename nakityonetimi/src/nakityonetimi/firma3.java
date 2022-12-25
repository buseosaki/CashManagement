package nakityonetimi;
import java.io.*;

public class firma3 { 
	  static void firma3method()  { 

			try {
		        FileInputStream fstream = new FileInputStream("C:\\Users\\buse.kizildag\\Desktop\\Proje\\firma3.txt");
		        DataInputStream in = new DataInputStream(fstream);
		        BufferedReader br = new BufferedReader(new InputStreamReader(in));
		        String strLine;
		        FileWriter myWriter = new FileWriter("guncelveri.txt");
		       
		        while ((strLine = br.readLine()) != null) {
		               
		        	String aboneno= strLine.substring(0,7);
		        	String adsoyad = strLine.substring(7,27);
		        	String borc = strLine.substring(27,36);
		        	String sontarih = strLine.substring(36,44);
		        	String transactionid = strLine.substring(44,53);
		        
		        	myWriter.write(aboneno+";" + adsoyad+";" +  borc +";" +  sontarih+ ";" + transactionid);
		    	      myWriter.write("\n");
	    	      
	    	      System.out.println("Subscribers has written to the file.");
	    	      
		        }
		        
		        myWriter.close();
		        in.close();
		          } catch (Exception e){
		        System.err.println("Error: " + e.getMessage());
		    }
			
			}}
