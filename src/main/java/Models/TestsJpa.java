package Models;

import Controllers.ApplicationListener;

import javax.persistence.EntityManager;

public class TestsJpa {

    private EntityManager em;

    public TestsJpa() {
        if(ApplicationListener.getEmf().isOpen()) {
            ApplicationListener.setPersistenceUnitName("default");
            //createEntityManager is "thread-safe" (1 thread by EntityManager)
            EntityManager em = TestsJpa.getEntityManager();
        }
    }

    public static EntityManager getEntityManager()  {
        //createEntityManager is "thread-safe" (1 thread by EntityManager)
        return ApplicationListener.getEmf().createEntityManager();
    }

}
