package pers.liuliang.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pers.liuliang.springbootmybatis.domain.Album;

import java.util.List;

@Mapper
public interface AlbumMapper {
    @Select("SELECT * FROM album")
    public List<Album> findAll();
}
