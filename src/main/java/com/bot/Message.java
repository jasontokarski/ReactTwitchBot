package com.bot;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.bot.commands.Command;

public class Message {
	private String username;
	private String channel;
	private Map<String, Command> commandList;
	
	@Autowired
    public Message(String username, String channel, Map<String, Command> commandList)
    {
        this.username = username;
        this.channel = channel;
        this.commandList = commandList;
    }
    
    public void receiveMessage(BufferedWriter bw, String userName, String message) {
    	String[] messageToken = message.split(" ");
    	String command = messageToken[0];
    	if(command.startsWith("!")) {
    		if(commandList.containsKey(command.substring(1))) {
    			commandList.get(command.substring(1)).execute(messageToken, bw, this);
    		}
    	}
    }
    	
    public void sendMessage(BufferedWriter bw, String message) {
    	try {
    		bw.write(message + "\r\n");
    		bw.flush();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}
