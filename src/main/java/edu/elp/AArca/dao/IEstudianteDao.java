package edu.elp.AArca.dao;

import edu.elp.AArca.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estudiante,String> {

    @Query("SELECT p FROM Estudiante p WHERE p.codigo = ?1")
    Estudiante buscarEstudiante(String codigo);

    Estudiante findBynombre(String codigo);
}
