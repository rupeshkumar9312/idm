package com.happiestminds.internal.idm.business;

import com.happiestminds.internal.idm.dataaccess.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(final User user);

    List<User> getAllUsers();

    void deleteUser(final Long id);
}
