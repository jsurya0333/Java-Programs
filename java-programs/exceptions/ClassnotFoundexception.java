package exceptions;

public class ClassnotFoundexception {
	public static void main(String[] args) throws Exception {
        try {
            Class.forName("collections1.Arraylistnumbr");
            System.out.println("Class loading success");
        } 
        catch (ClassNotFoundException e) {
            
            System.out.println(e.getMessage());
            throw e;
         }
     }
}
	
