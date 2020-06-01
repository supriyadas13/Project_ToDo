package com.supriya.spring.boot.datastore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("SUPRIYA").password(passwordEncoder().encode("das123"))
                .authorities("ROLE_USER");
        auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("admin123"))
                .authorities("ROLE_USER", "ROLE_ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
              .authorizeRequests().antMatchers("/**").hasRole("USER").and().httpBasic()
              .and()
              .csrf().disable();

        //http.authorizeRequests().anyRequest().authenticated().and()
        //   .httpBasic();
    }
    /*
    @Autowired
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
        .inMemoryAuthentication()
            .withUser("supriya").password(passwordEncoder().encode("test123")).roles("USER");
                //.withUser("admin").password(passwordEncoder().encode("admin123")).roles("ADMIN")
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            //.csrf().disable()
            .authorizeRequests().anyRequest().permitAll().anyRequest().authenticated()
            //.antMatchers("/to-do-list/*").hasRole("ADMIN")
            //.antMatchers("/h2console/**").permitAll()
            //.antMatchers("/to-do-list/getTasks/*").hasRole("USER")
            //.antMatchers("/to-do-list/*").permitAll().anyRequest().permitAll().anyRequest().authenticated()
            .and().httpBasic()
            ;
 
    }
    */
 
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}