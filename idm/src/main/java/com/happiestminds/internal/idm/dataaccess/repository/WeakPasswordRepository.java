package com.happiestminds.internal.idm.dataaccess.repository;

import com.happiestminds.internal.idm.dataaccess.entities.WeakPassword;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeakPasswordRepository extends CrudRepository<WeakPassword, Long> {
}
