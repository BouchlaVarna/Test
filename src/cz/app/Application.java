package cz.app;

import cz.app.modules.Maso;
import cz.app.modules.Ovoce;
import cz.app.modules.Product;
import cz.app.modules.Zelenina;

import java.util.Scanner;

public class Application {
    private static final Scanner sc = new Scanner(System.in);

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("maso/zelenina/ovoce");
            switch (sc.nextLine()) {
                case "maso" -> {
                    listMaso();
                    System.out.println("Do you want to edit?");
                    if (sc.nextLine().equals("yes")) {
                        editMaso();
                    }
                }
                case "zelenina" -> {
                    listZelenina();
                    System.out.println("Do you want to edit?");
                    if (sc.nextLine().equals("yes")) {
                        editZelenina();
                    }
                }
                case "ovoce" -> {
                    listOvoce();
                    System.out.println("Do you want to edit?");
                    if (sc.nextLine().equals("yes")) {
                        editOvoce();
                    }
                }
            }
        }
    }

    public static void listOvoce() {
        Ovoce ovoce = new Ovoce();
        System.out.println("Total amount of products: " + ovoce.getTotalAmount());
        System.out.println("Total price of products: " + ovoce.getTotalPriceOfProducts());
        for (Product ovoce1 : ovoce.getProducts()) {
            System.out.println(ovoce1);
        }
    }

    public static void listMaso() {
        Maso maso = new Maso();
        System.out.println("Total amount of products: " + maso.getTotalAmount());
        System.out.println("Total price of products: " + maso.getTotalPriceOfProducts());
        for (Product maso1 : maso.getProducts()) {
            System.out.println(maso1);
        }
    }

    public static void listZelenina() {
        Zelenina zelenina = new Zelenina();
        System.out.println("Total amount of products: " + zelenina.getTotalAmount());
        System.out.println("Total price of products: " + zelenina.getTotalPriceOfProducts());
        for (Product zelenina1 : zelenina.getProducts()) {
            System.out.println(zelenina1);
        }
    }

    public static void editOvoce() {
        Ovoce ovoce = new Ovoce();

        System.out.println("What product do you want to edit?");
        for (int i = 0; i < ovoce.getProducts().size(); i++) {
            System.out.println(i + " " + ovoce.getProducts().get(i).getName());
        }
        int productToEdit = sc.nextInt();

        System.out.println("Edit price: ");
        ovoce.getProducts().get(productToEdit).setPrice(sc.nextInt());
        System.out.println("Edit amount: ");
        ovoce.getProducts().get(productToEdit).setAmount(sc.nextInt());
    }

    public static void editMaso() {
        Maso maso = new Maso();

        System.out.println("What product do you want to edit?");
        for (int i = 0; i < maso.getProducts().size(); i++) {
            System.out.println(i + " " + maso.getProducts().get(i).getName());
        }
        int productToEdit = sc.nextInt();

        System.out.println("Edit price: ");
        maso.getProducts().get(productToEdit).setPrice(sc.nextInt());
        System.out.println("Edit amount: ");
        maso.getProducts().get(productToEdit).setAmount(sc.nextInt());
    }

    public static void editZelenina() {
        Zelenina zelenina = new Zelenina();

        System.out.println("What product do you want to edit?");
        for (int i = 0; i < zelenina.getProducts().size(); i++) {
            System.out.println(i + " " + zelenina.getProducts().get(i).getName());
        }
        int productToEdit = sc.nextInt();

        System.out.println("Edit price: ");
        zelenina.getProducts().get(productToEdit).setPrice(sc.nextInt());
        System.out.println("Edit amount: ");
        zelenina.getProducts().get(productToEdit).setAmount(sc.nextInt());
    }
}
