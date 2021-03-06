package edu.elp.AArca.controller;

import edu.elp.AArca.entity.Asignatura;
import edu.elp.AArca.entity.Estudiante;
import edu.elp.AArca.entity.Persona;
import edu.elp.AArca.entity.Profesor;
import edu.elp.AArca.service.IAsignaturaService;
import edu.elp.AArca.service.IEstudianteService;
import edu.elp.AArca.service.IPersonaService;
import edu.elp.AArca.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("index")
public class Controlador {
    @Autowired
    private IPersonaService personaService;



    @GetMapping("/listaPersona")
    public List<Persona> listaPersona() {
        return this.personaService.listaPersonas();
    }

    @GetMapping("/buscarPersona")
    public Persona buscarPersona(@RequestParam("nombre") String nombre) {
        return this.personaService.obtenerPersonaBynombre(nombre);

    }

       @Autowired
       private IEstudianteService estudianteService;
        @GetMapping("/listaEstudiantes")
        public List<Estudiante>listaEstudiantes(){
            return this.estudianteService.listaEstudiantes();
        }
        @GetMapping("/buscarEstudiante")
        public Estudiante buscarEstudiante(@RequestParam("nombre") String nombre) {
            return this.estudianteService.obtenerEstudianteByNombre(nombre);
        }

    @Autowired
        private IProfesorService profesorService;
         @GetMapping("/listaProfesor")
         public List<Profesor>listaProfesor() {
             return this.profesorService.listaProfesor();
         }
         @Autowired
    private IAsignaturaService asignaturaService;
         @GetMapping("/listaCurso")
    public List<Asignatura>listaCurso(){
             return this.asignaturaService.curso();
         }
}


