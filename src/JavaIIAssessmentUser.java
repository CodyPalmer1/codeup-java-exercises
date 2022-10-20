public class JavaIIAssessmentUser extends JavaIIAssessmentPersonClass{
    protected boolean admin;

    public JavaIIAssessmentUser(String firstName, String lastName, boolean admin) throws IllegalArgumentException {
        super(firstName, lastName);
        this.admin = admin;
    }

    public boolean isAdmin(){
        return admin;
    }
}
