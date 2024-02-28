import java.util.Scanner;
public class Magic_number {
	public static void main(String[] args) {
		
	int myNumber =656; //myNumber is a original number.
    int stepOne = myNumber*myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo/myNumber;
    int stepFour = stepThree+17;
    int stepFive = stepFour-myNumber;
    int stepSix = stepFive/6;
    System.out.println(stepSix);

    int magicNumber; 
    magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;
    System.out.println(magicNumber);
	}
}
