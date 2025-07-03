package dev.frogzinkk.CadastroDeNinjas.Ninjas;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {


  private NinjaRepository ninjaRepository;

  public NinjaService(NinjaRepository ninjaRepository) {
    this.ninjaRepository = ninjaRepository;
  }


  //Criar Novo Ninja
  public NinjaModel criarNinja(NinjaModel ninjaModel){
    return ninjaRepository.save(ninjaModel);
  }



  //Listar todos meus ninjas

  public List<NinjaModel> mostrarNinjas(){

    return ninjaRepository.findAll();
  }

  //Listar Ninja por ID
  public NinjaModel mostrarNinjaId(Long id){
    Optional<NinjaModel> ninjaModel =  ninjaRepository.findById(id);
    return ninjaModel.orElse(null);
  }

  //Alterar dados do Ninja
  public NinjaModel alterarNinjaId(long id, NinjaModel ninjaAtualizado){

    if(ninjaRepository.existsById(id)){
      ninjaAtualizado.setId(id);
      return ninjaRepository.save(ninjaAtualizado);
    }
    return null;
  }


  //Deletar Ninja
  public void deletarNinja(Long id){

    ninjaRepository.deleteById(id);;

  }

}
