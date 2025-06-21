package dev.frogzinkk.CadastroDeNinjas.Missoes;

import dev.frogzinkk.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "nome_missao")
  private String nome;

  @Column(name = "rank_missao")
  private String rank;

  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> ninjaModels;

}
