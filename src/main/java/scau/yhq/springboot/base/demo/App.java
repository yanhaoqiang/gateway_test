package scau.yhq.springboot.base.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yanhaoqiang
 * @date 2022-03-28
 */
@SpringBootApplication(scanBasePackages = {"scau.yhq.springboot.base.demo.*"})
public class App {
    private final Logger log = LoggerFactory.getLogger(App.class);

    @Value("${foo.bar}")
    private String value;

    @PostConstruct
    public void init() {
        log.info("value from nacos: {}", value);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
