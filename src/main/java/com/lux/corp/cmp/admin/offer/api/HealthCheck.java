package com.lux.corp.cmp.admin.offer.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
@Api(value = "Services to live operation")
public class HealthCheck {

	@GetMapping(value = "/health")
	public HttpStatus health(HttpServletResponse httpResponse, HttpServletRequest httpRequest) {
		return HttpStatus.OK;
	}
}
