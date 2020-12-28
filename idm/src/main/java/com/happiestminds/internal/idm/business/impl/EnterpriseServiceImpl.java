package com.happiestminds.internal.idm.business.impl;

import com.happiestminds.internal.idm.business.EnterpriseService;
import com.happiestminds.internal.idm.dataaccess.entities.Enterprise;
import com.happiestminds.internal.idm.dataaccess.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

  private EnterpriseRepository enterpriseRepository;

  @PersistenceContext
  private EntityManager entityManager;

  @Autowired
  public EnterpriseServiceImpl(EnterpriseRepository enterpriseRepository) {
    this.enterpriseRepository = enterpriseRepository;
  }

  @Override
  public List<Enterprise> getEnterprises() {
    /*return StreamSupport.stream(enterpriseRepository.findAll().spliterator(), false)
    .collect(Collectors.toList());*/
    return enterpriseRepository.getEnterprises();
  }

  @Override
  public Enterprise getEnterpriseById(long id) {
    /* StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("get_enterprise_by_id")
            .setParameter("id",id);
    return (Enterprise) storedProcedureQuery.getResultList();*/
    return enterpriseRepository.getEnterpriseById(id);
  }

  @Override
  public void deleteEnterprise(long id) {
    enterpriseRepository.deleteById(id);
  }

  @Override
  public Enterprise updateEnterprise(long id, Enterprise enterprise) {
    var dbEnterprise = getEnterpriseById(id);
    dbEnterprise.setName(enterprise.getName());
    dbEnterprise.setCode(enterprise.getCode());
    dbEnterprise.setStatus(enterprise.getStatus());
    dbEnterprise.setType(enterprise.getType());
    return enterpriseRepository.save(dbEnterprise);
  }

  @Override
  public Enterprise saveEnterprise(Enterprise enterprise) {
    return enterpriseRepository.save(enterprise);
  }
}
