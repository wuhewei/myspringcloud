package cn.hewei;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by hewei on 2019/11/9.
 */
@EnableConfigServer
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        int port = 8030;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.out.printf("端口%d已被占用，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ConfigServerApplication.class).properties("server.port=" + port).run(args);
    }
}
