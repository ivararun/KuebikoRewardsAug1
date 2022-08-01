package com.kuebiko.rewardsProgram.dao;

import com.kuebiko.rewardsProgram.entity.RewardsEntity;
import com.kuebiko.rewardsProgram.repo.RewardsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RewardsDao implements RewardsDaoIf {

    @Autowired
    RewardsRepo rewardsRepo;

    public int computePoints(int purchaseAmount) {

        int points = 0;

        if (purchaseAmount > 50) {
            points = 1 * (purchaseAmount - 50);
        }
        if (purchaseAmount > 100) {
            points = 2 * (purchaseAmount - 100) + (1 * (100 - 50));
        }

        RewardsEntity rewardsEntity = new RewardsEntity();
        rewardsEntity.setPurchaseAmount(purchaseAmount);
        rewardsEntity.setPoints(points);

        rewardsRepo.save(rewardsEntity);

        return points;
    }


}
