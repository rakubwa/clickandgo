//package pl.clickandgoApp.clickandgo;
//
//import org.hibernate.annotations.LazyCollection;
//import org.hibernate.annotations.LazyCollectionOption;
//import org.springframework.data.annotation.Id;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "USERS")
//public class User {
//
//    public final static String USER_ID = "userId";
//    public final static String USER_PASSWORD = "password";
//    public final static String USER_EMAIL = "email";
//    public final static String USER_ACTIVITY = "activity";
//    public final static String USER_NAME = "userName";
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = USER_ID, unique = true, nullable = false)
//    private Integer userId;
//
//    @Column(name = USER_PASSWORD, unique = true, length = 50)
//    private String password;
//
//    @Column(name = USER_EMAIL, unique = true)
//    private String email;
//
//    @Column(name = USER_NAME)
//    private String userName;

//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @LazyCollection(LazyCollectionOption.FALSE)
//    @JoinColumn(name = UserType.USER_TYPE_ID, referencedColumnName = UserType.USER_TYPE_ID)
//    private UserType userType;

//}