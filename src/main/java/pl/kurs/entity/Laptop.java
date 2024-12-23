package pl.kurs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "laptop")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nazwa")
    private String name;
    @Column(name = "model")
    private String model;
    @Column(name = "cena")
    private Double price;
    @Column(name = "ilośćSztuk")
    private Integer quantity;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "stan")
    private Condition condition;

    public Laptop(String name, String model, Double price, Integer quantity, Condition condition) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.condition = condition;
    }
}
