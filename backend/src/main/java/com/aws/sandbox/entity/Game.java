package com.aws.sandbox.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Game.
 *
 * @author alena.stanisheuskaya
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "game", schema = "sandbox")
public class Game implements BaseEntity<Long> {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, unique = true, length = 256)
    private String title;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;
}
