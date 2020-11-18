package com.aws.sandbox.entity;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * BaseEntity.
 *
 * @author alena.stanisheuskaya
 */

@MappedSuperclass
public interface BaseEntity<T extends Serializable> {

    T getId();
}
