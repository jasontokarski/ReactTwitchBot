package com.bot.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.bot.commands.Command;

@Component
@PropertySource("classpath:config.properties")
@ConfigurationProperties
public class BotProperties {
	@Value("${conn.username}")
    private String username;
	
	@Value("${conn.host}")
    private String host;
	
	@Value("${conn.pass}")
    private String pass;
	
	@Value("${conn.channel}")
    private String channel;
	
	@Value("${conn.port}")
    private String port;
	
	public Map<String, Command> commandList;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Map<String, Command> getCommandList() {
		return commandList;
	}

	@Autowired
	public void setCommandList(Map<String, Command> commandList) {
		this.commandList = commandList;
	}
}
