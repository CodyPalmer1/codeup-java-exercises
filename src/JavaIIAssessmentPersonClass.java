import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class JavaIIAssessmentPersonClass implements JavaIIAssessmentGreeter{
    private String firstName;
    private String lastName;

    public JavaIIAssessmentPersonClass(String firstName, String lastName) throws IllegalArgumentException {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String sayHello() {
        return String.format("Hello from %s", getFirstName(), getLastName());
    }
}
