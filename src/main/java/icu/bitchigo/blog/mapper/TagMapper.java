package icu.bitchigo.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.bitchigo.blog.pojo.po.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapper extends BaseMapper<Tag> {
    @Select("select tag.id,tag.name from tag,tag_map where tag.id=tag_map.tag_id and word_id=#{id}")
    public List<Tag> getTags(int id);
}
