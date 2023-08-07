package com.bruno.livrariaapi.controllers;

import com.bruno.livrariaapi.entities.Livro;
import com.bruno.livrariaapi.services.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public ResponseEntity<Livro> salvarLivro(@RequestBody Livro livro) {
        return new ResponseEntity<>(livroService.salvarLivro(livro), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> procurarTodos() {
        return new ResponseEntity<List<Livro>>(livroService.listarTodosLivros(), HttpStatus.OK);
    }


}
