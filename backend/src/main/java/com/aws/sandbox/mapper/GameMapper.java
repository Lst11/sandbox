package com.aws.sandbox.mapper;

import com.aws.sandbox.dto.GameDto;
import com.aws.sandbox.entity.Game;
import org.mapstruct.Mapper;

/**
 * GameMapper.
 *
 * @author alena.stanisheuskaya
 */

@Mapper(componentModel = "spring")
public interface GameMapper extends BaseMapper<Game, GameDto> {
}
