Feature: Registration page feature

  Scenario Outline: Registration for single user
    Given user is on login page
#    When user clicks on Signin Button
#    Then user should get the Login page
    And user enters "<Email Address>" to authenticate
    Then user enter "<FirstName>","<LastName>","<Email>","<Password>","<AddFirstName>","<AddLastName>","<Address>","<City>","<State>","<Zip>","<Country>", and "<MobileNo>"
    And user validates registarion is successfull
    Examples:
      | Email Address      | FirstName | LastName | Email         | Password | AddFirstName | AddLastName | Address | City | State | Zip   | Country       | MobileNo   |
      | test2121@gmail.com | Bob       | B        | bob@gmail.com | Bob@123  | B            | USA         | Mys     | lowa | lowa  | 57119 | United States | 1111155555 |

#  Scenario : Registration for multiple user user
#    Given user is on login page
##    When user clicks on Signin Button
##    Then user should get the Login page
#    Then user enters "<EmailAddress>" to autneticate with "<FirstName>","<LastName>","<Email>","<Password>","<AddFirstName>","<AddLastName>","<Address>","<City>","<State>","<Zip>","<Country>", and "<MobileNo>" and validates
#      | EmailAddress      | FirstName | LastName | Email         | Password | AddFirstName | AddLastName | Address | City | State | Zip   | Country       | MobileNo   |
#      | test2121@gmail.com | Bob       | B        | bob@gmail.com | Bob@123  | B            | USA         | Mys     | lowa | lowa  | 57119 | United States | 1111155555 |
#      | test2121@gmail.com | Bob       | B        | bob@gmail.com | Bob@123  | B            | USA         | Mys     | lowa | lowa  | 57119 | United States | 1111155555 |
#      | test2121@gmail.com | Bob       | B        | bob@gmail.com | Bob@123  | B            | USA         | Mys     | lowa | lowa  | 57119 | United States | 1111155555 |
#      | test2121@gmail.com | Bob       | B        | bob@gmail.com | Bob@123  | B            | USA         | Mys     | lowa | lowa  | 57119 | United States | 1111155555 |
#      | test2121@gmail.com | Bob       | B        | bob@gmail.com | Bob@123  | B            | USA         | Mys     | lowa | lowa  | 57119 | United States | 1111155555 |
