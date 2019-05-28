package br.gov.sc.ibirama.RotaAPI.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Soares
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
       auth.inMemoryAuthentication().withUser("ibiramaPrefeitura").password("{noop}prefeituraIbirama2019psw").roles("USER");
        //auth.inMemoryAuthentication().withUser("ibiramaPrefeitura").password(passwordEncoder().encode("prefeituraIbirama2019psw")).roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/rotasIbirama").permitAll()
                .antMatchers("/rotasIbirama/filter").permitAll()
                .antMatchers(HttpMethod.OPTIONS, "/upload").permitAll().anyRequest().authenticated()
                .anyRequest().authenticated()
                .and().httpBasic()
                .and().csrf().disable();
    }

//    @Bean
//    static PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
