package pl.waw.sgh;

import java.io.File;

public class DirectoryCounter {

    public static void main(String[] args) {
        File folder = new File("./src");
        System.out.println(countFiles(folder));
        System.out.println(countFilesSize(folder));
    }

    public static int countFiles(File directory){
        int sum = 0;
        if (!directory.isDirectory()){
            System.out.println("This is not a directory");
        } else {
            for (File fileInDirectory: directory.listFiles()){
                sum ++;
            }
        }
        return sum;
    }

    public static long countFilesSize(File directory){
        long sum = 0;
        if (!directory.isDirectory()){
            System.out.println("This is not a directory");
        } else {
            for (File fileInDirectory: directory.listFiles()){
                sum += fileInDirectory.length();
                if (fileInDirectory.isDirectory()){
                    sum += countFilesSize(fileInDirectory);
                }
            }
        }
        return sum;
    }
}
