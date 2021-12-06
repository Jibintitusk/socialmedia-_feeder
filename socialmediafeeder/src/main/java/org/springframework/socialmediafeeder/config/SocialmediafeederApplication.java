package org.springframework.socialmediafeeder.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.socialmediafeeder.signin.SimpleSignInAdapter;

@EnableSocial
@ComponentScan(basePackages ="org.springframework.socialmediafeeder")
@EnableConfigurationProperties
@SpringBootApplication
public class SocialmediafeederApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialmediafeederApplication.class, args);
    }
    @Bean
    public SignInAdapter signInAdapter() {
        return new SimpleSignInAdapter(new HttpSessionRequestCache());
    }


}
