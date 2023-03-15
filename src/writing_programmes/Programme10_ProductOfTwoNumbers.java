package writing_programmes;

/**
 *10.Write a Java programme that takes two numbers as input and display the product
 *  of two numbers.
 *  Test Data:
 *  Input first number: 25
 *  Input second number: 5
 *  Expected Output: 25 * 5 = 125
 */
public class Programme10_ProductOfTwoNumbers {
    public static void main(String [] args) {
        //First number declaration
        int firstNumber = 25;
        //Second number declaration
        int secondNumber = 5;
        int product = firstNumber * secondNumber;
        //Expected Output
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);

    }
}
