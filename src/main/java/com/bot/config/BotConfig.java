package com.bot.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bot.commands.Command;
import com.bot.service.BotService;
import com.bot.service.BotServiceImpl;

@Configuration
@ComponentScan
public class BotConfig {

	@Bean
	public BotService botService(BotProperties botProperties) {
		return new BotServiceImpl(botProperties);
	}
	
	@Bean
	public Map<String, Command> commandList() {
		return new HashMap<String, Command>();
	}
}
