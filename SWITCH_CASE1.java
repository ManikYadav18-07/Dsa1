/*import java.util.Scanner;

public class SWITCH_CASE1 {
    public static void main(String[] args) {
        System.out.println("=======WELCOME TO THE RESTURANT=======");
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU :-");
        System.out.println("PLEASE CHOOSE ANY OPTION FOR ORDER :-");
        System.out.println("1. MAIN COURSE ");
        System.out.println("2. SNACKS");
        System.out.println("3. BEVERAGE");
        System.out.println("4. DESSERT");
        
        System.out.println("CHOOSE ANY ONE OF THEM AND WRITE IT'S SERIES NUMBER :-");
        Integer num1 = sc.nextInt();

        switch (num1) {
            case 1:System.out.println("You choose MAIN COURSE now for further:-");

            System.out.println("1. FRIED RICE ------- $10");
            System.out.println("2. DEEF FRIED COOSE ------- $14");
            System.out.println("3. SPICY CHICKEN ------- $12");
            System.out.println("4. GRILLED SALMON FISH ------- $13");

            System.out.println("CHOOSE ANY ONE OF THEM AND WRITE IT'S SERIES NUMBER :-");
            Integer num2 = sc.nextInt();

            switch (num2) {
                case 1:System.out.println("you choose FRIED RICE");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 2:System.out.println("you choose  DEEF FRIED COOSE");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 3:System.out.println("you choose SPICY CHICKEN");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 4:System.out.println("you choose GRILLED SALMON FISH");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
            
                default:System.out.println("no thanks");
                    break;
            }

                break;
            case 2:System.out.println("You choose SNACKS now for further:-");

            System.out.println("1. PIZZA ------- $13");
            System.out.println("2. WINGS  ------- $14");
            System.out.println("3. MEAT BALLS ------- $15");
            System.out.println("4. FRENCH FRIES ------- $10");
            System.out.println("CHOOSE ANY ONE OF THEM AND WRITE IT'S SERIES NUMBER :-");
            Integer num3 = sc.nextInt();

            switch (num3) {
                case 1:System.out.println("you choose PIZZA");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 2:System.out.println("you choose WINGS");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 3:System.out.println("you choose MEAT BALLS");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 4:System.out.println("you choose FRENCH FRIES");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
            
                default:System.out.println("No thanks");
                    break;
            }
                break;
            case 3:System.out.println("You choose BEVERAGE now for further:-");

            System.out.println("1. COLD COFFEE ------- $10");
            System.out.println("2. HOT COFFEE ------- $10");
            System.out.println("3. COLD DRINK ------- PRINT PRICE");
            System.out.println("4. MACHA ------- $10");

            System.out.println("CHOOSE ANY ONE OF THEM AND WRITE IT'S SERIES NUMBER :-");
            Integer num4 = sc.nextInt();

            switch (num4) {
                case 1:System.out.println("you choose COLD COFFEE");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 2:System.out.println("you choose HOT COFFEE");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 3:System.out.println("you choose COLD DRINK");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 4:System.out.println("you choose MACHA");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
            
                default:System.out.println("No thanks");
                    break;
            }
                break;
            case 4:System.out.println("You choose DESSERT now for further:-");

            System.out.println("1. CHEESECAKE ------- $8");
            System.out.println("2. CAKE ------- $10");
            System.out.println("3. TIRAMISU ------- $9");
            System.out.println("4. ICE CREAM ------- $13");

            System.out.println("CHOOSE ANY ONE OF THEM AND WRITE IT'S SERIES NUMBER :-");
            Integer num5 = sc.nextInt();

            switch (num5) {
                case 1:System.out.println("you choose CHEESECAKE");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 2:System.out.println("you choose HOT CAKE");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 3:System.out.println("you choose TIRAMISU");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
                case 4:System.out.println("you choose ICE CREAM");
                System.out.println("THANKS FOR ORDER PLEASE WAIT FOR FEW MINUTES TO GET YOUR ORDER");
                break;
            
                default:System.out.println("No thanks");
                    break;
            }
                break;
            default:System.out.println("Choose Wisely");
                break;
        }
        sc.close();

    }
}*/

