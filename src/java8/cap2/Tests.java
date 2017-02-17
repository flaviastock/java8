package java8.cap2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import java8.Exercise;

public class Tests implements Exercise {

	@Test
	@Override
	public void perform() {
		try {
			String contents = new String(Files.readAllBytes(Paths.get("src//resources//alice.txt")), StandardCharsets.UTF_8); // Read file into string
			
			//2.1
//			Lit<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
//			int count = 0;
//			for (String w : words) {
//				if (w.length() > 12)
//					count++;
//			}
			
//			long count = words.stream().filter(w -> w.length() > 12).count();
			
//			long count = words.parallelStream().filter(w -> w.length() > 12).count();
//			System.out.println(count);
			
			//2.2
//			Stream<String> words = Stream.of(contents.split("[\\P{L}]+")); // split returns a String[] array
//			Stream<String> song = Stream.of("gently", "down", "the", "stream");
//			Stream<String> silence = Stream.empty();
//			   // Generic type <String> is inferred; same as Stream.<String>empty()
//			Stream<String> echos = Stream.generate(() -> "Echo");
//			Stream<Double> randoms = Stream.generate(Math::random).limit(10);
//			Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(10);
//			integers.forEach(System.out::println);
//			Stream<String> words2 = Pattern.compile("[\\P{L}]+").splitAsStream(contents);
//			
//			try(Stream<String> lines = Files.lines(Paths.get("src//resources//alice.txt"))) {
//				System.out.println(lines.count());
//			}
			
			List<String> wordList = Arrays.asList(contents.split("[\\P{L}]+"));
			Stream<String> words3 = wordList.stream();
			Stream<String> longWords = words3.filter(w -> w.length() > 12);
//			longWords.forEach(System.out::println);
			
//			longWords = longWords.skip(1).limit(3);
//			longWords.forEach(System.out::println);
			
//			Stream<String> lowercaseWords = longWords.map(String::toLowerCase);
//			lowercaseWords.forEach(System.out::println);
			
//			Stream<Character> firstChars = longWords.map(s -> s.charAt(0));
//			firstChars.forEach(System.out::println);
			
//			Stream<Stream<Character>> result = longWords.map(w -> characterStream(w));
//			result.forEach(System.out::println);
			
//			Stream<Character> letters = longWords.flatMap(w -> characterStream(w));
//			letters.forEach(System.out::println);
			
//			Stream<Character> combined = Stream.concat(
//					   characterStream("Hello"), characterStream("World"));
//					   // Yields the stream ['H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd']
//			combined.forEach(System.out::println);
			
//			Object[] powers = Stream.iterate(1.0, p -> p * 2)
//					.peek(e -> System.out.println("Fetching " + e)).limit(20).toArray();
			
//			Stream<String> uniqueWords
//			   = Stream.of("merrily", "merrily", "merrily", "gently").distinct();
//			uniqueWords.forEach(System.out::println);
			
//			Stream<String> longestFirst =
//					longWords.sorted(Comparator.comparing(String::length).reversed());
//			longestFirst.forEach(System.out::println);
			
//			Optional<String> largest = longWords.max(String::compareToIgnoreCase);
//			if (largest.isPresent())
//			   System.out.println("largest: " + largest.get());
//			
//			List<String> teste = new ArrayList<>();
//			largest.ifPresent(n -> teste.add(n));
//			teste.forEach(System.out::println);
			
//			Optional<Boolean> added = largest.map(teste::add);
//			System.out.println(added);
//			
//			Optional<String> startsWithQ = longWords.filter(s -> s.startsWith("Q")).findFirst();
//			if (startsWithQ.isPresent())
//				   System.out.println("largest: " + startsWithQ.get());
			
//			String result = startsWithQ.orElse("");
//			String result = startsWithQ.orElseGet(() -> System.getProperty("user.dir"));
//			String result = startsWithQ.orElseThrow(NoSuchElementException::new);
//			System.out.println(result);
			
			
//			Optional<String> startsWithQ = longWords.parallel().filter(s -> s.startsWith("c")).findAny();
//			if (startsWithQ.isPresent())
//				   System.out.println("largest: " + startsWithQ.get());
			
//			boolean aWordStartsWithQ = longWords.parallel().anyMatch(s -> s.startsWith("c"));
//			boolean aWordStartsWithQ = longWords.parallel().allMatch(s -> s.startsWith("c"));
//			boolean aWordStartsWithQ = longWords.parallel().noneMatch(s -> s.startsWith("Q"));
//			System.out.println(aWordStartsWithQ);
			
//			Double result = inverse(2.0).flatMap(Tests::squareRoot);
			
//			Double result = Optional.of(2.0).flatMap(Tests::inverse).flatMap(Tests::squareRoot).orElse(0.0);
//			System.out.println(result);
			
//			Stream<Integer> values = Stream.of(1, 2);
//			Optional<Integer> sum = values.reduce((x, y) -> x + y);
//			if (sum.isPresent())
//			   System.out.println("sum: " + sum.get());
			   
//			Stream<Integer> values = Stream.empty();
//			Integer sum = values.reduce(0, (x, y) -> x + y);
//			System.out.println("sum: " + sum);
			   
//			int result = longWords.reduce(0, (total, word) -> total + word.length(), (total1, total2) -> total1 + total2);
//			System.out.println(result);
			
//			String[] result = longWords.toArray(String[]::new);
			
//			HashSet<String> result = longWords.collect(HashSet::new, HashSet::add, HashSet::addAll);
//			List<String> result = longWords.collect(Collectors.toList());
//			Set<String> result = longWords.collect(Collectors.toSet());
//			TreeSet<String> result = longWords.collect(Collectors.toCollection(TreeSet::new));
//			result.forEach(System.out::println);
			String result = longWords.collect(Collectors.joining());
			System.out.println(result);
			
//			IntSummaryStatistics summary = longWords.collect(Collectors.summarizingInt(String::length));
//			double averageWordLength = summary.getAverage();
//			System.out.println(averageWordLength);
//			double maxWordLength = summary.getMax();
//			System.out.println(maxWordLength);
			
//			words3.parallel().filter(w -> w.length() > 12).forEachOrdered(System.out::println);
			
//			Stream<Person> people = Stream.of(new Person(0, "Maria"), new Person(1, "Jose"), new Person(2, "Joao"));
//			Map<Integer, String> idToName = people.collect(Collectors.toMap(Person::getId, Person::getName));
//			System.out.println(idToName);
//			Map<Integer, Person> idToPerson = people.collect(Collectors.toMap(Person::getId, Function.identity()));
//			System.out.println(idToPerson);
			
//			Map<Integer, Person> idToPerson = people
//			.collect(Collectors.toMap(Person::getId, Function.identity(), (existingValue, newValue) -> {
//				throw new IllegalStateException();
//			}, TreeMap::new));
//	
//			System.out.println(idToPerson);
			
//			Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
//			Map<String, String> languageNames = locales.collect(Collectors.toMap(l -> l.getDisplayLanguage(),
//					l -> l.getDisplayLanguage(l), (existingValue, newValue) -> existingValue));
//			System.out.println(languageNames);
			
//			Map<String, Set<String>> countryLanguageSets = 
//					locales.collect(Collectors.toMap(l -> l.getDisplayCountry(), l -> Collections.singleton(l.getDisplayLanguage()), (a, b) -> { // Union of a and b
//						Set<String> r = new HashSet<>(a);
//						r.addAll(b);
//						return r;
//					}));
//			System.out.println(countryLanguageSets);
			
//			Map<String, List<Locale>> countryToLocales = locales.collect(Collectors.groupingBy(Locale::getCountry));
//			System.out.println(countryToLocales);
//			Map<String, Set<Locale>> countryToLocaleSet = locales.collect(Collectors.groupingBy(Locale::getCountry, Collectors.toSet()));
//			System.out.println(countryToLocaleSet);
//			Map<String, Long> countryToLocaleCounts = locales.collect(Collectors.groupingBy(Locale::getCountry, Collectors.counting()));
//			System.out.println(countryToLocaleCounts);
//			List<Locale> swissLocales = countryToLocales.get("CH");
//			System.out.println(swissLocales);
			
//			Map<Boolean, List<Locale>> englishAndOtherLocales = locales.collect(Collectors.partitioningBy(l -> l.getLanguage().equals("en")));
//			List<Locale> englishLocales = englishAndOtherLocales.get(true);
//			System.out.println(englishLocales);
			
//			Stream<City> cities = Stream.of(new City("Curitiba", 100, "Parana"), new City("Apucarana", 200, "Parana"), new City("Campinas", 500, "Sao Paulo"));
//			Map<String, Integer> stateToCityPopulation = cities.collect(Collectors.groupingBy(City::getState, Collectors.summingInt(City::getPopulation)));
//			System.out.println(stateToCityPopulation);
			
//			Map<String, Optional<City>> stateToLargestCity = cities.collect(Collectors.groupingBy(City::getState, Collectors.maxBy(Comparator.comparing(City::getPopulation))));
//			System.out.println(stateToLargestCity);
			
//			Map<String, Optional<String>> stateToLongestCityName = cities.collect(
//					Collectors.groupingBy(City::getState, Collectors.mapping(City::getName, Collectors.maxBy(Comparator.comparing(String::length)))));
//			System.out.println(stateToLongestCityName);
			
//			Map<String, Set<String>> countryToLanguages = locales
//					.collect(Collectors.groupingBy(l -> l.getDisplayCountry(), Collectors.mapping(l -> l.getDisplayLanguage(), Collectors.toSet())));
//			System.out.println(countryToLanguages);
			
//			Map<String, IntSummaryStatistics> stateToCityPopulationSummary = cities
//					.collect(Collectors.groupingBy(City::getState, Collectors.summarizingInt(City::getPopulation)));
//			System.out.println(stateToCityPopulationSummary);
			
//			Map<String, String> stateToCityNames = cities.collect(Collectors.groupingBy(City::getState,
//					Collectors.reducing("", City::getName, (s, t) -> s.length() == 0 ? t : s + ", " + t)));
//			System.out.println(stateToCityNames);
			
//			Map<String, String> stateToCityNames = cities
//					.collect(Collectors.groupingBy(City::getState, Collectors.mapping(City::getName, Collectors.joining(", "))));
//			System.out.println(stateToCityNames);
			
//			IntStream stream = IntStream.of(1, 1, 2, 3, 5);
//			stream = Arrays.stream(values, from, to); // values is an int[] array
			
//			IntStream zeroToNinetyNine = IntStream.range(0, 100); // Upper bound is excluded
//			zeroToNinetyNine.forEach(System.out::println);
//			IntStream zeroToHundred = IntStream.rangeClosed(0, 100); // Upper bound is included
//			zeroToHundred.forEach(System.out::println);
			
//			String sentence = "\uD835\uDD46 is the set of octonions.";
//			   // \uD835\uDD46 is the UTF-16 encoding of the letter Image, unicode U+1D546
//
//			IntStream codes = sentence.codePoints();
//			   // The stream with hex values 1D546 20 69 73 20 ...
//			codes.forEach(System.out::println);
			
//			IntStream lengths = longWords.mapToInt(String::length);
//			lengths.forEach(System.out::println);
			
//			Stream<Integer> integers = IntStream.range(0, 100).boxed();
//			integers.forEach(System.out::println);
			
//			Stream<String> parallelWords = Stream.of(contents.split("[\\P{L}]+")).parallel();
//			
//			
//			int[] shortWords = new int[12];
//			parallelWords.parallel().forEach(
//			   s -> { if (s.length() < 12) shortWords[s.length()]++; });
//			      // Error—race condition!
//			System.out.println(Arrays.toString(shortWords));
			
//			Stream<String> words = wordList.stream();
//			wordList.add("END"); // Ok -> This cause java.lang.UnsupportedOperationException
//			long n = words.distinct().count();
			
//			Stream<String> longWords = words.filter(s -> s.length() >= 12);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray())
			result.add(c);
		return result.stream();
	}

	public static Optional<Double> inverse(Double x) {
		return x == 0 ? Optional.empty() : Optional.of(1 / x);
	}

	public static Optional<Double> squareRoot(Double x) {
		return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
	}

}
