package com.seccion5.Data.controller;



@RestController 
@RequestMapping("/api/v1/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService PacienteService;


    @GetMapping
    public ResponseEntity<List<Paciente>> getPaciente(){
        List<Paciente>
        return new ResponseEntity<>(pacienteService.findAll(),HttpStatus.OK);

    }
}