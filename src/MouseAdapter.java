public class MouseAdapter implements InputOutputDevice {
    private Mouse mouse;

    public MouseAdapter(Mouse mouse) {
        this.mouse = mouse;

    }
    public void writeData(String data) {
        mouse.click(data);
    }
    public String readData() {
        // В случае мыши, чтение может быть не поддерживаться
        return null;
    }
}
