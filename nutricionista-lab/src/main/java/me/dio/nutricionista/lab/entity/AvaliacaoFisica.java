package me.dio.nutricionista.lab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "nutricionista_id")
  private Nutricionista nutricionista;

  @Column(name="peso_atual")
  private Double peso;

  @Column(name="altura_atual")
  private Double altura;
  
  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
}


