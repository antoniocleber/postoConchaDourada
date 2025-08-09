package postoConchaDourada.api.combustivel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;

@Table(name = "tipo_combustivel")
@Entity(name = "TipoCombustivel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoCombustivelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    private String nome;

    @Column(name = "preco_por_litro")
    private BigDecimal precoPorLitro;

}
