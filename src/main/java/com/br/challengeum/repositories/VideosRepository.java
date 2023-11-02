package com.br.challengeum.repositories;

import com.br.challengeum.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideosRepository extends JpaRepository<Video, Integer> {

}
