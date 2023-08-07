package com.bruno.livrariaapi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String autor;
    private String descricao;
    private int numeroDePaginas;
    private String editora;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataPublicacao;
    private String categoria;

    public Livro(Long id, String nome, String autor, String descricao, int numeroDePaginas, String editora, LocalDate dataPublicacao, String categoria) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.descricao = descricao;
        this.numeroDePaginas = numeroDePaginas;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.categoria = categoria;
    }

    public Livro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", nome='" + nome + '\'' + ", autor='" + autor + '\'' + ", descricao='" + descricao + '\'' + ", numeroDePaginas=" + numeroDePaginas + ", editora='" + editora + '\'' + ", dataPublicacao=" + dataPublicacao + ", categoria='" + categoria + '\'' + '}';
    }
}
