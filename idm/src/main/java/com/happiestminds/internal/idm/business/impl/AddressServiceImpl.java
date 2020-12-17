package com.happiestminds.internal.idm.business.impl;

import com.happiestminds.internal.idm.business.AddressService;
import com.happiestminds.internal.idm.dataaccess.entities.Address;
import com.happiestminds.internal.idm.dataaccess.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address get(long id) {
        return addressRepository.findById(id).orElseThrow();
    }

    @Override
    public Address update(long id, Address address) {
        var dbAddress = get(id);

        return null;
    }

    @Override
    public void delete(long id) {
        addressRepository.deleteById(id);
    }
}
