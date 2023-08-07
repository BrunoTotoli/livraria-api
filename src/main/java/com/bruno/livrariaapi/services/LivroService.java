package com.bruno.livrariaapi.services;

import com.bruno.livrariaapi.entities.Livro;
import com.bruno.livrariaapi.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro salvarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro atualizarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro procurarPorId(Long id) {
        return livroRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public List<Livro> listarTodosLivros() {
        return livroRepository.findAll();
    }
}
