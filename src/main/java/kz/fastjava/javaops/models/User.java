package kz.fastjava.javaops.models;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // т.к protected конструктор нужен для hibernate
@ToString(callSuper = true, exclude = {"password"})
public class User extends AbstractPersistable<Long> {

    @Column(name = "email", nullable = false, unique = true)
    @Email
    @NotNull
    @Size(max = 128)
    private String email;

    @Column(name = "first_name")
    @Size(max = 128)
    private String firstName;

    @Column(name = "last_name")
    @Size(max = 128)
    private String lastName;

    @Column(name = "password")
    @Size(max = 128)
    private String password;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @ElementCollection(fetch = FetchType.EAGER)
    @Column(name = "role")
    private Set<Role> roles;
}
