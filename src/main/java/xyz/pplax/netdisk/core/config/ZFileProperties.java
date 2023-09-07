package xyz.pplax.netdisk.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@EnableConfigurationProperties
@Component
@ConfigurationProperties(prefix = "zfile")
public class ZFileProperties {

	private boolean debug;

}