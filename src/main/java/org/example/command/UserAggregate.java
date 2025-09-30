package org.example.command;

import org.example.domain.User;

public class UserAggregate {

    private UserWriteRepository writeRepository;

    public UserAggregate(UserWriteRepository repository) {
        this.writeRepository = repository;
    }

    public User handleCreateUserCommand(CreateUserCommand command) {
        User user = new User(command.getUserId(), command.getUserName(), command.getUserAddress());
        return user;
    }

    public User handleUpdateUserCommand(UpdateUserCommand command) {
        User user = writeRepository.getUser(command.getUserId());
        user.setUserAddress(command.getAddresses());
        user.setUserContact(command.getContact());
        writeRepository.addUser(user.getUserId(), user);
        return user;
    }
}
