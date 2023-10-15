package pl.coderslab.users;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String email;
    private String userName;
    private String password;

}
