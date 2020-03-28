//package org.javaboy.actuator.config;
//
//import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * SecurityConfig
// * 权限配置
// * @author arctic
// * @date 2020/3/27
// **/
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.requestMatcher(EndpointRequest.toAnyEndpoint())
//                .authorizeRequests()
//                .anyRequest().hasRole("admin")
//                .and()
//                .httpBasic();
//    }
//
//}
