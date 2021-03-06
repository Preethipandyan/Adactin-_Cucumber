Feature: Testing Adactin application end to end process

Scenario: Verify that user is able to login the application

Given User launch the application

When Title of login page is Adactin.com - Hotel Reservation system 
Then User enters username and password
Then User clicks on the login button
And User is on home page 

Scenario: Searching the Hotel 

When User selects the hotel location, hotel name and roon type  
Then User selects the number of rooms, check in date, check out date and number of person per room 
And User clicks on the search button 

Scenario: Selection of the Hotel 

When User selects the price and type of room 
And User clicks on the continue button 

Scenario: User is on Book A Hotel page 

When User enters his first name, last name and address
Then User enters Credit card details 
And User clicks on the Book Now button 

Scenario: User is on Booking Confirmation page 

When User takes a screenshot
Then User logs out of the application
And  User quits the browser                                                                                                                                                                                                                                                                                                                                                                                     