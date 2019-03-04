Feature: Refund faulty items
  Broken items should be refunded if you have receipt

  Background:
    Given Setup Dependency Injection

  Scenario Outline: test
    Given I <try> this where <item> for <price>
    When she return the <item> to the thing
    Then she will get <price> refffuundd
    Examples:
      | try    | item  | price |
      | Joanne | b     | 133   |
      | Arjun  | kell  | 546   |
      | Billy  | thing | dads  |