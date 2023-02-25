

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice1,choice2,max;

        System.out.println("please enter maximum number of slots");
        max = in.nextInt();
        garage gA = new garage();

        System.out.println("choose 2 configration  ");
        System.out.println("-------------------- ");
        System.out.println("1- first come  ");
        System.out.println("2- best fit  ");
        choice2 = in.nextInt();
        System.out.println(" ");
        gA.makeGarage(max);
int a=0,num=0;
        do {
            System.out.println("1.parkin");
            System.out.println("2.parkout");
            System.out.println("3.display available");
            System.out.println("4.display all income");
            System.out.println("5.display num of entry vehicles");
            System.out.println("6.exit ");
            System.out.println("enter your choice : ");
            choice1 = in.nextInt();
            switch (choice1) {
                case 1:
                    gA.park_in(gA,choice2,a);
                    a++;
                    System.out.println(" ");

                    break;

                case 2:
                    gA.park_out(gA);
                    System.out.println(" ");

                    break;

                case 3:
                    gA.availableArea();
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("all income: " + gA.getIncome());;
                    break;

                case 5:
                    System.out.println("No. of client in garage is: " + gA.getNum());
                    break;
                case 6:
                    choice1=6;
                    break;
                default:
                    System.out.println("invalid choice .. ");
                    break;


            }




                System.out.println("thanks");



        } while (choice1 != 6);

    }
}



