package org.example.command;

import org.example.domain.Address;

import java.util.Set;

public class UpdateUserCommand {

    private String userId;
    private String userName;
    private Set<Address> userAddress;
    private Set<Contact> userContact;//for multiple billing addresses
    private String password;
}
