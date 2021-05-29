package com.neko.seed.service;

import com.neko.seed.entity.po.Case;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface CaseService extends IService<Case> {
    List<List<Object>> getCategoryNum();
}
