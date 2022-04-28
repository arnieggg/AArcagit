package edu.elp.AArca.service.impl;

import edu.elp.AArca.dao.IProfesorDao;
import edu.elp.AArca.entity.Profesor;
import edu.elp.AArca.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServicelmpl implements IProfesorService {

@Autowired
private IProfesorDao profesorDao;
    @Override
    public List<Profesor> listaProfesor() {

        List<Profesor> profesorList=this.profesorDao.findAll();
        for (Profesor profesor:profesorList){
            System.out.println(profesor.toString());
        }
        return profesorList;
    }

    @Override
    public Profesor obtenerProfesorBysalario(String salario) {
        return null;
    }
}
