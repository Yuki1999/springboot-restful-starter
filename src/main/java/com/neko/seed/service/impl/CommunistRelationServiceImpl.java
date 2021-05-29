package com.neko.seed.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neko.seed.entity.po.Communist;
import com.neko.seed.entity.po.CommunistRelation;
import com.neko.seed.service.CommunistRelationService;
import com.neko.seed.mapper.CommunistRelationMapper;
import com.neko.seed.service.CommunistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class CommunistRelationServiceImpl extends ServiceImpl<CommunistRelationMapper, CommunistRelation>
        implements CommunistRelationService {
    @Autowired
    CommunistService communistService;

    @Override
    public List<CommunistRelation> getHandledRelationsById(String id) {
        QueryWrapper<CommunistRelation> qwp = new QueryWrapper<>();
        qwp.eq("source_id", id).or().eq("target_id", id);
        List<CommunistRelation> relations = this.list(qwp);
        List<Communist> relatedCommunists = communistService.getRelatedCommunists(id);
        for (CommunistRelation relation : relations) {
            for (Communist communist : relatedCommunists) {
                if (communist.getId() == relation.getSourceId()) {
                    relation.setSourceId(relatedCommunists.indexOf(communist));
                }
                if (communist.getId() == relation.getTargetId()) {
                    relation.setTargetId(relatedCommunists.indexOf(communist));
                }
            }
        }
        return relations;
    }

    @Override
    public List<CommunistRelation> getOriginRelationsById(String id) {
        QueryWrapper<CommunistRelation> qwp = new QueryWrapper<>();
        qwp.eq("source_id", id).or().eq("target_id", id);
        List<CommunistRelation> relations = this.list(qwp);
        return relations;
    }

    @Override
    public List<CommunistRelation> getHandledRelations() {
        List<CommunistRelation> relations = this.list();
        List<Communist> communists = communistService.list();
        for (CommunistRelation relation : relations) {
            for (Communist communist : communists) {
                if (communist.getId() == relation.getSourceId()) {
                    relation.setSourceId(communists.indexOf(communist));
                }
                if (communist.getId() == relation.getTargetId()) {
                    relation.setTargetId(communists.indexOf(communist));
                }
            }
        }
        return relations;
    }
}




