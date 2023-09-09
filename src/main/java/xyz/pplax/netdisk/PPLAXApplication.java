package xyz.pplax.netdisk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * @author zhaojun
 */
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@ServletComponentScan(basePackages = {"xyz.pplax.netdisk.core.filter", "xyz.pplax.netdisk.module.storage.filter"})
@ComponentScan(basePackages = "xyz.pplax.netdisk.*")
public class PPLAXApplication {

    public static void main(String[] args) {
        SpringApplication.run(PPLAXApplication.class, args);
    }

}