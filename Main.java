package exercise5;


import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();


        System.out.println("Table to: " + num);
        System.out.println(num + " * 1 = " + num * 1);
        System.out.println(num + " * 2 = " + num * 2);
        System.out.println(num + " * 3 = " + num * 3);
        System.out.println(num + " * 4 = " + num * 4);
        System.out.println(num + " * 5 = " + num * 5);
        System.out.println(num + " * 6 = " + num * 6);
        System.out.println(num + " * 7 = " + num * 7);
        System.out.println(num + " * 8 = " + num * 8);
        System.out.println(num + " * 9 = " + num * 9);
        System.out.println(num + " * 10 = " + num * 10);
        in.close();
    }
}
