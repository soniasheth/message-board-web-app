**Purpose: ** A Anonymous Message Board that a user can post a message to a board to. Messages show up in order of most recent posted to least recent. 

**Requirements / Components + Interactions: **
Admittedly, it doesn’t meet many of the program requirements. It creates a web page with a form to submit a message to. The messages don't show up anywhere yet though.
Admittedly, I started this super late, thinking it was a simple MVC gui. I was completely unfamiliar with HTML and web dev, so in the time I had, I spent a lot of it learning about HTML, servlets, configuring my environment for web dev,
and overall how web apps works, rather that writing actual code. Though it’s not a complete program, I’ll share what I have, what I learned, and still need to learn.

The model of the program includes the MessageBoard and Message, which holds all the data of messages inputted by the user. In terms of the web app, the index.jps
to serves at the view with the HTML code, displaying things to the user and handing data they input. There is a form for the user to put in a message and a servlet connected as an action to that form. 
This PostMessageServlet is the controller with a doPost, handling client requests and giving responses. Upon the client request of submitting the form, the idea is that it should grab the text
from the request, check the text for validity, and create a Message object with it and then store add that Message to the singleton MessageBoard object. 
The response would be to just redirect the page to the same page the user is on - we don't want another page to show up. 
The MessageBoardServlet is mapped to the root URL ("/") and so that redirect message in the PostMessageServlet should also redirect to the MessageBoardServlet. 
The MessageBoardServlet then has a doGet method that take all the messages from the singleton MessageBoard object, set a request attribute for these messages and then redirects 
to the index.jsp (view), which then gets the 'messages' attribute, which is an ArrayList of the messages. A foreach loop here should display all the messages.

Above, not all that works, it is the idea of how I want it to work. I had trouble initilizating the MessageBoard object that holds all the messages. It should be a singleton object that is only inited once.
But with no real controller and main, I didn't know where to init it. I had trouble thinking through the structure of a web dev app. I learned about the CDI @Inject decorators, which should have helped me do the initing under the hood, but 
something is going wrong there. I also don't think my two Servlets are properly connected / redirecting content - some debugging to do there. 

I didn't get around to learning more about JavaScript to make it so that multiple users on different computers can run the web app. Also, would have loved to created CSS files 
for formatting, but also time didn't permit for that. Needless to say, there is a lot to learn and I will be taking a Web Dev course now. :) Thanks for looking at my incomplete app - glad I 
attempted it, because I learned a lot and realized I am actually interested in web dev and getting more familiar with it!

**Running Application **
Make sure TomCat is downloaded and installed on your laptop and IDE. Go to the index.jps file and press run. I used Intellij as my IDE. 
