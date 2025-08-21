package com.joao.librarySistem.service;

import com.joao.librarySistem.DTO.LivroDTO;
import com.joao.librarySistem.DTO.LivroRequestDTO;
import com.joao.librarySistem.entities.Livro;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LivroService {
    Livro salvaLivro(LivroRequestDTO livro);
    List<Livro> listarLivros();
    List<Livro> livrosDisponiveis();
    List<Livro> filtrarPorGenero(String genero);
}
