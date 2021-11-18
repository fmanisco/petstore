Feature: Petstore feature

  Scenario Outline: 
    Given utente ha identificato Petstore: <id>
    When eseguo get
    Then ottengo <status>

    Examples: 
      | id         | status        |
     	| 1            | 200           |