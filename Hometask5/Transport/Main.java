import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Passenger car = new Passenger(250, 180, 1200, "Audi", 4, 8, "Sedan", 5);
        car.description();
        System.out.print("Введите время, за которое должна проехать машина: ");
        while (!scanner.hasNextDouble())
            scanner.next();
        double time = scanner.nextDouble();
        car.resWork(time);
        Truck bus=new Truck(200,150,2000,"MAZ",6,10,500);
        bus.description();
        System.out.print("Введите количество груза: ");
        while (!scanner.hasNextDouble())
            scanner.next();
        double countLifting=scanner.nextDouble();
        bus.resBus(countLifting);
Civil plane=new Civil(1500,1000,5000,"Airbus A330-300",120,600,100,true) ;
    plane.description();
        System.out.print("Введите количество пасажиров: ");
        while (!scanner.hasNextDouble())
            scanner.next();
        double Passenger=scanner.nextDouble();
        plane.resPlane(Passenger);
        Military plane1=new Military(2000,1915,1500,"Boeing F/A-18",100,500,true,5);
   plane1.description();
        plane1.resPlane1();
    }
}
