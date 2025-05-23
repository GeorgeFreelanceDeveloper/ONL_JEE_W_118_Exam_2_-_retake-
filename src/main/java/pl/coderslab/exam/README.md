## Task 1 (2 pts)

1. Create an **index.jsp** file with a link to the **/someCookie** servlet.
2. Create a servlet available at **someCookie**, retrieving data by **GET**.
3. In the servlet, retrieve the **login** parameter and then create a cookie called **cookieLogin** with the value transferred.


## Task 2 (4 pts)

1. Create a `Message` class that will contain properties:
 - title - String
 - author - String
 - age - int
 - message - String
2. Create a servlet available at **/sendMessage** which will display the form from the JSP file with fields that are compatible with the `Message` class. 
3. The form should be sent by POST to the second servlet available at **/getMessage**. 
4. In the **doPost** servlet method, retrieve data from the request and create a `Message` class object,
  pass the object to the view and then display all its properties in separate lines.


## Task 3 (4 pts)

1. Create a servlet available at **/login*, which will display a form from the JSP view.
2. Display a form with the following fields on the page:
    * login - text field
    * password - password field
3. Check that the login is equal to **admin** and the password to **coderslab**.
5. If the data match, save your login in the session under the key `user` and then redirect to the page at **/success** displaying **Thank you**.
6. If the data does not match, redirect to the **/login** page.
