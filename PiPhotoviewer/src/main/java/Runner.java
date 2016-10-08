import be.tjon.driveApi.GoogleDriveService;
import com.google.api.services.drive.model.*;
import com.google.api.services.drive.Drive;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException, GeneralSecurityException {
        // Build a new authorized API client service.
        Drive service = new GoogleDriveService().getDriveService();

        // Print the names and IDs for up to 10 files.
        FileList result = service.files().list()
                .setPageSize(10)
                .setFields("nextPageToken, files(id, name)")
                .execute();
        List<File> files = result.getFiles();
        if (files == null || files.size() == 0) {
            System.out.println("No files found.");
        } else {
            System.out.println("Files:");
            for (File file : files) {
                System.out.printf("%s (%s)\n", file.getName(), file.getId());
            }
        }
    }

}