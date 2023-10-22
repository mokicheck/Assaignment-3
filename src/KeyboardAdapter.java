public class KeyboardAdapter implements InputOutputDevice {
    private Keyboard keyboard;

    public KeyboardAdapter(Keyboard keyboard) {
        this.keyboard = keyboard;
    }


    public void writeData(String data) {
        keyboard.type(data);
    }


    public String readData() {
        // В случае клавиатуры, чтение может быть не поддерживаться
        return null;
    }
}
