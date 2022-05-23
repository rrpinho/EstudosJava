package alura.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alura.springboot.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>
{
    Curso findByNome(String nomeCurso);   
}
