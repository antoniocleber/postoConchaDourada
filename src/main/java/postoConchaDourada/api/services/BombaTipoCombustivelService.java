package postoConchaDourada.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postoConchaDourada.api.combustivel.models.BombaCombustivelDO;
import postoConchaDourada.api.combustivel.models.TipoCombustivelDO;
import postoConchaDourada.api.combustivel.repositories.BombaCombustivelRepository;
import postoConchaDourada.api.combustivel.repositories.TipoCombustivelRepository;

import java.math.BigInteger;

@Service
public class BombaTipoCombustivelService {

    @Autowired
    private final TipoCombustivelRepository tipoCombustivelRepository;

    @Autowired
    private final BombaCombustivelRepository bombaCombustivelRepository;

    public BombaTipoCombustivelService(TipoCombustivelRepository tipoCombustivelRepository, BombaCombustivelRepository bombaCombustivelRepository) {
        this.tipoCombustivelRepository = tipoCombustivelRepository;
        this.bombaCombustivelRepository = bombaCombustivelRepository;
    }


    public void associarBombaComTipoCombustivel(BigInteger bombaId, BigInteger tipoCombustivelId) {

        BombaCombustivelDO bomba = bombaCombustivelRepository.buscarPorId(bombaId);
        TipoCombustivelDO tipoCombustivel = tipoCombustivelRepository.buscarPorId(tipoCombustivelId);
        if (bomba == null) {
            throw new IllegalArgumentException("Bomba de combustível não encontrada");
        }

        if (tipoCombustivel == null) {
            throw new IllegalArgumentException("Tipo de combustível não encontrado");
        }
        
        // Aqui você deve implementar a lógica para associar a bomba com o tipo de combustível
        // Exemplo: bomba.setTipoCombustivel(tipoCombustivelRepository.findById(tipoCombustivelId));
        // bombaCombustivelRepository.cadastrar(bomba);
    }
}
