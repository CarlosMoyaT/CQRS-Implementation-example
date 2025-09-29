package org.example.command;

import jakarta.transaction.Transactional;
import org.example.domain.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCommandHandler {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public Long handle(CreateUserCommand command) {
        User user = new User();
        user.setUserId(command.getUserId());
        userRepository.save(user);
        return user.getUserId();
    }
}
