package postoConchaDourada.api.combustivel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Table(name = "bomba_combustivel")
@Entity(name = "BombaCombustivel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BombaCombustivelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    private String nome;

}
