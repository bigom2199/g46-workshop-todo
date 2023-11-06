package se.lexicon.g46todoapi.service;
@SpringBootTest
public class UserServiceTest  {

 private userService TestObject;
 private userRepository userRepository;
         @AuthoWrird

    public void registerTest(){


    }

    void getByEmailTest(){

    }
    void disableByEmailTest(){

    }
    void enableByEmailTest(){

    }
    void setUp(){
             testObject.register(UserDTOFrom.builder()
                     .email("")
                     .password("")
                     .roles(new HashSet<>)
                     .build())

    }
      void registerTest(){
             testObject.register(userDTOfrom.builder()
                     .email("")
                     .password("")
                     .roles(new HashSet<>())
                     .build());

                     sertTheow(DataNotFoundException.class,()->{
                         HashSer<Role> roles= new HashSet<>();
                         roles.add(RoleDTOFrom.builder())
                                 .Id(234)
                                 .name("")
                                 .build());
                     testObject.register(UserDTOFrom.builder()
                             .email()
                             .password()
                             .roles()
                             .builde());



                     }
         void getByEmailTest() {
                         UserDTOView result = testObject.getByEmail(email);
                         assertNotNull(result);
                         assertThrows(DataNotFoundException.class,()-> {
                             testObject.getByEmail("test@test.com");

                         });
          }
    void disableByEmailTest(){
                         testObject.disableByEmail(email);
                         UserDTOView byEmail = testObject.getByEmail(email);
                         assertTrue(byEmail.isExpired());
          }
      }
}
