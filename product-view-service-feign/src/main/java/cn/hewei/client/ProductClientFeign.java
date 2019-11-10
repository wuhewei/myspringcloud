package cn.hewei.client;

import cn.hewei.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by hewei on 2019/11/9.
 */
@FeignClient(value = "product-data-service", fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

    @GetMapping("/products")
    List<Product> listProducts();
}
