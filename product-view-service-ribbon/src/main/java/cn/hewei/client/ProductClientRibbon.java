package cn.hewei.client;

import cn.hewei.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by hewei on 2019/11/9.
 */
@Component
public class ProductClientRibbon {

    @Autowired
    private RestTemplate restTemplate;

    public List<Product> listProducts() {
        return restTemplate.getForObject("http://product-data-service/products", List.class);
    }
}
