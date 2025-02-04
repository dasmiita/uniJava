public class ProductDemo {
    public static class Product {
        String productName;
        int productID;
        double price;
        int quantityInStock;

        void applyDiscount(double discountPercentage) {
            price -= price * (discountPercentage / 100);
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.productName = "Smartphone";
        p.productID = 202;
        p.price = 4499.99;
        p.quantityInStock = 25;

        System.out.println("Before Discount: " + p.productName + " " + p.price);

        // Applying a 10% discount
        p.applyDiscount(10);
        System.out.println("After 10% Discount: " + p.productName + " " + p.price);
    }
}
    