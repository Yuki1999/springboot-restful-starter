package com.neko.seed.service;

import com.neko.seed.entity.po.Communist;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neko.seed.entity.po.CommunistRelation;

import java.util.List;

/**
 *
 */
public interface CommunistService extends IService<Communist> {
    List<Communist> getRelatedCommunists(String id);

}
