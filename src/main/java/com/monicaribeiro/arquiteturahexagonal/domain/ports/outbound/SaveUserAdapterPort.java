package com.monicaribeiro.arquiteturahexagonal.domain.ports.outbound;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.User;

public interface SaveUserAdapterPort {
    User saveUser(User user);
}
