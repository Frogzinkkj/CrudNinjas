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
  public String criarNinja(){
    return "ninja Criado";
  }

  //Mostrar todos os ninjas (READ)
  @GetMapping("/listar")
  public List<NinjaModel> mostrarTodosNinjas(){
    return ninjaService.mostrarNinjas();
  }

  //Mostrar ninja por id (READ)
  @GetMapping("/allID")
  public String mostrarPorId(){
    return "Mostrar por Id";
  }

  //Alterar dados do ninja (UPDATE)
  @PutMapping("/alterar")
  public String alterarNinja(){
    return "Ninja alterado";
  }

  //Deletar ninja (DELETE)
  @DeleteMapping("/deletarId")
  public String deletarNinja(){
    return "Ninja deletado";
  }



}
