package com.happiestminds.internal.idm.dataaccess.repository;

import com.happiestminds.internal.idm.dataaccess.entities.PasswordPolicyAttribute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordPolicyAttrRepository extends CrudRepository<PasswordPolicyAttribute, Long> {
}
