package CommonMethods;

import java.util.Objects;

public class CommonMethods implements Cloneable{
    private int number;
    private String someString;

    public CommonMethods(int number, String someString) {
        this.number = number;
        this.someString = someString;
    }

    //Override equals to compare object attributes
    @Override
    public boolean equals(Object o) {
        if(Objects.isNull(o) || !(o instanceof  CommonMethods)) return false;

        return ((CommonMethods) o).number == number &&
                ((CommonMethods) o).someString.equals(someString);
    }

    //When overriding equals, also override hashCode for methods that use the hashCode (such as HashMaps)
    @Override
    public int hashCode() {
        int result = Integer.hashCode(number);
        result = 31 * result + someString.hashCode();
        return result;
    }

    //Clone can be used when the class implements the Cloneable interface
    @Override
    public CommonMethods clone() {
        try {
            return (CommonMethods) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }

    //Good to always override toString method
    @Override
    public String toString() {
        return number + ": " + someString;
    }
}
