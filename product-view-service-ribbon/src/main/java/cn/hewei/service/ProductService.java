package cn.hewei.service;

import cn.hewei.client.ProductClientRibbon;
import cn.hewei.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hewei on 2019/11/9.
 */
@Service
public class ProductService {

    @Autowired
    private ProductClientRibbon productClientRibbon;

    public List<Product> listProducts() {
        return productClientRibbon.listProducts();
    }

}
