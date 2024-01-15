package com.github.ygorcalimanis.ecommerce.repository;

import com.github.ygorcalimanis.ecommerce.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    <T> List<T> findByUf(String uf, Class<T> type);
}
