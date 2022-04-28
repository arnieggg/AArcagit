package edu.elp.AArca.service.impl;

import edu.elp.AArca.dao.IEstudianteDao;
import edu.elp.AArca.entity.Estudiante;
import edu.elp.AArca.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicelmpl  implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listaEstudiantes() {

        List<Estudiante> EstudianteList = this.estudianteDao.findAll();

        for(Estudiante Estudiante:EstudianteList) {
            System.out.println(Estudiante.toString());
        }

        return EstudianteList;
    }

    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {
        return this.estudianteDao.buscarEstudiante(codigo);
    }
}
