package com.monicaribeiro.arquiteturahexagonal.domain.ports.inbound;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.User;

public interface CreateUserUseCasePort {
    User execute(User user);
}
