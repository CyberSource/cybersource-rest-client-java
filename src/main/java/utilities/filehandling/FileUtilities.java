package utilities.filehandling;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;

public class FileUtilities {
	public static void downloadFileFromInputStream(InputStream inputStream, File outputFile) throws IOException {
		if (inputStream == null) {
			throw new IllegalArgumentException("Input Stream is null or unavailable.");
		}
		
		FileUtils.copyInputStreamToFile(inputStream, outputFile);
		
		inputStream.close();
	}
}
