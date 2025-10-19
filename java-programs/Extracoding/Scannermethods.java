package Extracoding;
import java.util.Scanner;

	public class Scannermethods {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        boolean num = sc.hasNextInt();
	        System.out.println("You entered: " + num);
	        sc.close();
	        
	        //
	        Scanner s = new Scanner(System.in);
	       
	        System.out.print("Enter a word: ");
	        long word = s.nextLong();
	        System.out.println("You entered: " + word);
	        sc.close();
	        
	        //
//	        Scanner s2 = new Scanner(System.in);
//	        System.out.println("Enter numbers (type non-number to stop):");
//	        while(sc.hasNextInt()) {
//	            int num = sc.nextInt();
//	            System.out.println("You entered: " + num);
//	        }
//	        sc.close();
	        
	        //
	        Scanner s3 = new Scanner(System.in);
	        System.out.print("Enter 3 numbers: ");
	        int a = s3.nextInt();
	        int b = s3.nextInt();
	        int c = s3.nextInt();
	        System.out.println("Sum = " + (a + b + c));
	        sc.close();
	    }
}
	    
//	| Method         | Description                               | Example Input |
//	| -------------- | ----------------------------------------- | ------------- |
//	| `nextInt()`    | Reads an integer                          | `42`          |
//	| `nextDouble()` | Reads a double                            | `3.14`        |
//	| `nextFloat()`  | Reads a float                             | `2.5`         |
//	| `nextLong()`   | Reads a long                              | `1234567890`  |
//	| `nextShort()`  | Reads a short                             | `12`          |
//	| `nextByte()`   | Reads a byte                              | `127`         |
//	| `next()`       | Reads a **single word** (until space)     | `Hello`       |
//	| `nextLine()`   | Reads the **whole line** including spaces | `Hello World` |
//	| `hasNext()`    | Checks if there is another token          | –             |
//	| `hasNextInt()` | Checks if the next token is an integer    | –             |
//	| `close()`      | Closes the scanner to free resources 
	
//| –
//| Scanner Method | Description                                 | Example Code                   | Sample Input  | Output                     |
//| -------------- | ------------------------------------------- | ------------------------------ | ------------- | -------------------------- |
//| `nextInt()`    | Reads an integer                            | `int n = sc.nextInt();`        | `42`          | `You entered: 42`          |
//| `nextDouble()` | Reads a double value                        | `double d = sc.nextDouble();`  | `3.14`        | `You entered: 3.14`        |
//| `nextFloat()`  | Reads a float value                         | `float f = sc.nextFloat();`    | `2.5`         | `You entered: 2.5`         |
//| `nextLong()`   | Reads a long integer                        | `long l = sc.nextLong();`      | `1234567890`  | `You entered: 1234567890`  |
//| `nextShort()`  | Reads a short value                         | `short s = sc.nextShort();`    | `12`          | `You entered: 12`          |
//| `nextByte()`   | Reads a byte value                          | `byte b = sc.nextByte();`      | `127`         | `You entered: 127`         |
//| `next()`       | Reads a **single word** (until space)       | `String word = sc.next();`     | `Hello`       | `You entered: Hello`       |
//| `nextLine()`   | Reads a **whole line** including spaces     | `String line = sc.nextLine();` | `Hello World` | `You entered: Hello World` |
//| `hasNext()`    | Checks if there is **any token** available  | `if(sc.hasNext()) {...}`       | –             | –                          |
//| `hasNextInt()` | Checks if the next token is an integer      | `if(sc.hasNextInt()) {...}`    | –             | –                          |
//| `close()`      | Closes the scanner to **release resources** | `sc.close();`                  | –             | –                          |
//|
