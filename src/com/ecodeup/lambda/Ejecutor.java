package com.ecodeup.lambda;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ejecutor {
	public static void main(String args[]) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		Optional<String> reduced = memberNames.stream()
		        .reduce((s1,s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
		System.out.println("que pasas tambien");
		System.out.println("nueva rama");
	}



}
