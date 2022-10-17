package com.monicaribeiro.arquiteturahexagonal.adapter.outbound.repository;

import com.monicaribeiro.arquiteturahexagonal.config.exception.UserNotFoundException;
import com.monicaribeiro.arquiteturahexagonal.domain.domain.User;
import com.monicaribeiro.arquiteturahexagonal.domain.ports.outbound.GetUserByIdAdapterPort;
import org.springframework.stereotype.Component;

@Component
public class GetUserByIdAdapter implements GetUserByIdAdapterPort {

    private final UserRepository userRepository;

    public GetUserByIdAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Long id) {
        try {
            var userResult = userRepository.findById(id);
            return User.fromEntity(userResult.get());

        } catch (Exception exception) {
            throw new UserNotFoundException(id);
        }
    }
}
