package com.monicaribeiro.arquiteturahexagonal.adapter.outbound.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "omdb", url = "http://www.omdbapi.com/?apikey=69cad562")
public interface OmdbClient {

    @GetMapping
    OmdbMovieResponse getMovieByName(@RequestParam("t") String title);

    @GetMapping
    OmdbMovieResponse getMovieById(@RequestParam("i") String id);

}
