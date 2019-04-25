package com.ashik;

import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserRecord, String> {
}
