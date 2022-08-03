package com.monicaribeiro.arquiteturahexagonal.adapter.inbound.controller;

import com.monicaribeiro.arquiteturahexagonal.adapter.inbound.controller.request.CreateUserRequest;
import com.monicaribeiro.arquiteturahexagonal.adapter.inbound.controller.response.UserResponse;
import com.monicaribeiro.arquiteturahexagonal.domain.ports.inbound.CreateUserUseCasePort;
import com.monicaribeiro.arquiteturahexagonal.domain.ports.inbound.GetUserByIdUseCasePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCasePort createUserUseCase;
    private final GetUserByIdUseCasePort getUserByIdUseCasePort;

    public UserController(CreateUserUseCasePort createUserUseCase,
                          GetUserByIdUseCasePort getUserByIdUseCasePort) {
        this.createUserUseCase = createUserUseCase;
        this.getUserByIdUseCasePort = getUserByIdUseCasePort;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUser(@PathVariable Long userId) {
        return ResponseEntity.ok(UserResponse.fromDomain(getUserByIdUseCasePort.execute(userId)));
    }

    @PostMapping()
    public ResponseEntity<UserResponse> createUser(@RequestBody CreateUserRequest createUserRequest) {
        return ResponseEntity.ok(UserResponse.fromDomain(createUserUseCase.execute(createUserRequest.toUserDomain())));
    }
}
