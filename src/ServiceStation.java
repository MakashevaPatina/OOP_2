public class ServiceStation {
    public void check(Service transport) {
        if (transport != null) {
            transport.service();
        }
    }

    public void check(Car car) {
        if (car != null) {
            if (car.getWheelsCount() == 4) {
                car.service();
                car.checkEngine();
            } else {
                System.out.println("Ошибка: У машины должно быть 4 колеса");
            }
        }
    }
}

