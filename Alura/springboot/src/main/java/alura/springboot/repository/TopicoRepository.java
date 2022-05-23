package alura.springboot.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import alura.springboot.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findByCurso_Nome(String nomeCurso, Pageable paginacao); //Vai na Classe <Topico>, vai na variável "Curso" no atributo "Nome"
    
    @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso") //JPQE
    List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
