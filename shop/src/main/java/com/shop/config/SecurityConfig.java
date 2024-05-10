package com.shop.config;

import com.shop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    MemberService memberService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.formLogin(form -> form
                .loginPage("/members/login") //로그인 페이지 URL 설정
                .defaultSuccessUrl("/") //로그인 성공 시 이동할 URL 설정
                .usernameParameter("email") //로그인 시 사용할 파라미터 이름으로 email을 지정
                .failureUrl("/members/login/error") //로그인 실패 시 이동할 URL을 설정
        )
        .logout(logout -> logout
                //로그 아웃 URL을 설정
                .logoutRequestMatcher(new AntPathRequestMatcher("/members/logout"))
                .logoutSuccessUrl("/") //로그아웃 성공 시 이동할 URL을 설정
        );
        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() { //비밀번호 암호화를 위해 passwordEncoder를 지정

        return new BCryptPasswordEncoder();
    }
}
