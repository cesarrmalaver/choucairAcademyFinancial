#Autor: Cesar Rodrigo Malaver Flor

@Stories
Feature: Academy Choucair
  As a user, I want to learn how automate in screenplay at the Choucair Academy with the automation course
  @scenario1:
  Scenario: Search for a automation course
    Given that Cesar wants to learns automation at the academy Choucair
    | strUser | strPassword |
    | 1144139156 | Choucair2021* |
    When  he search for the course Recursos Automatización Bancolombia on the Choucair academy platform
    Then he finds the course called resources Usted no tiene permiso para ver esta lista de cursos.