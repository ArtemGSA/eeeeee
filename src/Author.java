import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;
    public Author(String authorName, String authorSurname){this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
    @Override
    public String toString() {
        return "Имя "+this.authorName+" Фамилия "+this.authorSurname;
    }
    @Override
    public boolean equals(Object other){
        if(other!=null){
            if(this.getClass() != other.getClass()){
                return false;
            }
            if(this == other){
                return true;
            }}
        else{
            return false;
        }
        Author oAuthor = (Author) other;
        return Objects.equals(authorName,oAuthor.authorName)&& Objects.equals(authorSurname, oAuthor.authorSurname);
    }
    @Override
    public int hashCode(){
        return Objects.hash(authorName, authorSurname);
    }
}
