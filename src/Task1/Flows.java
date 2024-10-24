package Task1;

public class Flows {

    public void methodA(String input) {
        System.out.println("j");
        if (!input.equals("start")) {
            System.out.println("o");
            methodC("Java er super sjovt");
        } else {
            System.out.println("a");
        }
        if (input.equals("start")) {
            System.out.println("v");
        }
    }

    public void methodB(String start) {
        System.out.println("a");
    }

    public int methodC(String input) {
        if (input.length() < 15) {
            System.out.println("e");
        } else {
            System.out.println("v");
            if (input.equals("Java er super sjovt")) {
                System.out.println("t");
            }
        }
        return input.length() * 2;
    }


    public void methodD(int number) {
        if (number > 5) {
            System.out.println("r");
        }
        System.out.println("s");
        methodA("notStart");
    }

}










 /*public void aMethod() {
        System.out.println("H");
    }

    public String bMethod() {
        String str = "aMethod";
        return str;
    }

    public void cMethod(String str) {
        if (str.equals("aMethod")) {
            System.out.println("e");
        } else {
            System.out.println("o");
        }
    }

    public void dMethod(int number) {
        if (number >= 5 && number < 10) {
            System.out.println("l");
        } else if (number >= 11) {
            System.out.println("p");
        } else {
            System.out.println("i");
        }

    }
}
*/

