package postoConchaDourada.api.combustivel.repositories;

import org.springframework.stereotype.Repository;
import postoConchaDourada.api.combustivel.converters.BombaTipoCombustivelConverter;
import postoConchaDourada.api.combustivel.models.BombaTipoCombustivelDO;
import postoConchaDourada.api.combustivel.repositories.interfaces.BombaTipoCombustivelJPARepository;

@Repository
public class BombaTipoCombustivelRepository {

    private final BombaTipoCombustivelJPARepository bombaTipoCombustivelJPARepository;

    public BombaTipoCombustivelRepository(BombaTipoCombustivelJPARepository bombaTipoCombustivelJPARepository) {
        this.bombaTipoCombustivelJPARepository = bombaTipoCombustivelJPARepository;
    }

    public void cadastrarAssociacao(BombaTipoCombustivelDO bombaTipoCombustivelDO) {
        bombaTipoCombustivelJPARepository.saveAndFlush(BombaTipoCombustivelConverter.toEntity(bombaTipoCombustivelDO));
    }
}
