import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String args[]) {
	Random rnd = new Random();
	int d1 = rnd.nextInt(6) + 1;
	int d2 = rnd.nextInt(6) + 1;

	System.out.println("What is your name?");
	System.out.print(">");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	System.out.println("Hello, " + str + "!");

	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " + d1);
	System.out.println("Die 2: " + d2);
	System.out.println("Total value: " + (d1+d2));

	if((d1 + d2) >= 7) {
	    System.out.println(str + " won!");
	}else {
	    System.out.println(str + " lost!");
	}
	switch (d1){
	case 1:
	    System.out.println("大吉");
	    break;
	case 2:
	    System.out.println("吉");
	    break;
	case 3:
	    System.out.println("中吉");
	    break;
	case 4:
	    System.out.println("小吉");
	    break;
	case 5:
	    System.out.println("凶");
	    break;
	case 6:
	    System.out.println("凶");
	    break;
	}
    }
}
