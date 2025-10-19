package Extracoding;

public class Diamondpattern {

	public static void main(String[] args) {
		
		        //int n = 5;  // number of rows in top half (you can change this)

		        // 1) Upper half (including middle row)
		        for (int i = 1; i <= 5; i++) {						//    *   
		            // print (n - i) spaces							//   ***
		            for (int j = 1; j <= 5-i ; j++) {				//  *****
		                System.out.print(" ");						// *******
		            }												//*********
		            // print (2*i - 1) stars							// *	******
		            for (int j = 1; j <= 2 * i - 1; j++) {			//  *****
		                System.out.print("*");						//   ***
		            }												//    *
		            System.out.println();
		        }

		        // 2) Lower half (excluding middle row)
		        for (int i = 5 - 1; i >= 1; i--) {
		            // print (n - i) spaces
		            for (int j = 1; j <= 5 - i; j++) {
		                System.out.print(" ");
		            }
		            // print (2*i - 1) stars
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		}

//
//Step-by-Step Character Diagram for n = 5
//
//We’ll use:
//
//· to represent spaces
//
//* to represent stars
//
//Row 1 (i = 1)
//
//Spaces loop (n - i = 4): prints · · · ·
//
//j = 1 → ·
//
//j = 2 → ·
//
//j = 3 → ·
//
//j = 4 → ·
//
//Stars loop (2*i - 1 = 1): prints *
//
//j = 1 → *
//
//Newline → moves to next row
//
//Result: ····*
//
//Row 2 (i = 2)
//
//Spaces loop (n - i = 3): prints · · ·
//
//j = 1 → ·
//
//j = 2 → ·
//
//j = 3 → ·
//
//Stars loop (2*i - 1 = 3): prints ***
//
//j = 1 → *
//
//j = 2 → *
//
//j = 3 → *
//
//Newline
//
//Result: ···***
//
//Row 3 (i = 3)
//
//Spaces loop (n - i = 2): · ·
//
//j = 1 → ·
//
//j = 2 → ·
//
//Stars loop (2*i - 1 = 5): *****
//
//j = 1 → *
//
//j = 2 → *
//
//j = 3 → *
//
//j = 4 → *
//
//j = 5 → *
//
//Newline
//
//Result: ··*****
//
//Row 4 (i = 4)
//
//Spaces loop (n - i = 1): ·
//
//j = 1 → ·
//
//Stars loop (2*i - 1 = 7): *******
//
//j = 1 → *
//
//j = 2 → *
//
//j = 3 → *
//
//j = 4 → *
//
//j = 5 → *
//
//j = 6 → *
//
//j = 7 → *
//
//Newline
//
//Result: ·*******
//
//Row 5 (i = 5)
//
//Spaces loop (n - i = 0): prints nothing
//
//Stars loop (2*i - 1 = 9): *********
//
//j = 1 → *
//
//j = 2 → *
//
//… up to j = 9 → *
//
//Newline
//
//Result: *********
//
//Upper Half Full Output (with spaces shown as dots ·)
//····*
//···***
//··*****
//·*******
//*********
//
//Step 1: Outer loop — for (int i = n - 1; i >= 1; i--)
//
//Purpose: iterates through the rows of the lower half of the diamond.
//
//i value: represents the current row number from the bottom of the upper half down to the tip of the lower pyramid.
//
//Starts at i = n - 1: we skip the middle row, because it was already printed in the upper half.
//
//Ends at i = 1: the tip of the bottom of the diamond.
//
//Example: if n = 5, i values will be: 4, 3, 2, 1.
//
//Step 2: First inner loop — spaces
//for (int j = 1; j <= n - i; j++) {
//    System.out.print(" ");
//}
//
//Explanation
//
//Purpose: left-pad the stars with spaces so that the row is centered.
//
//Number of spaces: n - i.
//
//Behavior: as i decreases, the number of spaces increases, moving the stars inward to create the inverted pyramid.
//
//Example: n = 5
//Row (i)	Spaces (n-i)	j values	Output (spaces only)
//4	1	1	
//3	2	1,2	
//2	3	1,2,3	
//1	4	1,2,3,4	
//Step 3: Second inner loop — stars
//for (int j = 1; j <= 2 * i - 1; j++) {
//    System.out.print("*");
//}
//
//Explanation
//
//Purpose: print the stars for the current row.
//
//Number of stars: 2*i - 1 (odd numbers: 7, 5, 3, 1 in this lower half example).
//
//Behavior: as i decreases, the number of stars decreases by 2 each row, forming the inverted pyramid.
//
//Example: n = 5
//Row (i)	Stars (2*i-1)	j values	Output (stars only)
//4	7	1..7	*******
//3	5	1..5	*****
//2	3	1..3	***
//1	1	1	*
//Step 4: Newline
//System.out.println();
//
//
//After printing spaces and stars for a row, move to the next line.
//
//Ensures that each row of the diamond is printed on its own line.
//
//Step 5: Full row-by-row output (lower half) for n = 5
//Row	Spaces	Stars	Combined Output
//4	1	7	·*******
//3	2	5	··*****
//2	3	3	···***
//1	4	1	····*
//
//(Dots · represent spaces for clarity.)
//
//Step 6: How the lower half mirrors the upper half
//
//Upper half: spaces decrease, stars increase → pyramid grows.
//
//Lower half: spaces increase, stars decrease → inverted pyramid shrinks.
//
//Together, upper + lower halves form a complete symmetric diamond.
//
//✅ Key Observations
//
//Outer loop (i) decreases from n-1 to 1.
//
//First inner loop prints spaces → increases by 1 each row.
//
//Second inner loop prints stars → decreases by 2 each row.
//
//System.out.println() moves to the next line.
//
//Lower half is exactly symmetric to the upper half (except middle row is not repeated).
//
//Lower Half Visual Output (n = 5):
// *******
//  *****
//   ***
//    *