package test;


public class TestEnum {

  public static void main(String[] args) {
    
    String var = "_1";
    
   
    for (PolicyEnum p : PolicyEnum.values()) {
      System.out.println(p);
      if (p.toString().equals(var)) {
        System.out.println(p.toString());
      }
    }
  }
  
  public enum PolicyEnum {
    _1("nist-loa-1"),
    
    _2("nist-loa-2"),
    
    _3("nist-loa-3");

    private String value;

    PolicyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolicyEnum fromValue(String text) {
      for (PolicyEnum b : PolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

}
