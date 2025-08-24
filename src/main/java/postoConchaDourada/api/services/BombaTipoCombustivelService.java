package postoConchaDourada.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postoConchaDourada.api.combustivel.models.BombaTipoCombustivelDO;
import postoConchaDourada.api.combustivel.repositories.BombaCombustivelRepository;
import postoConchaDourada.api.combustivel.repositories.BombaTipoCombustivelRepository;
import postoConchaDourada.api.combustivel.repositories.TipoCombustivelRepository;

import java.math.BigInteger;

@Service
public class BombaTipoCombustivelService {

    @Autowired
    private final TipoCombustivelRepository tipoCombustivelRepository;

    @Autowired
    private final BombaCombustivelRepository bombaCombustivelRepository;

    @Autowired
    private final BombaTipoCombustivelRepository bombaTipoCombustivelRepository;

    public BombaTipoCombustivelService(TipoCombustivelRepository tipoCombustivelRepository, BombaCombustivelRepository bombaCombustivelRepository, BombaTipoCombustivelRepository bombaTipoCombustivelRepository) {
        this.tipoCombustivelRepository = tipoCombustivelRepository;
        this.bombaCombustivelRepository = bombaCombustivelRepository;
        this.bombaTipoCombustivelRepository = bombaTipoCombustivelRepository;
    }


    public void associarBombaComTipoCombustivel(BigInteger bombaId, BigInteger tipoCombustivelId) {

        //para associacao no cadastro criar 2 listas para o front ja trazendo os tipos e as bombas disponiveis
        BombaTipoCombustivelDO bombaTipoCombustivel = new BombaTipoCombustivelDO();

        bombaTipoCombustivel.setBombaId(bombaId);
        bombaTipoCombustivel.setTipoCombustivelId(tipoCombustivelId);
        bombaTipoCombustivelRepository.cadastrarAssociacao(bombaTipoCombustivel);
    }
}
