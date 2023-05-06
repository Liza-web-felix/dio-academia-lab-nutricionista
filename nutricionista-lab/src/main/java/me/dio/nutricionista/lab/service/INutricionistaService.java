package me.dio.nutricionista.lab.service;

import me.dio.nutricionista.lab.entity.Nutricionista;
import me.dio.nutricionista.lab.entity.AvaliacaoFisica;
import me.dio.nutricionista.lab.entity.form.NutricionistaForm;
import me.dio.nutricionista.lab.entity.form.NutricionistaUpdateForm;

import java.time.LocalDate;
import java.util.List;


@SuppressWarnings("unused")
public interface INutricionistaService {
  /**
   * Cria um Nutricionista e salva no banco de dados.
   * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
   * @return Nutricionista recém-criado.
   */
  Nutricionista create(NutricionistaForm form);

  /**
   * Retorna um Nutricionista que está no banco de dados de acordo com seu Id.
   * @param id id do Nutricionista que será exibido.
   * @return Nutricionista de acordo com o Id fornecido.
   */
  Nutricionista get(Long id);

  /**
   * Retorna os Nutricionistas que estão no banco de dados.
   * @return Uma lista os Nutricionistas que estão salvas no DB.
   */
  List<Nutricionista> getAll(String dataDeNascimento);

  /**
   * Atualiza o Nutricionista.
   * @param id id do Nutricionista que será atualizado.
   * @param formUpdate formulário referente aos dados necessários para atualização do Nutricionistas
   * no banco de dados.
   * @return nutricionista recém-atualizado.
   */
  Nutricionista update(Long id, NutricionistaUpdateForm formUpdate);

  /**
   * Deleta um Nutricionista específico.
   * @param id id do Nutricionista que será removido.
   */
  void delete(Long id);

  /**
   *
   * @param id id do nutricionista que será recuperada a lista de avaliações
   * @return uma lista com todas as avaliações do nutricionista de acordo com o Id
   */
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}
