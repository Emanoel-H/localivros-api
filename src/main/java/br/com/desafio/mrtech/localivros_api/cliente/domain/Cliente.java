package br.com.desafio.mrtech.localivros_api.cliente.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true, nullable = false, updatable = false)
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false,  unique = true)
    private String email;
    @Column(nullable = false, length = 60)
    private String senha;
    @Column(nullable = false,  length = 11)
    private String telefone;
    @Column(nullable = false,  unique = true, length = 14)
    private String identificacao;
    private boolean isCNPJ;
    private boolean ativo = true;
    private Integer totalEmprestados;
    private Integer totalLocados;
    private Integer totalAvaliacoes;
    private Double mediaAvaliacoes;
    private Integer denuncias;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(nullable = false,  updatable = false)
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime dataHoraAtualizacao;
    private LocalDateTime dataHoraLimiteExclusao;

    @PrePersist
    public void prePersist(){
        this.dataHoraCriacao = LocalDateTime.now();
        this.dataHoraAtualizacao = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
       this.dataHoraAtualizacao = LocalDateTime.now();
    }
}
