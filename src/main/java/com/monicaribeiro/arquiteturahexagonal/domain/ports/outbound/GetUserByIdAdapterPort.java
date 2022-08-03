package com.monicaribeiro.arquiteturahexagonal.domain.ports.outbound;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.User;

public interface GetUserByIdAdapterPort {
    User getUser(Long id);
}
