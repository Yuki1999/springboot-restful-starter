package com.neko.seed.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName case
 */
@TableName(value ="`case`")
@Data
public class Case implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 1人社，2城市管理，3应急管理，4卫健
     */
    private Integer category;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}