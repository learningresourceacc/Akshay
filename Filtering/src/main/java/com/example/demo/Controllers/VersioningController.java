package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Versioning.Name;
import com.example.demo.Versioning.Version1;
import com.example.demo.Versioning.Version2;

@RestController
public class VersioningController {

	// Uri Versioning
	@GetMapping("/v1/getUser")
	public Version1 uriVersion1() {
		return new Version1(new Name("akshay", "dubey"));
	}

	@GetMapping("/v2/getUser")
	public Version2 uriVersion2() {
		return new Version2("akshay dubey");
	}

	// Param Versioning
	@GetMapping(value = "/user/param", params = "version=1")
	public Version1 paramV1() {
		return new Version1(new Name("akshay", "dubey"));
	}

	@GetMapping(value = "/user/param", params = "version=2")
	public Version2 paramV2() {
		return new Version2("akshay dubey");
	}

	// Header Versioning
	@GetMapping(value = "/user", headers = "X-API-VERSION=1")
	public Version1 headerV1() {
		return new Version1(new Name("akshay", "dubey"));
	}

	@GetMapping(value = "/user", headers = "X-API-VERSION=2")
	public Version2 headerV2() {
		return new Version2("akshay dubey");
	}
	
	//Media type versioning or content negotiation versioning
	@GetMapping(value = "/user", produces = "application/app-v1+json")
	public Version1 producesV1() {
		return new Version1(new Name("akshay", "dubey"));
	}

	@GetMapping(value = "/user",produces = "application/app-v2+json")
	public Version2 producesV2() {
		return new Version2("akshay dubey");
	}
	

}
