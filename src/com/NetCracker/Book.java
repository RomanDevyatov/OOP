package com.NetCracker;

public class Book extends Author{
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price){
        this.name=name;
        this.authors= authors;
        this.price=price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int setQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        String s=", authors={";
        for (int i=0;i<authors.length;i++){
            s+="["+authors[i].getName()+authors[i].getEmail()+authors[i].getGender()+"], ";
        }
        s=s.substring(0, s.length()-2)+"}";
        return "Book[" +
                "name='" + name +
                s +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
    public String getAuthorNames(){
        String tmp="";
        for (int i=0; i<authors.length; i++){
            tmp += authors[i].getName()+", ";
        }
        tmp=tmp.substring(0, tmp.length()-2);
        return tmp;
    }

@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                qty == book.qty &&
                Objects.equals(name, book.name) &&
                Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*name.hashCode();
        for(int i=0;i<authors.length;i++){
            result = 31*result + authors[i].hashCode();
        }
        result = 31*result + (int)Double.doubleToLongBits(price);
        result = 31*result + qty;
        return result;
    }
}