import java.util.Scanner;

public class SWITCH_CASE1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = 0;
        String item = "";

        System.out.println("======= WELCOME TO THE RESTAURANT =======");
        System.out.println("1. MAIN COURSE");
        System.out.println("2. SNACKS");
        System.out.println("3. BEVERAGE");
        System.out.println("4. DESSERT");

        System.out.print("Choose a category: ");
        int cate = sc.nextInt();

        switch (cate) {

            case 1:
                System.out.println("\nMAIN COURSE");
                System.out.println("1. Fried Rice - $10");
                System.out.println("2. Beef Fried Goose - $14");
                System.out.println("3. Spicy Chicken - $12");
                System.out.println("4. Grilled Salmon Fish - $13");

                System.out.print("Choose item number: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        item = "Fried Rice";
                        price = 10;
                        break;
                    case 2:
                        item = "Beef Fried Goose";
                        price = 14;
                        break;
                    case 3:
                        item = "Spicy Chicken";
                        price = 12;
                        break;
                    case 4:
                        item = "Grilled Salmon Fish";
                        price = 13;
                        break;
                    default:
                        System.out.println("Invalid Item!");
                        break;
                }
                break;

            case 2:
                System.out.println("\nSNACKS");
                System.out.println("1. Pizza - $13");
                System.out.println("2. Wings - $14");
                System.out.println("3. Meat Balls - $15");
                System.out.println("4. French Fries - $10");

                System.out.print("Choose item number: ");
                int snack = sc.nextInt();

                switch (snack) {
                    case 1:
                        item = "Pizza";
                        price = 13;
                        break;
                    case 2:
                        item = "Wings";
                        price = 14;
                        break;
                    case 3:
                        item = "Meat Balls";
                        price = 15;
                        break;
                    case 4:
                        item = "French Fries";
                        price = 10;
                        break;
                    default:
                        System.out.println("Invalid Item!");
                        break;
                }
                break;

            case 3:
                System.out.println("\nBEVERAGES");
                System.out.println("1. Cold Coffee - $10");
                System.out.println("2. Hot Coffee - $10");
                System.out.println("3. Cold Drink - $8");
                System.out.println("4. Matcha - $10");

                System.out.print("Choose item number: ");
                int drink = sc.nextInt();

                switch (drink) {
                    case 1:
                        item = "Cold Coffee";
                        price = 10;
                        break;
                    case 2:
                        item = "Hot Coffee";
                        price = 10;
                        break;
                    case 3:
                        item = "Cold Drink";
                        price = 8;
                        break;
                    case 4:
                        item = "Matcha";
                        price = 10;
                        break;
                    default:
                        System.out.println("Invalid Item!");
                        break;
                }
                break;

            case 4:
                System.out.println("\nDESSERT");
                System.out.println("1. Cheesecake - $8");
                System.out.println("2. Cake - $10");
                System.out.println("3. Tiramisu - $9");
                System.out.println("4. Ice Cream - $13");

                System.out.print("Choose item number: ");
                int dessert = sc.nextInt();

                switch (dessert) {
                    case 1:
                        item = "Cheesecake";
                        price = 8;
                        break;
                    case 2:
                        item = "Cake";
                        price = 10;
                        break;
                    case 3:
                        item = "Tiramisu";
                        price = 9;
                        break;
                    case 4:
                        item = "Ice Cream";
                        price = 13;
                        break;
                    default:
                        System.out.println("Invalid Item!");
                        break;
                }
                break;

            default:
                System.out.println("Invalid Category!");
                break;
        }

        // Quantity
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int total = price * quantity;

        // Bill
        System.out.println("\n========== BILL ==========");
        System.out.println("Item      : " + item);
        System.out.println("Price     : $" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("--------------------------");
        System.out.println("Total Bill: $" + total);
        System.out.println("==========================");
        System.out.println("Thank you for your order!");

        sc.close();
    }
}
