package icu.bitchigo.blog.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@TableName("word")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Word implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String title;
    private String text;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer classify;
}
