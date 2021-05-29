package com.neko.seed.controller;

import com.neko.seed.service.CaseService;
import com.neko.seed.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class CaseController {
    @Autowired
    CaseService caseService;
    @GetMapping(value = "/case/category/num")
    public Result getCommunistSexNum() {
        List<List<Object>> sexNum = caseService.getCategoryNum();
        return new Result().success(sexNum);
    }
}
