package postoConchaDourada.api.combustivel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Table(name = "bomba_tipo_combustivel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BombaTipoCombustivelEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @ManyToOne
    @JoinColumn(name = "bomba_id", referencedColumnName = "id")
    private BombaCombustivelEntity bomba;


    @ManyToOne
    @JoinColumn(name = "tipo_combustivel_id", referencedColumnName = "id")
    private TipoCombustivelEntity tipoCombustivel;
}
