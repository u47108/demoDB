package com.ddd.sample.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ddd.sample.domain.Users;

interface UsersRepository extends CrudRepository<Users, Integer> {

}
