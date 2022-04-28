package edu.elp.AArca.service;

import edu.elp.AArca.entity.Profesor;

import java.util.List;

public interface IProfesorService {

    List<Profesor> listaProfesor();

    Profesor obtenerProfesorBysalario(String salario );

}
