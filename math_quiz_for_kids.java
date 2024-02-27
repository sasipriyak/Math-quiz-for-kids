import java.util.Scanner;
import java.util.Random;
public class math_quiz_for_kids {
    public static void question(int num1,String operator,int num2)
    {
        System.out.println("What is "+num1+operator+num2+"?");
        System.out.print("Answer:");
    }
    public static int answer(int user_answer,int correct_answer,int points)
    {
        if(correct_answer==user_answer)
        {
            points+=1;
            score(points);
        }
        else
        {
            System.out.println("Oops, You have entered incorrect answer :(\nCorrect answer is "+correct_answer+"\n");
        }
            
        return points;
    }
    public static void score(int points)
    {
        System.out.println("You have entered correct answer.\nYou got "+points+" points :)\n");
    }
    public static String choose_operator(int operator)
    {
        if (operator==1)
            return "+";
        else if(operator==2)
            return "-";
        else if(operator==3)
            return "*";
        else
            return "/";
    }
    public static int correct_ans(int num1,String operator,int num2)
    {
        if (operator=="+")
            return num1+num2;
        else if(operator=="-")
            return num1-num2;
        else if(operator=="*")
            return num1*num2;
        else
            return num1/num2;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("\nWhat is your name?\nName:");
        String user_name = scan.nextLine();
        System.out.println("\nHello, "+user_name+"! Welcome to maths quiz.\n");
        int num1,num2,user_answer,correct_answer,count=0,points=0;
        String operator;
        while(count<5)
        {
            num1= rand.nextInt(20);
            num2 = rand.nextInt(20);
            operator = choose_operator(rand.nextInt(4));
            question(num1,operator,num2);
            user_answer = scan.nextInt();
            correct_answer = correct_ans(num1,operator,num2);
            points = answer(user_answer,correct_answer,points);
            count +=1;
        }
        
        System.out.println("Thanks for taking the quiz. Your score is "+points+" out of 5.\n");
        
    }
    
}
