import java.util.*;

public class It24200911Lab4Q1{

public static void main (String[]args){

    System.out.print ("Enter a number : ");
    	Scanner num = new Scanner(System.in);
	    int number = num.nextInt();
   if (number == 0){
        System.out.print ("The number is Zero ");

    }
    else if (number > 0){
        System.out.print ("The number is : Positive ");

    }
    else if (number < 0){
        System.out.print ("The number is : Negative ");

    }
}

}