package net.j4c0b3y.api.config.utils;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author J4C0B3Y
 * @version ConfigAPI
 * @since 10/11/2024
 */
@UtilityClass
public class PathUtils {
    /**
     * Creates a file backup, using a date format.
     *
     * @param path The file path to back up.
     * @param format The date format for the file name.
     * @return The name of the backed up file.
     */
    public String createBackup(Path path, String format) throws IOException {
        String date = new SimpleDateFormat(format).format(new Date());
        String name = getBaseName(path) + "-" + date + getExtension(path);
        return Files.copy(path, path.resolveSibling(name)).toFile().getName();
    }

    /**
     * Gets the base name of the file in a path.
     *
     * @param path The path.
     * @return The base name.
     */
    public String getBaseName(Path path) {
        String name = path.getFileName().toString();
        return name.contains(".") ? name.substring(0, name.lastIndexOf(".")) : name;
    }

    /**
     * Gets the extension of the file in a path.
     *
     * @param path The path.
     * @return The extension.
     */
    public String getExtension(Path path) {
        String name = path.getFileName().toString();
        return name.contains(".") ? name.substring(name.lastIndexOf(".")) : "";
    }
}
