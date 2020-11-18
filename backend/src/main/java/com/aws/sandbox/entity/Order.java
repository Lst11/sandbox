package com.aws.sandbox.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Order
 *
 * @author alena.stanisheuskaya
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "order", schema = "sandbox")
public class Order implements BaseEntity<Long> {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "user_game", schema = "sandbox",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "game_id")})
    private List<Game> games;

    @DateTimeFormat(pattern = "dd.MM.yyyy в HH:mm:ss")
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "amount", nullable = false, length = 64)
    private Double amount;

    @Column(name = "delivery_type", length = 64, unique = true)
    private DeliveryType deliveryType;
}
