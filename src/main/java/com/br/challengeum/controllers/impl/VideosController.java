package com.br.challengeum.controllers.impl;

import com.br.challengeum.controllers.VideoController;
import com.br.challengeum.dtos.VideosRequest;
import com.br.challengeum.dtos.VideosResponse;
import com.br.challengeum.models.Video;
import com.br.challengeum.repositories.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/")
public class VideosController  {

    @Autowired
    private VideosRepository videosRepository;

    @GetMapping(path ="/videos")
    public @ResponseBody Iterable<Video> getAllVideos() {
        return videosRepository.findAll();
    }

    @PostMapping(path="/add")
    public VideosResponse addVideo(@RequestBody VideosRequest request) {
        Video v = new Video();
        v.getId();
        v.setTitulo(request.getTitulo());
        v.setDescricao(request.getDescricao());
        v.setUrl(request.getUrl());
        videosRepository.save(v);

        VideosResponse vp = VideosResponse.builder()
                .titulo(v.getTitulo())
                .descricao(v.getDescricao())
                .url(v.getUrl())
                .build();
        return vp;
    }

}
