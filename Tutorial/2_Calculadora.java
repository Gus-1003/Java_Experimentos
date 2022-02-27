// Classe basica para a realizacao de operações básicas
class Calculadora {

  public static void main(String[] args) {
	    int a, b, c, d, e, f, g;
	    // int = afirma que as variaveis a seguir armazenam valores numericos do conjunto dos inteiros
	    
	    a = 5; 
	    // o sinal de "=" atribui valores as variaveis
	    
	    System.out.println("O valor de 'a'= " + a);
	    // o sinal de "+" concatena textos e soma o valor de valores númericos

	    b = 15; 
	    System.out.println("O valor de 'b'= " + b);
	    
	    c = a + b;
	    System.out.println("O valor da soma de A e B = " + c); //console = 20

	    d = a - b;
	    System.out.println("O valor da diferenca de A e B = " + d); //console = -10

	    e = a * b;
	    System.out.println("O valor da multiplicacao de A e B = " + e); //console = 75

	    f = b / a;
	    System.out.println("O valor da divisao de A e B = " + f); //console = 3
	    
	    g = b % a;
	    System.out.println("O valor da resto de A e B = " + g); //console = 0
  }
}
