package com.bot.commands;

import java.io.BufferedWriter;

import com.bot.Message;

public interface Command {
	public void execute(String[] messageToken, BufferedWriter bw, Message message);
}
