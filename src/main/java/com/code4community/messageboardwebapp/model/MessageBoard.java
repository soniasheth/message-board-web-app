package com.code4community.messageboardwebapp.model;
import com.code4community.messageboardwebapp.model.Message;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;

@ApplicationScoped
@Singleton
public class MessageBoard {

    @Inject
    ArrayList<Message> board;

    public MessageBoard() {

        this.board = new ArrayList<>();
    }
    public void addMessage(Message message) {
        this.board.add(message);
    }

    public ArrayList<Message> getMessageBoard() {
        return this.board;
    }

}
