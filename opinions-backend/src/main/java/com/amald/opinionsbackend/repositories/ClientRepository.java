package com.amald.opinionsbackend.repositories;

import com.amald.opinionsbackend.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
