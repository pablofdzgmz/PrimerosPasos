package germanpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ApplicationTest {

    private Application app = new Application();

    @Test
    public void product_test() {
        final String test_resources_file_path = "resources/sample_test_resources_file.txt";

        String fileContent = this.app.getTextFileContent(test_resources_file_path);
        System.out.println(fileContent);

        assertTrue(fileContent.contains("test"));
    }

}