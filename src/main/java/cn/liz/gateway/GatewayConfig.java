package cn.liz.gateway;

import cn.liz.lizrpc.core.registry.RegistryCenter;
import cn.liz.lizrpc.core.registry.liz.LizRegistryCenter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RegistryCenter rc() {
        return new LizRegistryCenter();
    }

}
