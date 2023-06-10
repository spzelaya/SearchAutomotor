package com.example.SearchAutomotor.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "automotores")
public class Automotor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Character ln;
    private String marca;
    private String descripcion;
    private String tipo;
    private Integer dosmilveintiuno;
    private Integer dosmilveinte;
    private Integer dosmildiecinueve;
    private Integer dosmildieciocho;
    private Integer dosmildiecisiete;
    private Integer dosmildieciseis;
    private Integer dosmilquince;
    private Integer dosmilcatorce;
    private Integer dosmiltrece;
    private Integer dosmildoce;
}
