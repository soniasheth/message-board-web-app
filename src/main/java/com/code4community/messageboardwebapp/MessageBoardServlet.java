package com.code4community.messageboardwebapp;

import com.code4community.messageboardwebapp.model.Message;
import com.code4community.messageboardwebapp.model.MessageBoard;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/")
public class MessageBoardServlet extends HttpServlet {

    //use the CDI dependency injection method - takes care of instantiation
    @Inject
    private MessageBoard messageList;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<Message> messages = messageList.getMessageBoard();
        request.setAttribute("messages", messages);

        request.getRequestDispatcher("src/main/webapp/index.jsp").forward(request, response);
    }
}
