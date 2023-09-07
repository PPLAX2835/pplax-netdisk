package xyz.pplax.netdisk;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.pplax.netdisk.module.config.mapper.SystemConfigMapper;
import xyz.pplax.netdisk.module.config.model.entity.SystemConfig;
import xyz.pplax.netdisk.module.link.mapper.ShortLinkMapper;
import xyz.pplax.netdisk.module.link.model.entity.ShortLink;
import xyz.pplax.netdisk.module.readme.mapper.ReadmeConfigMapper;
import xyz.pplax.netdisk.module.readme.model.entity.ReadmeConfig;
import xyz.pplax.netdisk.module.storage.mapper.StorageSourceConfigMapper;
import xyz.pplax.netdisk.module.storage.mapper.StorageSourceMapper;
import xyz.pplax.netdisk.module.storage.model.entity.StorageSourceConfig;

import java.util.ArrayList;
import java.util.List;

import static xyz.pplax.netdisk.module.storage.model.enums.StorageTypeEnum.LOCAL;

@SpringBootTest
class PPLAXNetdiskApplicationTests {

    @Autowired
    SystemConfigMapper systemConfigMapper;
    @Test
    public void SystemConfigMapperTest() {
        List<SystemConfig> all = systemConfigMapper.findAll();
        System.out.println(all);
    }

    @Autowired
    StorageSourceConfigMapper storageSourceConfigMapper;
    @Test
    public void StorageSourceConfigMapperTest() {
        List<StorageSourceConfig> byTypeOrderById = storageSourceConfigMapper.findByTypeOrderById("1");
        System.out.println(byTypeOrderById);

        List<StorageSourceConfig> byStorageIdOrderById = storageSourceConfigMapper.findByStorageIdOrderById(1);
        System.out.println(byStorageIdOrderById);

        storageSourceConfigMapper.deleteByStorageId(1);
        StorageSourceConfig storageSourceConfig = new StorageSourceConfig();
        storageSourceConfig.setStorageId(1);
        storageSourceConfig.setName("pplax");
        storageSourceConfig.setType(LOCAL);
        storageSourceConfig.setTitle("pplax type");
        List<StorageSourceConfig> list= new ArrayList<>();
        list.add(storageSourceConfig);
        storageSourceConfigMapper.insertList(list);

    }


    @Autowired
    StorageSourceMapper storageSourceMapper;
    @Test
    public void StorageSourceMapperTest() {


    }


    @Autowired
    ShortLinkMapper shortLinkMapper;
    @Test
    public void ShortLinkMapperTest() {
        ShortLink byKey = shortLinkMapper.findByKey("1");
        System.out.println(byKey);

    }



    @Autowired
    ReadmeConfigMapper readmeConfigMapper;
    @Test
    public void ReadmeConfigMapperTest() {
        List<ReadmeConfig> byStorageId = readmeConfigMapper.findByStorageId(1);
        System.out.println(byStorageId);

    }
}
