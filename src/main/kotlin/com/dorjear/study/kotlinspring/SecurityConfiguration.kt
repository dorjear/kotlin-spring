package com.dorjear.study.kotlinspring

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.User
import org.springframework.security.provisioning.InMemoryUserDetailsManager


@Configuration
class SecurityConfiguration : WebSecurityConfigurerAdapter() {

    @Bean
    fun inMemoryUserDetailsManager(): InMemoryUserDetailsManager {
        return InMemoryUserDetailsManager(
                User.withUsername("xiulaba").password("{noop}diulama")
                        .authorities("ROLE_USER").build())
    }

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
                .antMatchers("/**").hasRole("USER")
                .and()
                .cors()
                .and()
                .httpBasic()
    }

}
