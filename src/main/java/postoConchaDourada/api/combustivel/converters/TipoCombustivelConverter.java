package postoConchaDourada.api.combustivel.converters;

import postoConchaDourada.api.combustivel.entities.TipoCombustivelEntity;
import postoConchaDourada.api.combustivel.models.TipoCombustivelDO;

public class TipoCombustivelConverter {

    public static TipoCombustivelEntity toEntity(TipoCombustivelDO tipoCombustivelDO) {

        if (tipoCombustivelDO == null) {
            return null;
        }

        TipoCombustivelEntity entity = new TipoCombustivelEntity();

        entity.setId(tipoCombustivelDO.getId());
        entity.setNome(tipoCombustivelDO.getNome());
        entity.setPrecoPorLitro(tipoCombustivelDO.getPrecoPorLitro());

        return entity;
    }

    public static TipoCombustivelDO toModel(TipoCombustivelEntity entity) {

        if (entity == null) {
            return null;
        }

        TipoCombustivelDO model = new TipoCombustivelDO();

        model.setId(entity.getId());
        model.setNome(entity.getNome());
        model.setPrecoPorLitro(entity.getPrecoPorLitro());

        return model;
    }

}
