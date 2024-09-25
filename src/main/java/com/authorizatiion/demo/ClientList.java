package com.authorizatiion.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClientList {

	public List<Clients> getAllClients() {
		List<Clients> clients = new ArrayList<>();
		Clients client1 = new Clients(1L, "qms", "qmsse", "http://localhost:3000/redirect");
		Clients client2 = new Clients(2L, "customer", "cus", "http://172.20.1.38:8080/RNT-SSO/rntlogin.do");
		Clients client3 = new Clients(3L, "ClientThree", "secret789", "http://localhost:8080/redirect3");
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		return clients;

	}
}
