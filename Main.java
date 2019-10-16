package exercise5;


import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();

        int res1 = num * 1;
        int res2 = num * 2;
        int res3 = num * 3;
        int res4 = num * 4;
        int res5 = num * 5;
        int res6 = num * 6;
        int res7 = num * 7;
        int res8 = num * 8;
        int res9 = num * 9;
        int res10 = num * 10;

        System.out.print("Table to: " + num + "\n");
        System.out.print(num + " * 1 = " + res1 + "\n");
        System.out.print(num + " * 2 = " + res2 + "\n");
        System.out.print(num + " * 3 = " + res3 + "\n");
        System.out.print(num + " * 4 = " + res4 + "\n");
        System.out.print(num + " * 5 = " + res5 + "\n");
        System.out.print(num + " * 6 = " + res6 + "\n");
        System.out.print(num + " * 7 = " + res7 + "\n");
        System.out.print(num + " * 8 = " + res8 + "\n");
        System.out.print(num + " * 9 = " + res9 + "\n");
        System.out.print(num + " * 10 = " + res10 + "\n");
        in.close();
    }
}
