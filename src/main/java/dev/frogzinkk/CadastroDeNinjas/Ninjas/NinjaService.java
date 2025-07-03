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


}
