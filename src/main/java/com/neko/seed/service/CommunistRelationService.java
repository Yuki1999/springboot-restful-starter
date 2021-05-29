package com.neko.seed.service;

import com.neko.seed.entity.po.CommunistRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neko.seed.entity.vo.RelationVO;

import java.util.List;

/**
 *
 */
public interface CommunistRelationService extends IService<CommunistRelation> {

    List<CommunistRelation> getOriginRelationsById(String id);
    List<CommunistRelation> getHandledRelationsById(String id);
    List<CommunistRelation> getHandledRelations();
    List<RelationVO> toVOList(List<CommunistRelation> POList);
}
