package pers.liuliang.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.liuliang.springbootmybatis.domain.Album;

import java.util.List;

@Mapper
public interface AlbumXmlMapper {
    public List<Album> findAll();
}
