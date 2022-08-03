package com.monicaribeiro.arquiteturahexagonal.adapter.outbound.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
