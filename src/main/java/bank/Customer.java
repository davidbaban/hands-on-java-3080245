package bank;

public class Customer {
  private int id;
  private String name;
  private String username;
  private String password;
  private int accountId;

  public Customer(int id,String name,String username,String password,int accountId){
    this.id=id;
    this.name=name;
    this.username=username;
    this.password=password;
    this.accountId=accountId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUserName() {
    return this.username;
  }

  public void setUserName(String userName) {
    this.username = userName;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public int getId(){
    return this.id;
  }
  public void setId(int id){
    this.id=id;
  }
}
