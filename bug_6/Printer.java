package bug_6;



    public class Printer {

        private String name;


        public void setName(String name) {
            this.name = name;
        }

        public void print()
        {
            printString(name);
        }

        private void printString(String s) {
            System.out.println(s + " (" + s.length() + ")");
        }


////////////////////////////////////////////////////////////////////////////////////////////////////


        public static void main(String[] args) {

            Printer printer = new Printer();

            printer.setName("Some_name");  // Need to declare variable
            printer.print();

        }

    }

