package com.example.testProject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    @NotBlank(message = "Поле не может быть пустым")
    private String firstName;

    @Column(name = "lastName")
    @NotBlank(message = "Поле не может быть пустым")
    private String lastName;

    @Column(name = "email")
    @Email(message = "Неверный формат email")
    private String email;

    @Column(name = "roles")
    @ElementCollection
    @CollectionTable(name = "user_roles")
    @Size(min = 1, max = 3, message = "Количество ролей должно быть от 1 до 3")
    private List<@NotBlank(message = "Поле не может быть пустым") String> roles;

    @Column(name = "phones")
    @CollectionTable
    @ElementCollection
    @Size(min = 1, max = 3, message = "Количество телефонов должно быть от 1 до 3")
    private List<@Pattern(regexp = "375\\d{9}", message = "Неверный формат номера телефона") String> phones;
}
