package com.happiestminds.internal.idm.dataaccess.repository;

import com.happiestminds.internal.idm.dataaccess.entities.Enterprise;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnterpriseRepository extends CrudRepository<Enterprise, Long> {

  @Query(value = "{call get_enterprises}", nativeQuery = true)
  List<Enterprise> getEnterprises();

  @Query(value = "{call get_enterprise_by_id(:id)}", nativeQuery = true)
  Enterprise getEnterpriseById(@Param("id") Long id);
}
