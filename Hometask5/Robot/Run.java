public class Run {
        public static void main(String[] args) {
                SamsungHead samsungHead = new SamsungHead(100);
                SamsungHand samsungHand = new SamsungHand(200);
                SamsungLegs samsungLegs = new SamsungLegs(200);
                SonyHead sonyHead = new SonyHead(150);
                SonyHand sonyHand = new SonyHand(220);
                SonyLegs sonyLegs = new SonyLegs(220);
                ToshibaHead toshibaHead = new ToshibaHead(70);
                ToshibaHand toshibaHand = new ToshibaHand(150);
                ToshibaLegs toshibaLegs = new ToshibaLegs(150);
                Robot Masha = new Robot(samsungHead, sonyHand, toshibaLegs);
                Masha.action();
                System.out.println("Стоимость первого робота: " + Masha.getPrice());
                Robot Anya = new Robot(toshibaHead, samsungHand, sonyLegs);
                Anya.action();
                System.out.println("Стоимость второго робота: " + Anya.getPrice());
                Robot Vlad = new Robot(sonyHead, toshibaHand, samsungLegs);
                Vlad.action();
                System.out.println("Стоимость третьего робота: " + Vlad.getPrice());
                if (Masha.getPrice() > Anya.getPrice() && Masha.getPrice() > Vlad.getPrice()) {
                        System.out.println("Самый дорогой робот - первый");
                        if (Anya.getPrice() > Masha.getPrice() && Anya.getPrice() > Vlad.getPrice()) {
                                System.out.println("Самый дорогой робот - второй");
                        }
                } else {
                        System.out.println("Самый дорогой робот - третий");
                }

        }

}