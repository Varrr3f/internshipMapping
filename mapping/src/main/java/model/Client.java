package model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Long clientId;

    @Basic
    @Column
    private String firstName;

    @Basic
    @Column
    private String lastName;

    @Basic
    @Column
    private String passportSeries;

    @Basic
    @Column
    private String passportNumber;
}