package com.NetCracker;

public class Author {
    public String name;
    public String email;
    public char gender;

//    public Author(String name, String email, char gender){
//        this.name=name;
//        this.email=email;
//        this.gender=gender;
//    }
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender &&
                Objects.equals(name, author.name) &&
                Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        int res = 17;
        res = 31*res+name.hashCode();
        res = 31*res+email.hashCode();
        res = 31*res+(int)gender;
        return res;
    }
}
