package alura.springboot.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import alura.springboot.modelo.Topico;
import alura.springboot.repository.CursoRepository;
import alura.springboot.repository.TopicoRepository;
import alura.springboot.controller.dto.DetalhesDoTopicoDto;
import alura.springboot.controller.dto.TopicoDto;
import alura.springboot.controller.form.AtualizacaoTopicoForm;
import alura.springboot.controller.form.TopicoForm;

@RestController
@RequestMapping("/topicos")
public class TopicosController 
{
    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    //@RequestMapping(value = "/topicos", method = RequestMethod.GET)
    @GetMapping
    //public Page<TopicoDto> lista(@RequestParam(required = false) String nomeCurso, @RequestParam int pagina, @RequestParam int qtd, @RequestParam String ordenacao)
    public Page<TopicoDto> lista(@RequestParam(required = false) String nomeCurso, @PageableDefault(sort = "id", direction = Direction.DESC, page = 0, size = 10) Pageable paginacao)
    {
        //Pageable paginacao = PageRequest.of(pagina, qtd, Direction.ASC, ordenacao);

        if (nomeCurso == null)
        {
            Page<Topico> topicos = topicoRepository.findAll(paginacao);
            return TopicoDto.converter(topicos);
        }else
        {
            Page<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso, paginacao);
            return TopicoDto.converter(topicos);
        }
        
    }

    //@RequestMapping(value = "/topicos", method = RequestMethod.POST)
    @PostMapping
    @Transactional
    public ResponseEntity<TopicoDto> cadastrar(@RequestBody TopicoForm form, UriComponentsBuilder uriBuilder)
    {
        Topico topico = form.converter(cursoRepository);
        topicoRepository.save(topico);

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(new TopicoDto(topico));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalhesDoTopicoDto> detalhar(@PathVariable("id") Long id)
    {
        Optional<Topico> topico = topicoRepository.findById(id);
        if(topico.isPresent())
            return ResponseEntity.ok(new DetalhesDoTopicoDto(topico.get()));
        else
            return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicoDto> atualizar(@PathVariable Long id, @RequestBody AtualizacaoTopicoForm form)
    {
        Optional<Topico> optional = topicoRepository.findById(id);
        if (optional.isPresent())
        {
            Topico topico = form.atualizar(id, topicoRepository);
            return ResponseEntity.ok(new TopicoDto(topico));
        }else
            return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> remover(@PathVariable Long id)
    {
        Optional<Topico> optional = topicoRepository.findById(id);
        if (optional.isPresent())
        {
            topicoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }else
            return ResponseEntity.notFound().build();
            
    }
}
