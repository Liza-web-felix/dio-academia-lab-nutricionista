package me.dio.nutricionista.lab.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  //@Positive(message = "O Id do nutricionista precisa ser positivo.")

	private Long nutricionistaId;

  //@NotNull(message = "Preencha o campo corretamente.")
  //@Positive(message = "${validatedValue}' precisa ser positivo.")

	private double peso;

  //@NotNull(message = "Preencha o campo corretamente.")
  //@Positive(message = "${validatedValue}' precisa ser positivo.")
  //@DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")

	private double altura;

	public Long getNutricionistaId() {
		return null;
	}

	public Double getPeso() {
		return null;
	}

	public Double getAltura() {
		return null;
	}
}

