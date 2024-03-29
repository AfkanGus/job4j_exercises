package designpatterns.observer;

/*
погодные элементы реализует интерфейс Observer.
 С этим интерфейсом взаимодей-
        ствует субъект, когда
        приходит время обновле-
        ния наблюдателей
        Интерфейс Observer
реализуется всеми на-
блюдателями; таким
образом, все наблюда-
тели должны реализо-
вать метод update().
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
    /*
    Данные состояния, передаваемые на-
блюдателям при изменении состояния
субъекта.
     */
}
