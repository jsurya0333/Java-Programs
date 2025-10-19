package Extracoding;

public class Pyramidpattern {

	public static void main(String[] args) {
		
		    
		       // int n = 5;  // number of rows

		       for (int i = 1; i <= 5; i++) {					//    *
		            // 1. Print spaces							//   ***
		          for (int j = i; j < 5; j++) {					//  *****
		        	  System.out.print(" ");							// *******
		            }											//*********

		            // 2. Print stars
		           for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }

		            // 3. Move to next line
		            System.out.println();
		        }
		    }
		}

//Initialization: j starts at i (the current row number).

//Condition: loop continues while j < n.
//
//Increment: j++ (increase by 1 each iteration).
//
//Body: System.out.print(" ") prints a single space character (no newline).
//
//How many spaces are printed?
//Number of iterations = values of j that satisfy i <= j < n → n - i iterations.
//So this prints n - i spaces. That left-pads each row so the stars are centered.
//
//Example (n=5):
//
//int j = i; j < 5; j++
//i = 1: j = 1,2,3,4 → 4 spaces //1<5 t,2<5 t,3<5 t,4<5 t,5<5 f
//
//i = 2: j = 2,3,4 → 3 spaces	//2<5 t,3<5 t,4<5 t,5<5 f
//
//i = 3: j = 3,4 → 2 spaces		//3<5 t,4<5 t,5<5 f
//
//i = 4: j = 4 → 1 space			//4<5 t,5<5 f
//
//i = 5: j starts at 5, condition 5 < 5 false → 0 spaces //5<5 f
//
//2) Second inner loop — printing stars
//for (int j = 1; j <= (2 * i - 1); j++) {
//    System.out.print("*");
//}
//
//
//Initialization: j starts at 1.
//
//Condition: loop continues while j <= (2*i - 1).
//
//Increment: j++.
//
//Body: System.out.print("*") prints a single asterisk (no newline).
//
//How many stars are printed?
//Number of iterations = (2 * i - 1) → that yields the odd sequence 1, 3, 5, 7, ... as i increases. This produces the pyramid width for each row.
//
//Why 2*i - 1?
//For row i you want an odd number of * so the pyramid is symmetric: center one star at i=1, then 3 stars at i=2, etc.
//
//Example (n=5):
//
//i = 1: 2*1 - 1 = 1 → prints *
//
//i = 2: 2*2 - 1 = 3 → prints ***
//
//i = 3: 5 → *****
//
//i = 4: 7 → *******
//
//i = 5: 9 → *********
//
//Full row-by-row result (n = 5)
//
//Show spaces as · for visibility:
//
//i = 1: ····* (4 spaces, 1 star)
//
//i = 2: ···*** (3 spaces, 3 stars)
//
//i = 3: ··*****(2 spaces, 5 stars)
//
//i = 4: ·*******(1 space, 7 stars)
//
//i = 5: *********(0 spaces, 9 stars)
//
//Actual program output (real spaces):
//
//    *
//   ***
//  *****
// *******
//*********