package com.example.aprovados.controller;

import com.example.aprovados.model.Aprovado;
import com.example.aprovados.repository.AprovadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/aprovados")
@CrossOrigin(origins = "*")
public class AprovadoController {

    @Autowired
    private AprovadoRepository repository;

    @GetMapping
    public String status() {
        return "API de aprovados funcionando";
    }

    @PostMapping(consumes = "multipart/form-data")
    public ResponseEntity<?> salvar(
            @RequestParam String nome,
            @RequestParam String email,
            @RequestParam String telefone,
            @RequestParam String concursos,
            @RequestParam MultipartFile imagem
    ) throws IOException {

        Aprovado aprovado = new Aprovado();
        aprovado.setNome(nome);
        aprovado.setEmail(email);
        aprovado.setTelefone(telefone);
        aprovado.setConcursos(concursos);
        aprovado.setImagem(imagem.getBytes());

        repository.save(aprovado);

        return ResponseEntity.ok("Cadastro realizado com sucesso");
    }
}
