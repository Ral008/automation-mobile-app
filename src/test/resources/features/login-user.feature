Feature: Login aplicacion mobile
  Como usuario
  Quiero ingresar a la aplicacion mobile para su validacion
  
  Scenario: Ingresar aplicacion mobile
    Given iniciar la app   
    When ingresamos con las credenciales con usuario "admin" y password "admin"
    Then mover el scroll hacia abajo hasta encontrar la opcion Carousel
    And hacer tap en "Carousel"  
    And que el primer elemento mostrado es aquel que dice "1"