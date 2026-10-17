package FactoryAndBuilderPattern;

public class Main {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactoryImpl();
        ProductService productService = new ProductService(productFactory);

        productService.newProduct("Samsung Galaxy 8+", "Mobile");
        productService.newProduct("Boat Audio 259", "Bluetooth");
        productService.newProduct("Panasonic Heat360", "Heater");
        productService.newProduct("Acer Compact", "Laptop");
    }

}
