package com.br.challengeum.models;

import com.br.challengeum.dtos.VideoRecod;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity(name = "Video")
@Table(name = "fastVideo")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class VideoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String descricao;

    @NotBlank
    private String url;

    public VideoEntity(VideoRecod dados) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.url = dados.url();
    }
}
