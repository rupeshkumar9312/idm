package com.happiestminds.internal.idm.business;

import com.happiestminds.internal.idm.dataaccess.entities.Address;

public interface AddressService {
    Address save(Address address);

    Address get(long id);

    Address update(long id, Address address);

    void delete(long id);

}
