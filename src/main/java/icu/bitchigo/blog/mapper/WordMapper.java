package icu.bitchigo.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.bitchigo.blog.pojo.po.Word;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface WordMapper extends BaseMapper<Word> {
}
