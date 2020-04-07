package pl.haladyj.zuulservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.haladyj.zuulservice.filter.ErrorFilter;
import pl.haladyj.zuulservice.filter.PostFilter;
import pl.haladyj.zuulservice.filter.PreFilter;
import pl.haladyj.zuulservice.filter.RouteFilter;

@Configuration
public class ZuulConfig {

    @Bean
    public PreFilter preFilter(){
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter(){
        return new PostFilter();
    }

    @Bean
    public RouteFilter routeFilter(){
        return new RouteFilter();
    }

    @Bean
    public ErrorFilter errorFilter(){
        return new ErrorFilter();
    }


}
