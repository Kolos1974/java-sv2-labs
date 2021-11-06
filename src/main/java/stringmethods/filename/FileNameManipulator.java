package stringmethods.filename;

import java.util.Locale;

public class FileNameManipulator {
    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        String fileName = "Taxidermia.mov";
        System.out.println(fileName);
        System.out.println(fileNameManipulator.findLastCharacter(fileName));
        System.out.println(fileNameManipulator.findFileExtension(fileName));
        System.out.println(fileNameManipulator.identifyFilesByExtension("mov", fileName));
        System.out.println(fileNameManipulator.comparesFilesByName("Taxidermia.mov", fileName));
        System.out.println(fileNameManipulator.changeExtensionToLoweCase(fileName));
        System.out.println(fileNameManipulator.replaceStringPart(fileName, "Taxi", "Auto"));
    }

    public char findLastCharacter(String str){
        char[] result = str.toCharArray();
        return result[str.length()-1];

        // return str.charAt(str.length()-1);
    }

    public String findFileExtension(String fileName){
        fileName = fileName.trim();
        int index = fileName.lastIndexOf('.');
        return fileName.substring(index);


    }

    public boolean identifyFilesByExtension(String ext, String fileName){
        return fileName.endsWith(ext);
    }

    public boolean comparesFilesByName(String searchedFileName, String actualFileName) {
        return actualFileName.equals(searchedFileName);
    }

    public String changeExtensionToLoweCase(String fileName){
        fileName = fileName.trim();
        int index = fileName.lastIndexOf('.');
        String namePart = fileName.substring(0, index);
        String extension = fileName.substring(index).toLowerCase();
        return namePart+extension;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }

}
