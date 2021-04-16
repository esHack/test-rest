package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping(value = "/data", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String data(HttpEntity<String> httpEntity) {

//		System.out.println(httpEntity.getBody());
//		JSONArray jsonObject = new JSONArray(httpEntity.getBody());
//
//		JSONObject j2 = new JSONObject();
//		System.out.println(jsonObject.getJSONObject(0).getJSONObject("data").getString("validationCode"));
//
//		j2.put("validationResponse",jsonObject.getJSONObject(0).getJSONObject("data").getString("validationCode"));
//
//		return j2.toString();
		return "";
	}
}
