# Que me pongo
# Iteración 1

1) Termine optando por utilizar enums para los tipos de prenda porque me facilito poder hacer la relación con las categorias, y luego así su comparación.
2) Los enum también me permiten su facil expansión en caso de tener que agregar más en un futuro.

![Screenshot 2021-04-10 03-49-00](https://i.imgur.com/fAWeNdM.png)


# Iteración 2

1) Uso un enum para las tramas porque ya se sabe cuales van a ser, creo igual que podría ser valido usar String.
2) En un principio intente usar un solo método para la validación de las variables de PrendaBorrador pero me ocaciono inconveniente al momento de tener que crear la prenda, por lo cual termine optando por validar en el momento que seteo las variables.
3) Los métodos con los cuales corroboraba que una prenda sea valida los saque de la clase Prenda y los pase a PrendaBorrador, ya que para poder crear la prenda necesitaba que esta misma este completa.
4) Al inicio de la iteración había creado una clase llamada Tela donde se aclararia la trama, material y color, luego opte por borrar la clase.
5) En PrendaBorrador use métodos elegir..() porque considere que al estar haciendo validaciones dentro de los mismos no era correcto usar setters. 

![Screenshot 2021-04-10 03-49-00](https://i.imgur.com/KSCdv3z.png)
