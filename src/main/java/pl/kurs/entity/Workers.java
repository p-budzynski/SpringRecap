package pl.kurs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Robole")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Workers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "imie")
    private String firstName;
    @Column(name = "nazwisko")
    private String lastName;
    @Column(name = "pensja")
    private Double salary;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "stanowisko")
    private Position position;

    public Workers(String firstName, String lastName, Double salary, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
    }
}
