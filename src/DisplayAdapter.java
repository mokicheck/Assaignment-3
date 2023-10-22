public class DisplayAdapter implements InputOutputDevice {
    private Display display;

    public DisplayAdapter(Display display) {
        this.display = display;
    }


    public void writeData(String data) {
        display.show(data);
    }


    public String readData() {
        // В случае экрана, чтение может быть не поддерживаться
        return null;
    }
}
