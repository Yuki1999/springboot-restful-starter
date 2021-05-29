package com.neko.seed.controller;
import com.neko.seed.utils.Result;
import com.neko.seed.entity.po.PartyOrg;
import com.neko.seed.service.PartyOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/org")
public class PartyOrgController {
    @Autowired
    private PartyOrgService partyOrgService;

    @GetMapping(value = "/party-org")
    public Result getPartyOrg() {
        List<PartyOrg> partyOrgs = partyOrgService.list();
        return new Result().success(partyOrgs);
    }

    @PostMapping(value = "/party-org")
    public Result addOrUpdatePartyOrg(@RequestBody PartyOrg partyOrg) {
        partyOrgService.saveOrUpdate(partyOrg);
        return new Result().success(partyOrg);
    }

    @DeleteMapping(value = "/party-org/{id}")
    public Result deletePartyOrg(@PathVariable String id) {
        partyOrgService.removeById(id);
        return new Result().success();
    }
}
