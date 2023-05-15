package pers.liuliang.springbootmybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.liuliang.springbootmybatis.domain.Album;
import pers.liuliang.springbootmybatis.mapper.AlbumMapper;
import pers.liuliang.springbootmybatis.mapper.AlbumXmlMapper;

import java.util.List;

@SpringBootTest
class SpringBootMybatisApplicationTests {
    @Autowired
    private AlbumMapper albumMapper;
    @Autowired
    private AlbumXmlMapper albumXmlMapper;

    @Test
    public void testFindAll() {
        List<Album> albums = albumMapper.findAll();
        for (Album album : albums) {
            System.out.println(album);
        }
    }

    @Test
    public void testXmlFindAll() {
        List<Album> albums = albumXmlMapper.findAll();
        for (Album album : albums) {
            System.out.println(album);
        }
    }
}
