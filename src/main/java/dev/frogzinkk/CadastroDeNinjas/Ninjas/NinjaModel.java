package dev.frogzinkk.CadastroDeNinjas.Ninjas;

import dev.frogzinkk.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "nome_ninja")
  private String nome;


  @Column(name = "email_ninja",unique = true)
  private String email;

  @Column(name = "idade_ninja")
  private int idade;

  @ManyToOne()
  @JoinColumn(name = "missoes_id") //Foring Key / Chave Estrangeira
  private MissoesModel missoes;
}
