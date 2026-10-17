package FactoryAndBuilderPattern;

public class Product {

    private final Integer id;
    private final String name;
    private final String type;
    private final String nextFill; // Optional
    private final String discount; // Optional

    public Product(ProductBuilder productBuilder){
        this.id = productBuilder.id; this.nextFill = productBuilder.nextFill;
        this.name = productBuilder.name; this.discount = productBuilder.discount;
        this.type = productBuilder.type;
    }

    public static class ProductBuilder {

        private final Integer id;
        private final String name;
        private final String type;
        private String nextFill; // Optional
        private String discount; // Optional

        public ProductBuilder(Integer id, String name, String type){
            this.id = id;
            this.name = name;
            this.type = type;
        }

        public ProductBuilder nextFill(String nextFill){
            this.nextFill = nextFill;
            return this;
        }
        public ProductBuilder discount(String discount){
            this.discount = discount;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }

}
