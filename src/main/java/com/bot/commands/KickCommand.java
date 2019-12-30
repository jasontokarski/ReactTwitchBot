package com.bot.commands;

import java.io.BufferedWriter;

import com.bot.Message;

public class KickCommand implements Command {
	private String question;
	private String[] options;
	
	public void execute(String[] messageToken, BufferedWriter bw, Message message) {
		message.sendMessage("Received Message");
	}
}
