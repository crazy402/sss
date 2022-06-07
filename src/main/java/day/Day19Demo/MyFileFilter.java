package day.Day19Demo;

import java.io.File;
import java.io.FileFilter;

/**
 * @ClassName MyFileFiter
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/6 14:29
 * @Version 1.0
 **/
public class MyFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().toLowerCase().endsWith(".git");
    }
}
