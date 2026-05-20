package service;

import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public void getTotalPrice() {
        double sum = 0;

        for (Food product: products) {
            sum += product.getAmount() * product.getPrice();
        }

        System.out.println("TotalPrice " + sum);
    }

    public void getTotalPriceWithDiscount() {
        double sum = 0;

        for (Food product: products) {
            double fullPrice = product.getAmount() * product.getPrice();
            double discount = product.getDiscount();

            sum += fullPrice * (1 - discount / 100);
        }

        System.out.println("TotalPriceWithDiscount " + sum);
    }

    public void getTotalVegetarianPrice() {
        double sum = 0;

        for (Food product: products) {
            if (product.isVegetarian()) {
                sum += product.getAmount() * product.getPrice();
            }
        }

        System.out.println("TotalVegetarianPrice " + sum);
    }
}
