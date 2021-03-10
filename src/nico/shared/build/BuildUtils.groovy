package nico.shared.build

import org.yaml.snakeyaml.Yaml

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
        Yaml yaml = new Yaml();
        context.echo yaml.toString();
    }

}
