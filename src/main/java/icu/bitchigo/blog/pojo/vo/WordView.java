package icu.bitchigo.blog.pojo.vo;

import icu.bitchigo.blog.pojo.po.Classify;
import icu.bitchigo.blog.pojo.po.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WordView {
    private Integer id;
    private String title;
    private String text;
    private String creatTime;
    private String updateTime;
    private List<Tag> tag;
    private Classify classify;
}
