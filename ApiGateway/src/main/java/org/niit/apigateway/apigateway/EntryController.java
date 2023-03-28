package org.niit.apigateway.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class EntryController {

    @Bean
    public RouteLocator getRoute(RouteLocatorBuilder builder){
        return builder.routes().route(p->p.path("/api/userAuthService/**")
                        .uri("http://localhost:8084/")).route(p->p.path("/api/userTrackService/**")
                        .uri("http://localhost:8085/"))
                .build();
    }

}
