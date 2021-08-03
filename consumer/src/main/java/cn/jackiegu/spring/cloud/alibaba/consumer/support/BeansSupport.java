package cn.jackiegu.spring.cloud.alibaba.consumer.support;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Spring Bean 实例支持类
 *
 * @author JackieGu
 * @date 2021/8/3
 */
@Component
public class BeansSupport {

    /**
     * RestTemplate Bean
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        // 设置超时时间
        // SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        // factory.setConnectTimeout(2000);
        // factory.setReadTimeout(3000);
        // return new RestTemplate(factory);

        return new RestTemplate();
    }
}
