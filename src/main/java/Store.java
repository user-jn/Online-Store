import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//main store application
public class Store {

    public static void main(String[] args) {

        // scanner for user input
        Scanner scnr = new Scanner(System.in);

        // Create ArrayLists for products and shopping cart
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Product> cart = new ArrayList<>();

        // load products from csv


        // menu - keep running until customer exits
        boolean running = true;

        while (running) {
            // display home menu
            System.out.println("\n=== ONLINE STORE ===");
            System.out.println("1. Display Products");
            System.out.println("2. Display Cart");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            //collects users choice
            String choice = scnr.nextLine();

            switch (choice) {

                case "1":

            }
        }
        // product menu method
        public static void productMenu(
                ArrayList<Product> products,
                ArrayList<Product> cart,
                Scanner scnr) {

            boolean browsing = true;

            while (browsing) {
                System.out.println("\n===== PRODUCTS =====");
                System.out.println("2. Search by Name");
                System.out.println("3. Search by Price");
                System.out.println("4. Search by Department");
                System.out.println("5. Add Product to Cart");
                System.out.println("6. Return to Home");
                System.out.print("Enter your choice: ");

                String choice = scnr.nextLine();

                // DISPLAY ALL PRODUCTS
                public static void displayProducts (ArrayList < Product > products) {

                    System.out.println("\n===== ALL PRODUCTS =====");

                    // Loop through inventory and print each product
                    for (Product product : products) {
                        System.out.println(product);

                    }
                }
                // SEARCH PRODUCTS BY NAME
                public static void searchByName (
                        ArrayList < Product > products, Scanner scnr){

                    System.out.print("Enter product name: ");
                    String search = scnr.nextLine().trim().toLowerCase();
                    boolean found = false;

                    for (Product product : products) {

                        if (product.getName().toLowerCase().contains(search)) { //used .contains to check if search matches
                            System.out.println(product);
                            found = true;

                        }
                    }

                    if (!found) {
                        System.out.println("No products found.");
                    }
                }
                // SEARCH PRODUCTS BY PRICE
                public static void searchByPrice (ArrayList < Product > products, Scanner scnr){

                    System.out.print("Enter a product name: ");
                    String search = scnr.nextLine().trim().toLowerCase();

                    boolean found = false;

                    for (Product product : products) {
                        if (product.getName().toLowerCase().contains(search)) {
                            System.out.println(product);
                            found = true;
                        }
                    }
                    // make a case for if not found
                    if (!=found) {
                        System.out.println("No products found.");
                    }
                }

            }




        // display loaded products
        for (Product product : products) {
            System.out.println(product);
        }
    }


    // read products from csv and add them to arraylist
    public static void loadProducts(ArrayList<Product> products) {
        try {
            // open products file
            FileReader fileReader = new FileReader("products.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;

            bufReader.readLine(); // skips header on csv file

            // read one product at a time
            while ((line = bufReader.readLine()) != null) {

                // split product information
                String[] tokens = line.split("\\|");

                // now storing individual values
                String sku = tokens[0];
                String name = tokens[1];
                double price = Double.parseDouble(tokens[2]);
                String department = tokens[3];

                // creating new product object
                Product product = new Product(sku, name, price, department);

                // add product to arraylist
                products.add(product);
            }
            // close the file
            bufReader.close();

        } catch (IOException e) {
            System.out.println("Error reading products: " + e.getMessage());

        }
    }
}