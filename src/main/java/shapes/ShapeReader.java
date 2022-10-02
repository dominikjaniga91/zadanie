package shapes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dominik_Janiga
 */
class ShapeReader {

    List<String[]> readFileContentAsList(String path) throws IOException {

        return Files.readAllLines(Paths.get(path))
                .stream().map(record -> record.split(";"))
                .collect(Collectors.toList());
    }
}
