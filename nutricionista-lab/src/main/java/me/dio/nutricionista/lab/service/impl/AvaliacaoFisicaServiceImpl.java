package me.dio.nutricionista.lab.service.impl;

import me.dio.nutricionista.lab.entity.Nutricionista;
import me.dio.nutricionista.lab.entity.AvaliacaoFisica;
import me.dio.nutricionista.lab.entity.form.AvaliacaoFisicaForm;
import me.dio.nutricionista.lab.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.nutricionista.lab.repository.NutricionistaRepository;
import me.dio.nutricionista.lab.repository.AvaliacaoFisicaRepository;
import me.dio.nutricionista.lab.service.IAvaliacaoFisicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

  @Autowired
  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Autowired
  private NutricionistaRepository nutricionistaRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Nutricionista nutricionista = nutricionistaRepository.findById(form.getNutricionistaId()).get();

    avaliacaoFisica.setNutricionista(nutricionista);
    avaliacaoFisica.setPeso(form.getPeso());
    avaliacaoFisica.setAltura(form.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return null;
  }

  @Override
  public List<AvaliacaoFisica> getAll() {

    return avaliacaoFisicaRepository.findAll();
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
