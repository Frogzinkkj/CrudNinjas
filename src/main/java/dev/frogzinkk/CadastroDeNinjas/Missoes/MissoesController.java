package dev.frogzinkk.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

  private final MissoesService missoesService;

  public MissoesController(MissoesService missoesService) {
    this.missoesService = missoesService;
  }

  @GetMapping("/teste")
  public String teste(){
    return "tudo certo por aqui";
  }

  @PostMapping("/criar")
  public MissoesModel criarNinjas(@RequestBody MissoesModel novaMissao){
    return missoesService.criarMissoes(novaMissao);
  }

  @GetMapping("/exibir")
  public List<MissoesModel> exibirMissoes(){
    return missoesService.exibirMissoes();
  }
  @GetMapping("/exibir/{id}")
  public MissoesModel exibirMissaoID(@PathVariable long id){
    return missoesService.exibirMissaoID(id);
  }


  @PutMapping("/alterar/{id}")
  public MissoesModel alterarMissao(@PathVariable long id, @RequestBody MissoesModel missaoAlterada){
    return missoesService.alterarMissao(id,missaoAlterada);
  }

  //Alterar dados especifico da missao
  @PutMapping("/alterarAtributo/{id}")
  public MissoesModel alterarMissaoAtributo(@PathVariable long id, @RequestBody MissoesModel missoaoAlterada){
    return missoesService.alterarAtributoMissao(id, missoaoAlterada);
  }
  @DeleteMapping("/deletar/{id}")
  public void deletarMissao(@PathVariable long id){
    missoesService.deletarMissao(id);
  }


}
