package me.dio.nutricionista.lab.controller;

import me.dio.nutricionista.lab.entity.Nutricionista;
import me.dio.nutricionista.lab.entity.AvaliacaoFisica;
import me.dio.nutricionista.lab.entity.form.NutricionistaForm;
import me.dio.nutricionista.lab.service.impl.NutricionistaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/nutricionistas")
public class NutricionistaController {

  @Autowired
  private NutricionistaServiceImpl service;

  @PostMapping
  public Nutricionista create(@Valid @RequestBody NutricionistaForm form) {
    return service.create(form);
  }

  @GetMapping("/avaliacoes/{id}")
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
    return service.getAllAvaliacaoFisicaId(id);
  }

  @GetMapping
  public List<Nutricionista> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                  String dataDeNacimento){
    return service.getAll(dataDeNacimento);
  }


}
