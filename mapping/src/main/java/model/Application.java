package model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long appId;

    @Basic
    @Column
    private int number;

    @Basic
    @Column
    private int amount;

    @Basic
    @Column
    private String currency;

    @OneToOne(fetch = FetchType.LAZY)
    private Client applicantId;

    @OneToOne(fetch = FetchType.LAZY)
    private Client guarantorId;
}
