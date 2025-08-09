package postoConchaDourada.api.combustivel.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TipoCombustivelDO {

    
    @NotNull
    @NotBlank
    String nome;

    @NotNull
    @NotBlank
    BigDecimal precoPorLitro;
}
