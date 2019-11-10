package cn.hewei.web;

import cn.hewei.pojo.Product;
import cn.hewei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hewei on 2019/11/9.
 */
@Controller
@RefreshScope
public class ProductController {

    @Value("${version}")
    private String version;

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> products = productService.listProducts();
        m.addAttribute("products", products);
        m.addAttribute("version", version);
        return "products";
    }

}
