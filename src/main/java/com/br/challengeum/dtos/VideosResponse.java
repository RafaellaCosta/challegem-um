package com.br.challengeum.dtos;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class VideosResponse {

    private int id;
    private String titulo;
    private String descricao;
    private String url;

}
