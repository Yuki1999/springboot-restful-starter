package com.neko.seed.mapper;

import com.neko.seed.entity.po.CommunistRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity com.neko.seed.entity.po.CommunistRelation
 */
@Mapper
public interface CommunistRelationMapper extends BaseMapper<CommunistRelation> {
    CommunistRelation getRelationById(String id);
}




