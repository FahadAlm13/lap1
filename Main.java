import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1) Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input .

//        System.out.println("Enter your first number : ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter your second number : ");
//        int num2 = sc.nextInt();
//
//        int sum = num1 + num2;
//        int diff = num1 - num2;
//        int product = num1 * num2;
//        int division = num1 / num2;
//        int remainder = num1 % num2;
//        System.out.println("Expected output :  ");
//        System.out.println(num1+" + "+num2+" = "+sum);
//        System.out.println(num1+" - "+num2+" = "+diff);
//        System.out.println(num1+" * "+num2+" = "+product);
//        System.out.println(num1+" / "+num2+" = "+division);
//        System.out.println(num1+" % "+num2+" = "+remainder);


        //Q2)  Write a Java program that takes a number as input and prints its multiplication table up to 10.
        //Test Data:
//
//        System.out.println("Please write a number : ");
//        int num = sc.nextInt();
//        int product = 1;
//        for (int i = 1; i<=10;i++){
//            product = num * i;
//            System.out.println(num+"*"+i+"="+product);
//        }

        //Q3) Write a Java program to print the area and perimeter of a circle.

//        System.out.println("Enter your Radius number : ");
//        double radius = sc.nextDouble();
//
//        double perimeter = 2 * Math.PI * radius;
//        double area = Math.PI * Math.pow(radius,2);
//
//        System.out.println("Perimeter is = " + perimeter);
//        System.out.println("Area is = " + area);

        //Q4) Java program to find out the average of a set of integers

//        System.out.println("Please enter number of Integer : ");
//        int n = sc.nextInt();
//
//        double sum = 0;
//        int counter = 0;
//        System.out.println("Please enter " + n + " number :");
//        for (int i = 1; i <= n; i++) {
//            int num = sc.nextInt();
//            System.out.println("Enter an integer : ");
//            sum += num;
//            counter++;
//        }
//        double avr = sum / counter;
//        System.out.println("The average is: " + avr);


        // Q5) Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.

//        System.out.println("Please write three Integer ");
//        System.out.println("First number : ");
//        int num = sc.nextInt();
//        System.out.println("Second number : ");
//        int num2 = sc.nextInt();
//        System.out.println("Third number :");
//        int num3 = sc.nextInt();
//
//        int sum = num + num2;
//        boolean equal = true;
//
//        if (sum != num3) {
//            equal = false;
//            System.out.println("The result is:" + equal);
//        } else System.out.println("The result is:" + equal);


        //Q6 Write a Java program to reverse a word

//        System.out.println("Please Enter your sentence to reverse it : ");
//        String sentence = sc.nextLine();
//        String revers = "";
//        for (int i = sentence.length() - 1; i >= 0; i--) {
//            revers += sentence.charAt(i);
//        }
//        System.out.println("This is the sentence after reversing : " + revers);

        //Q7 Java program to check whether the given number is even or odd

//        System.out.println("Please enter number of Integer : ");
//        int n = sc.nextInt();
//
//        if (n%2==0){
//            System.out.println("The number is Even");
//        }else{
//            System.out.println("The number is Odd");
//        }

        //Q8 - Java program to convert the temperature in Centigrade to Fahrenheit

//        System.out.println("Enter temperature in Centigrade:");
//        double centigrade = sc.nextDouble();
//
//        double fahrenheit = (centigrade * 9/5) + 32 ;
//        System.out.println("Temperature in Fahrenheit is: " +fahrenheit );

        //Q9 .Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index

//        System.out.println("Enter a sentence : ");
//        String s = sc.nextLine();
//
//        System.out.println("Enter Integer : ");
//        int index = sc.nextInt();
//
//        if (index >= 0 && index < s.length()) {
//            char c = s.charAt(index);
//            System.out.println("your character is :  " + c);
//        } else {
//            System.out.println("Please enter a number between 0 and " + (s.length() - 1));
//        }

        //Q10) Write a Java program to print the area and perimeter of a rectangle.

