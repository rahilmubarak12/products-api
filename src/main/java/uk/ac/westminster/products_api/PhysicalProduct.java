package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has everything every product has (id, name, price) and only adds shipping details.
// A ShoppingCart would NOT pass this test: a cart HAS products inside it, it is not itself a product, so it needs a field, not extends.
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // empty no-arg constructor for Jackson
    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
            double weightKg, String dimensions) {
        super(id, name, price); // MUST be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
