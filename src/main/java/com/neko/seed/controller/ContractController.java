package com.neko.seed.controller;

import com.neko.seed.entity.po.Contract;
import com.neko.seed.entity.po.PartyOrg;
import com.neko.seed.service.ContractService;
import com.neko.seed.utils.DateUtils;
import com.neko.seed.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;
import java.util.List;

@RestController
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;
//
//    @GetMapping(value = "/category")
//    public Result getContractCategory() {
//        int dqsl = 0;
//        int yy = 0;
//        int ly = 0;
//        int sy = 0;
//        List<Contract> contracts = contractService.list();
//        LocalTime now = LocalTime.now();
//        for (Contract contract : contracts) {
//            if (now.isBefore(DateUtils.dateToLocalTime(contract.getEnddate()))) ;
//            dqsl++;
////            if (now.isAfter(DateUtils.dateToLocalDateTime(contract.getEnddate()))) ;
//        }
////        return new Result().success(partyOrgs);
//    }
//
//}

    public LocalTime UDateToLocalTime() {
        java.util.Date date = new java.util.Date();
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        LocalTime localTime = localDateTime.toLocalTime();
        return localTime;
    }
}

