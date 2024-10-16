package academy.devdojo.springboot2essentials.repository;

import java.util.List;

import academy.devdojo.springboot2essentials.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long>{
    List<Anime> listAll();
}
