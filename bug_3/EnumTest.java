package bug_3;

public class EnumTest {
    public static void main(String[] args) {


        TestEnum[] values = TestEnum.values();

        for (TestEnum testEnum : values) {

            testEnum.printVeryImportantInformation(); //DOES NOT WORK
        }
    }
}
