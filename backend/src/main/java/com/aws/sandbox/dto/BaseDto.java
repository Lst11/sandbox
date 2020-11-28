package com.aws.sandbox.dto;

import java.io.Serializable;

/**
 * BaseDto.
 *
 * @author alena.stanisheuskaya
 */

public interface BaseDto<T extends Serializable> {

    T getId();
}
