package com.joao.librarySistem.service.impl;

import com.joao.librarySistem.entities.Livro;
import com.joao.librarySistem.repository.LivroRepository;
import com.joao.librarySistem.service.LivroService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class LivroServiceImpl implements LivroService {

    private final LivroRepository livroRepository;

    public LivroServiceImpl(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }


    @Override
    public Livro salvaLivro(Livro livro) {
        return livroRepository.save(livro);
    }


    @Override
    public List<Livro> listarLivros(){
        return livroRepository.findAll();
    }
}
