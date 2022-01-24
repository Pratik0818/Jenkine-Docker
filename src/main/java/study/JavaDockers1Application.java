package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDockers1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaDockers1Application.class, args);
		System.out.println(checkIfInputIsAnEvenNumber(122));
	}
	public static boolean checkIfInputIsAnEvenNumber(int number)
	{
		return number % 2 == 0;
	}

}
