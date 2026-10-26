package br.edu.fatecFranca.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.fatecfranca.api.models.Aluno;

public interface AlunoRepository
extends MongoRepository<Aluno, String> {
    
}