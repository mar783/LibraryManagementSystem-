package pl.file;

import pl.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}