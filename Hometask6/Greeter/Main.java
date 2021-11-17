public class Main {
    public static void main(String[] args) {
     Greeter russion =new Greeter() {
         @Override
         public void wish() {System.out.println("Привет на русском - ПРИВЕТ");

         }
     };
Greeter belorussian =new Greeter() {
    @Override
    public void wish() {
        System.out.println("Привет на белорусском - ПРЫВIТАННЕ");
    }
};
Greeter english= new Greeter() {
    @Override
    public void wish() {
        System.out.println("Привет на английском - HELLO");
    }
};
Greeter spanish= new Greeter() {
    @Override
    public void wish() {
        System.out.println("Привет на испанском - HOLA");
    }
};
russion.wish();
belorussian.wish();
english.wish();
spanish.wish();
        }
    }

