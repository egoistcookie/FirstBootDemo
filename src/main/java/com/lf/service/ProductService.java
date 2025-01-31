package com.lf.service;

import com.lf.entity.Product;
import com.lf.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // 添加商品
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // 获取所有商品
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 根据 ID 获取商品
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // 更新商品信息
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    // 根据 ID 删除商品
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}