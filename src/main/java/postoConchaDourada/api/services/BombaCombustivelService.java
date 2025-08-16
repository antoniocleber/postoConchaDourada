package postoConchaDourada.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postoConchaDourada.api.combustivel.models.BombaCombustivelDO;
import postoConchaDourada.api.combustivel.repositories.BombaCombustivelRepository;

import java.math.BigInteger;

@Service
public class BombaCombustivelService {

    @Autowired
    private final BombaCombustivelRepository bombaCombustivelRepository;

    public BombaCombustivelService(BombaCombustivelRepository bombaCombustivelRepository) {
        this.bombaCombustivelRepository = bombaCombustivelRepository;
    }

    public void cadastrarBombaCombustivel(BombaCombustivelDO bombaCombustivelDO) {
        bombaCombustivelRepository.cadastrar(bombaCombustivelDO);
    }

    public void editarBombaCombustivel(BombaCombustivelDO bombaCombustivelDO, BigInteger id) throws IllegalArgumentException {

        BombaCombustivelDO bombaExistente = bombaCombustivelRepository.buscarPorId(id);

        if (bombaExistente == null) {
            throw new IllegalArgumentException("Bomba de combustível não encontrada");
        }

        bombaExistente.setNome(bombaCombustivelDO.getNome());
        bombaCombustivelRepository.cadastrar(bombaExistente);


    }

    public void deletarBombaCombustivel(BigInteger id) throws IllegalArgumentException {
        BombaCombustivelDO bombaExistente = bombaCombustivelRepository.buscarPorId(id);

        if (bombaExistente == null) {
            throw new IllegalArgumentException("Bomba de combustível não encontrada");
        }

        bombaCombustivelRepository.excluir(id);
    }


}
