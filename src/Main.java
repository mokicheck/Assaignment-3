public class Main {
    public static void main(String[] args) {
        // Создаем адаптер для клавиатуры и экрана
        InputOutputDevice keyboardAdapter = new KeyboardAdapter(new Keyboard());
        InputOutputDevice displayAdapter = new DisplayAdapter(new Display());

        // Используем адаптеры для ввода и вывода
        keyboardAdapter.writeData("Hello, World!");
        displayAdapter.writeData("This is a display.");

        // Попробуем прочитать данные (в данном случае, для клавиатуры)
        String inputData = keyboardAdapter.readData();
        if (inputData != null) {
            System.out.println("Read data: " + inputData);
        } else {
            System.out.println("Reading is not supported for the keyboard.");
        }
    }
}
