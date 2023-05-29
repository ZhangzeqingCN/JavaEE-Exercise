package com.example.a2.config;

import com.example.a2.condition.FalseCondition;
import com.example.a2.filter.JwtFilter;
import com.example.a2.utils.MyAuthenticationManager;
import com.example.a2.utils.MyAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class MySecurityConfiguration{
    /**
     * 配置用户权限组和接口路径的关系
     * 和一些其他配置
     *
     * @param http
     * @throws Exception
     */
    private JwtFilter jwtFilter;

    @Conditional(FalseCondition.class)
    @Bean
    @Deprecated(since = "不推荐的")

    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().requestMatchers("/auth/**");
    }

    @Bean
    public AuthenticationManager authenticationManager() {
        return new MyAuthenticationManager();
    }

    @Bean
    public Customizer<SessionManagementConfigurer<HttpSecurity>> sessionManagementConfigurerCustomizer() {
        return configurer -> configurer.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(auth -> {
            try {
                auth
                        .requestMatchers("/auth/**", "/login").permitAll()
                        .anyRequest().authenticated();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        httpSecurity.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
        return httpSecurity.build();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        return new MyAuthenticationProvider();
    }

    @Autowired
    public void setJwtFilter(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }
}
