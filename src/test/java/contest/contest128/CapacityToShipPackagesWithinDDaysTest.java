package contest.contest128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapacityToShipPackagesWithinDDaysTest {
	private CapacityToShipPackagesWithinDDays solution = new CapacityToShipPackagesWithinDDays();

	@Test
	public void test0() {
		int[] weights = {1,2,3,4,5,6,7,8,9,10};
		int D = 5;
		Assertions.assertEquals(15, solution.shipWithinDays(weights, D));
	}

	@Test
	public void test1() {
		int[] weights = {1,2,3,1,1};
		int D = 4;
		Assertions.assertEquals(3, solution.shipWithinDays(weights, D));
	}

	@Test
	public void test2() {
		int[] weights = {3,2,2,4,1,4};
		int D = 3;
		Assertions.assertEquals(6, solution.shipWithinDays(weights, D));
	}

	@Test
	public void test3() {
		int[] weights = {10,50,100,100,50,100,100,100};
		int D = 5;
		Assertions.assertEquals(160, solution.shipWithinDays(weights, D));
	}
}
