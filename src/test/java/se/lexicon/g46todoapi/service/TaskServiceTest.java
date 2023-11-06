package se.lexicon.g46todoapi.service;
@SpringBootTest
public class TaskServiceTest   {

  // todo: implement unit testing for this
    @Autowried
    private TaskService testObject;
    private PersonRepository personRepository;
    private userRepository userRepository;


    void  getAllTest(){

    }
    void findByIdTest(){

    }
    void findByTest(){

    }
 void setUp(){
      User user = userRepository.save(user.builder()
              .email("test@test.com")
              .password("TestPassword")
              .roles(new HashSet())
              .build())

 }
   person person = personRepository.save(person.builder()
           .name("a person")
           .user()
           .tasks(new ArrayList())
           .build())

}
    void getAllTesr(){
  assertEquals(testObject.getAll().size(),1)
    }

    void findByIdTest(){
  TaskDTOview = testObject.getAll().get();
  TaskDTOview.findBYId= testObject.findById(view.getId())
          seartEquals(view.getdescription(),findById.getdescription());
    }


