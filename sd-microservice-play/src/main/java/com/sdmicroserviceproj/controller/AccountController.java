package com.sdmicroserviceproj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.sdmicroserviceproj.model.AccountModel;
import com.sdmicroserviceproj.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/valuemapping")
public class AccountController {

	@Autowired
	AccountRepository accountRepository;
		
		
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String addAccount(@RequestBody AccountModel accountModel) {
		accountRepository.save(accountModel);
		return "Value Mapping added successfully";
	}
}
