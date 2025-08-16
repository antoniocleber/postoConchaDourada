package postoConchaDourada.api.combustivel.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import postoConchaDourada.api.combustivel.entities.TipoCombustivelEntity;

import java.math.BigInteger;

public interface TipoCombustivelJPARepository extends JpaRepository<TipoCombustivelEntity, BigInteger> {
}
