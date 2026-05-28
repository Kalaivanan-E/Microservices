package com.example.address.service;

import com.example.address.dto.AddressDTO;
import com.example.address.entity.Address;

public interface AddressService {
    AddressDTO saveAddress(AddressDTO addressDTO);
    AddressDTO getAddressById(Long id);
}
