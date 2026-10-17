package FactoryAndBuilderPattern;

public class ProductService {

    ProductFactory productFactory;

    public ProductService(ProductFactory productFactory){
        this.productFactory = productFactory;
    }

    public void newProduct(String name, String type){
        Product product = productFactory.createProduct(name,type);
        calculateTaxes(product);
    }

    void calculateTaxes(Product product){}
}
