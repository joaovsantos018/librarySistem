package com.joao.librarySistem.controller;

import com.joao.librarySistem.DTO.LivroRequestDTO;
import com.joao.librarySistem.entities.Livro;
import com.joao.librarySistem.service.LivroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public Livro salvaLivro(@RequestBody LivroRequestDTO livro){
        return livroService.salvaLivro(livro);
    }


    @Operation(description = "Lista todos os livros")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Livros encontrados"),
            @ApiResponse(responseCode = "404", description = "Não encontrado"),
    })
    @GetMapping("/list")
    public List<Livro> livros() {
        return livroService.listarLivros();
    }


    @Operation(description = "Lista livros disponiveis")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Livros disponiveis encontrados"),
            @ApiResponse(responseCode = "404", description = "Não encontrado"),
    })
    @GetMapping("/listAllAvailable")
    public List<Livro> livrosDisponiveis() {
        return livroService.livrosDisponiveis();
    }


    @GetMapping("/listByGender")
    public List<Livro> filtrarLivrosPorGenero(@RequestParam String genero){
        return livroService.filtrarPorGenero(genero);
    }






}
