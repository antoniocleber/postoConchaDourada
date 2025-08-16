package postoConchaDourada.api.combustivel.converters;

import postoConchaDourada.api.combustivel.entities.BombaCombustivelEntity;
import postoConchaDourada.api.combustivel.models.BombaCombustivelDO;

public class BombaCombustivelConverter {

    public static BombaCombustivelEntity toEntity(BombaCombustivelDO bombaCombustivelDO) {
        if (bombaCombustivelDO == null) {
            return null;
        }
        BombaCombustivelEntity entity = new BombaCombustivelEntity();
        entity.setId(bombaCombustivelDO.getId());
        entity.setNome(bombaCombustivelDO.getNome());
        return entity;
    }

    public static BombaCombustivelDO toModel(BombaCombustivelEntity bombaCombustivelEntity) {
        if (bombaCombustivelEntity == null) {
            return null;
        }
        BombaCombustivelDO bombaCombustivelDO = new BombaCombustivelDO();
        bombaCombustivelDO.setId(bombaCombustivelEntity.getId());
        bombaCombustivelDO.setNome(bombaCombustivelEntity.getNome());
        return bombaCombustivelDO;
    }
}
