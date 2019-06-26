package com.ashik;

/**
 * Created by narayaa on 26-04-2019.
 */

import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserRecord, String> {

}