//        System.out.println("Please enter your Width : ");
//        double width = sc.nextDouble();
//        System.out.println("Please enter your Height :");
//        double height = sc.nextDouble();
//
//        double area = width * height ;
//        double perimeter = 2 * (width + height);
//
//        System.out.println("Area is :"+width+" * "+height+" = " + area);
//        System.out.println("Perimeter is 2 * (" + width + " + " + height+ ")" + " = " + perimeter);

        //Q11) Write a Java program to compare two numbers.

//        System.out.println("Please write your first number : ");
//        int num = sc.nextInt();
//        System.out.println("Please write your second number :");
//        int num2 = sc.nextInt();
//
//        if (num != num2) {
//            System.out.println(num + " != " + num2);
//        }
//        if (num < num2) {
//            System.out.println(num + " < " + num2);
//        }
//        if (num <= num2) {
//            System.out.println(num + " <= " + num2);
//        }

        //Q12) Write a Java program to convert seconds to hours, minutes and seconds .

//        System.out.println("Please write your seconds : ");
//        int totalSeconds = sc.nextInt();
//
//        int hours = totalSeconds / 3600;
//        int minutes = (totalSeconds % 3600) / 60;
//        int seconds = totalSeconds % 60;
//
//        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);

        //Q13 . Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.

//        System.out.println("Please enter your first number : ");
//        int num = sc.nextInt();
//        System.out.println("Please enter your second number :");
//        int num2 = sc.nextInt();
//        System.out.println("Please enter your third number :");
//        int num3 = sc.nextInt();
//        System.out.println("please enter your fourth number");
//        int num4 = sc.nextInt();
//
//
//        if (num == num2 && num3 == num4 && num == num4) {
//
//            System.out.println("Numbers are equal!");
//        } else {
//            System.out.println("Numbers are not equal!");
//        }

        //Q14) Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.


//        System.out.println("Please enter number of Integer : ");
//        int n = sc.nextInt();
//
//        if (n == 0){
//            System.out.println("Number is zero!");
//        } else if (n > 0) {
//            System.out.println("Number is positive!");
//        }else System.out.println("Number is negative!");

        //Q15) Write a program to enter the numbers till the user wants and at the end it should
        //display the count of positive, negative and zeros entered
        //(End loop use -1 , Don’t count -1).

//        System.out.println("Enter how integer number do you want to write ?");
//        int n = sc.nextInt();
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//
//        System.out.println("Please enter " + n + " number or -1 to end :");
//        for (int i = 1; i <= n; i++) {
//            int num = sc.nextInt();
//            if (num == -1) {
//                break;
//            } else if (num == 0) {
//                zero++;
//            } else if (num > 0) {
//                positive++;
//            } else if (num < 0) {
//                negative++;
//            }
//        }
//        System.out.println(positive + " positive");
//        System.out.println(zero + " zero");
//        System.out.println(negative + " negative");

        //Q16) - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.

//        System.out.println("Please write a number :");
//        int num = sc.nextInt();
//
//        int reverse = 0;
//        while (num != 0){
//            int digit = num % 10;
//            reverse = reverse*10+digit;
//            num /= 10;
//        }
//        System.out.println("The reverse number is :" + reverse );

        //Q17) - Write a program to enter the numbers till the user wants and at the end the program
        //should display the largest and smallest numbers entered .
//
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//
//        while (true) {
//            System.out.println("Enter the number or exit to finish):");
//            if (sc.hasNextInt()) {
//                int number = sc.nextInt();
//
//                if (number > largest) {
//                    largest = number;
//                }
//                if (number < smallest) {
//                    smallest = number;
//                }
//            } else {
//                String input = sc.next();
//                if (input.equalsIgnoreCase("N")) {
//                    break;
//                } else {
//                    System.out.println("Please enter a valid number or type N to finish.");
//                }
//
//
//            }
//        }
//        if (largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE) {
//            System.out.println("The largest number: " + largest);
//            System.out.println("The smallest number: " + smallest);
//        } else {
//            System.out.println("No valid numbers.");
//        }

        //Q18) Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.

//        System.out.println("Enter String:");
//        String inputString = sc.nextLine();
//
//        int count = 0;
//
//        for (int i = 0; i < inputString.length(); i++) {
//            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A') {
//                count++;
//            }
//        }
//        System.out.println("Number of a's: " + count);
    }
}

