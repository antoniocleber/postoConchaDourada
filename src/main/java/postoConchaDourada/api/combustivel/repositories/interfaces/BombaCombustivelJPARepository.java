package postoConchaDourada.api.combustivel.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import postoConchaDourada.api.combustivel.entities.BombaCombustivelEntity;

import java.math.BigInteger;

public interface BombaCombustivelJPARepository extends JpaRepository<BombaCombustivelEntity, BigInteger> {
}
