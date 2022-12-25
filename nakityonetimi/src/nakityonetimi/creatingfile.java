package nakityonetimi;
import java.io.File; 
import java.io.IOException; 

public class creatingfile { 

	static void createfilemethod() {
	try {
	      File myObj = new File("guncelveri.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File has already created.");
	      }
	    } catch (IOException e) {
	      System.out.println("File couldn't create.");
	      e.printStackTrace();
	    }
	  }
	
}

