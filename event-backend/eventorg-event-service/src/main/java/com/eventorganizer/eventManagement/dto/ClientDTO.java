package com.eventorganizer.eventManagement.dto;

import lombok.Data;

@Data
public class ClientDTO
{
    private Long clientId;
    private String name;
    private String email;
    private String phoneNumber;
    private Long userId;
}
