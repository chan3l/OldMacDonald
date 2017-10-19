class NamedCow extends Cow
{
  private String name;
  public NamedCow(String type, String n, String sound) {
    super(type, sound);
    name =n;
  }
  public String getName() {
    return name;
  }
}