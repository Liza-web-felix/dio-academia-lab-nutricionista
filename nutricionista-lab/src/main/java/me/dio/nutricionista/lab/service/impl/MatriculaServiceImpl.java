package me.dio.nutricionista.lab.service.impl;

import me.dio.nutricionista.lab.entity.Nutricionista;
import me.dio.nutricionista.lab.entity.Matricula;
import me.dio.nutricionista.lab.entity.form.MatriculaForm;
import me.dio.nutricionista.lab.repository.NutricionistaRepository;
import me.dio.nutricionista.lab.repository.MatriculaRepository;
import me.dio.nutricionista.lab.service.IMatriculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

  @Autowired
  private MatriculaRepository matriculaRepository;

  @Autowired
  private NutricionistaRepository nutricionistaRepository;

  @Override
  public Matricula create(MatriculaForm form) {
    Matricula matricula = new Matricula();
    Nutricionista nutricionista = nutricionistaRepository.findById(form.getNutricionistaId()).get();

    matricula.setNutricionista(nutricionista);

    return matriculaRepository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return matriculaRepository.findById(id).get();
  }

  @Override
  public List<Matricula> getAll(String bairro) {

    if(bairro == null){
      return matriculaRepository.findAll();
    }else{
      return matriculaRepository.findNutricionistasMatriculadosBairro(bairro);
    }

  }

  @Override
  public void delete(Long id) {}



}
