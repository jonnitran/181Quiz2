package pkgCore;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class CarPaymentTest {

	@Test
	void test() {
			CarPayment car = new CarPayment(35000, 0 , 60 , 0.1);
			assertEquals(743.65, car.monthlyPayments(), .1);
			assertEquals(9618.79, car.totalInterest(), .1);
		}
	}


