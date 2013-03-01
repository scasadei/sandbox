package sandbox.guice.main;

class RealBillingService implements BillingService {
  private final CreditCardProcessor processor;
  private final TransactionLog transactionLog;

  @Inject
  RealBillingService(CreditCardProcessor processor, 
      TransactionLog transactionLog) {
    this.processor = processor;
    this.transactionLog = transactionLog;
  }

  @Override
  public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
 //   ...
  }
}