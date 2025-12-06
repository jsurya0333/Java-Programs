package StreamsInterviewCoding;
public class ArmstrongUsingStreams {

    public static void main(String[] args) {

        int num = 9474; // Try 370, 371, 9474...

        int digitsCount = String.valueOf(num).length();		//converts number to String="9474" length

        int armstrongSum =
              String.valueOf(num)
                   .chars()								//Stream of ASCII values: 57, 52, 55, 52
                   .map(Character::getNumericValue)        // 9,4,7,4
                   .map(d -> (int) Math.pow(d, digitsCount))//9⁴,4⁴...power this
                   .sum();									//sum the power values
        														//Math.pow() returns a double.
        														//But .map() expects an int, because we are building an IntStream.

        System.out.println((armstrongSum==num ? " Armstrong no":" not armstrng"));
    }
}
//public String getArm(int a) {
//	
//	int digitsCount=String.valueOf(a).length();
//	int armstrongSum =
//              String.valueOf(a)
//                   .chars()								//Stream of ASCII values: 57, 52, 55, 52
//                   .map(Character::getNumericValue)        // 9,4,7,4
//                   .map(d -> (int) Math.pow(d, digitsCount))//9⁴,4⁴...power this
//                   .sum();
//	if(armstrongSum==a) {
//		return "Armstrongnumber";
//	}
//	else {
//		return "not";
//	}
//}
//
//public static void main(String...args) {
//	 practicess p=new practicess();
//	 
//	 System.out.println(p.getArm(1583));
//}}

//1️⃣ Count the digits
//int digitsCount = String.valueOf(num).length();
//
//
//Convert number → "9474"
//
//Length = 4, so each digit will be raised to the 4th power.
//
//2️⃣ Convert number to stream of digits
//String.valueOf(num)
//        .chars()
//
//
//"9474".chars() → Stream of ASCII values: 57, 52, 55, 52
//
//These represent characters '9', '4', '7', '4'.
//
//3️⃣ Convert char → digit
//.map(c -> Character.getNumericValue(c))
//
//
//'9' → 9
//
//'4' → 4
//
//'7' → 7
//
//'4' → 4
//
//Now stream = 9, 4, 7, 4.
//
//4️⃣ Raise each digit to power of digitsCount
//.map(d -> (int) Math.pow(d, digitsCount))
//
//
//Since digitsCount = 4:
//
//9⁴ = 6561
//
//4⁴ = 256
//
//7⁴ = 2401
//
//4⁴ = 256
//
//Now stream = 6561, 256, 2401, 256.
//
//5️⃣ Sum all powers
//.sum();
//
//
//Sum = 6561 + 256 + 2401 + 256 = 9474
//
//So:
//
//int armstrongSum = ...
//
//6️⃣ Compare with original number
//if (armstrongSum == num)
//
//
//Since:
//
//9474 == 9474 → TRUE
//
//✔ Output:
//
//9474 is an Armstrong number
//
//🎯 Summary in simple words
//
//Convert number to string → count digits.
//
//Convert each character into an integer digit.
//
//Raise each digit to the power of total digits.
//
//Add all powered values.
//
//Compare with the original number.
//
//If both match → Armstrong Number.
