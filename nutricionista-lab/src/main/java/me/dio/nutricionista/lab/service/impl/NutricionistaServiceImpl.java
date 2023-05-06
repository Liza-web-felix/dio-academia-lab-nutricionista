package me.dio.nutricionista.lab.service.impl;

import me.dio.nutricionista.lab.entity.Nutricionista;
import me.dio.nutricionista.lab.entity.AvaliacaoFisica;
import me.dio.nutricionista.lab.entity.form.NutricionistaForm;
import me.dio.nutricionista.lab.entity.form.NutricionistaUpdateForm;
import me.dio.nutricionista.lab.infra.utils.JavaTimeUtils;
import me.dio.nutricionista.lab.repository.NutricionistaRepository;
import me.dio.nutricionista.lab.service.INutricionistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class NutricionistaServiceImpl implements INutricionistaService {

  @Autowired
  private NutricionistaRepository repository;

  @Override
  public Nutricionista create(NutricionistaForm form) {
    Nutricionista nutricionista = new Nutricionista();
    nutricionista.setNome(form.getNome());
    nutricionista.setCpf(form.getCpf());
    nutricionista.setBairro(form.getBairro());
    nutricionista.setDataDeNascimento(form.getDataDeNascimento());

    return repository.save(nutricionista);
  }

  @Override
  public Nutricionista get(Long id) {
    return null;
  }

  @Override
  public List<Nutricionista> getAll(String dataDeNascimento) {

    if(dataDeNascimento == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByDataDeNascimento(localDate);
    }

  }

  @Override
  public Nutricionista update(Long id, NutricionistaUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {
  }

  @Override
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

    Nutricionista nutricionista = repository.findById(id).get();

    return  nutricionista.getAvaliacoes();

  }

}
