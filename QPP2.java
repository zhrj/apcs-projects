import java.util.Scanner;

public class QPP2 {
 
  public static void main(String args[]) {
    Scanner reader = new Scanner(System.in);
    String name, college, petName;
    int age, n, d;
    double avg, amount, oneDollar, fiveDollar, tenDollar, penny, nickel, dime, quarter, decimal;
    
    //PP 2.2
    System.out.print("Enter an integer: ");
    int x = reader.nextInt();
    System.out.print("Enter an integer: ");
    int y = reader.nextInt();
    System.out.print("Enter an integer: ");
    int z = reader.nextInt();
    
    avg = (double) (x + y + z) / 3;
    
    System.out.println("The average of your three integers is: " + avg);
    
    //PP 2.3 
    System.out.print("Enter a decimal: ");
    float a = reader.nextFloat();
    System.out.print("Enter a decimal: ");
    float b = reader.nextFloat();
    
    System.out.println("The sum is: " + (a+b) + ", the product is " + (a*b) + ", and the difference is " + (a-b));
    
    //PP 2.4
    name = reader.nextLine(); //the press of enter messes up the flow
    System.out.print("What is your name? ");
    name = reader.nextLine();
    System.out.print("What is your age?: ");
    age = Integer.parseInt(reader.nextLine());

    System.out.print("What is your college?: ");
    college = reader.nextLine();
    System.out.print("What is your pet's name?: ");
    petName = reader.nextLine();

    System.out.println("Hello, my name is " + name + " and I am " + age
                + " years \nold. I\'m enjoying my time at " + college
                + ", though \nI miss my pet " + petName + " very much!");
        
     //PP 2.7
     System.out.println("Enter the distance you have traveled in miles?");
     int distance = Integer.parseInt(reader.nextLine());
     System.out.println("Enter the speed you traveled in mph?");
     int speed = Integer.parseInt(reader.nextLine());
     float time = (float) distance / speed;

     System.out.println("The time it took you to travel " + distance + " miles at a speed of " + speed + " mph is " + time + " hours.");
     
     //PP 2.11
     System.out.print("What is the monetary amount?: ");
     amount = reader.nextDouble();
     
     tenDollar = amount / 10;
     amount = amount %10;

     fiveDollar = amount / 5;
     amount = amount % 5;

     oneDollar = amount / 1;
     amount = amount % 1;
     
     quarter = amount / .25;
     amount = amount % .25;
     
     dime = amount / .10;
     amount = amount % .10;
     
     nickel = amount / .05;
     amount = amount % .05;
     
     penny = amount / .01;
     amount = amount % .01;
     
     System.out.println((int)tenDollar + " ten dollar bills");
     System.out.println((int)fiveDollar + " five dollar bils");
     System.out.println((int)oneDollar + " one dollar bills");
     System.out.println((int)quarter + " quarters");
     System.out.println((int)dime + " dimes ");
     System.out.println((int)nickel + " nickels");
     System.out.println((int)penny + " pennies");
     
     //2.13
     System.out.println("Numerator?: ");
     n = reader.nextInt();
     System.out.println("Denominator?: ");
     d = reader.nextInt();
     
     decimal = (double) n / d;
     
     System.out.println("The decimal equivalent of the fraction is " + decimal);
     
  }
}
