package edu.elp.AArca.entity;

import edu.elp.AArca.entity.Direccion;

import javax.persistence.*;

@Entity
@Table(name = "PRO_ASIGNATURA")
public class Profesor_asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprofasignatura;
    private  String idprofesor;
    private String idasignatura;
    private String semestre;

    @OneToOne


    private Direccion Persona;
}
