package com.joao.librarySistem.repository;

import com.joao.librarySistem.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LivroRepository  extends JpaRepository<Livro, UUID> {

    List<Livro> findByDisponivelTrue();
    List<Livro> findByGeneroIgnoreCase(String genero);

}
