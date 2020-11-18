package com.aws.sandbox.repository;

import com.aws.sandbox.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * GameRepository.
 *
 * @author alena.stanisheuskaya
 */

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
