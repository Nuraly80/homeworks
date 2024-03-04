public class HomeworkLesson3z1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.speed = 100;

        car2.brand = "Mers";
        car2.model = "S320";
        car2.speed = 180;

        car1.start();
        car1.stop();

        car2.start();
        car2.stop();

        System.out.println("Car 1: " + car1.brand + " " + car1.model + ", Speed: " + car1.speed);
        System.out.println("Car 2: " + car2.brand + " " + car2.model + ", Speed: " + car2.speed);

    }

    static class Car {
        String brand;
        String model;
        int speed;

        void start() {
            System.out.println("Метод старт");
        }

        void stop() {
            System.out.println("метод стоп");
        }
    }
}
