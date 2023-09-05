package xyz.pplax.pplaxnetdisk;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.pplax.pplaxnetdisk.io.PPLAXFile;

@SpringBootTest
class PPLAXNetdiskApplicationTests {

    @Test
    void firstTest() {
        System.out.println("Hello World!");
    }

    @Test
    void PPLAXFileTest() {
        PPLAXFile pplaxFile = new PPLAXFile("G:\\tmp", true);
        System.out.println(pplaxFile.getParent());
    }

}
