package tests.f10_Actions_faker_file;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class F05_ProjeIcindekiDosyaTesti {

    @Test
    public void fileExistTesti(){
        // projemiz icerisinde day10 package'i altinda
        // deneme.txt dosyasinin oldugunu test edin
        String dosyaYolu = "C:\\Users\\Z€YB\\IdeaProjects\\com.127_Junit\\src\\test\\java\\tests\\f10_Actions_faker_file\\deneme.txt";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        //  Herkeste farkli olan kisim ==> user.dir
        //         C:\Users\Z€YB\IdeaProjects\com.127_Junit
        // Herkeste ayni olan kisim ==> projenin icindeki dosya yolu
        //         \src\test\java\tests\f10_Actions_faker_file\deneme.txt;
        String dinamikDosyaYolu = System.getProperty("user.dir") +
                                    "/src/test/java/tests/f10_Actions_faker_file/deneme.txt";

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));



    }
}
