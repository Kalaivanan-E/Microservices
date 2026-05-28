package com.example.address.mapper;

import com.example.address.dto.AddressDTO;
import com.example.address.entity.Address;

public class AddressMapper {
    public static AddressDTO maptoAddressDTO(Address address){
        AddressDTO addressDTO = new AddressDTO(
                address.getId(),
                address.getAddress(),
                address.getCity(),
                address.getState(),
                address.getPinCode()
        );
        return addressDTO;
    }
    public static Address maptoAddress(AddressDTO addressDTO){
        Address address = new Address(
                addressDTO.getId(),
                addressDTO.getAddress(),
                addressDTO.getCity(),
                addressDTO.getState(),
                addressDTO.getPinCode()
        );
        return address;
    }
}
