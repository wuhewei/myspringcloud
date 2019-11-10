package cn.hewei;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by hewei on 2019/11/10.
 */
@EnableHystrixDashboard
@SpringBootApplication
public class ProductServiceHystrixDashboardApplication {
    public static void main(String[] args) {
        int port = 8020;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.out.printf("端口%d已被占用，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductServiceHystrixDashboardApplication.class).properties("server.port=" + port).run(args);
    }
}
