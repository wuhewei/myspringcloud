package cn.hewei.web;

import cn.hewei.pojo.Product;
import cn.hewei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hewei on 2019/11/9.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Object products() {
        List<Product> products = productService.listProducts();
        return products;
    }
}
