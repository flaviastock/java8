package java8.cap1;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Exercices {
	
	

	public static void main(String[] args) throws Exception {
		
		Path path = Paths.get("src\\dir");
		File file = path.toFile();
		String pattern = ".java";
		File[] files = file.listFiles();
		File[] filesEx4 = file.listFiles();

		System.out.println("Vai chamar sort: " + Thread.currentThread().getName());
		Arrays.sort(files, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				System.out.println("Comparator: " + Thread.currentThread().getName());
				return 0;
			}
		});
		
		
//		new Thread() {
//			@Override
//			public void run() {
//				super.run();
//				Arrays.sort(files, new Comparator<File>() {
//					@Override
//					public int compare(File o1, File o2) {
//						System.out.println("Comparator: " + Thread.currentThread().getName());
//						return 0;
//					}
//				});
//			}
//		}.start();
		
		
		
		// Exercice 2
		Stream.of(files).filter(File::isDirectory).forEach(System.out::println);
		System.out.println("-");
		Stream.of(file.listFiles(File::isDirectory)).forEach(System.out::println);
		System.out.println("-");
		Stream.of(file.listFiles(n -> n.isDirectory())).forEach(System.out::println);
		System.out.println("-");
		Stream.of(file.listFiles()).filter(File::isDirectory).forEach(System.out::println);
		System.out.println("-");
		Arrays.stream(files).filter(File::isDirectory).forEach(System.out::println);
		System.out.println("-");
		Files.list(path).filter(Files::isDirectory).forEach(System.out::println);
		System.out.println("-");
		Files.list(path).filter(n -> Files.isDirectory(n, LinkOption.NOFOLLOW_LINKS)).forEach(System.out::println);
		System.out.println("-");
		
		// Exercice 3
		Stream.of(file.list((pFile, pString) -> pString.endsWith(pattern))).forEach(System.out::println);
		System.out.println("-");
		FilenameFilter javaFiles = (dir, name) -> name.endsWith(pattern);
		Arrays.stream(file.list(javaFiles)).forEach(System.out::println);
		System.out.println("-");
//		Files.list(path).filter(pathMatcher::matches).forEach(System.out::println);
		
		// Exercice 4
		System.out.println("EX 4");
		Stream.of(filesEx4).sorted((first, second) -> {
				if(first.isDirectory() && !second.isDirectory()){
					return -1;
				}
				return 0;
			}).forEach(System.out::println);
		
		

		
		
		
		
		
//		
	}
}
