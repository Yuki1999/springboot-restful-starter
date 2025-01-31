package com.neko.seed.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.neko.seed.entity.po.CommunistRelation;
import com.neko.seed.entity.vo.RelationVO;
import com.neko.seed.service.CommunistRelationService;
import com.neko.seed.utils.Result;
import com.neko.seed.entity.po.Communist;
import com.neko.seed.service.CommunistService;
import com.neko.seed.websockt.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.EncodeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/organization")
public class CommunistController {
    @Autowired
    private CommunistService communistService;
    @Autowired
    private CommunistRelationService communistRelationService;

    @GetMapping(value = "/communist")
    public Result getCommunist() {
        List<Communist> communists = communistService.list();
        return new Result().success(communists);
    }

    @GetMapping(value = "/communist/{id}")
    public Result getCommunistById(@PathVariable String id) {
        List<Communist> relatedCommunists = communistService.getRelatedCommunists(id);
        return new Result().success(relatedCommunists);
    }

    @PostMapping(value = "/communist")
    public Result addOrUpdateCommunist(@RequestBody Communist communist) {
        communistService.saveOrUpdate(communist);
        return new Result().success(communist);
    }

    @DeleteMapping(value = "/communist/{id}")
    public Result deleteCommunist(@PathVariable String id) {
        communistService.removeById(id);
        QueryWrapper<CommunistRelation> qwp = new QueryWrapper<>();
        qwp.eq("source_id", id).or().eq("target_id", id);
        communistRelationService.remove(qwp);
        return new Result().success();
    }

    @GetMapping(value = "/realtion/show")
    public Result getShowRelation() {
        List<CommunistRelation> relations = communistRelationService.list();
        List<RelationVO> relationVOS = communistRelationService.toVOList(relations);
        return new Result().success(relationVOS);
    }

    @GetMapping(value = "/realtion")
    public Result getRelation() {
        List<CommunistRelation> relations = communistRelationService.getHandledRelations();
        return new Result().success(relations);
    }

    @GetMapping(value = "/relation/{id}")
    public Result getRelationById(@PathVariable String id) {
        List<CommunistRelation> relationList = communistRelationService.getHandledRelationsById(id);
        return new Result().success(relationList);
    }

    @PostMapping(value = "/relation")
    public Result addOrUpdateCommunist(@RequestBody CommunistRelation relation) {
        communistRelationService.saveOrUpdate(relation);
        return new Result().success(relation);
    }

    @DeleteMapping(value = "/relation/{id}")
    public Result deleteRelation(@PathVariable String id) {
        communistRelationService.removeById(id);
        return new Result().success();
    }

    @GetMapping(value = "/communist/sex/num")
    public Result getCommunistSexNum() {
        List<List<Object>> sexNum = communistService.getSexNum();
        return new Result().success(sexNum);
    }
    @GetMapping(value = "/satisfaction")
    public Result getRate() {
        List<List<Object>> chartData=new ArrayList<>();
        List<Object> sexNumOfMale = new ArrayList<>();
        sexNumOfMale.add("satisfied");
        sexNumOfMale.add(90);
        List<Object> sexNumOfNormal = new ArrayList<>();
        sexNumOfNormal.add("normal");
        sexNumOfNormal.add(50);
        List<Object> sexNumOfFemale = new ArrayList<>();
        sexNumOfFemale.add("unsatisfied");
        sexNumOfFemale.add(8);
        chartData.add(sexNumOfMale);
        chartData.add(sexNumOfNormal);
        chartData.add(sexNumOfFemale);
        return new Result().success(chartData);
    }

    @GetMapping("testws")
    public ResponseEntity<Void> testws() throws IOException, EncodeException {
        WebSocketServer.sendInfo("dsadsad", "111");
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
