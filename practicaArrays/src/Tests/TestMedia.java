package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestMedia {
    private static int[] array1;
    private static int[] array2;
    private static int[] array3;

    @BeforeAll
    public static void setUp() {
        array1 = new int[]{5, 8, 7, 9, 10};
        array2 = new int[]{4, 6, 6, 8};
        array3 = new int[]{-225, 18, 12, 19, 10};
    }
	@Test
	void testMediaNotas1() {
		
		float mediaEsperada1 =7.8f;
		float mediaObtenida1 = MisArrays.mediaNotas(array1);
		assertEquals(mediaEsperada1, mediaObtenida1,0.001);
	
		
	}
	@Test
	void testMediaNotas2() {
		
		float mediaEsperada2 =5.0f;
		float mediaObtenida2 = MisArrays.mediaNotas(array2);
		assertEquals(mediaEsperada2, mediaObtenida2,0.001);
	}
	@Test
	void testMediaNotas3() {
	
		assertThrows(IllegalArgumentException.class, () -> MisArrays.mediaNotas(array3));	
	}
}
