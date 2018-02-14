package br.com.tpa.brackets;

public class App 
{
    public static void main( String[] args )
    {
    	for (String input: args) {
    		if (BracketValidator.validarOrdemCaracteres(input)) {
        		System.out.println( "Ordem válida! " + input);
        	} else {
        		System.out.println( "Ordem inválida! " + input);
        	}
    	}
    }
}
