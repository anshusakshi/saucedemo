Feature: Amazon Search Feature

Scenario: User searches for a product on Amazon
  Given User is on Amazon homepage
  When User searches for "laptops"
  Then Search results for "laptops" are displayed