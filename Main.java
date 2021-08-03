package com.internshala.prework;
import java.util.Scanner;

public class Main {
            //function to check palindrome
public void checkPalindrome(){
        int n, x, y, temp=0;
        Scanner scanner=new Scanner(System.in);
System.out.println("Enter any Number: ");
n = scanner.nextInt();
y=n;
    while(n>0)
{
    x=n%10;
    n=n/10;
    temp=temp*10+x;
}
if(temp==y)
{
    System.out.println(n + "Number is Palindrome\n");
}
else{
    System.out.println(n + "Number is not Palindrome\n");
}
}

// function to print Pattern

    public void printPattern()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int rows = scanner.nextInt();
        for (int i=rows-1; i>=0;i--)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }


    //function to check no is prime or not

    public void checkPrimeNumber()
    {
       System.out.println("Enter a Number");
       Scanner scanner=new Scanner(System.in);
       int num= scanner.nextInt();
       int i=2,count=0;
       while(i<=num/2){
           if (num%i==0){
               count++;
               break;
           }
           i++;
       }
       if (count==0){
           System.out.println(num + " is a prime number\n");
       }else {
           System.out.println(num + " is  not a prime number\n");
       }
    }
// function to print fibonacci series

    public void printFibonacciSeries()
    {
        int n, a, b=0, c=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n= scanner.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i=1; i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
        System.out.println("\n");
    }
    public static void main (String[] args) {
        int choice;
        Main obj= new Main();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("""
                    Enter your choice from below list.
                    1. Find Palindrome of number.
                    2. Print Pattern for a given no
                    3. Check whether the no is a prime number.
                    4. Print Fibonacci series.
                    5. Enter 0 to Exit.
                    """);

            System.out.println("Enter Your Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                    obj.checkPalindrome();
                }
                break;
                case 2: {
                    obj.printPattern();
                }
                break;
                case 3: {
                    obj.checkPrimeNumber();
                }
                break;
                case 4: {
                    obj.printFibonacciSeries();
                }
                break;
                default:
                    System.out.println("Invalid choice. enter a Valid no.\n");
            }
        }while (choice!=0);
        System.out.println("Exited Successfully!!!");
        scanner.close();
    }
}
