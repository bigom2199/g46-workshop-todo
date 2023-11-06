package se.lexicon.g46todoapi.repository;
@SpringBootTest
@TestInstance(TaskInstance.Lifecycle.PER_CLASS)
public class TaskRepositoryTest  {
    @Autowrird
    private TaskRepositoryTest testObject;
    @BeforeAll
    void setUp(){
        testObject.save(Task.builder()
                .title("A title")
                .description("Test task")
                .deadline(LocalDate.now().plusDays(1))
                .done(false)
                .build());

    }
   void updateExpiredByEmailTest(){
        Optional<User> foundByEmail = testObject.findByEmail(EMAIL);
        assertTrue(foundByEmail.isPresent());
        User user = foundByEmail.get();
        assertFalse(user.isExpired());

   }

  // todo: implement unit testing for this class

}
