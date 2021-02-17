package no.hvl.dat109.javaee_start_prosjekt;

class GreetingServiceImplTest extends GreetingServiceTest {


    @Override
    protected GreetingService getInstance() {
        return new GreetingServiceImpl();
    }
}