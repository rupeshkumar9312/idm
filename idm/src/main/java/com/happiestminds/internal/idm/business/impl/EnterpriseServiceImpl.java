package com.happiestminds.internal.idm.business.impl;

import com.happiestminds.internal.idm.business.EnterpriseService;
import com.happiestminds.internal.idm.dataaccess.entities.Enterprise;
import com.happiestminds.internal.idm.dataaccess.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Override
    public List<Enterprise> getEnterprises() {
        return StreamSupport.stream(enterpriseRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Enterprise getEnterpriseById(long id) {
        return enterpriseRepository.findById(id).orElseThrow();
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
