package com.joao.librarySistem.service;

import com.joao.librarySistem.DTO.livroDTO.LivroRequestDTO;
import com.joao.librarySistem.entities.Livro;

import java.util.List;


public interface LivroService {
    Livro salvaLivro(LivroRequestDTO livro);
    List<Livro> listarLivros();
    List<Livro> livrosDisponiveis();
    List<Livro> filtrarPorGenero(String genero);
}
