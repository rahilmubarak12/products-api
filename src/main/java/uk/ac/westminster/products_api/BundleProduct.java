package uk.ac.westminster.products_api;

import java.util.ArrayList;
import java.util.List;

// Is BundleProduct really an IS-A Product?
// For: a bundle is sold in the catalogue with its own id, name and price, so the shop treats it as a product.
// Against: the List<Product> inside it is a HAS-A relationship - a bundle CONTAINS products.
// Conclusion: it is both. It IS-A Product (it can be listed and sold like any other)
// and it HAS-A list of Products (its contents). That pattern is called "Composite".
public class BundleProduct extends Product {

    private List<Product> items = new ArrayList<>();

    public BundleProduct() {
    }

    public BundleProduct(Long id, String name, double price, List<Product> items) {
        super(id, name, price);
        this.items = items;
    }

    public List<Product> getItems() {
        return items;
    }
}
