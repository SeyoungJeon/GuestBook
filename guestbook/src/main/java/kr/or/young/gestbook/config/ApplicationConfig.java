package kr.or.young.gestbook.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"kr.or.young.guestbook.dao","kr.or.young.guestbook.service"})
@Import({DBConfig.class})
public class ApplicationConfig {

}
