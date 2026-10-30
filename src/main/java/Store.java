import java.io.*;
import java.util.ArrayList;

//main
public class Store {
    public static void main(String[] args) {

        // creating array list to store products
        ArrayList<Product> products = new ArrayList<>();

        // load products from csv

        // display loaded products
    }
}

        // read products from csv and add them to arraylist
    public static void loadProducts(ArrayList<Product> products) {
        try {
            // open products fiel
            FileReader fileReader = new FileReader("products.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;

            bufReader.readLine(); // skips header on csv file

            // read one product at a time
            while ((line = bufReader.readLine()) != null) {


            }
        }
    }