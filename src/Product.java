public class Product {
    public String id;
    public String name;
    public double price;
    public int quantity;

    // constructor ( phễu nạp dẽ liệu )
    public Product(String idInput, String nameInput, double priceInput, int quantityInput) {
        this.id = idInput;
        this.name = nameInput;
        this.price = priceInput;
        this.quantity = quantityInput;
    }

    // method

    public void displayInfo() {
        System.out.println(
                "ID: " + this.id + "| Name:" + this.name + "| Price:" + this.price + "| Warehouse: " + this.quantity);
    }

    public void updateQuantity(int amount) {
        this.quantity += amount;
    }
}