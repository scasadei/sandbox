package sandbox.guice.main;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MainApp {
public static void main(String[] args) {
    /*
     * Guice.createInjector() takes your Modules, and returns a new Injector
     * instance. Most applications will call this method exactly once, in their
     * main() method.
     */
    Injector injector = Guice.createInjector(new BillingModule());

    /*
     * Now that we've got the injector, we can build objects.
     */
    RealBillingService billingService = injector.getInstance(RealBillingService.class);
    
  }
}