package com.monicaribeiro.arquiteturahexagonal.domain.ports.outbound;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.Movie;

public interface FindMovieAdapterPort {
    Movie getMovieByTitle(String title);
    Movie getMovieById(String id);
}
