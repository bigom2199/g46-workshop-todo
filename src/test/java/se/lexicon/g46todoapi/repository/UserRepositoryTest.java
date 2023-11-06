package se.lexicon.g46todoapi.repository;
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserRepositoryTest {


  // todo: implement unit testing for this class
    @Autowired
    private UserRepositoryTest testObject;
    private static final String EMAIL = "test@test.com";

    void setUP(){
      testObject.save(user.builder()
              .email()
              .password("")
              .expired(false)
              .build());


    }
    void updatePasswordByEmailTest(){

      Optional<User> foundByEmail = testObject.findByEmail();
      asserttrue(foundByEmail.isPresent());
      User user = foundByEmail.get();
      assertEquls(user.getPasswordByEmail().get().getPassword(),"NamePassword")

    }
    void updateExpiredByEmailTest(){
      Optional<user> foundByEmail = testObject.findByEmail();
      assertTrue(foundByEmail.isPresent());

      user user = foundByEmail.get();
      assertFalse(user.isexpired());

      testObject.updateExpiredByEmailTest(email,true);
      asserttrue(testObject.findByEmail(email).get().isExpired());


    }
    void updatePasswordByEmailTest(){
      Optional<user> foundByEmail = testObject.findByEmail();
      assertTrue(foundByEmail.isPresent());

      User user = foundByEmail.get();
      assertEquals(user.getPassword(),"TestPassword");

      testObject.updatePasswordByEmailTest(user.getEmail(),"namePassword");
      assertequals(testObject.findByEmail(email).get().getPassword(),"32445")



    }

}
