Feature: Refund faulty items
  Broken items should be refunded if you have receipt

  Background:
    Given Setup Dependency Injection

  Scenario Outline: <name> returning a broken <item> for a refund of <price>
    Given that <name> bought a faulty <item> for <price>
    When she return the <item> to the store
    Then she will get <price> refunded

    Examples:
    | name    | item | price |
    | Joanne | kettle | 100 |
    | Arjun  | kettle | 100 |
    | Jimmy  | bell   | 150 |