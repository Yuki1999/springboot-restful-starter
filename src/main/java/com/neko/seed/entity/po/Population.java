package com.neko.seed.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName population
 */
@TableName(value ="population")
@Data
public class Population implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String gender;

    /**
     * 人口类型：1流动人口，2常住人口
     */
    private Integer type;

    /**
     * 户口本户号
     */
    private String familyNo;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String address;

    /**
     * 学历：1小学，2初中，3高中，4专科，5本科，6硕士，7博士
     */
    private String educationBg;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 籍贯
     */
    private String nativePlace;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}