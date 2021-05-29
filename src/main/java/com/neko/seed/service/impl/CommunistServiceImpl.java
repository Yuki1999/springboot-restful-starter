package com.neko.seed.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neko.seed.entity.po.Communist;
import com.neko.seed.entity.po.CommunistRelation;
import com.neko.seed.service.CommunistRelationService;
import com.neko.seed.service.CommunistService;
import com.neko.seed.mapper.CommunistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 */
@Service
public class CommunistServiceImpl extends ServiceImpl<CommunistMapper, Communist>
        implements CommunistService {
    @Autowired
    CommunistRelationService relationService;

    @Override
    public List<Communist> getRelatedCommunists(String id) {
        List<CommunistRelation> relationList = relationService.getOriginRelationsById(id);
        QueryWrapper<Communist> qwp = new QueryWrapper<>();
        List<Integer> integerList = new ArrayList<>();
        for (CommunistRelation relation : relationList) {
            if (relation.getSourceId() == Integer.parseInt(id) ||
                    relation.getTargetId() == Integer.parseInt(id)) {
                integerList.add(relation.getSourceId() == Integer.parseInt(id) ?
                        relation.getTargetId() : relation.getSourceId());
            }
        }
        integerList.add(Integer.parseInt(id));
        List<Communist> communists = (List<Communist>) this.listByIds(integerList);
        return communists;
    }


}




