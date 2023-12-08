package com.code4community.messageboardwebapp;

import com.code4community.messageboardwebapp.model.Message;
import com.code4community.messageboardwebapp.model.MessageBoard;
import jakarta.inject.Inject;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PostMessageServlet")
public class PostMessageServlet extends HttpServlet {

    //use the CDI dependency injection method - takes care of instantiation
    @Inject
    private MessageBoard board;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String text = request.getParameter("message");

        try {
            if (text != null && !text.isEmpty() && text.length() <= 128) {
                Message message = new Message(text);
                board.addMessage(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect(request.getContextPath() + "/");

//        P
//        System.out.println("username: " + text);
//
//        // do some processing here...
//
//        // get response writer
//        PrintWriter writer = response.getWriter();
//
//        // build HTML code
//        String htmlRespone = "<html>";
//        htmlRespone += "<h2>Your username is: " + text + "<br/>";
//        htmlRespone += "</html>";
//
//        // return response
//        writer.println(htmlRespone);

    }
}
