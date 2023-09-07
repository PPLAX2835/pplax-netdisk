package xyz.pplax.netdisk;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.pplax.netdisk.module.config.mapper.SystemConfigMapper;
import xyz.pplax.netdisk.module.config.model.entity.SystemConfig;

import java.util.List;

@SpringBootTest
class PPLAXNetdiskApplicationTests {

    @Autowired
    SystemConfigMapper systemConfigMapper;
    @Test
    public void SystemConfigMapperTest() {
        List<SystemConfig> all = systemConfigMapper.findAll();
        System.out.println(all);
    }

}
