package me.dio.nutricionista.lab.controller;

import me.dio.nutricionista.lab.entity.AvaliacaoFisica;
import me.dio.nutricionista.lab.entity.form.AvaliacaoFisicaForm;
import me.dio.nutricionista.lab.service.impl.AvaliacaoFisicaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  private AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAll(){
    return service.getAll();
  }

}
