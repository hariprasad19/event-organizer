package com.eventorganizer.ClientService.repository;

import com.eventorganizer.ClientService.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
