package cn.hewei.service;

import cn.hewei.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hewei on 2019/11/9.
 */
@Service
public class ProductService {

    // 通过端口号可以区分不同的微服务提供数据
    @Value("${server.port}")
    private int port;

    public List<Product> listProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1001, "西瓜 from port:" + port, 5.9f));
        products.add(new Product(1002, "葡萄 from port:" + port, 16.9f));
        products.add(new Product(1003, "香蕉 from port:" + port, 3.9f));
        return products;
    }
}
