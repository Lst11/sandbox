package com.aws.sandbox.entity;

import lombok.*;

import javax.persistence.*;

/**
 * User.
 *
 * @author alena.stanisheuskaya
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "user", schema = "sandbox")
public class User implements BaseEntity<Long> {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 64)
    private String name;

    @Column(name = "surname", nullable = false, length = 64)
    private String surname;

    @Column(name = "phone", nullable = false, length = 64)
    private String phone;

    @Column(name = "email", nullable = false, length = 64, unique = true)
    private String email;
}
