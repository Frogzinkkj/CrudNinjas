package dev.frogzinkk.CadastroDeNinjas.Missoes;

import dev.frogzinkk.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {


  MissoesRepository missoesRepository;

  public MissoesService(MissoesRepository missoesRepository) {
    this.missoesRepository = missoesRepository;
  }

  //Criar Missoes
  public MissoesModel criarMissoes(MissoesModel missaoNova){
    return missoesRepository.save(missaoNova);
  }

  //Exibir todas as missoes
  public List<MissoesModel> exibirMissoes(){
    return missoesRepository.findAll();
  }

  //Exibit missao por ID
  public MissoesModel exibirMissaoID(long id){
    Optional<MissoesModel> missao = missoesRepository.findById(id);
    return missao.orElse(null);
  }
  //Alterar Missoes
  public MissoesModel alterarMissao(long id, MissoesModel missaoAlterada){
    if (missoesRepository.existsById(id)){
      missaoAlterada.setId(id);
      return missoesRepository.save(missaoAlterada);
    }
    return null;
  }
  //Alterar somente um atributo
  public MissoesModel alterarAtributoMissao(long id, MissoesModel missaoAlterada){
    if (missoesRepository.existsById(id)){
      Optional<MissoesModel> missao = missoesRepository.findById(id);
      MissoesModel missoesModel = missao.get();
      if (missaoAlterada.getNome() != null) missoesModel.setNome(missaoAlterada.getNome());
      if (missaoAlterada.getRank() != null) missoesModel.setRank(missaoAlterada.getRank());
      return missoesRepository.save(missoesModel);
    }
    return null;
  }

  //Deletar Missoes
  public void deletarMissao(long id){
    missoesRepository.deleteById(id);
  }

}
