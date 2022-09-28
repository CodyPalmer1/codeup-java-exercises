import java.util.Scanner;
public class practiceJavaSept28 {
    public static void main(String[] args) {
//        1. Write a program in Java to read 10 numbers from keyboard and find their sum and average
//
//        Expected Output :
//        The sum of 10 numbers is : 55
//        The Average is : 5.500000

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 10 seperate numbers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int n6 = scanner.nextInt();
        int n7 = scanner.nextInt();
        int n8 = scanner.nextInt();
        int n9 = scanner.nextInt();
        int n10 = scanner.nextInt();
        int total = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10);
        int sum = (total / 10);
        System.out.println("The sum of 10 numbers is : " + total);
        System.out.println("The Average is : " + sum);

//        Write a program in Java to display the cube of the number upto given an integer. Read the number using the Scanner class.
//
//        Expected Output :
//        Number is : 1 and cube of the 1 is :1
//        Number is : 2 and cube of the 2 is :8
//        Number is : 3 and cube of the 3 is :27
//        Number is : 4 and cube of the 4 is :64
//        Number is : 5 and cube of the 5 is :125

        scanner.nextLine();
        System.out.println("Please enter a number you want to cube: ");
        int cubeNum = scanner.nextInt();
        int cubed = cubeNum * cubeNum;
        System.out.printf("Number is : %s and cube of the %s is : %s", cubeNum, cubeNum, cubed);
        System.out.println("\n----------------------------------------------");

//        Write a program in Java to display the n terms of odd natural number and their sum.
//        Read the odd number using the Scanner class
//
//        Test Data
//        Input number of terms : 10
//        Expected Output :
//        The odd numbers are :1 3 5 7 9 11 13 15 17 19
//        The Sum of odd Natural Number upto 10 terms : 100

        System.out.println("display the n terms of odd natural number and their sum:");
        int userNum = scanner.nextInt();
        if(userNum < 0){

        }
        System.out.println("The odd numbers are :" + );
        System.out.println(" The Sum of odd Natural Number upto 10 terms : " + );

//        Write a program in Java to display the pattern like right angle triangle with a number.
//        Read the number using the Scanner class.
//
//        The pattern like :
//        1
//        12
//        123
//        1234

        scanner.nextLine();
        int pyramid = 5;
        for (int i = 1; i <= pyramid; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        Write a program in Java to make such a pattern like right angle triangle with number increased by 1.
//
//        With an input of 10.
//        The pattern must look like :
//
//        1
//        2 3
//        4 5 6
//        7 8 9 10

        //scanner.nextLine();
        int rows = 4, number = 1;
        for (int a = 1; a <= rows; a++) {
            for (int i = 1; i <= a; i++) {
                System.out.print(number + " ");
                ++number;
            }
            System.out.println();
        }
    }
}
