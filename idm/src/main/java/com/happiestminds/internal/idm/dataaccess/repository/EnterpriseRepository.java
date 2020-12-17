package com.happiestminds.internal.idm.dataaccess.repository;

import com.happiestminds.internal.idm.dataaccess.entities.Enterprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends CrudRepository<Enterprise, Long> {
}
