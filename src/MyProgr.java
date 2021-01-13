import javax.jws.soap.SOAPBinding;

class MyProgr {
    public static void main(String[] args) throws java.io.IOException {
        char myLetter, ignore;
        int counter = 0;

        for (; ; ) {
            do {
                System.out.println("Enter the letter:");
                System.out.println("Click '.' to exit.");
                myLetter = (char) System.in.read();

                if (Character.isLetter(myLetter)) {
                    if (Character.isUpperCase(myLetter)) {
                        System.out.println((char) (myLetter + 32));
                        counter++;
                    }
                    if (Character.isLowerCase(myLetter)) {
                        System.out.println(myLetter = (char) (myLetter - 32));
                        counter++;
                    }
                } else System.out.println(myLetter);

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (myLetter != '.');


            System.out.println("Number of changes: " + counter);
            if (myLetter == '.') break;
        }
    }
}
