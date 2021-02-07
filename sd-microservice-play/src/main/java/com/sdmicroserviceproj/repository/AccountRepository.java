package com.sdmicroserviceproj.repository;

import com.sdmicroserviceproj.model.AccountModel;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountModel, String>{}