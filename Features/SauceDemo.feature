
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  @tag2
  Scenario: Sauce Demo
    Given Login by entering "standard_user" and "secret_sauce"
	  When User chooses the product and clicks on Add to cart
    When User clicks on Cart link
		Then Product is added to Cart
