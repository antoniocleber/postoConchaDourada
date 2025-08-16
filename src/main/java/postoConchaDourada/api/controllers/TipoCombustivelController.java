package postoConchaDourada.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import postoConchaDourada.api.combustivel.models.TipoCombustivelDO;
import postoConchaDourada.api.services.TipoCombustivelService;

import java.math.BigInteger;
import java.util.List;


@RestController
@RequestMapping("/tipo-combustivel")
public class TipoCombustivelController {

    @Autowired
    TipoCombustivelService tipoCombustivelService;

    @GetMapping
    public ResponseEntity<List<TipoCombustivelDO>> buscarTipoCombustivel() {
        return ResponseEntity.ok(tipoCombustivelService.buscarTipoCombustivel());
    }

    @PostMapping
    public ResponseEntity<String> cadastrarTipoCombustivel(@RequestBody TipoCombustivelDO tipoCombustivelDO) {
        tipoCombustivelService.cadastrarTipoCombustivel(tipoCombustivelDO);
        return ResponseEntity.ok("Tipo de combustível cadastrado com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> editarTipoCombustivel(@PathVariable("id") BigInteger id, @RequestBody TipoCombustivelDO tipoCombustivelDO) throws Exception {
        tipoCombustivelService.editarTipoCombustivel(id, tipoCombustivelDO);
        return ResponseEntity.ok("Tipo de combustível editado com sucesso!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarTipoCombustivel(@PathVariable("id") BigInteger id) {
        tipoCombustivelService.deletarTipoCombustivel(id);
        return ResponseEntity.ok("Tipo de combustível deletado com sucesso!");
    }

}
