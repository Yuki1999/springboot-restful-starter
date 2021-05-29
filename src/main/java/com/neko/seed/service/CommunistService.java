package com.neko.seed.service;

import com.neko.seed.entity.po.Communist;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neko.seed.entity.po.CommunistRelation;
import com.neko.seed.entity.vo.CommunistSexNum;

import java.util.List;

/**
 *
 */
public interface CommunistService extends IService<Communist> {
    List<Communist> getRelatedCommunists(String id);
    List<List<Object>> getSexNum();
}
