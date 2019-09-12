Feature: AddTariff

 # Background: 
 #   Given User should be in the telecom home pages
  #  And click add tariff buttonn
 #   And click on submit buttons
  #  Then user should be displayed congratulation message

  Scenario: 
    Given User should be in the telecom home pages
    And click add tariff buttonn
    When User enter all the datas
    And click on submit buttons
    Then user should be displayed congratulation message

  Scenario: 
    Given User should be in the telecom home pages
    And click add tariff buttonn
    When User enter all the datass
      | 399 | 120 | 120 | 100 | 1 | 2 | 1 |
    And click on submit buttons
    Then user should be displayed congratulation message

  Scenario: 
    Given User should be in the telecom home pages
    And click add tariff buttonn
    When User enter all the datasss
      |   54 | 6995 | 121 |  78 |
      |  541 |  120 | 898 | 854 |
      |   56 |  120 | 212 | 787 |
      | 3235 |  100 | 986 | 656 |
      | 5544 |    1 | 565 |  78 |
      |  232 |    1 | 565 | 788 |
      |    3 |    1 | 898 | 656 |
    And click on submit buttons
    Then user should be displayed congratulation message

  Scenario: 
    Given User should be in the telecom home pages
    And click add tariff buttonn
    When User enter all the datassse
      | month | lm  | im | sms | lpm | ipm | sms1 |
      |    99 |  50 | 20 |  10 |  11 |  13 |   15 |
      |   199 | 100 | 40 |  20 |  21 |  33 |   45 |
      |   299 | 150 | 60 |  30 |  41 |  53 |   65 |
      |   399 | 200 | 80 |  40 |  61 |  73 |   85 |
    And click on submit buttons
    Then user should be displayed congratulation message
    #Given User should be in the telecom home pages
 #   And click add tariff buttonn
  #  When User enter all the datassse"<month>","<lm>","<im>","<sms>","<lpm>","<ipm>","<sms1>"
   #   | month | lm  | im | sms | lpm | ipm | sms1 |
    #  |    99 |  50 | 20 |  10 |  11 |  13 |   15 |
     # |   199 | 100 | 40 |  20 |  21 |  33 |   45 |
     # |   299 | 150 | 60 |  30 |  41 |  53 |   65 |
  #    |   399 | 200 | 80 |  40 |  61 |  73 |   85 |
   # And click on submit buttons
   # Then user should be displayed congratulation message
