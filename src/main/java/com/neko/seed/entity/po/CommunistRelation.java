package com.neko.seed.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName communist_relation
 */
@TableName(value ="communist_relation")
@Data
public class CommunistRelation implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer sourceId;

    /**
     * 
     */
    private Integer targetId;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private Double value;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}