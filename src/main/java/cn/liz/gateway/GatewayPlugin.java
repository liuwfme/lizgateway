package cn.liz.gateway;

import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public interface GatewayPlugin {

    public static String GATEWAY_PREFIX = "/gw";

    void start();

    void stop();

    String getName();

    boolean support(ServerWebExchange exchange);

    Mono<Void> handle(ServerWebExchange exchange,GatewayPluginChain chain);
}
