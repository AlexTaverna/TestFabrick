package com.Fabrick.Fabrick;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class RController {
private RestTemplate rTemp;
private String url="";
	
	@Value("${api.key}")
	private String apikey;
	
	@Value("${Auth-Schema}")
	private String authSchema;
	
	@GetMapping("/allAccounts")
	public List<Object> getAccount(){
	Object[]accounts=rTemp.getForObject(url, Object[].class);
	return Arrays.asList(accounts);
	}
	@GetMapping("/blalnce")
	private String getHelloClient(){
	String uri ="";
	RestTemplate restTemp=new RestTemplate();
	String result= restTemp.getForObject(uri+"?Auth-Schema="+authSchema, String.class);	
	return result;
	}
	
	
}
