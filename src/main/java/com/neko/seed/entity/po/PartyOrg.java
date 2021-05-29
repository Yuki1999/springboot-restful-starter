package com.neko.seed.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName party_org
 */
@TableName(value ="party_org")
@Data
public class PartyOrg implements Serializable {
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
    private String address;

    /**
     * 
     */
    private String level;

    /**
     * 
     */
    private Double memberSize;

    /**
     * 
     */
    private String intro;

    /**
     * 
     */
    private Integer upid;

    /**
     * 
     */
    private String upName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}