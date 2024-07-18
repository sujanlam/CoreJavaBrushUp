package org.src.aaatestings.beforeaftereach;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapesTest {
    ShapesTest(){
        System.out.println("Testing shapes instance created!");
    }
    @BeforeAll
            static void setUpBeforeClass() throws Exception {
        System.out.println("Making things ready!!!");
    }
    @AfterAll
    static void cleanUpAfterClass() throws Exception {
        System.out.println("Cleaning up things!!!");
    }
    Shapes shapes;

    @BeforeEach
    void init(){
        shapes = new Shapes();
    }

    @AfterEach
    void tearDown(){
        System.out.println("Test ended!");
    }

    @Test
    void testComputeSquareArea() {
        assertEquals(256, shapes.computeSquareArea(16.0));
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(78.55, shapes.computeCircleArea(5), () -> "Area of circle is wrong!!");
    }

}