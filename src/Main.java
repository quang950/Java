import java.util.Scanner; // Khai báo cho Java biết mình muốn mượn công cụ này

public class Main {
    public static void main(String[] args) {
        // khởi tạo scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Product Information entry !");
        // id
        System.out.print("Please Enter The Product Code: ");
        String idInput = sc.nextLine();
        // name
        System.out.print("Please Enter The Product Name: ");
        String nameInput = sc.nextLine();
        // price
        System.out.print("Please Enter The Product Price: ");
        double priceInput = sc.nextDouble();
        // quantity
        System.out.print("Please Enter The Product Quantity: ");
        int quantityInput = sc.nextInt();
        Product productFirst = new Product(idInput, nameInput, priceInput, quantityInput);

        System.out.println("---Your menu---");
        productFirst.displayInfo();

        System.out.println("Update Warehouse Quantity.");
        int amountInput = sc.nextInt();
        productFirst.updateQuantity(amountInput);
        productFirst.displayInfo();
        sc.close();

    }
}