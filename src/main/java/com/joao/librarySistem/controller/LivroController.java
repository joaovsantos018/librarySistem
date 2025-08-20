package com.joao.librarySistem.controller;

import com.joao.librarySistem.entities.Livro;
import com.joao.librarySistem.service.LivroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {


    @Autowired
    private LivroService livroService;


    @Operation(description = "Salva livro")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Livro foi salvo"),
            @ApiResponse(responseCode = "400", description = "Erro ao salvar"),
    })
    @PostMapping("/add")
    public Livro salvaLivro(@RequestBody Livro livro){
        return livroService.salvaLivro(livro);
    }

    @GetMapping("/list")
    public List<Livro> livros() {
        return livroService.listarLivros();
    }



}
