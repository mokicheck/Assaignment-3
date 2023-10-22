public class DisplayAdapter implements InputOutputDevice {
    private Display display;

    public DisplayAdapter(Display display) {
        this.display = display;
    }

    @Override
    public void writeData(String data) {
        display.show(data);
    }

    @Override
    public String readData() {
        // В случае экрана, чтение может быть не поддерживаться
        return null;
    }
}
