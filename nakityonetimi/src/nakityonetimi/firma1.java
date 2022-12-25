package nakityonetimi;
import java.io.*;


public class firma1 { 
  static void firma1method()  { 

	try {
        FileInputStream fstream = new FileInputStream("C:\\Users\\buse.kizildag\\Desktop\\Proje\\firma1.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
    
        FileWriter myWriter = new FileWriter("guncelveri.txt", true);
        while ((strLine = br.readLine()) != null) {
            String[] splitOut = strLine.split(",");
           
            String aboneno=splitOut[0];
            String adsoyad=splitOut[3];
            String borc=splitOut[1];
            String sontarih=splitOut[2];
            String transactionid=splitOut[4];
        
    	
    	      myWriter.write(aboneno+";" + adsoyad+";" +  borc +";" +  sontarih+ ";" + transactionid);
    	      myWriter.write("\n");
        
    	  
    	      System.out.println("Subscribers has written to the file.");
        }
        myWriter.close();
      	    
        
        in.close();
    } catch (Exception e){
        System.err.println("Error: " + e.getMessage());
    }

} }
