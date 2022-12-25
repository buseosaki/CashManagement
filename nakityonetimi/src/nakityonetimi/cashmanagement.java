package nakityonetimi;
import java.util.Scanner;


public class cashmanagement {

 public static void main(String[]args){    
	 
	 firma1 firma1 = new firma1();
	 firma2 firma2 = new firma2();
	 firma3 firma3 = new firma3();
	 creatingfile dosyaolustur = new creatingfile();
	 
	 
	 Scanner scannertest = new Scanner(System.in);
	 System.out.println("Kurum adi giriniz:");
	 String firma = scannertest.nextLine(); 
	 
	 
if(firma.equals("ISKI")) {
    
	    	firma1.firma1method(); 
	 }
	    	

else if(firma.equals("IDAS")) {
	
	 		firma2.firma2method();   
	 }

else if(firma.equals("TURKCELL")) {
	 
	        firma3.firma3method();
	 
	 }

 else {
	System.out.println("Kuruma ait bilgi bulunamadı.");
}
	    
 	creatingfile.createfilemethod();
 	
} }
 

