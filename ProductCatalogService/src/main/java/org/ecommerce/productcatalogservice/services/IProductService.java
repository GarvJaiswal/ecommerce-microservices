package org.ecommerce.productcatalogservice.services;

import org.ecommerce.productcatalogservice.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long productId);

    Product createProduct(Product product);

    Product replaceProduct(Long productId, Product product);
}
