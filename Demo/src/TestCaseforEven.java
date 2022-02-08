import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseforEven {
    Main obj=null;
	@BeforeEach
	void setUp() throws Exception {
		obj=new Main();
	}

	@Test
	void testIsEven() {
		//fail("Not yet implemented");
		assertFalse(obj.isEven(3));
		
	}   

}
