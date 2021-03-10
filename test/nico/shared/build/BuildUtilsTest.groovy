package nico.shared.build

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test

public class BuildUtilsTest{

    @Test
    public void whenGetShContent(){
        BuildUtils buildUtils = new BuildUtils();
        assertEquals(buildUtils.getShContent(), "mvn clean compile")
    }

}