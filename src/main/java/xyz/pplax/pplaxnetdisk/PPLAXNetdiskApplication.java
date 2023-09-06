package xyz.pplax.pplaxnetdisk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import xyz.pplax.pplaxnetdisk.property.StorageProperties;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(StorageProperties.class)
public class PPLAXNetdiskApplication {

    public static void main(String[] args) {
        SpringApplication.run(PPLAXNetdiskApplication.class, args);
    }

}
