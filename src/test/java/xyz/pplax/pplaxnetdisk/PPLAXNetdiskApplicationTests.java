package xyz.pplax.pplaxnetdisk;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import xyz.pplax.pplaxnetdisk.entity.App;
import xyz.pplax.pplaxnetdisk.entity.Diskfile;
import xyz.pplax.pplaxnetdisk.repository.AppRepository;
import xyz.pplax.pplaxnetdisk.repository.DiskfileRepository;

import java.util.List;

@SpringBootTest
class PPLAXNetdiskApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    AppRepository appRepository;
    @Test
    void AppRepositoryTest() {
        List<App> test1 = appRepository.findbyCode("test1");
        List<App> byCodeAndName = appRepository.findByCodeAndName("test3", "test3");
//        appRepository.deleteAppByCode("test4");
//        Integer pplax = appRepository.updateAppName("PPLAX", 3);
        Iterable<App> all = appRepository.findAll();

        System.out.println(test1);
        System.out.println(byCodeAndName);
//        System.out.println(pplax);
        System.out.println(all);
    }

    @Autowired
    DiskfileRepository diskfileRepository;
    @Test
    void DiskfileRepositoryTest() {

//        Pageable pageable= PageRequest.of(0,5);
//        Page<Diskfile> byAppid = diskfileRepository.findByAppid(1, pageable);
//        System.out.println(byAppid);
    }


}
