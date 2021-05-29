package com.neko.seed.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neko.seed.utils.Result;
import com.neko.seed.entity.po.Family;
import com.neko.seed.entity.po.Population;
import com.neko.seed.service.FamilyService;
import com.neko.seed.service.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/population")
public class PopulationController {
    @Autowired
    private PopulationService populationService;

    @Autowired
    private FamilyService familyService;

    @GetMapping(value = "/floating")
    public Result getFloatings() {
        QueryWrapper<Population> floatingQWP = new QueryWrapper<>();
        floatingQWP.eq("type", 1);
        List<Population> floatings = populationService.list(floatingQWP);
        return new Result().success(floatings);
    }

    @GetMapping(value = "/residents")
    public Result getResidents() {
        QueryWrapper<Population> floatingQWP = new QueryWrapper<>();
        floatingQWP.eq("type", 2);
        List<Population> residents = populationService.list(floatingQWP);
        return new Result().success(residents);
    }

    @PostMapping(value = "/popu")
    public Result addOrUpdatePopulation(@RequestBody Population population) {
        populationService.saveOrUpdate(population);
        return new Result().success(population);
    }

    @DeleteMapping(value = "/popu/{id}")
    public Result deletePopulation(@PathVariable String id) {
        populationService.removeById(id);
        return new Result().success();
    }

    @GetMapping(value = "/family")
    public Result getFamily() {
        List<Family> family = familyService.list();
        return new Result().success(family);
    }

    @PostMapping(value = "/family")
    public Result addOrUpdateFamily(@RequestBody Family Family) {
        familyService.saveOrUpdate(Family);
        return new Result().success(Family);
    }

    @DeleteMapping(value = "/family/{id}")
    public Result deleteFamily(@PathVariable String id) {
        familyService.removeById(id);
        return new Result().success();
    }

}
