Feature: Group Order Functionality
  #task3
Scenario: Creating the group order
When User enters the username 'guest1@microworks.com' and password 'Guest1!'
Then User clicks the remember me checkbox and signs in
And validates the title 'ORDER DETAILS - Weborder'
And User clicks group order box and next button
Then sends the word 'I love Cucumber' on the Invitees section
And sends the email address 'ahmet@gmail.cm' and 'mehmet@gmail.com' to invite List
Then User chooses delivery address My House and validate the address contains '3137 Laguna'
And User clicks create Group Order Button
#And User validate the header is 'View Group Order'
Then validates the word contains 'Your group order is now pending' from description
