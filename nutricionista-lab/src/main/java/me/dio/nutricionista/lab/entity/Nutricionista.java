package me.dio.nutricionista.lab.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_nutricionistas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Nutricionista {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

private String nome;

  @Column(unique = true)
  private String cpf;

private String bairro;

private LocalDate dataDeNascimento;

  @OneToMany(mappedBy = "nutricionista", cascade = CascadeType.REMOVE , fetch = FetchType.LAZY)
  @JsonIgnore
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
