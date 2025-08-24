package postoConchaDourada.api.combustivel.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BombaTipoCombustivelDO {

    private BigInteger id;

    private BigInteger bombaId;

    private BigInteger tipoCombustivelId;
}
