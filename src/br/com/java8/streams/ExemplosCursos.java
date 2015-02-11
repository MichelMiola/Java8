package br.com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

class ExemplosCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Phyton", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

		/*
		 * cursos.stream().filter(c -> c.getAlunos() >= 100) .map(c ->
		 * c.getAlunos()) .forEach(total -> System.out.println(total));
		 */

		// Stream<String> nomeCursos = cursos.stream().map(c -> c.getNome());

		cursos.stream().filter(c -> c.getAlunos() > 50).map(c -> c.getAlunos())
				.forEach(total -> System.out.println(total));

		// cursos.forEach(c -> System.out.println(c.getNome()));

		/*
		 * int sumAlunos = cursos.stream().filter(c -> c.getAlunos() > 50)
		 * .mapToInt(Curso::getAlunos).sum();
		 */

		// Optional<Curso> cursoOption = cursos.stream().filter(c ->
		// c.getAlunos() > 100).findAny();

		// cursoOption.ifPresent(c -> System.out.println(c.getNome()));

		/*
		 * cursos = cursos.stream() .filter(c -> c.getAlunos() >=
		 * 100).collect(Collectors.toList());
		 * 
		 * cursos.stream().forEach(c -> System.out.println(c.getNome()));
		 */

		/*cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(
											c -> c.getNome(), 
											c -> c.getAlunos()
										)
						).forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));*/
		
		OptionalDouble media = cursos.stream()
		.mapToInt(c -> c.getAlunos()).average();
		
		

		
	}
}