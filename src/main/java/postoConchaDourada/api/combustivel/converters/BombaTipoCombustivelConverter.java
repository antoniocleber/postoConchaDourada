package postoConchaDourada.api.combustivel.converters;

import postoConchaDourada.api.combustivel.entities.BombaCombustivelEntity;
import postoConchaDourada.api.combustivel.entities.BombaTipoCombustivelEntity;
import postoConchaDourada.api.combustivel.entities.TipoCombustivelEntity;
import postoConchaDourada.api.combustivel.models.BombaTipoCombustivelDO;

public class BombaTipoCombustivelConverter {

    public static BombaTipoCombustivelEntity toEntity(BombaTipoCombustivelDO model) {

        if (model == null) {
            return null;
        }
        BombaTipoCombustivelEntity entity = new BombaTipoCombustivelEntity();
        entity.setId(model.getId());

        BombaCombustivelEntity bombaCombustivelEntity = new BombaCombustivelEntity();
        bombaCombustivelEntity.setId(model.getBombaId());
        entity.setBomba(bombaCombustivelEntity);

        TipoCombustivelEntity tipoCombustivel = new TipoCombustivelEntity();
        tipoCombustivel.setId(model.getTipoCombustivelId());
        entity.setTipoCombustivel(tipoCombustivel);

        return entity;
    }

    public static BombaTipoCombustivelDO toModel(BombaTipoCombustivelEntity entity) {
        if (entity == null) {
            return null;
        }
        BombaTipoCombustivelDO model = new BombaTipoCombustivelDO();
        model.setId(entity.getId());
        if (entity.getBomba() != null) {
            model.setBombaId(entity.getBomba().getId());
        }
        if (entity.getTipoCombustivel() != null) {
            model.setTipoCombustivelId(entity.getTipoCombustivel().getId());
        }
        return model;
    }
}
