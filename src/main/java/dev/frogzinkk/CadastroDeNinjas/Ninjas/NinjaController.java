package dev.frogzinkk.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

  private NinjaService ninjaService;

  public NinjaController(NinjaService ninjaService) {
    this.ninjaService = ninjaService;
  }

  @GetMapping("/boasvindas")
  public String boasVindas(){
    return "Boas vindas, 1 msg nessa rota";
  }

  //CRUD

  //Adicionar ninja (CREATE)
  @PostMapping("/criar")
  public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
    return ninjaService.criarNinja(ninja);
  }

  //Mostrar todos os ninjas (READ)
  @GetMapping("/listar")
  public List<NinjaModel> mostrarTodosNinjas(){
    return ninjaService.mostrarNinjas();
  }

  //Mostrar ninja por id (READ)
  @GetMapping("/listar/{id}")
  public NinjaModel mostrarPorId(@PathVariable Long id){
    return ninjaService.mostrarNinjaId(id);
  }

  //Alterar dados do ninja (UPDATE)
  @PutMapping("/alterar/{id}")
  public NinjaModel alterarNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
    return ninjaService.alterarNinjaId(id,ninjaAtualizado);
  }

  //Deletar ninja (DELETE)
  @DeleteMapping("/deletar/{id}")
  public void deletarNinja(@PathVariable Long id){
    ninjaService.deletarNinja(id);
  }



}
