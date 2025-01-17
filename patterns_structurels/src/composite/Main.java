package composite;


public class Main {
  public static void main(String[] args) {
    // Leaves (files)
    File file1 = new FileTxt("file1");
    File file2 = new FileTxt("file2");
    File file3 = new FileTxt("file3");
    File file4 = new FileJson("file4");
    File file5 = new FileJson("file5");

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
