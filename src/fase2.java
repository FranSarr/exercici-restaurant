import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class fase2 {
    public static void main(String[] args) {
        int bill_5euros = 5;
        int bill_10euros = 10;
        int bill_20euros = 20;
        int bill_50euros = 50;
        int bill_100euros = 100;
        int bill_200euros = 200;
        int bill_500euros = 500;
        int total_bill = 0;
        String[] menu = new String[5];
        int[] price = new int[5];
        Scanner dish_input = new Scanner(System. in);
        Scanner price_input = new Scanner(System. in);
        ArrayList<String> order = new ArrayList<String>();
        int seguir = 1;
        Scanner seguir_input = new Scanner(System. in);

        for (int i = 0; i<5 ; i++){
            System.out.print("Enter the name of the dish number " + (i+1) + "  : ");
            menu[i] = dish_input. nextLine();
            System.out.print("Enter the price in euros of dish number " + (i+1) + "  : ");
            price[i] = price_input.nextInt();}
        System.out.println("\n");
        while (seguir == 1) {
            System.out.println("The available dishes today are: ");
            for (int i = 0; i<5 ; i++){
                System.out.println(menu[i]+": "+price[i]+" euros");}
            System.out.println("Please enter the dish name that you want to order:");
            order.add(dish_input.nextLine());
            System.out.println("Do you want to order another dish (1=yes / 0=no)?");
            seguir = seguir_input.nextInt();}

        System.out.println("This is what you have ordered: "+order);


    }

    }
