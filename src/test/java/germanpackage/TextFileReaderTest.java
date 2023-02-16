package germanpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TextFileReaderTest {

    private TextFileReader textFileReader = new TextFileReader();

    @Test
    public void resourcesFile_test() {
        String fileContent = this.textFileReader.getResourcesFileSampleContent();
        System.out.println(fileContent);

        assertTrue(fileContent.contains("standard"));
    }

    @Test
    public void testResourcesFile_test() {
        final String test_resources_file_path = "resources/sample_test_resources_file.txt";

        String fileContent = this.textFileReader.getTextFileContent(test_resources_file_path);
        System.out.println(fileContent);

        assertTrue(fileContent.contains("test"));
    }
}