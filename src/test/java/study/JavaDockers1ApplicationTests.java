package study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JavaDockers1ApplicationTests {

	@Test
	public void testInputIsEven(){
		 assertTrue(JavaDockers1Application.checkIfInputIsAnEvenNumber(22)); 

		 }

	
}
