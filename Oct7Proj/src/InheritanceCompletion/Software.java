package InheritanceCompletion;

public class Software extends Product
{
    private String version;

    public Software()
    {
        super();
    	version = "v001";
        count++;
    }

    public String getVersion()
    {
        return version;
    }

    public void setVersion(String version){
    	this.version = version;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Version:     " +
            version + "\n";
    }
}