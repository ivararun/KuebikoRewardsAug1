package com.kuebiko.rewardsProgram.repo;

import com.kuebiko.rewardsProgram.entity.RewardsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardsRepo extends JpaRepository<RewardsEntity, Long> {
}
