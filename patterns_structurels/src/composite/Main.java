package composite;

public class Main {
  public static void main(String[] args) {
    // Leaves (files)
    FileTxt file1 = new FileTxt("file1.txt");
    FileTxt file2 = new FileTxt("file2.txt");
    FileTxt file3 = new FileTxt("file3.txt");
    FileJson file4 = new FileJson("file4.json");
    FileJson file5 = new FileJson("file5.json");

    // Composite (directories)
    Directory directory1 = new Directory("Folder1");
    Directory directory2 = new Directory("Folder2");


    directory1.addComponent(file1);
    directory1.addComponent(file2);
    directory1.addComponent(file4);

    directory2.addComponent(file3);
    directory2.addComponent(file5);

    directory2.addComponent(directory1); // Imbrication

    directory2.showDetails();
  }
}
