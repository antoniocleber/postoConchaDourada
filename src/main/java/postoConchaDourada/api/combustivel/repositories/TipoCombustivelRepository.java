package postoConchaDourada.api.combustivel.repositories;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import postoConchaDourada.api.combustivel.converters.TipoCombustivelConverter;
import postoConchaDourada.api.combustivel.models.TipoCombustivelDO;

import java.math.BigInteger;
import java.util.List;

@Repository
public class TipoCombustivelRepository {

    private final TipoCombustivelJPARepository tipoCombustivelJPARepository;

    public TipoCombustivelRepository(TipoCombustivelJPARepository tipoCombustivelJPARepository) {
        this.tipoCombustivelJPARepository = tipoCombustivelJPARepository;
    }

    @Transactional
    public void cadastrar(TipoCombustivelDO tipoCombustivelDO) {
        tipoCombustivelJPARepository.saveAndFlush(TipoCombustivelConverter.toEntity(tipoCombustivelDO));
    }

    @Transactional
    public void excluir(BigInteger id) {
        tipoCombustivelJPARepository.delete(tipoCombustivelJPARepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tipo de combustível não encontrado com o ID: " + id)));
    }

    public List<TipoCombustivelDO> buscarTipoCombustivel() {
        return tipoCombustivelJPARepository.findAll()
                .stream()
                .map(TipoCombustivelConverter::toModel)
                .toList();
    }

    public TipoCombustivelDO buscarPorId(BigInteger id) {
        return tipoCombustivelJPARepository.findById(id)
                .map(TipoCombustivelConverter::toModel)
                .orElse(null);
    }


}
