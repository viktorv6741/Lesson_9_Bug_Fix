package bug_3;

public enum TestEnum {
    N1() {
        @Override
        public String toString() {
            return "new string view for N1 looks like -> )";
        }

        @Override
        public void printVeryImportantInformation() {}

    },
    N2() {
        @Override
        public String toString() {
            return "new string view for N2 looks like -> )";
        }

        @Override
        public void printVeryImportantInformation() {
            System.out.println("very important information - for TestEnum child inner static class -> N2");
    }


    };


    TestEnum() {
        System.out.println("constructor in enum -> by default");
    }


    public abstract void printVeryImportantInformation();
}