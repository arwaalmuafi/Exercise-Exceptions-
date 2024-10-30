import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1
//        try {
//            System.out.println("Please enter first number: ");
//            int first = input.nextInt();
//            System.out.println("Please enter second number: ");
//            int second = input.nextInt();
//
//            System.out.println("The addition is " + first + " + " + second + " = " + add(first, second));
//            System.out.println("The multiply is " + first + " * " + second + " = " + multiply(first, second));
//            System.out.println("The subtract is " + first + " - " + second + " = " + subtract(first, second));
//            System.out.println("The divide is " + first + " / " + second + " = " + divide(first, second));
//            System.out.println("The remainder is " + first + " % " + second + " = " + remainder(first, second));
//        } catch (ArithmeticException e) {
//            System.out.println("Error: Division by zero is not allowed.");
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter integers only.");
//        }

        //2
//        try {
//            System.out.print("Enter a number: ");
//            int number = input.nextInt();
//            printTable(number);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer.");
//        }

        //3

//        try {
//            System.out.print("Please enter the radius of the circle: ");
//            double radius = input.nextDouble();
//            System.out.println("The perimeter is: " + calculatePerimeter(radius));
//            System.out.println("The area is: " + calculateArea(radius));
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a number.");
//        }

        //4
//        try {
//            System.out.print("Please enter the count of numbers: ");
//            int count = input.nextInt();
//            int sum = 0;
//
//            for (int i = 0; i < count; i++) {
//                System.out.print("Please enter an integer: ");
//                int number = input.nextInt();
//                sum += number;
//            }
//
//            double average = (double) sum / count;
//            System.out.println("The average of the integers is: " + average);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter integers only.");
//        }
        //5
//        try {
//            System.out.print("Input the first number: ");
//            int first = input.nextInt();
//            System.out.print("Input the second number: ");
//            int second = input.nextInt();
//            System.out.print("Input the third number: ");
//            int third = input.nextInt();
//
//            int sum = first + second;
//            boolean result = (sum == third);
//            System.out.println("The result is: " + result);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter integers only.");
//        }

        //6
//        try {
//            System.out.print("Please enter your word: ");
//            String word = input.nextLine();
//            StringBuilder reversed = new StringBuilder();
//
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reversed.append(word.charAt(i));
//            }
//
//            System.out.println("The reversed word is: " + reversed);
//        }catch (InputMismatchException e) {
////            System.out.println("Invalid input. Please enter integers only.");
////        }
        //7
//        try {
//            System.out.print("Please enter a number: ");
//            int number = input.nextInt();
//
//            if (number % 2 == 0) {
//                System.out.println("The number is even.");
//            } else {
//                System.out.println("The number is odd.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer.");
//        }

        //8
//        try {
//            System.out.print("Please enter temperature in Centigrade: ");
//            double temp = input.nextDouble();
//            double fahrenheit = (temp * 9 / 5) + 32;
//            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid number.");
//        }
        //9
//        try {
//            System.out.print("Please input a string: ");
//            String word = input.nextLine();
//            System.out.print("Please input an index: ");
//            int index = input.nextInt();
//
//            if (index >= 0 && index < word.length()) {
//                System.out.println("Character at index " + index + " is: " + word.charAt(index));
//            } else {
//                System.out.println("Index out of bounds. Please enter a valid index.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer for the index.");
//        }
        //10
//        try {
//            System.out.print("Please enter the width of the rectangle: ");
//            double width = input.nextDouble();
//            System.out.print("Please enter the height of the rectangle: ");
//            double height = input.nextDouble();
//
//            double area = width * height;
//            double perimeter = 2 * (width + height);
//
//            System.out.println("The area of the rectangle: " + area);
//            System.out.println("The perimeter of the rectangle: " + perimeter);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter valid numbers.");
//        }

        //11
