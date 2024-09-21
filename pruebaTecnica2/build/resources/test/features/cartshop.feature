#autor Andres Cruz

  Feature: Seleccionar dos productos de la categoría amor

    Yo como usuario
    Quiero agregar 2 productos de la categoría amor
    Para comprobar que se añadan al carrito de compras correctamente

    Background:
      Given "usuario" abre el sitio web de pruebas
    @Escenario1
    Scenario: Agregar 2 productos de la categoria amor al carro de compras
      And selecciona la categoria amor, elige aleatoriamente el primer producto
      When regresa a la categoria amor, elige aleatoriamente el segundo producto
      Then visualizara en el CARRITO los dos productos seleccionados

    @Escenario2
    Scenario: Seleccionar un producto de la categoría cumpleaños, agregarlo y <eliminarlo> del carro de compras
      And selecciona la categoria cumpleaños, elige aleatoriamente un producto
      When eliminar el producto seleccionado anteriormente
      Then validar que en el CARRITO se haya eliminado correctamente