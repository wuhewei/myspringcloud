package cn.hewei.service;

import cn.hewei.client.ProductClientFeign;
import cn.hewei.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hewei on 2019/11/9.
 */
@Service
public class ProductService {

    @Autowired
    private ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProducts();
    }
}
