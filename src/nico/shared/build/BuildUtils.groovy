package nico.shared.build

public class BuildUtils{

    protected String shContent;

    public BuildUtils(){
        this.shContent = "mvn clean compile";

    }

    String getShContent() {
        return shContent;
    }

    public void build(context){
        context.echo "Running: ${context.env.BUILD_ID} on ${context.env.JENKINS_URL}";
        context.sh shContent;
    }

}
