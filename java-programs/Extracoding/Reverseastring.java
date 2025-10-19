package Extracoding;

public class Reverseastring {
	
	public static void main(String[] args) {
	   String s = "java is okay";   // Original string
	   String[] words = s.split(" "); // Split by spaces

	    for (int i = 0; i < words.length; i++) {
	     String word = words[i];
	     String rev= "";
	            
	          // Reverse each word
	     for (int j = word.length() - 1; j >= 0; j--) {
	                rev=rev+ word.charAt(j);
	            }
	            
	           System.out.print(rev + " "); // Print reversed word
	        }
	   }
	}

