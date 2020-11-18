package com.aws.sandbox.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * GameDto.
 *
 * @author alena.stanisheuskaya
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameDto implements BaseDto<Long> {

    private Long id;

    @NotBlank
    private String title;

    private String description;

    @NotNull
    private Double price;
}
