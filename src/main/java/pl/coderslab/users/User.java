package pl.coderslab.users;


import lombok.*;

@Getter
@Setter
@ToString
public class User {

    private int id;
    private String email;
    private String userName;
    private String password;

}
