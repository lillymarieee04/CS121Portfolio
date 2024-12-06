package CS121Portfolio.weekSixteen.jsonActivity;

import java.io.FileWriter;
import java.io.IOException;

public class PersonWriter {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25, "Engineer");

        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");
        jsonBuilder.append("  \"name\": \"").append(person.getName()).append("\",\n");
        jsonBuilder.append("  \"age\": ").append(person.getAge()).append(",\n");
        jsonBuilder.append("  \"occupation\": \"").append(person.getOccupation()).append("\"\n");
        jsonBuilder.append("}");

        String jsonString = jsonBuilder.toString();

        try (FileWriter fileWriter = new FileWriter("person.json")) {
            fileWriter.write(jsonString);
            System.out.println("JSON file has been written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the JSON file: " + e.getMessage());
        }
    }
}
