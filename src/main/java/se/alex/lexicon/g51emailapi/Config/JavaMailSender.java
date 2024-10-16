package se.alex.lexicon.g51emailapi.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;


@Configuration
public class JavaMailSender {

    @Bean
    public org.springframework.mail.javamail.JavaMailSender javaMailSender( ) {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        return getJavaMailSender(mailSender);
    }

    public org.springframework.mail.javamail.JavaMailSender getJavaMailSender(JavaMailSenderImpl mailSender) {
        return null;
    }
}