package com.joao.librarySistem.service;

import com.joao.librarySistem.entities.Livro;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LivroService {
    Livro salvaLivro(Livro livro);
    List<Livro> listarLivros();
}
