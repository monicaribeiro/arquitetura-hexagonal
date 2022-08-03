package com.monicaribeiro.arquiteturahexagonal.config;

import com.monicaribeiro.arquiteturahexagonal.adapter.outbound.integration.FindMovieAdapter;
import com.monicaribeiro.arquiteturahexagonal.adapter.outbound.repository.GetUserByIdAdapter;
import com.monicaribeiro.arquiteturahexagonal.adapter.outbound.repository.SaveUserAdapter;
import com.monicaribeiro.arquiteturahexagonal.domain.ports.inbound.CreateUserUseCasePort;
import com.monicaribeiro.arquiteturahexagonal.domain.ports.inbound.GetUserByIdUseCasePort;
import com.monicaribeiro.arquiteturahexagonal.domain.usecase.CreateUserUseCase;
import com.monicaribeiro.arquiteturahexagonal.domain.usecase.GetUserByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CreateUserUseCasePort createUserUseCasePort(FindMovieAdapter omdbIntegration, SaveUserAdapter saveUserAdapter) {
        return new CreateUserUseCase(omdbIntegration, saveUserAdapter);
    }

    @Bean
    public GetUserByIdUseCasePort getUserByIdUseCasePort(FindMovieAdapter omdbIntegration, GetUserByIdAdapter getUserByIdAdapter) {
        return new GetUserByIdUseCase(omdbIntegration, getUserByIdAdapter);
    }

}
