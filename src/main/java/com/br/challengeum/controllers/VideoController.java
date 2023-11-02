package com.br.challengeum.controllers;

import com.br.challengeum.dtos.VideosRequest;
import com.br.challengeum.dtos.VideosResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface VideoController {

    @GetMapping
    ResponseEntity<VideosResponse> getAllVideos();

    @PostMapping
    ResponseEntity<VideosResponse> addVideo(final VideosRequest request);
}
