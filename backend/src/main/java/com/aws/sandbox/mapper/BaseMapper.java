package com.aws.sandbox.mapper;


import com.aws.sandbox.dto.BaseDto;
import com.aws.sandbox.entity.BaseEntity;

/**
 * BaseMapper.
 *
 * @author alena.stanisheuskaya
 */

public interface BaseMapper<E extends BaseEntity, D extends BaseDto> {

    E dtoToEntity(D dto);

    D entityToDto(E entity);
}
