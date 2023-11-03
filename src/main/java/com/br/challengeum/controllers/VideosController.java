package com.br.challengeum.controllers;

import com.br.challengeum.dtos.VideoRecod;
import com.br.challengeum.models.VideoEntity;
import com.br.challengeum.repositories.VideosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/")
public class VideosController  {

    @Autowired
    private VideosRepository videosRepository;

    @GetMapping(path ="/videos")
    public @ResponseBody Iterable<VideoEntity> getAllVideos() {
        return videosRepository.findAll();
    }

    @PostMapping(path="/add")
    public void addVideo(@RequestBody @Valid VideoRecod request) {
        videosRepository.save(new VideoEntity(request));

    }

}
