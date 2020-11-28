package com.aws.sandbox.service;

import com.aws.sandbox.dto.GameDto;
import com.aws.sandbox.entity.Game;
import com.aws.sandbox.mapper.GameMapper;
import com.aws.sandbox.repository.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * GameService.
 *
 * @author alena.stanisheuskaya
 */

@Transactional(readOnly = true)
@Service
public class GameService extends BaseService<Game, GameDto, GameRepository, GameMapper> {

    public GameService(GameRepository repository, GameMapper mapper) {
        super(repository, mapper);
    }
}
