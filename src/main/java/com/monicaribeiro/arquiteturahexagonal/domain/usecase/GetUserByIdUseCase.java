package com.monicaribeiro.arquiteturahexagonal.domain.usecase;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.Movie;
import com.monicaribeiro.arquiteturahexagonal.domain.domain.User;
import com.monicaribeiro.arquiteturahexagonal.domain.ports.inbound.GetUserByIdUseCasePort;
import com.monicaribeiro.arquiteturahexagonal.domain.ports.outbound.FindMovieAdapterPort;
import com.monicaribeiro.arquiteturahexagonal.domain.ports.outbound.GetUserByIdAdapterPort;

public class GetUserByIdUseCase implements GetUserByIdUseCasePort {
    private final FindMovieAdapterPort findMovieAdapterPort;
    private final GetUserByIdAdapterPort getUserByIdAdapterPort;

    public GetUserByIdUseCase(FindMovieAdapterPort findMovieAdapterPort, GetUserByIdAdapterPort getUserByIdAdapterPort) {
        this.findMovieAdapterPort = findMovieAdapterPort;
        this.getUserByIdAdapterPort = getUserByIdAdapterPort;
    }

    @Override
    public User execute(Long id) {
        User user = getUserByIdAdapterPort.getUser(id);
        Movie movie = findMovieAdapterPort.getMovieById(user.getFavoriteMovie().getImdbID());
        user.setFavoriteMovie(movie);

        return user;
    }
}
