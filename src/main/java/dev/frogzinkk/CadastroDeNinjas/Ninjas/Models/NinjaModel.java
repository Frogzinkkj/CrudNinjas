package dev.frogzinkk.CadastroDeNinjas.Ninjas.Models;

import dev.frogzinkk.CadastroDeNinjas.Missoes.Models.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  private String email;

  private int idade;

  @ManyToOne()
  @JoinColumn(name = "missoes_id") //Foring Key / Chave Estrangeira
  private MissoesModel missoes;
}
