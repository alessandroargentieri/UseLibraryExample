package argentieri.alessandro.mylibrary;

public class LibraryClass {
    private String Name;

    public LibraryClass(String name){
        Name = name;
    }

    public String getSaluti(){
        return "Hello " + Name + "!";
    }
}
