package com.neko.seed.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName family
 */
@TableName(value ="family")
@Data
public class Family implements Serializable {
    /**
     * 户号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String familyNo;

    /**
     * 户主姓名
     */
    private String name;

    /**
     * 住址
     */
    private String address;

    /**
     * 户别：1居民户口，2农村户口
     */
    private String type;

    /**
     * 户口登记机关
     */
    private String regiAuth;

    /**
     * 承办人
     */
    private String contractor;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}