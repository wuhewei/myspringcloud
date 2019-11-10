package cn.hewei.web;

import cn.hewei.pojo.Product;
import cn.hewei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hewei on 2019/11/9.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> products = productService.listProducts();
        m.addAttribute("products", products);
        return "products";
    }
}
