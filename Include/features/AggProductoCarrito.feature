#Author: dalvarado@intergrupo.com

Feature: Agregar Producto Al Carrito
  Este es un feature creado para la funcionalidad de agregar productos al carrito

  Scenario Outline: Agregar Producto Al Carrito - Con Usuario No Registrado
    Given el usuario ingresa a la website
    When el agrega un producto con las siguientes caracteristicas <categoria> <subcategoria> <producto> <cantidad>
    Then el verifica que el producto fue agregado correctamente con el mensaje <mensaje>
	
	Examples:
		 | categoria   | subcategoria | producto | cantidad | mensaje                          |
     | Computación | Monitores    | F22T350  | 1        | Tu producto se agregó al carrito |