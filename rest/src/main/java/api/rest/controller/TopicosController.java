package api.rest.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.controller.dto.TopicoDto;
import api.rest.modelo.Topico;
import api.rest.repository.TopicoRepository;

@RestController
public class TopicosController {
    
    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(String nomeCurso) {
        if (nomeCurso == null){
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDto.converter(topicos);
        }else{
            //List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
            List<Topico> topicos = topicoRepository.carregarPorNomeDoCurso(nomeCurso);
            return TopicoDto.converter(topicos);
        }


    }
}
