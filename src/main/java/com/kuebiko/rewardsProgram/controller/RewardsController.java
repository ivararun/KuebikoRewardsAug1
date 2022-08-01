package com.kuebiko.rewardsProgram.controller;

import com.kuebiko.rewardsProgram.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rewards")
public class RewardsController {

    @Autowired
    RewardsService rewardsService;

    @RequestMapping(method = RequestMethod.GET, path = "/calculatepoints")
    public int calculatePoints(@RequestParam int purchaseAmount){
        return rewardsService.getPoints(purchaseAmount);
    }
}
