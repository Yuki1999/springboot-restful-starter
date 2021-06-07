package com.neko.seed.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * null
 * @TableName contract
 */
@TableName(value ="contract")
@Data
public class Contract implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date startdate;

    /**
     * 
     */
    private Date enddate;

    /**
     * 
     */
    private Integer rent;

    /**
     * 
     */
    private String intro;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}