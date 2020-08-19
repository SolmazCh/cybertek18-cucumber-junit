Feature: SmartBear Order feature
  Agile Story: User should fill out the form and verify given information is in the list

@smartOrder
  Scenario: SmartBear Order process
    Given  User is logged into SmartBear Tester account and on Order page
   And User is on Order Page and  fills out the form as followed:
   Then User selects "FamilyAlbum" from product dropdown
   Then User enters "4" to quantity
   Then User enters "John Wick" to costumer name
   Then User enters "Kinzie Ave" to street
   Then User enters "Chicago" to city
   Then User enters "Il" to state
   Then User enters "60056" as a postal code
   Then User selects "Visa" as card type
   Then User enters "1111222233334444" to card number
   Then User enters "12/22" to expiration date
   Then User clicks process button
   Then User verifies "John Wick" is in the list


