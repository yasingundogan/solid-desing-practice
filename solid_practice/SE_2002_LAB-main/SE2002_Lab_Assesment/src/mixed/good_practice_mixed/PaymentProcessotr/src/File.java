import java.io.FileWriter;

class File implements Logger {
    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}