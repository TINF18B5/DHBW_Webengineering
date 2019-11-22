package de.dhkarlsruhe.webengineering.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	private Map<String, Address> addressMap = new HashMap<>();

	@GetMapping("/addresses")
	public Collection<Address> getAddresses() {
		return addressMap.values();
	}

	@PostMapping("/addresses")
	@ResponseStatus(HttpStatus.CREATED)
	public void createAddress(@RequestBody Address adr) {
		addressMap.put(adr.getId(), adr);
	}

	@GetMapping("/addresses/{id}")
	public Address getAddress(@PathVariable("id") String id) {
		return addressMap.get(id);
	}

	@DeleteMapping("/addresses/{id}")
	public void deleteAddress(@PathVariable("id") String id) {
		addressMap.remove(id);
	}
}
