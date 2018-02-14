package br.com.tpa.brackets;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;

public class BracketValidator {
	
	private static final String SOMENTE_BRACKETS = "^[\\[\\]\\{\\}\\(\\)]+$";
	
	public static boolean validarOrdemCaracteres (String brackets) {
		if (brackets == null || brackets.trim().isEmpty()) {
			return false;
		}
		if (!Pattern.matches(SOMENTE_BRACKETS, brackets)) {
			return false;
		}
		Deque<Character> deque = new ArrayDeque<Character>();
		for (char posicao : brackets.toCharArray()) {
			if (posicao == '{' || posicao == '(' || posicao == '[') {
				deque.addFirst(posicao);
			}
			if (posicao == '}' || posicao == ')' || posicao == ']') {
				if (deque.isEmpty()) {
					return false;
				} else if (!verificarCorrespondenciaCaracteres(deque.removeFirst(), posicao)) {
					return false;
				} 
			} 
		}
		return deque.isEmpty();
	}
	
	private static boolean verificarCorrespondenciaCaracteres (char bracket1, char bracket2) {
		if (bracket1 == '('  && bracket2 == ')') {
			return true;
		} else if (bracket1 == '{'  && bracket2 == '}') {
			return true;
		} else if (bracket1 == '['  && bracket2 == ']') {
			return true;
		} else {
			return false;
		}
	}
}
