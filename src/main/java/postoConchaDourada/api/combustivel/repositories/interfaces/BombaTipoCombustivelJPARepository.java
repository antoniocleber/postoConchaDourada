package postoConchaDourada.api.combustivel.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import postoConchaDourada.api.combustivel.entities.BombaTipoCombustivelEntity;

import java.math.BigInteger;

public interface BombaTipoCombustivelJPARepository extends JpaRepository<BombaTipoCombustivelEntity, BigInteger> {
}
