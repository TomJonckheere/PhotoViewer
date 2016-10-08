package be.tjon.config;

/**
 * @author Tom
 */
public class Config {

    /** Application name. */
    public static final String APPLICATION_NAME =
            "PiPhotoViewer";

    /** Directory to store user credentials for this application. */
    public static final java.io.File DATA_STORE_DIR = new java.io.File(
            System.getProperty("user.home"), ".credentials/drive-java-quickstart");

}
