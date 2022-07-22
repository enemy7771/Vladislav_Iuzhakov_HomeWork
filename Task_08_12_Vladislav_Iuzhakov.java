/**
 * Двигатель — сердце автомобиля
 * Двигатель — сложный механизм, для описания которого недостаточно обычной переменной.
 * В классе Car создай внутренний класс (inner class) Engine. В классе Engine создай boolean поле isRunning, которое принимает значение true, если двигатель запущен, и false в противном случае. Также в этот класс добавь методы start и stop, которые будут запускать/останавливать двигатель (устанавливать соответствующее значение полю isRunning).
 * Чтобы использовать двигатель, создай поле engine типа Engine в классе Car.
 *
 *
 * Requirements:
 * 1. В классе Car нужно создать внутренний класс (inner class) Engine.
 * 2. В классе Engine должно существовать приватное поле isRunning типа boolean.
 * 3. В классе Engine должен существовать публичный метод void start, который устанавливает значение true полю isRunning.
 * 4. В классе Engine должен существовать публичный метод void stop, который устанавливает значение false полю isRunning.
 * 5. В классе Car должно существовать поле engine типа Engine.
 */

public class Task_08_12_Vladislav_Iuzhakov {
    public static void main(String[] args) {

    }
}

class Car {
    Engine engine = new Engine();


    class Engine{
    private boolean isRunning = true;
    void start(){
        this.isRunning = true;
    }
    void stop(){
        this.isRunning = false;
    }
}
}