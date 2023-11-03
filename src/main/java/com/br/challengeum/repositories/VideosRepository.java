package com.br.challengeum.repositories;

import com.br.challengeum.models.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideosRepository extends JpaRepository<VideoEntity, Long> {

}