//        try {
//            System.out.print("Please enter your first number: ");
//            int number1 = input.nextInt();
//            System.out.print("Please enter your second number: ");
//            int number2 = input.nextInt();
//
//            if (number1 == number2) {
//                System.out.println(number1 + " = " + number2);
//            } else if (number1 > number2) {
//                System.out.println(number1 + " > " + number2);
//            } else {
//                System.out.println(number1 + " < " + number2);
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter integers only.");
//        }
        //12
//        try {
//            System.out.print("Enter total seconds: ");
//            int totalSeconds = input.nextInt();
//
//            int hours = totalSeconds / 3600;
//            int minutes = (totalSeconds % 3600) / 60;
//            int seconds = totalSeconds % 60;
//
//            System.out.println("Hours: " + hours);
//            System.out.println("Minutes: " + minutes);
//            System.out.println("Seconds: " + seconds);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer for seconds.");
//        }

        //13
//        try {
//            System.out.print("Input first number: ");
//            int first = input.nextInt();
//            System.out.print("Input second number: ");
//            int second = input.nextInt();
//            System.out.print("Input third number: ");
//            int third = input.nextInt();
//            System.out.print("Input fourth number: ");
//            int fourth = input.nextInt();
//
//            if (first == second && second == third && third == fourth) {
//                System.out.println("All four numbers are equal!");
//            } else {
//                System.out.println("The numbers are not all equal.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter integers only.");
//        }

        //14
//        try {
//            System.out.print("Please enter your number: ");
//            int number = input.nextInt();
//
//            if (number < 0) {
//                System.out.println("The number is negative: " + number);
//            } else if (number > 0) {
//                System.out.println("The number is positive: " + number);
//            } else {
//                System.out.println("The number is zero.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer.");
//        }

        //15
//        int positive = 0, negative = 0, zero = 0;
//
//        System.out.println("Enter numbers or -1 to stop:");
//        while (true) {
//            try {
//                int number = input.nextInt();
//                if (number == -1) break;
//                if (number > 0) positive++;
//                else if (number < 0) negative++;
//                else zero++;
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter integers only.");
//                input.next(); // Clear invalid input
//            }
//        }
//        System.out.println("Positive numbers: " + positive);
//        System.out.println("Negative numbers: " + negative);
//        System.out.println("Zeros: " + zero);

        //16
//        try {
//            System.out.print("Please enter an integer: ");
//            int number = input.nextInt();
//            int reversedNumber = 0;
//
//            while (number != 0) {
//                int digit = number % 10;
//                reversedNumber = reversedNumber * 10 + digit;
//                number /= 10;
//            }
//            System.out.println("Reversed number is: " + reversedNumber);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer.");
//        }
        //17
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//
//        while (true) {
//            try {
//                System.out.print("Enter your number (-1 to stop): ");
//                int number = input.nextInt();
//                if (number == -1) break;
//
//                if (number > largest) largest = number;
//                if (number < smallest) smallest = number;
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter integers only.");
//                input.next(); // Clear invalid input
//            }
//        }
//        System.out.println("Largest number is: " + largest);
//        System.out.println("Smallest number is: " + smallest);

        //18
//        try {
//            System.out.print("Enter a string: ");
//            String word = input.nextLine().toLowerCase();
//            int count = 0;
//
//            for (int i = 0; i < word.length(); i++) {
//                if (word.charAt(i) == 'a') count++;
//            }
//            System.out.println("Number of 'a's: " + count);
//        } catch (Exception e) {
//            System.out.println("An error occurred. Please try again.");
//        }


    }
    //1

//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    public static int divide(int a, int b) throws ArithmeticException {
//        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
//        return a / b;
//    }
//
//    public static int remainder(int a, int b) throws ArithmeticException {
//        if (b == 0) throw new ArithmeticException("Cannot find remainder with divisor zero");
//        return a % b;
//    }
//    //2
//    public static void printTable(int number) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " x " + number + " = " + (number * i));
//        }
   // }
    //3

//    public static double calculateArea(double radius) {
//        return 3.14 * radius * radius;
//    }
//
//    public static double calculatePerimeter(double radius) {
//        return 2 * 3.14 * radius;
   // }


}
