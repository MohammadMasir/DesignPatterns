package FactoryAndBuilderPattern;

public class ProductFactoryImpl implements ProductFactory{

    public Product createProduct(String name, String type){
        switch (type) {
            case "Laptop" -> {
                System.out.println("Product type : "+type+" - "+name+" created successfully!");
                return new Product
                        .ProductBuilder(1, name, "Laptop")
                        .build();
            }
            case "Mobile" -> {
                System.out.println("Product type : "+type+" - "+name+" created successfully!");
                return new Product
                        .ProductBuilder(2, name, "Mobile")
                        .discount("Bumper Offer!")
                        .build();
            }
            case "Heater" -> {
                System.out.println("Product type : "+type+" - "+name+" created successfully!");
                return new Product
                        .ProductBuilder(3, name, "Heater")
                        .discount("Bumper Offer!")
                        .nextFill("19/09/26")
                        .build();
            }
            case "Bluetooth" -> {
                System.out.println("Product type : "+type+" - "+name+" created successfully!");
                return new Product
                        .ProductBuilder(4, name, "Bluetooth")
                        .build();
            }
            default -> throw new RuntimeException("Illegal Product type!");
        }
    }

}
