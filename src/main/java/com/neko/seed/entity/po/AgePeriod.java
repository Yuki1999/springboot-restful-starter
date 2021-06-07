package com.neko.seed.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * null
 *
 * @TableName age_period
 */
@TableName(value = "age_period")
@Data
public class AgePeriod implements Serializable {
    /**
     *
     */
    @TableId
    private String state;

    /**
     *
     */
    private Double underFive;

    /**
     *
     */
    private Double fiveToThirteen;

    /**
     *
     */
    private Double fourteenToSeventeen;

    /**
     *
     */
    private Double eighteenToTwentyFour;

    /**
     *
     */
    private Double twentyFiveToFiftyFour;

    /**
     *
     */
    private Double fiftyFiveToSixtyFour;

    /**
     *
     */
    private Double overSixtyFive;

    @TableField(exist = false)
    private Double total;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}