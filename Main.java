package exercise5;


import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();


        System.out.print("Table to: " + num + "\n");
        System.out.print(num + " * 1 = " + num * 1 + "\n");
        System.out.print(num + " * 2 = " + num * 2 + "\n");
        System.out.print(num + " * 3 = " + num * 3 + "\n");
        System.out.print(num + " * 4 = " + num * 4 + "\n");
        System.out.print(num + " * 5 = " + num * 5 + "\n");
        System.out.print(num + " * 6 = " + num * 6 + "\n");
        System.out.print(num + " * 7 = " + num * 7 + "\n");
        System.out.print(num + " * 8 = " + num * 8 + "\n");
        System.out.print(num + " * 9 = " + num * 9 + "\n");
        System.out.print(num + " * 10 = " + num * 10 + "\n");
        in.close();
    }
}
