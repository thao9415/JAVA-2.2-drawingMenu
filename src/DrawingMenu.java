import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 5;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the heart");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            choice=input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*");
                    System.out.println("* *");
                    System.out.println("* * *");
                    System.out.println("* * * *");
                    break;
                case 2:
                    System.out.println("     *       *   ");
                    System.out.println("         *       ");
                    System.out.println(" *               *");
                    System.out.println("         *        ");
                    break;
                case 3:
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }

}

