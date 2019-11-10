package cn.hewei.client;

import cn.hewei.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hewei on 2019/11/10.
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
    @Override
    public List<Product> listProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(-1, "产品数据微服务不可用", 0f));
        return products;
    }
}
