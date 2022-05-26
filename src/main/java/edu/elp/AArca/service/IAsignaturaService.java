package edu.elp.AArca.service;

import edu.elp.AArca.entity.Asignatura;

import java.util.List;

public interface IAsignaturaService {
    Asignatura getPersonaByAsignatura(String curso);

    List<Asignatura> curso();

    List<Asignatura> curso(String asignatura);
}
