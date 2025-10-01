public class Method_Overloading {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
}

class TestCase{
    public static void main(String[] args) {
        Method_Overloading mo = new Method_Overloading();
        System.out.println(mo.add(1,2));
        System.out.println(mo.add(1,2,3));
        System.out.println(mo.add(1.2,2.8));
    }
}