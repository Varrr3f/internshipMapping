package model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long phoneId;

    @OneToOne(fetch = FetchType.LAZY)
    private Client clientId;

    @Basic
    @Column
    private String type;

    @Basic
    @Column
    private String number;
}