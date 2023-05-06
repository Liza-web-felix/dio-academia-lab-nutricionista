package me.dio.nutricionista.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.nutricionista.lab.entity.Nutricionista;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {

  /**
   *
   * @param dataDeNascimento: data de nascimento dos nutricionistas
   * @return lista com todos os nutricionistas com a data de nascimento passada como parâmetro da função
   */
  List<Nutricionista> findByDataDeNascimento(LocalDate dataDeNascimento);

}
