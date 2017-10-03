/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 1 "structure.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String name;
  private String address;
  private String gender;
  private int age;

  //Customer Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aName, String aAddress, String aGender, int aAge, Account aAccount)
  {
    name = aName;
    address = aAddress;
    gender = aGender;
    age = aAge;
    if (aAccount == null || aAccount.getCustomer() != null)
    {
      throw new RuntimeException("Unable to create Customer due to aAccount");
    }
    account = aAccount;
  }

  public Customer(String aName, String aAddress, String aGender, int aAge, int aAccountNumForAccount, String aAccountHolderNameForAccount, String aDateCreatedForAccount, boolean aActiveForAccount)
  {
    name = aName;
    address = aAddress;
    gender = aGender;
    age = aAge;
    account = new Account(aAccountNumForAccount, aAccountHolderNameForAccount, aDateCreatedForAccount, aActiveForAccount, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setGender(String aGender)
  {
    boolean wasSet = false;
    gender = aGender;
    wasSet = true;
    return wasSet;
  }

  public boolean setAge(int aAge)
  {
    boolean wasSet = false;
    age = aAge;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public String getGender()
  {
    return gender;
  }

  public int getAge()
  {
    return age;
  }

  public Account getAccount()
  {
    return account;
  }

  public void delete()
  {
    Account existingAccount = account;
    account = null;
    if (existingAccount != null)
    {
      existingAccount.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "address" + ":" + getAddress()+ "," +
            "gender" + ":" + getGender()+ "," +
            "age" + ":" + getAge()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}