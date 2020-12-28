package com.happiestminds.internal.idm.business;

import com.happiestminds.internal.idm.dataaccess.entities.Enterprise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnterpriseService {

  List<Enterprise> getEnterprises();

  Enterprise getEnterpriseById(long id);

  Enterprise saveEnterprise(Enterprise enterprise);

  Enterprise updateEnterprise(long id, Enterprise enterprise);

  void deleteEnterprise(long id);

}
