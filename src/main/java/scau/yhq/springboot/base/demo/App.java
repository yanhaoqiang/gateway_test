package scau.yhq.springboot.base.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * @author yanhaoqiang
 * @date 2022-03-28
 */
@SpringBootApplication
@ComponentScan({"scau.yhq.springboot.base.demo.*"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
