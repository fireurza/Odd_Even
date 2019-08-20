import java.util.Scanner;

/**
 *
 * @author Aaron Kurth
 */
public class OddEven {

    public static void main(String[] args) {

        //Getting User Input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        //declaring first variable, converting the user input to an int and placing the value in the variable
        int numOne = userInput.nextInt();
        System.out.println("Enter the second number: ");

        //declaring second variable, converting the user input to an int and placing the value in the variable
        int numTwo = userInput.nextInt();
        System.out.println("Enter the third number: ");

        //declaring third variable, converting the user input to an int and placing the value in the variable
        int numThree = userInput.nextInt();

        //close the user input scanner
        userInput.close();

        //checking if  the first variable is odd or even be looking for any remainders after dividing by 2
        if (numOne % 2 == 0)
        {
            System.out.format("%d is Even %n", numOne); //print results
        }
        else
        {
            System.out.format("%d is Odd %n", numOne); //print results
        }

        //checking if  the second variable is odd or even be looking for any remainders after dividing by 2
        if (numTwo % 2 == 0)
        {
            System.out.format("%d is Even %n", numTwo); //print results
        }
        else
        {
            System.out.format("%d is Odd %n", numTwo); //print results
        }

        //checking if  the third variable is odd or even be looking for any remainders after dividing by 2
        if (numThree % 2 == 0)
        {
            System.out.format("%d is Even %n", numThree); //print results
        }
        else
        {
            System.out.format("%d is Odd %n", numThree); //print results
        }
        
    }
    
}