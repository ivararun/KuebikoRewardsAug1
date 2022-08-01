package com.kuebiko.rewardsProgram.service;

import com.kuebiko.rewardsProgram.dao.RewardsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RewardsService implements RewardsServiceIf {

    @Autowired
    RewardsDao rewardsDao;

    public int getPoints(int purchaseAmount) {

        return rewardsDao.computePoints(purchaseAmount);

    }
}
