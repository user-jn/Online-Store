import java.util.Locale;

public class Product {
     // product attributes
     private String sku;
     private String name;
     private double price;
     private String department;

     // constructor
    public Product(String sku, String name, double price, String department) {

        this.sku = sku;
        this.name = name;
        this.price = price;
        this.department = department;
    }
        // getters

        // get product SKU
        public String getSku() {
            return sku;
        }
        // get product name
        public String getName() {
            return name;
        }
        // get product price
        public double getPrice() {
            return price;
        }
        // get product department
        public String getDepartment() {
            return department;
        }

}
