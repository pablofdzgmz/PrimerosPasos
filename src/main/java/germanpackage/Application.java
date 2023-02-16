package germanpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Application {

    public String getTextFileContent(String filePath) {
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(filePath);

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Stream<String> lines = bufferedReader.lines();

        StringBuilder result = new StringBuilder();
        lines.forEach(line -> result.append(String.format("%s%n", line)));
        return result.toString();
    }

    public static void main(String[] args) {
        Application app = new Application();
        String message = app.getTextFileContent("sample_resources_file.txt");
        System.out.println(message);
    }
}
