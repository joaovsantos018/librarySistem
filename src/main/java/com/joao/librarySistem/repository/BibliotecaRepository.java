package com.joao.librarySistem.repository;

import com.joao.librarySistem.entities.LivroEmprestado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Repository
public interface BibliotecaRepository extends JpaRepository<LivroEmprestado, UUID> {
}
