package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestMaximaArray {

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
	    void testMaximaNota1() {
	        int maxEsperado1 = 10;
	        int maxObtenido1 = MisArrays.maximaNota(array1);
	        assertEquals(maxEsperado1, maxObtenido1);
	    }

	    @Test
	    void testMaximaNota2() {
	        int maxEsperado2 = 8;
	        int maxObtenido2 = MisArrays.maximaNota(array2);
	        assertEquals(maxEsperado2, maxObtenido2);
	    }

	    @Test
	    void testMaximaNota3() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            MisArrays.maximaNota(array3);
	        });
	    }
	}
