import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {

    @Test
    void todoShouldBeSerializable(){
        Todo sut = new Todo("some text", false);

        Assertions.assertEquals("[ ]<some text>", sut.toString());

    }

}