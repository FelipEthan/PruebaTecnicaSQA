Feature: Agregar productos al carrito de compras
  @Test1
  Scenario: Agregar 2 producto al carrito de compras
    Given Que estoy en la página de un producto
    When Selecciono el producto y agrego al carrito
    And Selecciono un nuevo producto y lo agrego al carrito
    Then Entonces el carrito debe contener 2 unidades del producto

  @Test2
  Scenario: Seleccionar un producto de la opción Girasoles y eliminarlo
    Given Que estoy en la página de un producto de girasoles
    When Selecciono el producto girasol
    And  Lo agrego al carrito y lo elimino del carrito
    Then Entonces el carrito debe estar vacío