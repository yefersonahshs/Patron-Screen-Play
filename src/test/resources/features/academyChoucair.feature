# Autor: Yeferson Estiven Naranjo Cardenas
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for automation course
  Scenario Outline: Search for automation course
    Given than estiven wants to learn automation at the academy Choucair
      | strUser  | strPassword |
      | <strUser> | <strPassword>|

    When he search for the course Recursos automatizacion Bancolombia on the choucair academy platform

      | strCourse  |
      | <strCourse> |


    Then he finds the course called resources Recursos automatizacion Bancolombia


      | strCourse  |
      | <strCourse> |

    Examples:
      |strUser|strPassword|strCourse  |
      |miusuario| micontraseña | Metodologia Bancolombia  |