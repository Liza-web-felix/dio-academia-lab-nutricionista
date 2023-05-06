package me.dio.nutricionista.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import me.dio.nutricionista.lab.entity.Matricula;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

  /**
   *
   * @param bairro bairro referência para o filtro
   * @return lista de nutricionistas matriculados que residem no bairro passado como parâmetro
   */
  @Query(value = "SELECT * FROM tb_matriculas m " +
      "INNER JOIN tb_nutricionista a ON m.nutricionista_id = a.id " +
      "WHERE a.bairro = :bairro", nativeQuery = true)
  //@Query("FROM Matricula m WHERE m.nutricionista.bairro = :bairro ")
  List<Matricula> findNutricionistasMatriculadosBairro(String bairro);

  //List<Matricula> findByNutricionistaBairro(String bairro);


}
