package pt.lima.spring1.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // Evita conflitos com 'user' (palavra reservada)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
