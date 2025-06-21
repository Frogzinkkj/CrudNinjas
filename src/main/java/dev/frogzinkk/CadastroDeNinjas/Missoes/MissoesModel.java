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
  private long id;

  private String nome;

  private String rank;

  @OneToMany(mappedBy = "missoes")
  private List<NinjaModel> ninjaModels;

}
