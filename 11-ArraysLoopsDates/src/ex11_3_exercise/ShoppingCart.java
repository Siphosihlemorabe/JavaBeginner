
package ex11_3_exercise;

public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60),
            new Item("WristBand",1.00),
            new Item("Pants",35.99)};

    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }

    public void displayTotal(){
        double total = 0;
        for(int index = 0; index < items.length; index++){
            if(items[index].isBackOrdered())
                continue;
            total += items[index].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }
}
