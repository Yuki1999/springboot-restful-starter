package com.neko.seed.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName communist
 */
@TableName(value ="communist")
@Data
public class Communist implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 住址
     */
    private String address;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 工作单位
     */
    private String workPlace;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}