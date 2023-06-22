package me.silvernine.tutorial.config;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity // 기본적인 Web 보안을 활성화 하겠다는 의미
// 추가적인 설정을 위해 WebSecurityConfigurer를 implements하거나 WebSecurityAdapter를 extends하는 방법이 있다.
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
}
