package junit5;

import org.junit.jupiter.api.*;


// in order for us not to have to mark all of these Before/After setup and cleanup methods as static,
// we will need to also add annotation for TestInstance.

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    public class FirstTestClass {

        // accessModifier returnType nameOfTheMethod(params)
        // we can omit accessModifier (NOTE: never use private)
        // a test method cannot return any value, so return type must be:  void
        @BeforeAll
        void beforeAll(){
            //in selenium, start the browser here
            System.out.println("--This is the BeforeAll method");
        }

        @BeforeEach
            // will run before EACH test runs
        void beforeEach(){
            System.out.println("----This is the @BeforeEach method");
        }

        //cleaning up after all the tests are done
        @AfterAll
        void afterAll(){
            System.out.println("--This is the @AfterAll method");
        }

        //cleaning up after each test
        @AfterEach
        void afterEach(){
            System.out.println("----This is the @AfterEach method");
        }

        @Test
        // @DisplayName("US1233 - TC11 - this method is the first one")
        void firstMethod(){
            System.out.println("This is the FIRST test method");
        }

        @Test
        @DisplayName("US1234 - TC12 - this method is the second one")
        void secondMethod(){
            System.out.println("This is the SECOND test method");
        }

    }
