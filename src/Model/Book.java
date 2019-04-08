package Model;

public class Book {
    private String name;
    private String AutherName;
    private String PublicationName;

    private boolean reserved;

    //---names

    public String getName() {
        return name;
    }

    public String getAutherName() {
        return AutherName;
    }

    public String getPublicationName() {
        return PublicationName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutherName(String autherName) {
        AutherName = autherName;
    }

    public void setPublicationName(String publicationName) {
        PublicationName = publicationName;
    }

    //---reserve


    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isReserved() {
        return reserved;
    }

    public boolean equals(Book book) {
        // TODO
        return false;
    }
}
