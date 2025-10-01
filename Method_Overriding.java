class Method_Overriding {
    public void run(){
        System.out.println("Task is running");
    }
}

class Animal extends Method_Overriding{
    public void run(){
        // Super keyword is used to access method of parent class
        super.run();
        System.out.println("Dog is running");
    }
}

class test{
    public static void main(String[] args) {
        Animal animal = new Animal();
        //Method_Overriding mo = new Animal();

        animal.run();
        //mo.run();

    }
}