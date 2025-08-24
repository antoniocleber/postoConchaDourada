package postoConchaDourada.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import postoConchaDourada.api.combustivel.models.BombaCombustivelDO;
import postoConchaDourada.api.combustivel.models.BombaTipoCombustivelDO;
import postoConchaDourada.api.services.BombaCombustivelService;
import postoConchaDourada.api.services.BombaTipoCombustivelService;

import java.math.BigInteger;

@RestController
@RequestMapping("/bomba-combustivel")
public class BombaCombustivelController {

    @Autowired
    BombaCombustivelService bombaCombustivelService;

    @Autowired
    BombaTipoCombustivelService bombaTipoCombustivelService;

    @PostMapping
    public ResponseEntity<String> cadastrarBombaCombustivel(@RequestBody BombaCombustivelDO bombaCombustivelDO) {
        bombaCombustivelService.cadastrarBombaCombustivel(bombaCombustivelDO);
        return ResponseEntity.ok("Bomba de combustível cadastrada com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> editarBombaCombustivel(@RequestBody BombaCombustivelDO bombaCombustivelDO, @PathVariable("id") BigInteger id) {
        bombaCombustivelService.editarBombaCombustivel(bombaCombustivelDO, id);
        return ResponseEntity.ok("Bomba de combustível editada com sucesso!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarBombaCombustivel(@PathVariable("id") BigInteger id) throws Exception {
        bombaCombustivelService.deletarBombaCombustivel(id);
        return ResponseEntity.ok("Bomba de combustível deletada com sucesso!");
    }

    @PostMapping("/associar")
    public ResponseEntity<String> associarBombaComTipoCombustivel(@RequestBody BombaTipoCombustivelDO bombaTipoCombustivelDO) {
        bombaTipoCombustivelService.associarBombaComTipoCombustivel(bombaTipoCombustivelDO.getBombaId(), bombaTipoCombustivelDO.getTipoCombustivelId());
        return ResponseEntity.ok("Bomba de combustível associada com sucesso!");
    }
}
