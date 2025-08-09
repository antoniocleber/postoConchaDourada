package postoConchaDourada.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import postoConchaDourada.api.combustivel.models.TipoCombustivelDO;
import postoConchaDourada.api.combustivel.repositories.TipoCombustivelRepository;

import java.math.BigInteger;
import java.util.List;

@Service
public class TipoCombustivelService {

    @Autowired
    private final TipoCombustivelRepository tipoCombustivelRepository;

    public TipoCombustivelService(TipoCombustivelRepository tipoCombustivelRepository) {
        this.tipoCombustivelRepository = tipoCombustivelRepository;
    }

    public void cadastrarTipoCombustivel(TipoCombustivelDO tipoCombustivelDO) {
        tipoCombustivelRepository.cadastrar(tipoCombustivelDO);
    }

    public void deletarTipoCombustivel(BigInteger id) {
        tipoCombustivelRepository.excluir(id);
    }

    public void editarTipoCombustivel(BigInteger id, TipoCombustivelDO tipoCombustivelDO) {
        TipoCombustivelDO tipoCombustivelDOEditar = tipoCombustivelRepository.buscarPorId(id);
        if (tipoCombustivelDOEditar != null) {
            tipoCombustivelDOEditar.setNome(tipoCombustivelDO.getNome());
            tipoCombustivelDOEditar.setPrecoPorLitro(tipoCombustivelDO.getPrecoPorLitro());
            tipoCombustivelRepository.cadastrar(tipoCombustivelDOEditar);
        } else {
            throw new IllegalArgumentException("Tipo de combustível não encontrado com o ID: " + id);
        }
    }

    public List<TipoCombustivelDO> buscarTipoCombustivel() {
        return tipoCombustivelRepository.buscarTipoCombustivel();
    }


}
