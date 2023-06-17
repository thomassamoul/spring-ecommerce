package com.example.ecommerce.model.dao;

import com.example.ecommerce.model.LocalUser;
import com.example.ecommerce.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Integer> {
    Optional<VerificationToken> findByToken(String token);

    void deleteByUser(LocalUser user);


}
