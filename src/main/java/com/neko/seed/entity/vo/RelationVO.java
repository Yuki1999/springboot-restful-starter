package com.neko.seed.entity.vo;

import lombok.Data;

@Data
public class RelationVO {
    private Integer id;
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
    private String sourceName;
    private String targetName;
}
