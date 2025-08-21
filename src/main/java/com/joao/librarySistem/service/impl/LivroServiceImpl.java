package com.joao.librarySistem.service.impl;

import com.joao.librarySistem.DTO.livroDTO.LivroRequestDTO;
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
    public Livro salvaLivro(LivroRequestDTO livroDTO) {
        Livro livro = new Livro();
        livro.setTitulo(livroDTO.titulo());
        livro.setAutor(livroDTO.autor());
        livro.setGenero(livroDTO.genero());
        livro.setDisponivel(true);

        return livroRepository.save(livro);
    }

    @Override
    public List<Livro> listarLivros(){
         return livroRepository.findAll();
    }

    @Override
    public List<Livro> livrosDisponiveis() {
        return livroRepository.findByDisponivelTrue();
    }

    @Override
    public List<Livro> filtrarPorGenero(String genero){
        return livroRepository.findByGeneroIgnoreCase(genero);
    }


}
