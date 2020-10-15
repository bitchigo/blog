package icu.bitchigo.blog.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("tag")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
}
