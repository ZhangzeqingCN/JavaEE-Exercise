//package com.example.a2.config;
//
//import com.example.a2.interceptor.AuthInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class MyInterceptorConfiguration implements WebMvcConfigurer {
//    AuthInterceptor authInterceptor;
//
//    @Autowired
//    public void setAuthInterceptor(AuthInterceptor authInterceptor) {
//        this.authInterceptor = authInterceptor;
//    }

@Configuration
public class MyInterceptorConfiguration implements WebMvcConfigurer {
    AuthInterceptor authInterceptor;

    @Autowired
    public void setAuthInterceptor(AuthInterceptor authInterceptor) {
        this.authInterceptor = authInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(authInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/auth/**", "/test/**", "/css/**", "/favicon.ico","/test/login");
    }
}
