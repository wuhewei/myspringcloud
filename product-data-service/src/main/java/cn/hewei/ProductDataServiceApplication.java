package cn.hewei;

import brave.sampler.Sampler;
import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * Created by hewei on 2019/11/9.
 */
@EnableEurekaClient
@SpringBootApplication
public class ProductDataServiceApplication {

    public static void main(String[] args) {
        int port = 8005;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.out.printf("端口%d已被占用，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductDataServiceApplication.class).properties("server.port=" + port).run(args);
    }

    /**
     * 配置 Sampler 抽样策略： ALWAYS_SAMPLE 表示持续抽样
     * @return 抽样策略
     */
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
