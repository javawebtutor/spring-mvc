package com.jwt.book.store.repo;

import org.springframework.data.repository.CrudRepository;

import com.jwt.book.store.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

}
