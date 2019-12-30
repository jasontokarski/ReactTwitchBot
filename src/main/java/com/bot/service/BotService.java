package com.bot.service;

import org.springframework.stereotype.Service;

import com.bot.Message;

@Service
public interface BotService {
	 public void init();
	 public void loadCommands();
	 public void loop();
	 public void connect();
	 public String getChannel();
	 public Message getMessage();
}