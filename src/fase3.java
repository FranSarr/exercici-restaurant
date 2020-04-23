import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class fase3 {
    public static void main(String[] args) {
        int bill_5euros = 5;
        int bill_10euros = 10;
        int bill_20euros = 20;
        int bill_50euros = 50;
        int bill_100euros = 100;
        int bill_200euros = 200;
        int bill_500euros = 500;
        String[] menu = new String[5];
        int[] price = new int[5];
        int total_price = 0;
        Scanner dish_input = new Scanner(System.in);
        Scanner price_input = new Scanner(System.in);
        ArrayList<String> order = new ArrayList<String>();
        int seguir = 1;
        Scanner seguir_input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of the dish number " + (i + 1) + "  : ");
            menu[i] = dish_input.nextLine();
            System.out.print("Enter the price in euros of dish number " + (i + 1) + "  : ");
            price[i] = price_input.nextInt();
        }
        System.out.println("\n");
        while (seguir == 1) {
            System.out.println("The available dishes today are: ");
            for (int i = 0; i < 5; i++) {
                System.out.println(menu[i] + ": " + price[i] + " euros");
            }
            System.out.println("Please enter the dish name that you want to order:");
            order.add(dish_input.nextLine());
            System.out.println("Do you want to order another dish (1=yes / 0=no)?");
            seguir = seguir_input.nextInt();
            }

            for (int i = 0; i < order.size(); i++) {
                if (Objects.equals(order.get(i), menu[0])) {
                    total_price = total_price + price[0];
                }
                if (Objects.equals(order.get(i), menu[1])) {
                    total_price = total_price + price[1];
                }
                if (Objects.equals(order.get(i), menu[2])) {
                    total_price = total_price + price[2];
                }
                if (Objects.equals(order.get(i), menu[3])) {
                    total_price = total_price + price[3];
                }
                if (Objects.equals(order.get(i), menu[4])) {
                    total_price = total_price + price[4];
                }
                if (!Objects.equals(order.get(i), menu[0]) && !Objects.equals(order.get(i), menu[1]) && !Objects.equals(order.get(i), menu[2]) && !Objects.equals(order.get(i), menu[3]) && !Objects.equals(order.get(i), menu[4]) ) {
                    System.out.println("The product you ordered does not exists");
                    break;
                }
            }
            System.out.println("This is what you have ordered: " + order + " :" + total_price + " euros");

    }
}