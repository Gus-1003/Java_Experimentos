class HelloWorld {
  
// class e uma palavra-chave para definir uma nova classe
// HelloWorld e o nome dessa classe
  
  public static void main(String[] args) {
    /* 
    - public = Modificador de acesso, permite que o JVM possa invocá-la de fora da classe de origem
    - static = metodo que pode ser chamado sem necessitar instanciar um objeto
    - void = metodo que nao retorna valores
    - main() = Nomeclatura do metodo principal. identificador que o JVM procura como ponto de partida do programa java.
    - String[] = Ele armazena argumentos de linha de comando Java e é uma matriz de classe tipo java.lang.String. Aqui, o nome da matriz String é args, mas não é fixo e o usuário pode usar qualquer nome no lugar dele.
    */
    System.out.println("Hello world!");
    
    // System = classe do pacote java.lang
    // out = membro estatico da classe System sendo uma instancia do java.io.PrintStream.
    // "plintln" = metodo do java.io.PrintStream - metodo encarregado de imprimir mensagens no console
  }
  
}

// Fonte: https://www.geeksforgeeks.org/java-main-method-public-static-void-main-string-args/#:~:text=String%20%5B%5D%20args%3A%20It%20stores%20Java%20command%20line,can%20use%20any%20name%20in%20place%20of%20it.
