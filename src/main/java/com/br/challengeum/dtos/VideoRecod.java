package com.br.challengeum.dtos;

import jakarta.validation.constraints.NotNull;

public record VideoRecod(
        @NotNull
        String titulo,

        @NotNull
        String descricao,

        @NotNull
        String url
    ) {
}
