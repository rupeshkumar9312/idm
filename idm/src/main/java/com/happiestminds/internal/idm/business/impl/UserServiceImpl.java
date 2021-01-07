package com.happiestminds.internal.idm.business.impl;

import com.happiestminds.internal.idm.business.UserService;
import com.happiestminds.internal.idm.dataaccess.entities.User;
import com.happiestminds.internal.idm.dataaccess.repository.UserRepository;
import com.happiestminds.internal.idm.exception.ResourceNotFoundException;
import com.happiestminds.internal.idm.web.response.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  @Transactional
  public User saveUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public List<User> getAllUsers() {
    return StreamSupport.stream(userRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
  }

  @Override
  @Transactional
  public void deleteUser(Long id) {
    try {
      userRepository.deleteById(id);
    } catch (EmptyResultDataAccessException ex) {
      throw new ResourceNotFoundException(ErrorMessage.USER_NOT_FOUND);
    }
  }
}
