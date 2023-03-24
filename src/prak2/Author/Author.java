package prak2.Author;

public class Author {
    private String Name = "";
    private String eMail = "";
    private char Gender = ' ';
    Author(String name, String email, char gender)
    {
        Name = name;
        eMail = email;
        Gender = gender;
    }
    public String GetName()
    {
        return Name;
    }
    public String GetEmail()
    {
        return eMail;
    }
    public void SetEmail(String email)
    {
        eMail = email;
    }
    public char GetGender()
    {
        return Gender;
    }
    public String ToString()
    {
        return String.format("%s %s %s",Name, eMail, Gender);
    }
}