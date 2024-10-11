package ex11_1_exercise;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
    public static void main(String[] args){

        LocalDateTime orderDate;


        orderDate = LocalDateTime.now();
        System.out.println("Order date: "+ orderDate);


        String formattedDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formatted order date: "+ formattedDate);
    }
}