 @etsyAll
Feature: Etsy search feature
   Agile Story: User should be able to enter search terms and see
   relevant results in the page and in the title


   Background: User is on the etsy home page
     Given User is on the etsy home page


  Scenario: Title verification
    Then User should see title is as expected

    #expected: Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

   @etsyWip
   Scenario: Title verification after search term
     When User searches "wooden spoon" in the search box
     And User clicks to search button
     Then User should see "wooden spoon"  in the Etsy title
