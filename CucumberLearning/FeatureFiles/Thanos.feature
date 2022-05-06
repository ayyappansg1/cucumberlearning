@TaggedHooks
Feature: Test Tagged hooks
@First
Scenario: This is First scenario
	Given This is first Step
	When This is Second Step
	Then This is Third Step
@Second
Scenario: This is Second scenario
	Given This is first Step
	When This is Second Step
	Then This is Third Step
@Third
Scenario: This is Third scenario
	Given This is first Step
	When This is Second Step
	Then This is Third Step
