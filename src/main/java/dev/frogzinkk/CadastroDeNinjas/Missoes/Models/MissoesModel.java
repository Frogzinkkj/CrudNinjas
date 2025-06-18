package dev.frogzinkk.CadastroDeNinjas.Missoes.Models;

import dev.frogzinkk.CadastroDeNinjas.Ninjas.Models.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String nome;

  private String rank;

  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> ninjaModels;



  public MissoesModel() {
  }
  public MissoesModel(String nome, String rank) {
    this.nome = nome;
    this.rank = rank;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }
}
