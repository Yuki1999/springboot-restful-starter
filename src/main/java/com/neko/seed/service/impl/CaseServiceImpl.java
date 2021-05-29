package com.neko.seed.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neko.seed.entity.po.Case;
import com.neko.seed.service.CaseService;
import com.neko.seed.mapper.CaseMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class CaseServiceImpl extends ServiceImpl<CaseMapper, Case>
        implements CaseService {
    @Override
    public List<List<Object>> getCategoryNum() {
        List<Case> cases = list();
        int numOfRS = 0, numOfCSGL = 0, numOfYJGL = 0, numOfWJ = 0;
        for (Case caze : cases) {
            if (null != caze.getCategory()) {
                switch (caze.getCategory()) {
                    case 1:
                        numOfRS++;
                        break;
                    case 2:
                        numOfCSGL++;
                        break;
                    case 3:
                        numOfYJGL++;
                        break;
                    case 4:
                        numOfWJ++;
                        break;
                    default:
                        break;
                }
            }
        }
        List<List<Object>> chartData = new ArrayList<>();
        List<Object> NumOfRS = new ArrayList<>();
        NumOfRS.add("rs");
        NumOfRS.add(numOfRS);
        List<Object> NumOfCSGL = new ArrayList<>();
        NumOfCSGL.add("csgl");
        NumOfCSGL.add(numOfCSGL);
        List<Object> NumOfYJGL = new ArrayList<>();
        NumOfYJGL.add("yjgl");
        NumOfYJGL.add(numOfYJGL);
        List<Object> NumOfWJ = new ArrayList<>();
        NumOfWJ.add("wj");
        NumOfWJ.add(numOfWJ);
        chartData.add(NumOfRS);
        chartData.add(NumOfCSGL);
        chartData.add(NumOfYJGL);
        chartData.add(NumOfWJ);
        return chartData;
    }
}




