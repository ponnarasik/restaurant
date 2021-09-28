package Restaurant;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem(name: "Salad", description: "Veggies", price: 2.30, category:"Main", isNew: true);

        System.out.println(item1.toString());
    }
}
