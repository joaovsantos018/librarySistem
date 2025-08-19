package com.joao.librarySistem.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class LivroEmprestado {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "pessoaId", foreignKey = @ForeignKey(name = "livroEmprestadoPessoa"))
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "livroId", foreignKey = @ForeignKey(name = "livroEmprestadoLivro"))
    private Livro livro;

    private Date dataEmprestimo;

    private Date dataDevolucao;

}
