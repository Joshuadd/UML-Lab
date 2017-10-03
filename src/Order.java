/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 8 "structure.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private String date;
  private String item;
  private String nameOnOrder;
  private int quantity;

  //Order Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(String aDate, String aItem, String aNameOnOrder, int aQuantity, Account aAccount)
  {
    date = aDate;
    item = aItem;
    nameOnOrder = aNameOnOrder;
    quantity = aQuantity;
    boolean didAddAccount = setAccount(aAccount);
    if (!didAddAccount)
    {
      throw new RuntimeException("Unable to create order due to account");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(String aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setItem(String aItem)
  {
    boolean wasSet = false;
    item = aItem;
    wasSet = true;
    return wasSet;
  }

  public boolean setNameOnOrder(String aNameOnOrder)
  {
    boolean wasSet = false;
    nameOnOrder = aNameOnOrder;
    wasSet = true;
    return wasSet;
  }

  public boolean setQuantity(int aQuantity)
  {
    boolean wasSet = false;
    quantity = aQuantity;
    wasSet = true;
    return wasSet;
  }

  public String getDate()
  {
    return date;
  }

  public String getItem()
  {
    return item;
  }

  public String getNameOnOrder()
  {
    return nameOnOrder;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public Account getAccount()
  {
    return account;
  }

  public boolean setAccount(Account aAccount)
  {
    boolean wasSet = false;
    if (aAccount == null)
    {
      return wasSet;
    }

    Account existingAccount = account;
    account = aAccount;
    if (existingAccount != null && !existingAccount.equals(aAccount))
    {
      existingAccount.removeOrder(this);
    }
    account.addOrder(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Account placeholderAccount = account;
    this.account = null;
    placeholderAccount.removeOrder(this);
  }


  public String toString()
  {
    return super.toString() + "["+
            "date" + ":" + getDate()+ "," +
            "item" + ":" + getItem()+ "," +
            "nameOnOrder" + ":" + getNameOnOrder()+ "," +
            "quantity" + ":" + getQuantity()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}