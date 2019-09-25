package com.dev.banking.weblogic.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.banking.weblogic.dto.MessageDTO;

@RestController
@RequestMapping("/apiv1/messages")
public class MessageController {
	
	@CrossOrigin
	@GetMapping
	public MessageDTO getMessage() {
		return new MessageDTO("Esto es un mensaje", new Date());
	}
	
}
