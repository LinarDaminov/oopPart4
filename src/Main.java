public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "2170", 1.5);
        Car toyota = new Car("Toyota", "corolla", 1.8);
        Car bmw = new Car("bmw", "x5", 2.0);
        Car kia = new Car("kia", "rio", 1.8);

        Truck daff = new Truck("Daff", "550", 3.2);
        Truck maz = new Truck("maz", "650", 2.9);
        Truck dfm = new Truck("dongFeng", "Captain", 3.0);
        Truck valday = new Truck("valday", "next", 2.6);

        Bus paz = new Bus("paz", "251", 2.6);
        Bus folAz = new Bus("golAz", "5291", 3.8);
        Bus liAz = new Bus("liaz", "254", 3.3);
        Bus nefAz = new Bus("nefAz", "657", 4.5);
        System.out.println(lada.toString());
        System.out.println(toyota.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println();
        System.out.println(daff.toString());
        System.out.println(maz.toString());
        System.out.println(dfm.toString());
        System.out.println(valday.toString());
        System.out.println();
        System.out.println(paz.toString());
        System.out.println(folAz.toString());
        System.out.println(liAz.toString());
        System.out.println(nefAz.toString());

        Driver<Bus> ivan = new Driver<>("Иванов Иван Иванович", "D", 15, paz);
        Driver<Car> petr = new Driver<>("Петров Петр Петрович", "B", 10,bmw);
        Driver<Truck> dima = new Driver<>("Дмитриев Дмитрий Дмитриевич", "C", 20,daff);


        System.out.println(ivan.toString() +" "+ paz.toString() );
        System.out.println(petr.toString() +","+ bmw.toString() );
        System.out.println(dima.toString() +" "+ daff.toString() );


        System.out.println(daff.bestTime());
        System.out.println(paz.maxSpeed());
        System.out.println(toyota.pitStop());
    }
}
