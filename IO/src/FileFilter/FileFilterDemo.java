package FileFilter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo implements FileFilter {
	public boolean accept(File pathname) {
		String name = pathname.getName();
		return name.endsWith(".java");
	}

}
