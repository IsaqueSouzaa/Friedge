package dev.isaque.Friedge.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table (name = "food_table")
// O Model representa a minha tabela no banco de dados
public class Food {

    @Id
    // Passo a estrategia que será usada para gerar o Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate experationDate;
    private Integer quantity;

    public Food() {}

    public Food(Long id, String name, LocalDate experationDate, Integer quantity) {
        this.id = id;
        this.name = name;
        this.experationDate = experationDate;
        this.quantity = quantity;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(LocalDate experationDate) {
        this.experationDate = experationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

