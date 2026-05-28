package com.example.address.service.impl;

import com.example.address.AddressApplication;
import com.example.address.dto.AddressDTO;
import com.example.address.entity.Address;
import com.example.address.mapper.AddressMapper;
import com.example.address.repository.AddressRepository;
import com.example.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepo;
    public AddressDTO saveAddress(AddressDTO addressDTO){
        Address address = AddressMapper.maptoAddress(addressDTO);
        Address savedAddress = addressRepo.save(address);
        AddressDTO savedAddressDTO = AddressMapper.maptoAddressDTO(savedAddress);
        return savedAddressDTO;
    }
    public AddressDTO getAddressById(Long id){
        Address address = addressRepo.findById(id).get();
        AddressDTO addressDTO = AddressMapper.maptoAddressDTO(address);
        return addressDTO;
    }
}
