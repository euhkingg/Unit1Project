public class Order {
    private double foodPrice;
    private String foodName;
    public Order(String food, double price) { //Creating a constructor to store food and price
        foodName = food;
        foodPrice = price;
    }

    //Getters
    public double getFoodPrice() {
        return foodPrice;
    }
    public String getFoodName() {
        return foodName;
    }
}
