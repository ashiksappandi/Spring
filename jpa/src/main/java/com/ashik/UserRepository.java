package com.ashik;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserRecord, String> {
    void delete(String id);

    Optional<UserRecord> findOne(String id);
}
