package danekin.yourowndict.server.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ad on 14.05.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("danekin.yourowndict.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
