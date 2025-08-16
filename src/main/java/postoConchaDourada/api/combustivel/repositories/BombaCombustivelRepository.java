package postoConchaDourada.api.combustivel.repositories;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import postoConchaDourada.api.combustivel.converters.BombaCombustivelConverter;
import postoConchaDourada.api.combustivel.models.BombaCombustivelDO;
import postoConchaDourada.api.combustivel.repositories.interfaces.BombaCombustivelJPARepository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class BombaCombustivelRepository {

    private final BombaCombustivelJPARepository bombaCombustivelJPARepository;

    public BombaCombustivelRepository(BombaCombustivelJPARepository bombaCombustivelJPARepository) {
        this.bombaCombustivelJPARepository = bombaCombustivelJPARepository;
    }

    @Transactional
    public void cadastrar(BombaCombustivelDO bombaCombustivelDO) {
        bombaCombustivelJPARepository.saveAndFlush(BombaCombustivelConverter.toEntity(bombaCombustivelDO));
    }

    public List<BombaCombustivelDO> findAll() {
        return bombaCombustivelJPARepository.findAll()
                .stream()
                .map(BombaCombustivelConverter::toModel)
                .toList();
    }

    public BombaCombustivelDO buscarPorId(BigInteger id) {
        return BombaCombustivelConverter.toModel(bombaCombustivelJPARepository.findById(id).orElse(null));
    }

    public void excluir(BigInteger id) {
        bombaCombustivelJPARepository.deleteById(id);
    }
}
