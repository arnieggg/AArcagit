package edu.elp.AArca.service;

import edu.elp.AArca.entity.Persona;

import java.util.List;

public interface IPersonaService {
    //Listar personas
    List<Persona> listaPersonas();

    //Buscar persona por su nombre
    Persona obtenerPersonaBynombre(String nombre);
}
