package edu.elp.AArca.service;

import edu.elp.AArca.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {
    List<Estudiante> listaEstudiantes();



    Estudiante obtenerEstudianteByNombre(String nombre);
}
